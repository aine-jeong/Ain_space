/*
 
 this: 객체 자신을 가리키는 this ( this.empno, this.ename )
 this: 생성자를 호출하는 this ( this(100,"red") )
 
 > 상속
 
 부모
 
 자식(this)
 
 super: 현재 자식이 부모의 접근 주소값을 갖는 것 >> 상속 관계에서 부모에 접근
      : 자식 입장에서 보면 super는 부모 객체의 주소
      
1. super > **상속 관계**에서 자식이 부모에 접근하는 방법
         > 상속 관계에서 부모의 생성자를 "명시적으로" 호출할 수 있다.
         
 Tip)
 c# >> base()
 java >> super()
 
 */


class Base {
    String basename;
    Base(){
        System.out.println("Base의 기본 생성자함수");
    }
    Base(String basename){
        this.basename = basename;
        System.out.println("basename: "+this.basename);
    }
    
    void method() {
        System.out.println("나 부모 method");
    }
}

class Derived extends Base{
    String dname;
    Derived() {
        System.out.println("Derived의 기본 생성자함수");
    }
    
    Derived(String dname) {
        super(dname); // 부모의 생성자를 호출 (상속관계)
        
        this.dname = dname;
        System.out.println("dname: "+this.dname);
                
    }
    
    @Override
    void method() {
        //super.method();
        System.out.println("부모함수 재정의");
    }
    
    // 어느날 부모님의 모습이 그리워요....
    // 재정의된 것을 지우는 것 빼고 유일한 방법: super 이용하기.
    void parent_method() {
        super.method();
    }
    
}

public class Ex06_Inherit_super {
    public static void main(String[] args) {
//        Derived d = new Derived();
        Derived d = new Derived("홍길동");
        d.method(); // 부모의 함수 호출
        d.parent_method();
        
    }
}
