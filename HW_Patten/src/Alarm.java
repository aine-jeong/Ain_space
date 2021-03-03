
abstract class Alarm {
    
    //final 선언으로 Override 방지
    public final void creatAlarm() {
        alarmSet();
        alarmOn();
        alarmOff();
    }
    
    public abstract void alarmSet();
    public abstract void alarmOn();
    public abstract void alarmOff();
}


