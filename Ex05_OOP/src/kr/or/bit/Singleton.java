package kr.or.bit;
/*
 디자인 패턴 (생성 패턴) >> new  (객체)를 만드는 내용에 관련된 패턴이다
 
### 객체 하나를 만들어서 공유하겠다 ###
 의도: 하나의 객체를 공유하겠다
 
 > 활용
 공유프린터 
 공유 wifi
 
 
 # new를 할 수 없게 막아두었다 -> 여러개의 인스턴스를 만들어도 하나의 객체를 사용하게 될 것
 # (if문을 통해서 한번만 생성되게 했으니까!)
 */
public class Singleton {
    private static Singleton p;
    private Singleton() {
        // 직접 객체 생성 불가 ... new로 생성 불가 -> 생성자를 통해 heap객체 생성 불가
        
    }
    public static Singleton getInstance() {
        if(p == null) {
            p = new Singleton(); // 생성자 호출 객체 만든 것
        }
        return p;
    }
}
