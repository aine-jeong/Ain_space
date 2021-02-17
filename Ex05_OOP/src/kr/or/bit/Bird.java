package kr.or.bit;

// 새(공통(일반화, 추상화)사항)
// 날수 있다. 새는 빠르다

public class Bird {
    // 공통기능
    public void fly() {
        System.out.println("flying");
    }
    
    // 설계자
    // 나를 상속하는 당신은 moveFast를 필요에 따라서 재정의 했으면 좋겠어(80%) >> 상속 관계에서
    // public -> 그냥 써
    
    protected void moveFast() { // 다른 폴더에서 상속해서 사용할 때, moveFast는 재정의하지 않으면 사용할 수 없는 것.
        fly();
    }
}
