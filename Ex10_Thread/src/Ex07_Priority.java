/*
 여러개의 Tread가 있을 때
 우선순위 부여 (CPU를 점유할 수 있는 확률을 높여주는 것)
 내부적으로 설정된 값 : 5(기본값(default)) : 공정하게 경쟁
 */

class Pth extends Thread {
    
    @Override
    public void run() {
        for(int i = 0 ; i < 1000 ; i++) {
            System.out.println("-------------------");
        }
    }
}

class Pth2 extends Thread {
    
    @Override
    public void run() {
        for(int i = 0 ; i < 1000 ; i++) {
            System.out.println("|||||||||||||||||||");
        }
    }
}

class Pth3 extends Thread {
    
    @Override
    public void run() {
        for(int i = 0 ; i < 1000 ; i++) {
            System.out.println("******************");
        }
    }
}


public class Ex07_Priority {
    public static void main(String[] args) {
        Pth pth = new Pth();
        Pth2 pth2 = new Pth2();
        Pth3 pth3 = new Pth3();
        
        pth.start();
        pth2.start();
        pth3.start();
        
        pth.setPriority(10); // pth("-------------------")가 먼저 끝날 수 있게 조작 
        pth2.setPriority(1); // 
        pth3.setPriority(1); // (100%는 아님: 상대적 수치이다. cpu를 점유할 확률을 높여주는 것 뿐!!)
        
        
        System.out.println(pth.getPriority());
        System.out.println(pth2.getPriority());
        System.out.println(pth3.getPriority());
        // 공정하게 경쟁 -> 누가 먼저 끝날지 알 수 없다
        
        

        
    
    }
    
}
