
public class Ex10_Static_Method {
    int number;
    
    public void print() {
        System.out.println("일반함수 number: "+number);
    }
    
    public static void method() {
        System.out.println("static함수");
    }
    
    public static void main(String[] args) {
        //Ex10_Static_Method.method();
        method();
        
        Ex10_Static_Method ex10 = new Ex10_Static_Method();
        ex10.print();
    }
}
