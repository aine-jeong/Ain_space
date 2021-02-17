import kr.or.bit.Singleton;
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
public class Ex14_Singleton_main {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println(s);
        
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2);
        // 두개의 결과가 동일한 주소가 나온다
        
        
    }
}
