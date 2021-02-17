import kr.or.bit.common.Car;

/*
 
 클래스 == 설계도 == 데이터 타입(사용자 정의)
 
 클래스 구성 요소: [필드(속성) + 함수(기능)] + 생성자 함수
 - 필드(field): 고유데이터, 상태 데이터, 부품(참조)정보 >> 변수
 - 함수(function): 기능과 행위를 정의하는 영역이 있다 >> 최소 단위(1개의 기능)
 - 추가적으로 생성자 함수(목적이 명확한 함수) >> member field 초기화를 목적으로 한다.
 
 클래스, 필드, 생성자, 함수 -> 어느 곳에 위치하느냐? (위치하는 곳에 따라 종류가 달라진당) -> 이것을 scope(영역)이라고 한다.
 ## 접근자, 한정자, 수정자 들을 붙이면 또 성격이 달라진당!
 
 >> public, private, default, protected(: 얘는 상속 이후로 배우게 될 것)
 
 1. public class Car{}
  : 얘의 경로는 원래 kr.or.bit.common 폴더 아래에 있당.
  : 그렇지만 public으로 선언되었기 때문에 여기서도 자유롭게 사용할 수 있다.
 
 2. class AirPlane{}
  : 얘는 default가 생략되어 있는 것 (컴파일러가 자동으로 default가 있는 것처럼 사용)
  : default 접근자는 "같은 폴더(package)"에서만 접근할 수 있다. >> 다른 폴더에 있으면 접근할 수 없음! 
  : default 접근자는 연습목적으로 사용... 현업에서는 거의 사용하지 않음!
  : Program이라는 같은 패키지 안에서는 사용 가능하다.
  
  3. 하나의 물리적인 자바 파일은 여러 개의 클래스를 가질 수 있다.
  : Ex01_main.java >> 여러 개의 클래스 생성 o >> 단, Ex01_main 클래스만 public을 가진다.
  : 나머지 클래스는 default
  
 */

class Test { // Test클래스는 public을 가질 수 없음
            // default class Test
    int data; // 접근제한자: default
    
    public int data2; // public으로 선언은 할 수있으나(문법적으로는 문제 없음) 의미가 없당..
                    // 클래스에 public이 없으니까 어차피 다른 폴더에서 사용 불가!
    private int data3; // private을 썼다면 getter, setter 함수를 만들어서 사용해야함
                        // 만약 게터, 세터를 작성하지 않으면 data3은 사용할 수 없는 변수
    
    // 어차피 연습용으로 위와 같이 만든다면, 굳이 접근제어자를 쓸 필요가 없당~~~~
    // 현업에서는 패키지를 많이 나눠서 사용하기 때문에 이렇게 쓸일 x
    
}

public class Ex01_main {
    public static void main(String[] args) {
        Car car = new Car();
        Test test = new Test();
        System.out.println(test.data); // 이렇게 가능할 수는 있지만, 현업에서 사용하는 것은 아님
        
        car.door = 10;
    }
}
