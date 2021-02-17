package kr.or.bit.common;

public class Car {
    public int door;
    // 만약 int door; 라고 선언했다면 Ex01_main에서 사용할 수 없음 
    //   ㄴ> 클래스는 public이지만 door의 접근자가 default이다.
    public int window;
    private int handle; // -> setter, getter가 필요하당
    
    

}
