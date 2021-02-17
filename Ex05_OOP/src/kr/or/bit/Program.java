package kr.or.bit;

public class Program {
    public static void main(String[] args) {
        Pclass pc = new Pclass();
        pc.k = 10; // protected
        pc.p = 11; // default      같은 패키지라면 의미가 없다.
        // 결국 protected는 상속관계에서만 의미가 있다 ...
        
    }
}
