package kr.or.bit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {
    Scanner sc = new Scanner(System.in);

    private Set<Integer> lotto;
    private String lottonum;
    private int round; // 실행회차
    private String round_info;

    public Lotto() {
    }

    public void Lotto_Start() {
        while (true) {
            System.out.println("***************************");
            System.out.println("**1.당첨 예상 번호 추출, 저장**");
            System.out.println("**2.이전 추출 내역 확인하기****");
            System.out.println("**3.프로그램 종료************");
            System.out.println("***************************");
            System.out.print("원하는 메뉴 번호를 입력하세요: ");
            int userChoice = sc.nextInt();

            while (userChoice > 3 || userChoice < 1) {
                System.out.println("메뉴 번호를 잘못 입력하셨습니다.");
                System.out.print("다시 입력해주세요: ");
                userChoice = sc.nextInt();
            }

            switch (userChoice) {
            case 1:
                Lotto_Ran();
                break;
            case 2:
                Lotto_Read();
                break;
            case 3:
                System.out.println("사용해주셔서 감사합니다");
                System.exit(0);
            }
        }
    }

    private void Lotto_Ran() {
        lotto = new TreeSet<Integer>();
        lottonum = null;
        round++;

        while (lotto.size() < 6) {
            lotto.add((int) (Math.random() * 45 + 1));
        }
        lottonum = lotto.toString();
        round_info = "[" + round + "회차 Lotto 번호 ]";

        System.out.println(round_info);
        System.out.println(lottonum);

        Lotto_Write();

    }

    private void Lotto_Write() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy년 MM월 dd일, HH시 mm분");
        String date = dateformat.format(cal.getTime());

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter("C:\\Temp\\lotto.txt", true);
            bw = new BufferedWriter(fw);

            bw.write("------------------------------------------");
            bw.newLine();
            bw.write(round_info);
            bw.newLine();
            bw.write(lottonum);
            bw.newLine();
            bw.write(date + "에 조회하신 내역입니다.");
            bw.newLine();
            bw.write("-----------------------------------------");
            bw.newLine();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                fw.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void Lotto_Read() {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("C:\\Temp\\lotto.txt");
            br = new BufferedReader(fr);
            String line = "";
            for (int i = 0; (line = br.readLine()) != null; i++) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
                br.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

}
