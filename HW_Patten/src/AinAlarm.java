
public class AinAlarm extends Alarm {

    @Override
    public void alarmSet() {
        // 알람이 울리는 시간을 설정한다.
        // 알람의 반복 주기를 설정한다. (ex. 일주일 중 무슨 요일에 울리게 할 것인지 등)
        // 알람 실행시 반복 유무를 설정한다. (ex. 10분후 다시 등)
        
        //임시
        System.out.println("알람이 오전 6:40분에 설정되었습니다.");
        System.out.println("매주 월,화,수,목,금 으로 설정하셨습니다.");
    }

    @Override
    public void alarmOn() {
        // 알람음을 설정한다.
        // 진동 여부를 설정한다.
        // 발광 유무를 설정한다. (ex. 플래시가 터진다)
        // 볼륨 조정을 설정한다. (ex. 소리가 점점 커진다 등)
        // 알람음의 반복 유무를 설정한다.
        
        System.out.println("\'전파탐지기\' 음악이 진동과 함께 재생됩니다.");
        System.out.println("소리가 점점 커집니다.");
        
    }

    @Override
    public void alarmOff() {
        // 알람의 연장 기능 유무를 설정한다.
        // 알람의 종료에 대한 반복을 설정한다 (ex. 자동으로 꺼지는지, 사용자가 꺼야 꺼지는지 등)
        // 알람 미션을 설정한다. (ex. 퀴즈를 푼다.. 등)
        
        System.out.println("연장 기능이 꺼져있어 한번 끄시면 지각이십니다");
        System.out.println("일어나서 화장실 사진을 찍으세요~~~~~");
    }
    
}
