
abstract class Alarm {
    
    //final 선언으로 Override 방지
    public final void creatAlarm() {
        alarmSet();
        alarmOn();
        alarmOff();
    }
    
    // HOOK 역할의 클래스가 하나 있으면 좋을 것 같당 (얘 아님... )
    // 아래에 다시 잔다(reSleep)... 같은것
    
    public abstract void alarmSet();
    // 알람이 울리는 시간을 설정한다.
    // 알람의 반복 주기를 설정한다. (ex. 일주일 중 무슨 요일에 울리게 할 것인지 등)
    // 알람 실행시 반복 유무를 설정한다. (ex. 10분후 다시 등)
    public abstract void alarmOn();
    // 알람음을 설정한다.
    // 진동 여부를 설정한다.
    // 발광 유무를 설정한다. (ex. 플래시가 터진다)
    // 볼륨 조정을 설정한다. (ex. 소리가 점점 커진다 등)
    // 알람음의 반복 유무를 설정한다.
    public abstract void alarmOff();
    // 알람의 연장 기능 유무를 설정한다.
    // 알람의 종료에 대한 반복을 설정한다 (ex. 자동으로 꺼지는지, 사용자가 꺼야 꺼지는지 등)
    // 알람 미션을 설정한다. (ex. 퀴즈를 푼다.. 등)
    
    // 일반 메소드 (=HOOK 메소드) : 구현 해도 되고 안해도 되는 것
    public void reSleep() {
        System.out.println("다시 잠에 듭니다...");
    }
    
    
}



