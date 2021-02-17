package kr.or.bit;
import java.util.Scanner;

public class Pj01_Computer {
    public static void main(String[] args) {
        
        // 컴퓨터를 생산합니다.
        Computer com = new Computer(500,"삼성",111,"red");
        
        // 전원을 켭니다.
        com.PowerOn();
        // 전원을 끕니다.
        com.PowerOff();
        
        // 절전모드를 실행합니다.
        com.SleepOn();
        // 절전모드를 끕니다.
        com.SleepOff();
        
        // 문자열을 입력합니다.
        com.Input();
        // 문자열을 출력합니다.
        com.Output();
        
        // 두개의 숫자를 받아 사칙연산을 수행합니다.
        com.Operation();
        
        // 컴퓨터의 현재 정보를 출력합니다.
        com.ComInfo();
        
        
        MainBody mainbody = new MainBody();
        // MainBody의 상태를 출력합니다.
        mainbody.MainInfo();
        // # 왜 메인보드를 따로 또 만들었을까 ?
        
//        com.mainbody.MainInfo(); // #이렇게 사용할 수는 있긴한데 ..굳이 ?!?!?!?
        
        Keybord keybord = new Keybord();
        //keybord의 상태를 출력합니다.
        keybord.print();
        
        Monitor monitor = new Monitor();
        // monitor의 상태를 출력합니다.
        monitor.MonitorInfo();
        
    }
}
