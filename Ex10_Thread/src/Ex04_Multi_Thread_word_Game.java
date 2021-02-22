import javax.swing.JOptionPane;

/*
 2개 함수가 개별로 별도 실행
 1. 시간을 제어하는 Thread(stack)
 2. 단어 입력을 처리하는 Thread(stack) -> main함수에서 처리하기 (main도 하나의 thread)
 */

class WordTime extends Thread {
    @Override
    public void run() {
        for(int i = 10 ; i > 0 ; i--) {
            try {
                System.out.println("남은 시간: " + i);
                sleep(1000); // 규칙적으로 빠졌다 들어갔다 하게 만들 수 있당
                // cpu를 점유했다가 sleep을 만나면 휴게실에서 1초간 휴식 , 그다음에 실행 반복시키도록 만들었다!
                
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
public class Ex04_Multi_Thread_word_Game {
    public static void main(String[] args) {
        // 2개
        // class WordRime extends Thread 하나
        // static void main 하나
        
        WordTime timer = new WordTime();
        timer.start();
        
        String inputdata = JOptionPane.showInputDialog("값을 입력하세요");
        System.out.println("입력값: " + inputdata);
        System.out.println("main end");
        // 우리가 원하는 것: 단어를 입력하지 않아도 시간이 흘러간다.
        
        
    }

}
