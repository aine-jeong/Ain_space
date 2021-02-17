

import kr.or.bit.Apt;
import kr.or.bit.BodyInfo;
import kr.or.bit.Emp;
import kr.or.bit.Person;
import kr.or.bit.Tv;

/*    // 함수
        public void print(){}
        //입력 없음 리턴 없음
        
        public void print(int num){}
        // 입력받지만 리턴되는 것이 없음
        // void -> 'return되는 타입이 없음'
         
        public int print(){
          return 10;
        }
        // 입력 없이 리턴시켜줌
        
        public int print(int num){
          return num + 10;
        }
// 입력받고 리턴시켜줌 
 
 */
public class Ex01_Ref_Type {
    public static void main(String[] args) {
        Emp emp = new Emp(); // 클래스 타입을 갖는 변수 -> 참조 변수(주소값 변수)
        System.out.println(emp.toString());
        // kr.or.bit.Emp@5305068a 주소값(변형)
        // ---패키지명----@---주소--- 
        int num = 100; // 값타입 변수
        System.out.println(num);
        
        emp.number = -100;
        System.out.println(emp.number);
        
        emp.setNum(100);
        int result = emp.getNum();
        System.out.println(result);
        
        
        emp.setEname("홍길동");
        String name = emp.getEname();
        System.out.println("name: "+name);
        
       //----------------------------------------------
        // 'instance variable(member field)는 초기화를 하지 않아도 된다'에 대한 해설
        // 객체를 만드는 사용자마다 다른 값을 가질 수 있게 하기 위해서
        Apt sapt = new Apt();
        sapt.door = 20;
        System.out.println(sapt.door);
        System.out.println("sapt 주소: "+sapt);
        //sapt 주소: kr.or.bit.Apt@279f2327
        
        Apt lapt = new Apt();
        lapt.door = 10;
        System.out.println(lapt.door);
        System.out.println("lapt 주소: "+lapt);
        // lapt 주소: kr.or.bit.Apt@2ff4acd0
        
        Apt mapt = new Apt();
        System.out.println(mapt.door);
        System.out.println("mapt 주소: "+mapt);
        // mapt 주소: kr.or.bit.Apt@54bedef2
        
    //--------------------------------------------------------------
        
//        int i = 10;
//        int j;
//        j = i;
//        j = 100;
//        // i값도 100이 되나요? X
//        // 값 할당
        
     
        //주소값 할당
        Apt apt = new Apt();
        Apt kapt = apt;
        
        apt.door = 9999;
        System.out.println(kapt.door);
        
        System.out.println("apt 주소: "+apt);
        System.out.println("kapt 주소: "+kapt);
        // apt 주소: kr.or.bit.Apt@5caf905d
        // kapt 주소: kr.or.bit.Apt@5caf905d  -> 주소가 같다. (같은 객체를 공유하고 있당~~~~)
        
        int[] arr = new int[5];
        int[] arr2 = arr; // 주소값 할당
                // arr와 arr2는 같은 주소를 참조한다
        
       
        // 값타입 (8가지)
        // 참조타입 (class, Array 등 변수에 객체의 주소를 갖고 있는 것)
        
        Apt ap; // 선언 (stack 영역에 공간만 확보: default로 4byte할당받는다.)
        ap = new Apt(); // 할당 (ap라는 변수가 메모리를 갖는다 = 객체의 주소값을 갖는다)
        // 선언과 할당을 분리할 수 있다.
        System.out.println("ap 주소값: " + ap);
        ap = null; // 연결을 끊어버림. 오래동안 아무도 heap의 객체를 사용하지 않으면 가비지컬렉터가 없애버리게 될 것.
        System.out.println("ap 주소값: " + ap);
        
      //--------------------------------------------------------------
        //초기화
        Apt ap2; // main 함수 안에 있는 변수는 지역변수이다 / 근데 지역변수를 초기화하지 않았음
//        System.out.println(ap2); // so, 사용(출력)할 수 없음
        // 클래스나 배열의 초기화는 null로 한다.
        ap2 = null; // 초기화 시켰으므로 사용(출력) 가능!
        
        // 참조타입은 초기화가 메모리를 갖는 것, 기본타입은 초기화하면 값을 갖는 것!!!
        
      //--------------------------------------------------------------
        
        Apt ap3 = new Apt();
        Apt ap4 = new Apt();
        Apt ap5 = ap4;
        
        
        // 주소값 비교
        // == 의 결과는 true, false // (==은 검증하는 연산자) // (변수가 가지고 있는 값)
        System.out.println(ap3 == ap4); //  -> false
        System.out.println(ap4 == ap5); // -> true -> 두 변수는 같은 주소를 가지고 있다.
        
        //--------------------------------------------------------------
        // TV 한대를 생산하세요.
        // 제조회사: 비트
        // 채널을 5번 설정
        // 정보를 출력하세요
        
        Tv bittv = new Tv();
        bittv.brandname = "비트";
        //bittv.ch = 5; (이 방법은 만약 ch을 private로 만들었다면 못건드린다!!!)
        //함수를 다섯번 호출해라.
        bittv.ch_Up();
        bittv.ch_Up();
        bittv.ch_Up();
        bittv.ch_Up();
        bittv.ch_Up(); // 함수는 호출하면 동작하는고
        
        bittv.tv_Info();
        
        // 사원 1명을 생성
        // 사번:7788, 이름: 김유신, 부서: IT,
        // 신체정보: 키는 190, 몸무게는 40
        
        
        Person person = new Person();
        person.empno = 7788;
        person.ename = "김유신";
        person.job = "IT";
        person.sal = 1000;
        //방법 1: 스택에 저장공간을 갖지 않는다.
//        person.bodyinfo = new BodyInfo(); 
                    // public BodyInfo bodyinfo; 여기까지만 선언되어 있었음
                    // 초기화가 되어있지 않으므로 초기화하는 과정을 넣은 것.
//        person.bodyinfo.height = 190;
//        person.bodyinfo.weight = 40; 
        
        //방법 2: 스택에 저장공간을 갖는다.
        BodyInfo info = new BodyInfo();
        info.height = 190;
        info.weight = 40;
        
        person.bodyinfo = info;
        // 방법1 = 방법2 
        // -> but 메모리를 적게 쓰는게 좋은거! 그럼 방법1이 더 좋당~~~~
        
        // ### 방법 1, 방법 2의 그림을 각각 그려보자 혼자서!!!!!!!
        
        
        
    }

}
