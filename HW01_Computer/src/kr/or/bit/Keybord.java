package kr.or.bit;

public class Keybord {

    private String button;
    private String led;
    private String kbrand; 
    
    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public String getLed() {
        return led;
    }

    public void setLed(String led) {
        this.led = led;
    }

    public String getKbrand() {
        return kbrand;
    }

    public void setKbrand(String kbrand) {
        this.kbrand = kbrand;
    }

    public Keybord(){
        this("눌림", "red", "TG");
    }
    
    public Keybord(String button, String led, String kbrand)
    {
        this.button = button;
        this.led = led;
        this.kbrand = kbrand;
    }
    void print() {
        System.out.printf("버튼: %s led: %s 브랜드: %s \n",button,led,kbrand);
    }
}

