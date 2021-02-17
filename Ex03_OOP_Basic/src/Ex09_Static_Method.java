/*
 1. static member field (객체간 공유 자원)
 
 why: Math.random() 은 Math m = new Math(); m.random() 이렇게 하지 않았을까?
 2. static method: 많이, 자주 쓰이니까 편하게 사용하도록 객체 생성 없이 쓸 수 있게 해둠 >> static
    
 */

class StaticClass{
    int iv;
    
    static int cv;
    
    void m() {
        // 일반 함수에서 cv 값을 가지고 놀 수 있다? O
        // '순서'
        // static 자원은 일반 자원보다 항상 메모리에 먼저 상주한다.
        cv = 1000;
        // StaticClass.cv = 1000;
    }
    
    static void sm() {
        // static 함수에서 일반 자원인 iv를 가지고 놀 수 있다? X
        // iv = 100; -> X  // 생성 시점 때문에!
        // error가 없게 하려면 static은 static끼리 놀아라
        cv = 2222;
    }
}

public class Ex09_Static_Method {
    public static void main(String[] args) {
        
        System.out.println(StaticClass.cv);
        StaticClass.sm();
        System.out.println(StaticClass.cv);
        
        // static자원은 객체를 생성하지 않고 사용 가능
        
        // 일반자원은 객체를 생성해야 한다.
        StaticClass sc = new StaticClass();
        sc.m();
        sc.sm();
        System.out.println(sc.iv);
        System.out.println(sc.cv);
        
        // 자주 사용하는 함수는 static으로 만들어서 편하게 사용하도록 해줘라!
        
    }
}
