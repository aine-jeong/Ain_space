import kr.or.bit.Bird;

//Bird 상속받아서 구현

class Bi extends Bird {
    
    @Override
    protected void moveFast() { //같은 폴더에서 사용할 거니까, protected를 또 붙여도 된다.
        super.moveFast();
    }
}

class Ostrich extends Bird {
    // 구체화되고 , 특수화된 내용이 있다
    void run() {
        System.out.println("run");
    }
    
    @Override
    protected void moveFast() {
        run(); // 얘는 빠르긴 빠르지만 달려서 빠른고 -> 재정의한 내용. (날아서 빠른게 아니당)
    }
}
public class Ex09_Inherit_protected {
    public static void main(String[] args) {
        Bi bi = new Bi();
        bi.fly(); // public은 상속관계에서 재정의하지 않아도 보이지만,
                  // protected는 상속관계에서 "만" public이다. 객체한테는 보이지 않음.
                  // 상속관계에서 재정의하지 않으면 쓸수없음 !!!!!
                  // bi.moveFast(); -> 현재 재정의되지 않아서, default와 같은 상태 (같은 폴더에서만 보인다)
        
        bi.moveFast();
        
        Ostrich o = new Ostrich();
        o.run();
        o.moveFast();
        
        
    }
}
