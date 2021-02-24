package kr.or.Izoa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Member {
    Scanner sc = new Scanner(System.in);

    public String id = loginUser();
    public String pw, name, phone;

    Map<Integer, Book> bookList = new HashMap<Integer, Book>();
    

//    static int count; // 예약번호 부여 (9000시작~)

//    List<Book> bookList = new ArrayList<Book>(); // 전체 회원 예약 목록 >> ## 메인 클래스에서 만들어야하는 것 같은뎅.. ##
//    static int userDateChoice;
//    static int userTimeChoice;
//    static int userStyleChoice;
    String[][] date_Time_List = new String[5][4]; // 날짜-시간 배열 (<1타임> [9:00~11:00] -> <1타임> [예약완료]
    String bookListPath = "C:\\Temp\\bookListTest.txt";

    public String loginUser() {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("C:\\Temp\\loginUser.txt");
            br = new BufferedReader(fr);
            String str = "";
            while ((str = br.readLine()) != null) {
                id = str;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return id;
    }

    public Member(String pw, String name, String phone) {
        this.pw = pw;
        this.name = name;
        this.phone = phone;
    }

    // ###추가한부분###
    public Member() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Member [ pw=" + pw + ", name=" + name + ", phone=" + phone + "]";
    }

    public void booking() {
//        Menu menu = new Menu();
//
//        menu.member_Book_Date();
//        System.out.println("예약을 원하시는 날짜 번호를 입력해주세요.");
//        System.out.print("> ");
//        userDateChoice = sc.nextInt();
//        // ## 범위를 벗어나는 번호를 입력한 경우
//        // ## 이미 예약된 날짜의 번호를 선택한 경우
//        // ## 예외구문 전체에 씌우기
//
//        menu.member_Book_Time();
//        System.out.println("예약을 원하시는 타임의 번호를 입력해주세요.");
//        System.out.println("(ex) 1타임을 원하시는 경우 \" 1 \" 입력");
//        System.out.print("> ");
//        userTimeChoice = sc.nextInt();
//
//        // ## 범위를 벗어나는 번호를 입력한 경우
//        // ## 이미 예약된 타임의 번호를 선택한 경우
//        // ## 예외처리구문 씌우기
//
//        menu.member_Book_StyleMenu();
//        System.out.println("예약을 원하시는 시술 번호를 입력해주세요.");
//        System.out.print("> ");
//        userStyleChoice = sc.nextInt();
//        // ## 범위를 벗어나는 번호를 입력한 경우
//        // ## 예매 할건지 다시 묻기
//        // ## 예매 취소시 다시 날짜선택 or 예약관리 화면으로 이동시키기
//        String hairStyle = null;
//        switch (userStyleChoice) {
//        case 1:
//            hairStyle = "커트";
//            break;
//        case 2:
//            hairStyle = "염색";
//            break;
//        case 3:
//            hairStyle = "펌";
//            break;
//        }
//
//        String book_date = Menu.dateList[userDateChoice]; // 예약한 날짜
//        String book_time = date_Time_List[userDateChoice][userTimeChoice - 1]; // 예약한 시간
//        // 처리 전 날짜와 시간을 저장해둬야 한다!
//        // $$$$ userDateChoice를 메뉴에서 --시켰다 (여기서 -1하면 범위넘어감)
//
//        // 예약 완료시 날짜-시간 2차원배열에 <n타임> [예약완료] 로 변경시키기....
//        date_Time_List[userDateChoice][userTimeChoice - 1] = "<" + userTimeChoice + "타임> " + "[예약완료]";
//
//        // @@@임시@@@
////        String hairStyle = "커트";
//
        Book book = new Book();

        // 전체 예약 목록에 저장
        
        // 예약번호 랜덤부여 (예약번호 -> HashMap key값)
        int bookNum = (int) (Math.random() * 9000 + 1000);
        boolean dup = true;
        while(dup){
            dup = bookList.containsKey(bookNum);
            bookNum = (int) (Math.random() * 9000 + 1000);// 해당 번호가 있으면 true반환
        }
        
        bookList.put(bookNum, book.input(book));
        
        // ## 시술종류 카트 만들기
        // ## 고객 이름만 뽑아다가 넣기 ..

        

        // 전체 예약 목록 텍스트파일에 저장하기
        bookingsave();
        
//        File file = new File(bookListPath);
//        FileOutputStream fos = null;
//        ObjectOutputStream oos = null;
//        try {
//            fos = new FileOutputStream(file); // true 뻈당
//            oos = new ObjectOutputStream(fos);
//
//            oos.writeObject(testBookList);
//
//        } catch (Exception e) {
//            System.out.println("에러발생!!!");
//            e.printStackTrace();
//        } finally {
//            try {
//                oos.close();
//                fos.close();
//            } catch (Exception e2) {
//                // TODO: handle exception
//            }
//        }

    }
    
    public void bookingsave() {
        File file = new File(bookListPath);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file); // true 뻈당
            oos = new ObjectOutputStream(fos);

            oos.writeObject(bookList);

        } catch (Exception e) {
            System.out.println("에러발생!!!");
            e.printStackTrace();
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (Exception e2) {
                // TODO: handle exception
            }
        }
    }

    // 검증되지 않은 연산자 관련 경고 억제시키는 이노테이션
    @SuppressWarnings("unchecked")
    public void bookingInfo() {
        // testBookList 해쉬맵에 파일 불러와서 다시 저장
        // 예약목록 확인시 현재 로그인된 id와 일치한 예약건만 인출
        File file = new File(bookListPath);
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream oos = new ObjectInputStream(fis);

            bookList = (HashMap<Integer, Book>) oos.readObject();

            Set<Integer> set = bookList.keySet();
            System.out.println("******예약목록******");
            for (Integer number : set) {
                Book value = (Book) bookList.get(number);
                if(this.id.equals(value.id)) {
                    System.out.println("예약번호: " + number + " :: " + value.toString());
                }
            }

            oos.close();
            fis.close();

        } catch (Exception e) {
            System.out.println("불러오는데 실패하였습니다.");
            e.printStackTrace();
        }
    }

    public void bookingEdit() {

//        System.out.println("****고객님의 예약 목록****");
        bookingInfo();
        System.out.println("수정을 원하시는 예약건의 예약번호를 입력해주세요.");
        System.out.print("> ");
        int userEditBookNum = sc.nextInt(); // 유저가 선택한 번호 -> 예약 해쉬맵의 해당 예약건 key값
        
        // 해당 예약번호가 존재하는지 확인
        boolean dup = bookList.containsKey(userEditBookNum);
        while(!dup){
            System.out.println("예약 번호를 잘못 입력하셨습니다.");
            System.out.println("수정을 원하시는 예약건의 예약번호를 입력해주세요.");
            System.out.print("> ");
            userEditBookNum = sc.nextInt(); // 유저가 선택한 번호 -> 예약 해쉬맵의 해당 예약건 key값
            dup = bookList.containsKey(userEditBookNum);
        }
        
        Book book = new Book();
        bookList.put(userEditBookNum, book.input(book)); // 유저가 선택한 예약번호 예약건의 내용을 덮어씌우기
        
        bookingsave(); // 변경된 내역 저장
        System.out.println("예약이 변경되었습니다.");
        bookingInfo(); // 예약 변경 확인

    }

    public void bookingDel() {
        bookingInfo();
        System.out.println("삭제를 원하시는 예약건의 예약번호를 입력해주세요.");
        System.out.print("> ");
        int userDelBookNum = sc.nextInt(); // 유저가 선택한 번호 -> 예약 해쉬맵의 해당 예약건 key값
        // 해당 예약번호가 존재하는지 확인
        boolean dup = bookList.containsKey(userDelBookNum);
        while(!dup){
            System.out.println("예약 번호를 잘못 입력하셨습니다.");
            System.out.println("수정을 원하시는 예약건의 예약번호를 입력해주세요.");
            System.out.print("> ");
            userDelBookNum = sc.nextInt(); // 유저가 선택한 번호 -> 예약 해쉬맵의 해당 예약건 key값
            dup = bookList.containsKey(userDelBookNum);
        }
        
        System.out.println("삭제시, 복구할 수 없습니다.");
        System.out.println("삭제하시겠습니까?");
        System.out.println("<1> 예 / <2> 아니오(메뉴화면으로 이동)");
        int userDelCheck = sc.nextInt();
        if(userDelCheck == 1) {
            bookList.remove(userDelBookNum);
            bookingsave();
            System.out.println("삭제되었습니다.");
        } else return;
        
    }

    public void logout() {

    }
}