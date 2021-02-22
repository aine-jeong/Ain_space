/*
 데몬: 보조 Thread
 
 주 thread가 동작을 멈추면(생명을 다하면,,) 보조 thread도 운명을 같이하도록 할 수 있다
 
 ex) 한글작업 >> 글쓰기할 때 3초마다 저장 옵션을 설정할 수 있다.
               글쓰기 작업 종료시 3초마다 저장되는 (보조)옵션도 같이 종료하기
               
 
 
 */

public class Ex08_Daemon_Thread implements Runnable{
    static boolean autosave = false;
    public static void main(String[] args) {
        Thread demonthread = new Thread(new Ex08_Daemon_Thread()); // runnable 객체의 주소를 넣어준다.
        
        // demonthread를 main함수 스레드의 보조(Daemon)로 만들고 싶다.
        // demonthread은 main과 생명을 같이한다 ... >> ### main이 끝나면 같이 끝나게 만들어 둔 것
        // setDaemon을 안해주면 메인이 끝나도 자동저장(demonthread)도 계속해서 실행된다!
        demonthread.setDaemon(true);
        demonthread.start();
        
        //주작업(한글 쓰기)
        for(int i = 0; i <= 30; i++) {
            try {
                Thread.sleep(1000); // 1초
            } catch (Exception e) {
                // TODO: handle exception
            }
            System.out.println("Main 한글 쓰기 작업" + i);
            // 자동 저장 시점
            if(i == 5) {
                System.out.println("i: " + i);
                autosave = true;
            }
            
        }
    }
    
    public void autoSave() {
        System.out.println("한글 작업이 3초 간격으로 자동 저장됩니다.");
    }
    
    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            if(autosave) { //static boolean autosave = true 면 작업을 하겠다.
                // 저장 작업
                autoSave(); //호출
            }
        }
        
    }
    
}
