package kr.or.Izoa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

public class MemberJoin {
    private Scanner sc = new Scanner(System.in);

    static final String MEMBER_LIST_PATH = "C:\\Temp\\memberList.txt";

    public void join() {
        User user = new User();
        String id = "";
        
        System.out.println("■□■□■□회원가입■□■□■□");
        
     // V 아이디 정규표현식 확인
        String idRegEx = "^[a-z0-9]{4,10}$";
        boolean idCheck = false;
        while (!idCheck) {
            System.out.println("ID는 알파벳 소문자와 숫자를 혼용, 4~10자리로 생성해주세요.");
            System.out.print("ID: ");
            id = sc.nextLine();
            idCheck = id.matches(idRegEx);
        }
        // 아이디 중복 확인
        boolean dup = User.memberList.containsKey(id);
        while (dup) {
            System.out.println("이미 사용중인 ID입니다.");
            System.out.println("ID는 알파벳 소문자와 숫자를 혼용, 4~10자리로 생성해주세요.");
            System.out.print("ID: ");
            id = sc.nextLine(); // 유저가 선택한 번호 -> 예약 해쉬맵의 해당 예약건 key값
            idCheck = id.matches(idRegEx);
            while (!idCheck) {
                System.out.println("ID는 알파벳 소문자와 숫자를 혼용, 4~10자리로 생성해주세요.");
                System.out.print("ID: ");
                id = sc.nextLine();
                idCheck = id.matches(idRegEx);
            }
            dup = User.memberList.containsKey(id);
        }
        
        User.memberList.put(id, user.input(user));
        
        joinSave();
    }

    public void joinSave() {
        File file = new File(MEMBER_LIST_PATH);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(User.memberList);

        } catch (Exception e) {
            System.out.println("에러발생!!!");
            e.printStackTrace();
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }
    }

    @SuppressWarnings("unchecked")
    public void memberLoad() {
        // testBookList 해쉬맵에 파일 불러와서 다시 저장
        // 예약목록 확인시 현재 로그인된 id와 일치한 예약건만 인출
        File file = new File(MEMBER_LIST_PATH);
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream oos = new ObjectInputStream(fis);

            User.memberList = (HashMap<String, User>) oos.readObject();

            oos.close();
            fis.close();

        } catch (Exception e) {
            System.out.println("불러오는데 실패하였습니다.");
            e.printStackTrace();
        }
    }
}
