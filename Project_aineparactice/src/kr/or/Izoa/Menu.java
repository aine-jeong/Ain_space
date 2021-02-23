package kr.or.Izoa;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);

    public String loginID;
    
    static int userDateChoice;
    static int userTimeChoice;
    static String[] dateList = new String[5];
//    String[][] date_Time_List = new String[5][4];

    public User user = new User();
    public Login login = new Login();
    public Member member = new Member();

    void showMenu() {

        while (true) {
            System.out.println("@=====[Izoa_Salon]=====@");
            System.out.println("<1> 회원가입");
            System.out.println("<2> 로그인");
            System.out.print("원하는 메뉴 번호를 입력하세요>  ");
            int userChoice = sc.nextInt();
            sc.nextLine();

            while (userChoice > 2 || userChoice < 1) {
                System.out.println("메뉴 번호를 잘못 입력하셨습니다.");
                System.out.print("다시 입력해주세요: ");
                userChoice = sc.nextInt();
            }

            switch (userChoice) {
            case 1:
                user.join();
                break;
            case 2:
                loginID = login.Login_Check2();
                // 관리자면 true, 회원이면 false가 리턴된다 (ver1)

                // 로그인체크시 아이디가 리턴된다. (ver2)

                // if (id.e(admin) { managerMenu(); }
                // else { memberMenu(); }
                break;
            }
        }
    }

    void managerMenu() { // 관리자 메뉴
        // 매니저 매니저 뉴 매니저

        // 1 회원관리 2 예약관리 3 리뷰조회 4 매출조회 5 로그아웃 6 프로그램 종료 보여주고 입력받기

        // 메뉴번호 범위 체크

        // 1. manager_MemeberMenu
        // 2. manager_BookMenu
        // 3. 매니저.reviewInfo
        // 4. 매니저.payinfo
        // 5. 매니저.logout
        // 6. 매니저.프로그램 종료
    }

    void memberMenu() { // 회원 메뉴
        // 로그인 된 상태이다....
        // loginID

        // 1. member_MemberMenu();

        // 2. member_ReviewMenu();
        // 3. member_BookMenu();
        // 4. Member.logout();

    }

    void member_MemberMenu() {

        // 1. Member.memberInfo(); (내정보 조회)
        // 2. Member.memberEdit(); (정보 수정)
        // 3. Member.memberDel(); (회원 탈퇴)

    }

    void member_ReviewMenu() {

        // 1. reviewList 읽어오기
        // 2. Member.reviewAdd
        // 3. Member.reviewEdit
        // 4. Member.reviewDel

    }

    void member_BookMenu() {

        // 1. Member.booking
        // 2. Member.bookInfo
        // 3. Member.bookEdit
        // 4. Member.bookDel

    }

    public void member_Book_Date() {
        
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("[yyyy년 MM월 dd일]");
        String date = dateFormat.format(cal.getTime());
        
        try {
            for(int i = 0; i < dateList.length ; i++) {
                cal.add(Calendar.DATE,1);
                date = dateFormat.format(cal.getTime());
                dateList[i] = "<"+(i+1)+"> "+date;
            }
            for(String d : dateList) {
                System.out.println(d);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            
//        System.out.println("예약을 원하시는 날짜 번호를 입력해주세요.");
//        System.out.print("> ");
//        userDateChoice = sc.nextInt();
//        
//        //## 범위를 벗어나는 번호를 입력한 경우
//        //## 이미 예약된 날짜의 번호를 선택한 경우
//        //## 예외구문 전체에 씌우기
        

    }

    public void member_Book_Time() {
      //날짜 + 시간 2차원 배열 (예약정보 저장해둬야 한다)
        
        
        for (int i = 0; i < member.date_Time_List.length; i++) {
            member.date_Time_List[i][0] = "<1타임> [9:00-11:00]";
            member.date_Time_List[i][1] = "<2타임> [13:00-15:00]";
            member.date_Time_List[i][2] = "<3타임> [15:00-17:00]";
            member.date_Time_List[i][3] = "<4타임> [17:00-19:00]";
        }
        
//        userDateChoice--;
        member.userDateChoice--;
        for(String str : member.date_Time_List[member.userDateChoice]) {
            System.out.println(str);
        }
        
//        System.out.println("예약을 원하시는 타임의 번호를 입력해주세요.");
//        System.out.println("(ex) 1타임을 원하시는 경우 \" 1 \" 입력");
//        System.out.print("> ");
//        userTimeChoice = sc.nextInt();
//        
//        // 예약 완료시 날짜-시간 2차원배열에 <n타임> [예약완료] 로 변경시키기....
//        date_Time_List[userDateChoice-1][userTimeChoice-1] = "<"+userTimeChoice+"타임> " + "[예약완료]";
//        
//        //## 범위를 벗어나는 번호를 입력한 경우
//        //## 이미 예약된 타임의 번호를 선택한 경우 
//        //## 예외처리구문 씌우기
//        //## 예매 할건지 다시 묻기
//        //## 예매 취소시 다시 날짜선택 or 예약관리 화면으로 이동시키기
        
    }

    void member_Book_StyleMenu() {

        // 1. 커트
        // 2. 염색
        // 3. 펌
        System.out.println("1. 커트 ------15,000");
        System.out.println("2. 염색 ------30,000");
        System.out.println("3. 펌 ------50,000");
        
    }

    void manager_MemberMenu() {

        // 1. 매니저.memberInfo
        // 2. 매니저.memberEdit (회원수정)
        // 3. 매니저.memberDel (회원 삭제)

    }

    void manager_BookMenu() {

        // 1. 매니저.bookInfo
        // 2. 매니저.bookEdit
        // 3. 매니저.bookDel

    }
}
