/*

함수의 parameter로
1. 값 전달
 
 
2. 주소값 전달
 
 
 
 */

class Data{
    int i;
}

public class Ex13_Method_Call {
    public static void main(String[] args) {
        
        Data d = new Data();
        d.i = 100;
        System.out.println("d.i: " + d.i);
        
        scall(d) ; //Data 타입을 갖는 주소값을 parameter로 넘겨야 한다.
                   //## 값이 아닌 "주소값"을 parameter로 가져간다 ##
        System.out.println("after d.i: " + d.i);
        
        vcall(d.i); // 값전달
        System.out.println("d.i: " + d.i);
        
    }
    
    static void scall(Data sdata) { // 주소값 전달
        System.out.println("함수: " + sdata.i);
        sdata.i = 111;
    }
    
    static void vcall(int x) {
        System.out.println("before x: " + x);
        x = 8888;
        System.out.println("after x: " + x);
    }
    
    
}
