package kr.or.bit;


/*
 클래스 구성요소 (필드 + 함수) 중 함수를 배워보자
 
 - 기능(행위)을 만드는 방법!
 - 함수(function, method)
 - method: 행위 또는 기능을 "최소단위"로 정의하는 것 >> 즉 하나의 함수는 하나의 기능만 구현한다.
  ex) 먹는다, 걷는다, 잔다 ...
  
 - 함수는 호출에 의해서만 동작된다.
 
 # JAVA)
    1. void, parameter(0)        >> void print(String str) { 실행 코드 }
       - void: return이 없당
       - parameter: 인수, 매개변수
       - 동전을 넣고 하는 게임기
       - 주는것 0, 받는것 x
    2. void, parameter(x)        >> void print() { 실행코드}
       - 동전을 넣지 않아도 할 수 있는 게임기
       - 주는것 x, 받는것 x
    3. return type, parameter(0) >> int print(int data) {return data + 10}
       - 주는것 0, 받는것 0              ㄴ 어떤 값을 주면 10을 더해서 돌려주겠다. 
                                  ( 그 어떤 값이 어떤 형태인지 표현하는 부분이 return type이다. 여기서는 int )
    4. return type, parameter(x) >> int print() {return 100;}
       - 주는것 x, 받는것0
       
       
    void: 돌려주는 것이 없다 >> return value가 없다
    return type >> 8가지 기본 타입, Array, Class, ... Collection, Interface 등
    parameter type >> 8가지 기본 타입, Array, Class, ... Collection, Interface 등
    
    parameter의 개수는 제한이 없다.
    void print(int a, int b, int c, int d) {}
    >> print(10, 20, 30) -> 정상 실행하지 않음
    >> 이 함수를 정상적으로 실행시키려면
    >> print(10, 20, 30, 40) : 주어진 파라미터의 개수와 똑같은 개수의 값을 넣어주어야 한다.
 
    ex)
    boolean print(bollean b) {return b};
    print(false);
    
    함수의 이름에는 관용적 표현이 있다.
    void a(){} ... (x)
    의미있는 단어의 조합
    getChnnelNumber()
    getEmpListByEmpno
 
 
 */
public class Fclass {
    public int data;
    
    // 4가지 기본 유형
    
    public void m() {// 리턴타입이 없고 파라미터가 없다
        System.out.println("일반함수: void, parameter(x)");
    }
    
    public void m2(int i) {// 리턴타입이 없고 파라미터가 있다
        System.out.println("일반함수: void, parameter(0)");
        System.out.println("parameter value: " + i);
    }
    
    public int m3() {// 리턴타입이 있고 파라미터가 없다
        return 100; // return type이 존재하면 반드시 return 키워드를 사용해야 한다.
    }
    
    public int m4(int data) {// 리턴타입이 있고 파라미터가 있다
        return 100+data;
    }
    
    // 확장 (parameter가 여러개 쓰일 수 있다.)
    public int sum(int i, int j, int k) {
        return i + j + k;
    }
    
    //함수(접근자: public 거의  ...)
    //함수 접근자 private
    // 만든 설계자의 의도는:
    // 이 함수는 외부에서는 사용할 수 없다. >> 내부에서 사용하려고! >> 다른 함수를 도와주는 역할.
    // "내부에서 사용되는 >공통함수<"
    // 공통된 기능을 하는 함수를 같은 클래스 내에서 반복적으로 사용할 때 만드는 것
    private int subSum(int i) {
        return i + 100;
    }
    
    // 각각의 부분이 이 설계도에서 어떤 역할인지를 계속해서 생각하면서 만들어라!
    
    public void callSubSum() {
        int result = subSum(100); // 내부에서 호출
        System.out.println("call result: " + result);
    }
    
    private int operationMethod(int data) {
        return data * 200;
    }
    
    public boolean opSum(int data) {
        // 연산은 다른 함수에게 위임하고
        // 본인은 진위여부만 판단하는 함수
        boolean bo;
        int result = operationMethod(data) ;
        if(result > 0) {
            bo = true;
        }else {
            bo = false;
        }
        return bo;
    }
    
    // Quiz
    // a와 b 둘중에 큰 값을 return하는 함수를 만드세요
    // ex) max(300,100) return 값은 300
    // public int max(int a, int b) {}
    
    //return을 최소화하자!
    public int max(int a, int b) {
        return (a>b) ? a : b;
    }
    
    // 함수의 return type 또는 parameter로 Array, Class 등의 사용자 정의 타입이 올 수도 있다)
    public Tv tCall() { // Tv 타입을 갖는 "같은 타입을 갖는"주소값을 리턴
//        return null; >>  Tv 타입의 객체가 없다!
        
        // 방법1---------
        Tv t = new Tv(); // t라는 변수는 Tv타입 객체가 주소를 가지고 있다.
        t.brandname = "LG";
        System.out.println("t의 주소: "+t);
        return t;
        
        // 방법2---------
//        return new Tv(); // Tv라는 객체의 주소값을 바로 리턴
        
        
        // 방법 1: Tv를 세팅해서 보내줘야겠다.
        //        객체에 어떤 값을 세팅해서 보낼 때 사용
        //        t.brandname = "LG"; 처럼!
        //        만약 main에서 tv.brandname을 호출하면 LG가 호출될 것
        
        // 방법 2: 어떠한 초기화도 없이 주소만 보낼 때 사용
        //        방법 2는 t.brandname = "LG"; 불가능하다.
        //        니가 다 정해라! 하고 강제할 수 있다.
        
    }
    
    public void tCall2(Tv t) { // Tv 타입을 갖는 주소값을 parameter로 준다.
        System.out.println("t 주소 값: " + t);
    }
   

}



















