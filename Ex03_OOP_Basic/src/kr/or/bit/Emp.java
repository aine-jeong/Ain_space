package kr.or.bit;

// class == 설계도 == Type(사용자 정의 타입)

//사원이라는 설계도
//사원을 표현 (사번, 이름, 직종 ......)
public class Emp {
    //함수: 최소의 기능(행위) 단위
    
    //정보를 담을 수 있는 변수
    //변수: 정보(고유, 상태, 부품)를 담을 수 있는 공간의 이름 >> instance variable(객체변수) >> member field
    
    //변수의 종류(scope: 유효 범위): 선언되는 위치 
    // 1.   local variable(지역 변수): 함수 내 / 반드시 초기화가 전제가 되어야 한다.
    //                            class person{ public void run() {int speed;}} 
    //                                            여기서 speed가 지역변수이다. run이 호출되면 생성되었다가 사라진다.
    // 1-1. block variable: 함수안에 if, while, for등의 블럭 안에 들어가는 변수들
    // 2.   instance variable(객체 변수): class person{ public int age; } 
    //                             ㄴ> Heap 안의 오브젝트(객체) 안에 생성되는 변수이기 때문에 객체 변수라고 한다.
    // 3.   static variable: 공유 자원(객체 간)
    
    //클래스의 종류
    // 1. class Test{ } : 독자적인 실행이 불가능 >> 다른 클래스를 도와주는 클래스(타입) >> lib(라이브러리)
    // 2. class Test{public static void main(String[] args){}} : 독자적인 실행이 가능한 클래스
    // 2-1. 함수의 이름(main) >> main이 있다면 main을 시작점(진입점)으로 보자고 약속해두었다.
    // tip) c# >> Main() 'c#과 java는 유사한 문법을 가지고 있다'
    
    
    private int empno; //사원은 사번을 가지고 있다 (사번은 숫자의 형태이다)  (empno -> 객체 변수이자, 멤버 변수 라고 함!)
    private String ename;
    private String job;
    
    
    public String getEname() { // getter 함수
        return ename + "님";
    }
    public void setEname(String ename) { // 캡슐화된 ename에다 값을 쓸 수 있는 setter 함수
        this.ename = ename;
    }
    
    // 객체지향언어이기 때문에 "멤버필드 앞에" public클래스를 만들 일은 (거의)없음
    // 현업에서 모든 클래스를 만들 때 "멤버필드 앞에" private를 사용한다!!
    // 왜냐면 객체지향언어에서 캡슐화는 필수니까~~~
    // 자원은 감춰두고 기능단위는 열어둔다!
    
    //private 캡슐화 : 자원을 보호하겠다.
    //멤버 필드에 직접 할당을 막고 간접할당을 통해서 데이터 제어하는 것(캡슐화)을 목적으로 한다. (자원보호를 위해서!)
    private int num;
    // 간접(누군가를 통해서 전달, 누군가를 통해서 받겠다) 
    //    private는 외부에서 접근을 할 수 없으므로 접근할 방법을 만들어 주어야 함
    //    쓰기/읽기를 전용으로 하는 함수를 각각 만들어 준다.
    //    setter와 getter를 만들면 간접할당 하도록 만들어줄 수 있다.
    public void setNum(int n) { // setter 기능함수(write 함수)
                                    // ()안의 int n <- 파라미터
        if(n > 0) { // 조건을 만들 수 있음
            num = n;
        }else {
            num = 0;
        }
       
    }
    public int getNum() { // getter 기능함수(read 함수)
        return num;
    }
    
    public int number; // 참조변수가 직접 접근이 가능해서 -100이라는 값을 넣는 것을 막을 방법이 없음.
    
    // void: 리턴타입이 없는 함수
    public void print() {
        int number = 0; // 넘버는 지역변수이다.
        
        for(int i = 0; i < 10 ; i++) { // i는 블럭변수
            
        }
        //    System.out.println(i); -> for 블럭 밖에서는 i라는 변수를 사용할 수 없다.
        // 지역에 선언 / 로컬에 선언 / 파라미터 / 상수로 만들기 -> 이 방법들로 해결할 수 있다. 
    }

}
