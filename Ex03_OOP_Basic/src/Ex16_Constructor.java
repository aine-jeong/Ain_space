/*
 생성자 함수(constructor)
 1. 특수한 목적을 가진 함수
 2. 특수한 목적: member field 초기화
 tip) { 초기자 함수 }  , static{ 초기자 함수 }
 
 3. 일반 함수와 다른 점 (public void m(), public String m(String s) ...)
 3.1. 함수의 이름이 고정되어 있다. (클래스의 이름과 동일하다)
 3.2. 실행 시점: 
 - 객체 생성(new) >> heap 공간이 할당되고 >> 변수(member field) >> 생성자함수 자동 호출
 - return type(x) >> 생성자함수는 무조건 void >> 컴파일러가 자동으로 해준당! (void) 생략 가능
 - public 클래스이름
 
 4. 목적: 생성되는 객체마다 "강제적으로" member field 값을 초기화할 수 있다.
 
 class Car{
     String color;
  }
 - 요구사항: 자동차를 만들면 무조건 색상 하나를 가져야 한다.
 Car car = new Car() <- 이렇게만 써도 문제가 없다 (설계자의 의도가 반영되지 x)
 - 자동차는 각각 다른 색상을 가질 수 있다 (를 만족해야 한다)
 class Car{
     public Car(String color){
     
     }
 }
 
 Car car = new Car(); //() -> 함수를 호출하는 괄호
                   // 이렇게 작성할 때 () 안에 String을 입력하지 않으면 생성되지 않음.
 
 5. 생성자 함수는 "method overloading"
 
 6. 당신이 만약 overloading 생성자 함수를 하나라도 구현했다면 
    default 생성자 함수는 반드시 구현을 통해서만 가능하다.
 
 
 */

// 당신이 만약 자동차를 만든다면 반드시 자동차의 이름을 부여하세요.
class Car{
    String carname = "포니";
    // 보이지 않지만 default로 생성자 함수가 생략되어 있는 것이다.
    // 컴파일러가 알아서 생성한다.
    // public Car() {}
    
    // 직접 작성해보기
    public Car() {
        System.out.println("나 생성자야 .. 강제 구현");
    }
}

class Car2{
    String carname;
    public Car2() { // default constructor
        carname = "포니"; // 초기화
    }
}

class Car3{
    String carname;
    public Car3() {
        carname = "포니";
    }
    public Car3(String name) {
        carname = name;
    }
}

class Car4{
    String carname;
    // default를 구현하지 않았다.
    // [예외적으로 overloading 생성자를 구현했다면] default는 자동으로 생성되지 않는다. 
    // ㄴ> 설계자의 의도: 자동차 이름을 무조건 넣기를 원했다. (강제적 구현을 목적)
    public Car4(String name) {
        carname = name;
    }
}



public class Ex16_Constructor {
    public static void main(String[] args) {
        
        Car car = new Car(); // () : 생성자를 호출하는 괄호
        
        
        Car3 car3 = new Car3(); // default constructor 자동호출
        System.out.println(car3.carname); // 출력결과: 포니
        
        Car3 car4 = new Car3("제네시스"); // overloading constructor
        System.out.println(car4.carname);
        
        Car4 car5 = new Car4("포드");
        System.out.println(car5.carname);
        
        Car4 car6 = new Car4("벤츠");
        System.out.println(car6.carname);
        
    }
}








