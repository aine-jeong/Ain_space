import kr.or.bit.Emp;

class Test2{
    int x = 100;
    void print() {
        System.out.println("부모함수의 Test2");
    }
}

class Test3 extends Test2 {
    int x = 300; // c#: 부모 무시하기 // 쓰지 마세용 (문법적 문제는 없지만..)
    
    @Override
    void print() {
        System.out.println("자식이 부모함수를 재정의하고있다.");
    }
    
    //overloading
    void print(String str) {
        System.out.println("나 오버로딩이야" + str);
    }
}

public class Ex05_Inherit_Override {
    public static void main(String[] args) {
        Test3 t3 = new Test3();
        System.out.println(t3.x);
        
        t3.print();
        t3.print("hello");
        
        ////////////////////////////
        Emp emp = new Emp(1000,"홍길동");
        System.out.println(emp); // 조작된 주소: kr.or.bit.Emp@762efe5d
        System.out.println(emp.toString()); // kr.or.bit.Emp@762efe5d
        //emp라고 출력하면 사실은 toString()이 뒤에 숨어서 붙어있당...
        //toString()은 Object가 가지는 자원이다.
        
    }
}
