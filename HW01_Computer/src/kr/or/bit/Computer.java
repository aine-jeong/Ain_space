package kr.or.bit;

import java.util.Scanner;
// #클래스에 있는 모든 멤버필드는 일단 캡슐화 하는 것으로 생각하면 된다~~~~ (접근자 private)
// #고유정보 상태정보 등등~~~

// 
public class Computer {
    Scanner scanner = new Scanner(System.in);
    //#접근자 붙여라~~~~~~~~~~~~ 지금 default로 되있는 것...
    
    private int price;
    private String brand;
    private int number;
    private String color;
    
    static String input;
    //#접근자 붙여라~~~~~~~~~~~~ 지금 default로 되있는 것...
    
    private boolean sleepState;
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    
    public Computer() {
        this(500000, "TG", 111111, "white");
    }
    
    public Computer(int price, String brand, int number, String color) {
        this.price = price;
        this.brand = brand;
        this.number = number;
        this.color = color; 
    }
    
    //정보보기
    public void ComInfo() {
        System.out.printf("가격: %d 브랜드: %s 시리얼넘버: %d 색상: %s \n",price,brand, number, color);
        System.out.println("현재 절전모드 상태: "+ ((this.sleepState == true)? "On":"Off") );
    }
    
    //부품
    static MainBody mainbody = new MainBody();
    static Keybord keybord = new Keybord();
    static Monitor monitor = new Monitor();
    // # 왜 static으로 했을까 ? -> 그럼 메인에서 사용해야 하는데 사용도 안했어
    // # 굳이 static을 왜만들었을까~~~~
    // # 굳이 클래스를 만들지 않고도 쓸 수 있다고 가정되어 있는 것이다.
    // # 컴퓨터 여러대가 메인보드, 키보드, 모니터를 한개로 공유하는 상황인건가? -> X -> 그럼 왜?
    
    // # com.mainbody.MainInfo(); 이렇게 사용은 가능하지만... 굳이 안해도 됐을 것 같다.
    
    // # 게터, 세터 필요 없으면 안만들어도 된다.
    // # 우리가 만든 것이 어떻게 사용 되는 건지 생각해봐야 한다.
    
    // # 클래스 타입도 타입이다.
    // # 접근제한자도 붙여줘야하고~~ 초기화 방식도 굳이 다르게 할 필요가 있을까?
    // # 생성자를 통해서 초기화할 수 있지 않을까 ???
    
    // # 학교가 학생을 가지고 있는 것 / 자동차가 엔진을 가지고 있는 것
    // # 다르다. 어떤 문제인지 생각해 본 뒤 설계를 해야 한다~~~~
    
    //기능
    // 입력이 가능하다.
    public void Input() {
        System.out.print("입력하세요> ");
        input = scanner.nextLine();
    }
    // 출력이 가능하다.
    public void Output() {
        System.out.print("입력하신 내용입니다: ");
        System.out.println(input);
    }
    // 전원을 킬 수 있다.
    public void PowerOn() {
        mainbody.powerOn();
    }
    // 전원을 끌 수 있다.
    public void PowerOff() {
        mainbody.powerOff();
    }
    // 절전모드를 할 수 있다.
    public void SleepOn() {
        this.sleepState = true; // sleepState가 true일 때 절전모드인 것으로 설정했습니다.
        System.out.println("절전모드가 켜졌습니다.");
    }
    // 절전모드를 해제할 수 있다.
    public void SleepOff() {
        this.sleepState = false;// sleepState가 false일 때 절전모드인 것으로 설정했습니다.
        System.out.println("절전모드가 꺼졌습니다.");
    }
    
    public void Operation() {
        int num1;
        int num2;
        
        System.out.println("1번 숫자를 입력하세요.");
        num1 = scanner.nextInt();
        
        System.out.println("2번 숫자를 입력하세요.");
        num2 = scanner.nextInt();
        
        System.out.println("두 개의 값을 더한 결과: "+(num1+num2));
        System.out.println("첫번째 숫자에서 두번째 숫자를 뺀 결과: "+(num1-num2));
        System.out.println("첫번째 숫자에서 두번째 숫자를 나눈 결과: "+(num1/num2));
        System.out.println("두 개의 값을 곱한 결과: "+(num1*num2));
        
    }
    
//    scanner.close();
}
