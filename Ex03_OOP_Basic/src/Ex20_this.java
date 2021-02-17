/*
 원칙: 생성자는 객체 생성시 한개만 호출 가능하다다. 
 ( Car c = new Car() or Car c = new Car(100))
 
 예외적으로
 this를 활용하면 여러개의 생성자를 호출할 수 있다.
 
 */
// 아래 코드는 중복이 보인다.
// 값을 할당하는 부분이 중복되어있음
// 할당하는 부분을 1개로 표현할 수 없을까?
//class Zcar{
//    String color;
//    String geartype;
//    int door;
//    
//    Zcar() {
//        this.color = "red";
//        this.geartype = "auto";
//        this.door = 2;
//    }
//    
//    Zcar(String color, String geartype, int door) {
//        this.color = color;
//        this.geartype = geartype;
//        this.door = door;
//    }
//    
//    void print() {
//        System.out.println(this.door + "," + this.geartype + "," + this.door);
//    }
//    
//}


class Zcar{
    String color;
    String geartype;
    int door;
    
    Zcar() {
        // 생성자를 호출하는 this ...
        this("red","auto",2); // 다시 자기자신을 호출한다.
                                // parameter 3개짜리 호출
        // new Zcar("red, "auto", 2) 
        System.out.println("default constructor");
        
    }
    
    Zcar(String color, String geartype, int door) {
        this.color = color;
        this.geartype = geartype;
        this.door = door;
        System.out.println("overloading constructor");
    }
    
    void print() {
        System.out.println(this.color + "," + this.geartype + "," + this.door);
    } 
}

class Zcar2 {
    String color;
    String geartype;
    int door;
    
    Zcar2() {
        this("red",1);
        System.out.println("default constructor");
    }
    
    Zcar2(String color, int door){
        this(color, door, "auto");
        System.out.println("overloading constructor param2개");
    }
    Zcar2(String color, int door, String geartype){
        this.color = color;
        this.door = door;
        this.geartype = geartype;
        System.out.println("overloading constructor param3개");
    }
    
    void print() {
        System.out.println(this.color + "," + this.geartype + "," + this.door);
    } 
}


public class Ex20_this {
    public static void main(String[] args) {
//        Zcar zcar = new Zcar();
//        zcar.print();
        
//        Zcar zcar = new Zcar("pink", "auto", 10);
//        zcar.print();
        
        Zcar2 zcar = new Zcar2();
        
        System.out.println("==============");
      
        Zcar2 zcar2 = new Zcar2("gold", 2);
      
        System.out.println("==============");
        
        Zcar2 zcar3 = new Zcar2("red",10,"auto");
    }
}
