package kr.or.bit;
// 20210201-3번째 시간-1

// 창문의 수를 가지고 있다
// 속도를 가지고 있다

// 2가지 속성은 캡슐화할 것
// 속도는 음수값이 오면 0으로 초기화한다.
// 속도를 10씩 올리거나 감소하는 기능을 만들어보기
// 속도가 마이너스 값을 가지면 0으로 초기화

public class Car {
    private int window;
    private int speed;
    
    public int getWindow() {
        return window;
    }
    public void setWindow(int window) {
        this.window = window;
    }
    
    
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        if(speed < 0) {
            this.speed = 0;
        }else {
            this.speed = 0;
        }
    }
    
    public void speedUp() {
        speed += 10;
    }
    
    public void speedDown() {
        if(this.speed > 0) {
            this.speed -= 10;
        }else {
            this.speed = 0;
        }
    }
    
    
    

}
