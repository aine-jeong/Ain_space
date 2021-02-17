/*
 
 OOP (객체 지향 프로그래밍) >> 설계도 만들기
 1. 상속(재사용성)
 2. 캡슐화(은닉화) : private >> getter/setter
 3. 다형성: 하나의 타입으로 여러 개의 객체 주소를 갖는 것
 
 >> method overloading
 >> 하나의 이름으로 여러가지 기능을 하는 함수
 System.out.println() >> println() 이름은 하나고 기능은 여러개닷
 1. 성능향상과 관련 없다
 2. 설계자가 개발자의 편리성을 위해서 제공한 것이다.
 
 ##문법##
 - 함수의 이름은 같아야 한다.
 - "parameter"의 개수 또는 타입은 달라야 한다.
 - return type은 오버로딩의 판단 기준이 아니다.
 - parameter의 순서가 다름을 인정한다. (주의)
 
 class out {
     public void println(){}
     public void println(int i) {}
     public void println(String s) {}
   }
 
 
 */

class Human2{
    String name;
    int age;
}

class OverTest{
    int add(int i) {
        return 100+i;
    }
    
    int add(int i, int j) {
        return i+j;
    }
    
//    String add(int j) { // return type은 오버로딩의 판단 기준이 아니다.
//        return "";
//    }
    
    String add(String s) {
        return "hello" + s;
    }
    
    String add(String s, int i) {
        return null;
    }
    
    String add(int i, String s) { // 순서만 달라도 오버로딩으로 인정해준다.
        return null;
    }
    
    void add(Human2 human) { // 인정
        human.name = "홍길동";
        human.age = 100;
        System.out.println(human.name + " , " + human.age);
    }
    // Human2 add(Human2 h) {} // 충돌난다
}



public class Ex14_Method_Overloading {
    public static void main(String[] args) {
        OverTest ot = new OverTest();
        ot.add(100);
        ot.add(100,200);
        
        ot.add(new Human2());
        
        String result = ot.add("방가방가");
        System.out.println(result);
    }
}
