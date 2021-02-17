package kr.or.bit;

public class MainBody {
    private  int price;
    private String brand;
    private int number;
    private int cpunum;
    private int memory;
    
    private boolean power;
    
    
   
   

    public void setPrice(int price) {
        this.price = price;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
   
    public void setNumber(int number) {
        this.number = number;
    }
    
    public void setCpunum(int cpunum) {
        this.cpunum = cpunum;
    }
    
    public void setMemory(int memory) {
        this.memory = memory;
    }
//    
    public MainBody(){
        this(700000, "TG", 123456, 1, 4);
    }
    
    public MainBody(int price, String brand, int number, int cpunum, int memory){
        this.price = price;
        this.brand = brand;
        this.number = number;
        this.cpunum = cpunum;
        this.memory = memory;
    }
    
    public void powerOn() {
        this.power = true;
        System.out.println("전원이 켜졌습니다.");
    }
    public void powerOff() {
        this.power = false;
        System.out.println("전원이 꺼졌습니다.");
    }
    
   
    public void MainInfo() {
        System.out.printf("가격: %d 브랜드: %s 시리얼넘버: %d CPU개수: %d 메모리크기: %d \n",price,brand,number,cpunum,memory);
        System.out.println("현재 전원 상태: "+ ((this.power == true)? "On":"Off") );
    }

}
