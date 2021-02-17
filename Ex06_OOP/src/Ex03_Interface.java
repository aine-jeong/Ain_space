/*
 추상클래스: 인터페이스(interface)
 
 인터페이스: 표준, 약속, 규약, 규칙을 만드는 행위
 
 [추상 클래스와 인터페이스 공통점]
 1.   스스로 객체 생성이 불가능하다 (new 연산자를 통한 객체 생성 불가)
 1.1. 차이점: 추상 클래스(완성 + 미완성), 인터페이스(모든 것이 미완성(추상자원))
 
 2. 사용
 추상클래스: extends
 인터페이스: (구현해라) implements 사용
 class Car extends abclass{}
 class Car implements la{} // 인터페이스가 가지는 추상자원을 재정의해라
 
 추상클래스 인터페이스
 1. 다중 상속(구현) 가능 >> 약속(작은 단위로 여러개) >> 여러 개의 작은 약속들을 모아서 큰 약속으로 조합해서 사용
 class Test extends Object implements Ia, Ib, Ic
 - 약속을 크게 만들면 사용성이 떨어진다 >> 특수한 것에 한정되버린다! >> so, 쪼갠것 ....
 
 2. 추상클래스는 단일상속원칙 (계층적 상속)
 
 3. 추상클래스 (완성 + 미완성)
 
 4. 인터페이스는 상수를 제외한 나머지는 미완성 자원(추상자원)이다 >> JDK (Default값, static값 (잘 안쓰이니까 일단 신경쓰지 마세용))
 
 인터페이스는 소프트웨어 설계의 최상위 단계 >> 경험이 많아야 한다... 어렵다.. 
 
 ++개발자(초급)++
 1. 인터페이스를 "다형성"입장으로 접근해라 (인터페이스는 부모타입이다)
 2. 서로 연관성이 없는 클래스를 하나로 묶어주는 기능 (인터페이스를 구현함으로써 같은 부모를 가지게 한다)
 3. JAVA API가 이미 여러분이 사용할만한 수많은 Interface를 만들어놓았다. (가져다 쓰면 돼)
 4. 인터페이스의 관용적 표현: (~able) / 수리할 수 있는, 날수 있는~~ >> Cloneable (관용적 표현)
 5. 객체간 연결고리(객체간 소통) >> 다형성 >> 같은 부모
 
 */

/*
interface Iable{
    String print();
    // 출력할때 print 함수 사용 ....리턴 문자열
}

class Test implements Iable{

    @Override
    public String print() {
        // TODO Auto-generated method stub
        return null;
    }
}

*/

// 설계 표준 >> 구현 강제 >> 재정의
/*
 1. 실제 구현부를 가지고있지 않다: 실행 블럭이 없는 함수를 가지고 있다 (void run();)
  ex) 게임 설계: 이동은 move라고 하자 >> Interface로 만들어두기 
                 >> move(int x, int y) >> 탱크, 마린 >> move 구현
                 >> 강제 구현을 내포하고있다. (all 미완성)
 ### JAVA API: Collection(동적배열 = (자바의)자료구조) >> Vector, "#ArrayList#", HashSet, "#HashMap#", ...
    > Vector, "#ArrayList#", HashSet, "#HashMap#", ... 넘들은.. 수많은 interface 구현
    
 2. 생성방법 (interface 자원)
 2.1. public static final int VERSION=1; 
        >> int VERSION = 1 >> 컴파일러가 public static final 자동으로 붙여준당
 
   
 2.2. public abstract /void/ run(); >> [public abstract] 생략 >> 실제로 void run() 만 작성
 
 // 원래는 이거구
 interface Iable{
     public static final int VERSION=1;
     public abstract void run();
   }
   
 // 실제사용은
  interface Iable{
     int VERSION=1;
     void run();
     String move(int x, int y);
   }
   
 interface able { }
 interface able { int NUM = 0; }
 interface able { void run(); void move(); }
 
 class Test extends Object implement Iable, Bable, Cable
   
    
    
 */

interface Humanable{
    int AGE = 100;
    String GENDER = "남";
    
    String print();
    void message(String str);
}

interface Iable{
    int AGE = 10;
    void info();
    String val(String s);
}

class Test extends Object implements Humanable , Iable{
    // class Test implements Humanable , Iable{ 이렇게 쓸 수 있음 (extends Object생략 가능)

    @Override
    public void info() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String val(String s) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String print() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void message(String str) {
        // TODO Auto-generated method stub
        
    }
    
}

public class Ex03_Interface {
    public static void main(String[] args) {
        Test t = new Test();
        Humanable h = t; //다형성; 부모는 자식타입의 객체의 주소를 가질 수 있다
        System.out.println(h.AGE); // Humanable의 AGE에 접근
        
        Iable ia = t;
        System.out.println(ia.AGE); // Iable의 AGE에 접근
        
        
        
        
        
    }
}
