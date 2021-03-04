
public class DefaultAlarm extends Alarm {
    
    @Override
    public void alarmSet() {
        // 알람이 울리는 시간을 설정한다.
        // 알람의 반복 주기를 설정한다. (ex. 일주일 중 무슨 요일에 울리게 할 것인지 등)
        // 알람 실행시 반복 유무를 설정한다. (ex. 10분후 다시 등)
        
        //임시
        System.out.println("알람이 오전 7:00에 설정되었습니다.");
        System.out.println("반복 주기를 설정하지 않으셨습니다.");
    }
    
    @Override
    public void alarmOn() {
        // 알람음을 설정한다.
        // 진동 여부를 설정한다.
        // 발광 유무를 설정한다. (ex. 플래시가 터진다)
        // 볼륨 조정을 설정한다. (ex. 소리가 점점 커진다 등)
        // 알람음의 반복 유무를 설정한다.
        
        System.out.println("음악이 설정되어있지 않습니다(무음)");
        System.out.println("진동이 울리고 있습니다.");
        System.out.println("플래시가 반짝이고있습니다.");
        
    }

    @Override
    public void alarmOff() {
        // 알람의 연장 기능 유무를 설정한다.
        // 알람의 종료에 대한 반복을 설정한다 (ex. 자동으로 꺼지는지, 사용자가 꺼야 꺼지는지 등)
        // 알람 미션을 설정한다. (ex. 퀴즈를 푼다.. 등)
        
        System.out.println("알람을 종료하셨습니다.");
    }
    
}
