package Programmers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Year_2016 {
    public static void main(String[] args) throws ParseException {
        String answer = "" ;
        
        String date = "2016-05-24";
        String dateType= "yyyy-mm-dd";
        
        SimpleDateFormat dateFormat = new SimpleDateFormat(dateType) ;
        Date nDate = dateFormat.parse(date) ;
         
        Calendar cal = Calendar.getInstance() ;
        cal.setTime(nDate);
         
        int dayNum = cal.get(Calendar.DAY_OF_WEEK) ;
         
         
         
        switch(dayNum){
            case 1:
                answer = "SUN";
                break ;
            case 2:
                answer = "MON";
                break ;
            case 3:
                answer = "TUE";
                break ;
            case 4:
                answer = "WED";
                break ;
            case 5:
                answer = "THU";
                break ;
            case 6:
                answer = "FRI";
                break ;
            case 7:
                answer = "SAT";
                break ;
                 
        }
         
         System.out.println(answer);
    }
}
