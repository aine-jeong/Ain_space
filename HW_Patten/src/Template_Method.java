
public class Template_Method {
    public static void main(String[] args) {
        Alarm alarm1 = new AinAlarm();
        
        alarm1.creatAlarm();
        alarm1.reSleep();
        
        System.out.println();
        System.out.println("===========");
        System.out.println();
        
        alarm1 = new DefaultAlarm();
        alarm1.creatAlarm();
    }
}
