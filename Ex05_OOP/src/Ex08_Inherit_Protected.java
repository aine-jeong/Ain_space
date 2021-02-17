import kr.or.bit.Pclass;

/*
 private, default, public, [상속관계]에서 protected
 
 protected: 양면성을 가지고 있다 > default, public
 >> 상속이 없는 클래스 안에서 protected 접근자는 default와 같다.
 >> 결국 상속 관계에서만 의미가 있다.
 
 */

class Dclass{
    public int i;
    private int p;
    int s; // default
    protected int k; // default (일반클래스에서는 사용할 이유가 없다)
    
}

class Child2 extends Pclass{
    void method() {
        // this.k 는 보이는데 this.p는 안보인당
        this.k = 100; // 상속관계에서 protected는 public처럼 쓰인다.
        System.out.println(this.k);
    }
    
    
}

public class Ex08_Inherit_Protected {
    public static void main(String[] args) {
        Child2 ch = new Child2();
        ch.method();
    }
}
