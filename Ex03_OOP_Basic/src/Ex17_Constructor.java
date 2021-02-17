/*
 자동차의 기본은
 문의 개수 4개, 자동차의 색상 기본은 red
 
 1. 기본사양 구매 가능
 2. 옵션1: 문 변경, 자동차의 색상 기본
 3. 옵션2: 자동차의 색상 변경, 문 기분
 4. 옵션3: 자동차의 색상 변경, 문 변경
 */


// 좋은 코드는 아니다 (why?)
// 1. parameter의 이름이 모호하다 (member field명과 같게 만들기) >> this
// 2. 반복되는 코드가 있다 >> this
class Car6{
    int door;
    String color;
    
    public Car6() {
        door = 4;
        color = "red";
    }
    
    public Car6(int d) {
        door = d;
        color = "red";
    }
    
    public Car6(String c) {
        door = 4;
        color = c;
    }
    
    public Car6(int d, String c) {
        door = d;
        color = c;
    }
    
    public void carInfo() {
        System.out.println("door: "+door+", color: "+color);
    }
    
}

public class Ex17_Constructor {
    public static void main(String[] args) {
        Car6 car = new Car6();
        car.carInfo();
        
        Car6 car2 = new Car6("pink");
        car2.carInfo();
        
        Car6 car3 = new Car6(2, "gold");
        car3.carInfo();
        
    }
}
