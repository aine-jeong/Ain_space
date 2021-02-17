// 설계도
class Tv{
    boolean power;
    int ch;
    
    void power() {
        this.power = !this.power;
    }
    
    void chUp() {
        this.ch++;
    }
    void chDown() {
        this.ch--;
    }
}

class Vcr{ //비디오 플레이어
    boolean power;
    void power() {
        this.power = !this.power;
    }
    void play() {
        System.out.println("재생하기");
    }
    void stop() {
        System.out.println("정지하기");
    }
    
    void rew() { // 빨리감기 되감기 등등이 더 있다~~~~ 고 가정
        
    }
}
/*
 Tv 설계도
 Vcr 설계도
 
 TvVcr 이라는 제품을 만들어주세욤
 
 >> class TvVct {Tv t; Vcr v;}
 >> class TvVct extends Tv{ Vcr vcr }
 >> class TvVct extends Vcr{ Tv tv }
 
 Q. Tv를 상속받을까 Vcr을 상속받을까?
 기준: 주기능이 뭔지 생각해봐라! >> 둘중에 비중 >> 비중이 높은 클래스를 상속, 나머지는 포함시키는게 좋다.
 
 */

class TvVcr extends Tv{
    Vcr vcr;
    TvVcr() {
        vcr = new Vcr();
    }
    
}


public class Ex03_Inherit {
    public static void main(String[] args) {
        TvVcr t = new TvVcr();
        t.power();
        System.out.println("전원: "+t.power);
        t.chUp();
        System.out.println("채널: "+t.ch);
        
        //비디오 
        t.vcr.power();
        System.out.println("비디오 전원: "+t.vcr.power);
        t.vcr.play();
        t.vcr.stop();
        
        t.vcr.power();
        t.power();
        System.out.println("전원: "+t.power);
        System.out.println("비디오 전원: "+t.vcr.power);
    }
}
