import javax.swing.JOptionPane;

// 단어 하나라도 입력해서 확인버튼 누르면 시간을 멈추게 하고싶다.
// Hint) 공유자원!!

class WordInputProcess extends Thread {
    @Override
    public void run() {
        String dan = "2";
        String inputdata = JOptionPane.showInputDialog(dan + "단 값을 입력");
        if(inputdata != null && !inputdata.equals("")) {
            Ex05_WordGame.inputcheck = true; // 공유자원의 값을 변경
            // 데이터를 하나라도 입력한다면, 공유자원을 true로 변경했다
            // 공유자원이 true가 되면 WordTimeOut의 if문에서 return에 걸리게 될 것! (WordTimeOut종료)
        }
        System.out.println("입력한 값은: " + inputdata);
    }
}

class WordTimeOut extends Thread {
    @Override
    public void run() {
        for ( int i = 10 ; i > 0 ; i--) {
            if(Ex05_WordGame.inputcheck) return; //return; -> run함수 빠져나간다 -> stack 종료
            System.out.println("남은 시간: " + i);
            try {
                Thread.sleep(1000); // 1초 간격으로 쉬었다가 다시 일한다.
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Ex05_WordGame {
    //###POINT### 공유자원 ###
    static boolean inputcheck = false;
    public static void main(String[] args) {
        
        WordInputProcess word = new WordInputProcess();
        WordTimeOut time = new WordTimeOut();
        
        word.start();
        time.start();
        
        /* 콘솔 (join 추가하기 전)
        Main END
        남은 시간: 10
        남은 시간: 9
        남은 시간: 8
        남은 시간: 7
        입력한 값은: 123123123
        */
        
        try {
            // join: 다른 스레드의 종료를 기다린다.(다른 스레드가 종료될 때 까지 main이 휴식한다)
            // join을 요청한 스레드가 다 종료되면 그때 동작한다.
            word.join(); // main에게 word가 끝날때까지 기다려달라고 하는 것....
                        // 나를 실행한 main에게 join 요청 ....
            time.join(); // time이 끝날때까지 기다려죠 ...
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        /* 콘솔 (join 추가하기 전)
        남은 시간: 10
        남은 시간: 9
        남은 시간: 8
        입력한 값은: 123123
        Main END
        */
        
        System.out.println("Main END"); // 현재 스레드 3개가 돌고있음 (메인은 바로 끝나겠징~~)
        
        
    }
}
