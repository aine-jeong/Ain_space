package kr.or.bit;

public class Monitor {
   private String liquid;
   private String bar;
   private String brand;
   private String button;
    
    public Monitor(){
        this("있음", "있음", "삼송", "2개");
    }
    public Monitor(String liquid, String bar, String brand, String button){
        this.liquid = liquid;
        this.bar = bar;
        this.brand = brand;
        this.button = button;
    }
    
    public String getLiquid() {
        return liquid;
    }
    public void setLiquid(String liquid) {
        this.liquid = liquid;
    }
    public String getBar() {
        return bar;
    }
    public void setBar(String bar) {
        this.bar = bar;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getButton() {
        return button;
    }
    public void setButton(String button) {
        this.button = button;
    }
    
    public void MonitorInfo(){
        System.out.printf("액정: %s  거치대: %s  브랜드: %s  버튼: %s\n", liquid, bar, brand, button);
    }

}
