package kr.or.bit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {
    private Set<Integer> lotto;
    private String lottonum;
    
    SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH-mma");

    public Lotto() {
        lotto = new TreeSet<Integer>();
        for (int i = 0; lotto.size() < 6; i++) {
            lotto.add((int) (Math.random() * 45 + 1));
        }
        lottonum = lotto.toString();
    }

    public void Write() {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter("C:\\Temp\\lotto.txt", true);
            bw = new BufferedWriter(fw);

            bw.write("로또 번호: " + lottonum); // 날짜 입력하기~~~~~
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

    public void Read() {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("C:\\Temp\\lotto.txt"); // 2byte씩 하나씩... 읽는즁...
            br = new BufferedReader(fr); // 다형성 / ㄴ> 한번에 태워서 보내자!!!!
            String line = "";
            for (int i = 0; (line = br.readLine()) != null; i++) {
                System.out.println(line); // 라인단위로 읽기
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