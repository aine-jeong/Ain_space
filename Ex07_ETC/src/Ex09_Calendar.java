import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import kr.or.bit.utils.Edu_Date;


/*
* Calendar 를 상속받아 완전히 구현한 클래스는 
 * GregorianCalendar
   buddhisCalendar 있는데 getInstance()는 [시스템의 국가와 지역설정]을 [확인]해서
      태국인 경우 buddhisCalendar 의 인스턴스를 반환하고 그 외에는 GregorianCalendar
     의 인스턴스를 반환한다
   GregorianCalendar 는 Calendar를 상속받아 오늘날 전세계 공통으로 사용하고 있는 
   그레고리력에 맞게 구현한 것으로 태국을 제외한 나머지 국가에서는 GregorianCalendar 사용
   그래서 인스턴스를 직접 생성해서 사용하지 않고 메서드를 통해서 인스턴스를 반환받게하는
   이유는 최소의 변경으로 프로그램 동작을 하도록 하기 위함
   class MyApp{
     static void main(){
      Calendar cal = new GregorianCalendar();
      다른 종류의 역법의 사용하는 국가에서 실행하면 변경......    }  }
   class MyApp{
     static void main(){
      Calendar cal = new getInstance();
        다른 종류의 역법의 사용하는 국가에서 실행하면 변경......   }  }
  API : 생성자 Protected Calendar() 
 */
//Java API
//날짜 : Date (구) -> Calendar(신)
public class Ex09_Calendar {
    public static void main(String[] args) {
        Date dt = new Date();
        System.out.println(dt.toString()); // Wed Feb 17 10:07:25 KST 2021 // 구버전
        
        //신버전
        //Calendar cal = new Calendar(); // 추상자원
        Calendar cal = Calendar.getInstance(); // 내부적으로 new GregorianCalendar()날짜 객체를 생성해서 주소를 전달하겠다.
        // 얘도 다형성이당!
        System.out.println(cal.toString()); // 재정의(날짜 정보가 전부 출력된다)
        
        //당신이 필요한 형식을 추출해서 조합해서 사용해라
        System.out.println("년도: " + cal.get(Calendar.YEAR));
        System.out.println("월: " + (cal.get(Calendar.MONTH)+1)); // 0~11월로 되어있으니까 +1 해줘야댄다
        System.out.println("일: " + cal.get(Calendar.DATE));
        
        //cal.get() 의 리턴타입 >> 정수 >> 결과를 연산할 수 있다.
        
        System.out.println("이 달의 몇번째 주일까? " + cal.get(Calendar.WEEK_OF_MONTH));
        System.out.println("이번 달의 몇일이니? " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("이번주의 몇번째 날이니? " + cal.get(Calendar.DAY_OF_WEEK)); // 시작이 일요일이당
        
        
        //시 분 초 각각 출력
        System.out.println("시: " + cal.get(Calendar.HOUR));
        System.out.println("분: " + cal.get(Calendar.MINUTE));
        System.out.println("초: " + cal.get(Calendar.SECOND));
        
        System.out.println("오전/오후" + cal.get(Calendar.AM_PM));
        
        //학사관리 시스템
        //회원가입 페이지, 학사신청 페이지 >> 페이지 본수 200페이지
        //150개의 페이지는 날짜 정보
        //상단에 현재 날짜 출력 ex) 2021-02-17
        //요구사항: 2021년 02월 17일 로 변경해주세요
        //150번의 수정을 통해서 변경해야 하는가 ...
        
        // 별도의 class 설계 >> method 통해서 >>
        // 150페이지의 EduDate.today(); >> 호출 >> 변경 >> today함수 한번만 수정
        
        String result = Edu_Date.DateString(cal);
        System.out.println(result);
        
        result = Edu_Date.DateString(cal,"-");
        System.out.println(result);
        
        result = Edu_Date.monthFormat_DateString(cal);
        System.out.println(result);
        
    }

}

