// // 20210201-3번째 시간-3
/*
 변수의 위치
 1. class 내부: instance variable (member field)
 2. method 내부: local variable (반드시 초기화 .. 사용)
 ex) main(String[] args) >> 함수 >> so, 이 안의 모든 변수는 사용시 초기화해야 한다.
 **method안의 변수는 무조건 초기화하자~!~!~!
 3. static variable(객체간 공유자원): 객체 생성 이전에 memory에 올라가는 자원
 (메모리 구조 중 Class area 또는 method area)
 
 ============================================
 javac Ex05_variable_scope.java - 컴파일
 java Ex05_variable_scope       - 실행
 
 Ex05_variable_scope 정보 >> method(class) area에 올라간다.
 그때 클래스 안에 static 자원이 있다면 그 자원을 바로 memory에 road시킨다.
 --------------------이때까지도 stack영역에는 아무것도 없다.
 static자원의 이름이 main이면 자동으로 stack으로 이동해서 main의 영역을 만들어준다.
 만약 자원의 이름이 main이 아니면 실행되지 않고 memory에만 존재한다.
 
 */

class Variable {
    int iv; // member field(=instance variable)
    
    void method() {
        int lv = 0; // local variable / 반드시 초기화
        
        //for(int i = 0 ... // -> block variable // for안에서만 유효하다)
    }
    
    static int cv;
    // 1. 이름: class variable(클래스 변수) = static variable(객체간 공유자원)
    // 2. 목적: 정보를 담는 것 (###생성되는 모든 객체가 공유하는 자원###)
    // heap 영역에 생성된 "객체"들의 "공유자원"
    // 3. 특징: 접근 방법
    // 3.1. class 이름.static변수명 >> Variable.cv 
    //            >> why? 객체가 생성되기 전에도 접근이 가능해야 하므로
    // 3.2. Variable v = new Variable(); >> v.cv (가능)
    //      Variable v2 = new Variable(); >> v2.cv (가능)
    //      v.cv == v2.cv : 같은 주소의 메모리이다.
    
    // 4. 생성시점: Hello.java > javac.Hello.java (컴파일)> Hello.class
    //     >java.exe Hell 엔터 실행...
    //     >class loader System에 의해서
    //     클래스를 정보(meta data: 설명) class area(method area)에 올려요
    //      --이 클래스를 언제 만들었고 어떤 자원을 import하고있고 변수는 몇개고....기술
    //      --이 클래스 안에 static variable 또는 static method가 있으면
    //      --이 녀석을 memory (calss area)에 올려놓는다.
    
    // 5. 용도-> AirPlane만든 클래스에서 누적 대수 세는 부분 확인해보깅
    
    // 클래스 변수는 클래스가 로딩될 때 생성되고 프로그램이 종료될 때 소멸한다.
    // 객체 생성 이전에 메모리에 올라가는 자원 (new를 하지 않아도, 사용할 수 있다!)
}

public class Ex05_variable_scope {
    
    public static void main(String[] args) {
        // 클래스 내부에 함수의 이름이 main이면서 static이라는 키워드가 붙어있는 함수는
        // "public class Ex05_variable_scope" 이 만들어지기 전에 이미 메모리에 올라간다.
        // 메모리에 올라간다는 것은 실행 가능한 함수라는 의미이다.
        
//        System.out.println(Variable.cv);
        Variable v = new Variable();
        Variable v2 = new Variable();
        
        Variable.cv = 200;
        
        System.out.println(v.cv);
        System.out.println(v2.cv); // 같은 주소를 공유하고 있기 때문에 같은 출력값이 나올 것
        
        
        
    } // main end
} // class end







