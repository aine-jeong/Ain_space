/*
OOP
1. 상속
2. 캡슐화
3. 상속

####
1. 상속
java>> child extends Base
c#  >> child : Base

2.  특징
2.1. 다중상속 불가
2.2. 단일상속만 가능하다 (계층적 상속은 가능 -> 여러 개의 클래스 상속받는 방법)
2.3. 다중 상속을 지원 (interface)

3.1. 진정한 의미: 재사용성
3.2. 단점: 초기 설계 비용이 많이 들어간다.
3.3. 재사용성 >> 설계 >> 비용 (공통분모(추상화))

4. 상속관계
GrandFather >> Father >> Child 상속관계
Child child = new Child(); 
부모부터 Heap 메모리에 올라간다.



 */

// 상속관계 Base 클래스가 Object를 가지고 있다.
class GrandFather {
    public GrandFather() { // default constructor
        System.out.println("GrandFather");
    }
    public int gmoney = 5000;
    private int pmoney = 1111; // 접근자가 private 
                            //(객체, 상속관계에서 모두 접근 불가능 유일하게 내부에서만 접근 가능하다.)

//    public void call() {
//        System.out.println(pmoney);
//    }
    
    
}

class Father extends GrandFather{
    public Father() {// default constructor
        System.out.println("Father");
    }
    public int fmoney = 3000;
}

class Child extends Father{
    public Child() {// default constructor
        System.out.println("Child");
    }
    public int cmoney = 1000;
}

// default
// 사용자가 만드는 모든 클래스는
// class Car extends Object
class Car{ // extends Object
    
}

// 사용자가 만드는 모든 클래스는 default로 Object(최상위)class를 상속한다.
// Object : 가장 추상화(일반화)
// 가지는 자원: 모든 클래스가 공통으로 사용하는 것들 (주소 확인, 등...) 

public class Ex01_Inherit {
    public static void main(String[] args) {
        
        Child child = new Child();
        System.out.println(child.gmoney);
        System.out.println(child.fmoney);
        System.out.println(child.cmoney);
        
//        child.call();
        
        Car car = new Car();
        
        
    }
}



