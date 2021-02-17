/*
 
 tip) C# 다형성 (overloading, override)
 
 
 Java: "상속관계"에서 "하나의 참조 변수"가 "여러개의 타입"을 가질 수 있다.
 - 하나의 참조 변수 >> 부모타입
 
 부모클래스 타입의 참조변수가 여러개의 자식클래스 객체를 담을 수 있다.
 */

class Tv2{
    boolean power;
    int ch;
    
    void power() {
        this.power = !this.power;
    }
    
    void chUp() {
        this.ch++;
    }
    
    void chDown() {
        this.ch--;
    }
}

class CapTv extends Tv2{ // 자막기능이 있는 티비
    // 특수화, 구체화된 자원: 자막기능
    String text;
    String captionText() {
        return this.text = "현재 자막 처리중....";
    }
    
}

public class Ex10_Inherit_Poly {
    public static void main(String[] args) {
        CapTv captv = new CapTv();
        captv.power();
        System.out.println("전원: "+captv.power);
        
        captv.chUp();
        System.out.println("채널: "+captv.ch);
        System.out.println(captv.captionText());
        // ---- 기존 배운 내용 ----
        
        // 같은 타입끼리 주소를 주고받을 수 있다.
        //Car c = new Car();
        //Car c2 = c;
        
        Tv2 tv2 = captv; 
        // 상속관계에서 "부모타입은 자식타입의 주소"를 가질 수 있다.
        // 단, 부모는 자신의 자원만 접근할 수 있다.
        //     자식이 재정의한 것은 재정의 된 상태인 것을 볼 수 있다.
        
        // 새로 Tv2 만들기 -> Heap에 메모리 공간이 하나 더생긴당... 비효율적이얏
        
        System.out.println(tv2.toString());
        System.out.println(captv.toString());
        // 주소값은 같지만,
        // tv2.captionText(); -> 자식의 자원은 접근 불가능
        tv2.power(); // -> 부모(본인)의 자원은 접근 가능
        
        
        
    }
}
