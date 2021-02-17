package kr.or.bit.utils;

import java.util.Calendar;

//날짜의 형식을 제공하는 설계도
//어떠한 기능이 자주 사용된다면, new를 사용하지 않도록 static함수로 만들어주자. 
// ㄴ>> 하나의 이름으로 -> 오버로딩

public class Edu_Date {
    public static String DateString(Calendar date) {
        return date.get(Calendar.YEAR) + "년" +
               (date.get(Calendar.MONTH)+1) + "월" +
               date.get(Calendar.DATE) + "일";
    }
    
    public static String DateString(Calendar date, String opr) {
        return date.get(Calendar.YEAR) + opr +
               (date.get(Calendar.MONTH)+1) + opr +
               date.get(Calendar.DATE);
    }
    
    //요구사항
    //현재: 2021년2월17일 / 2021년02월17일
    //1~9월 >> 01, 02 ... (0붙여주세용)
    //10, 11, 12 는 그대로
    public static String monthFormat_DateString(Calendar date) {
        
        String year,month,day;
        
        year = date.get(Calendar.YEAR) + "년";
        
        if((date.get(Calendar.MONTH)+1) < 10) {
            month = "0"+(date.get(Calendar.MONTH)+1) + "월";
        } else {
            month = (date.get(Calendar.MONTH)+1) + "월";
            
            // String.valueOf(정수) >> 문자열
            // month = String.valueOf((date.get(Calendar.MONTH) +1));
        }
        
        day = date.get(Calendar.DATE) + "일";
                
        return year+month+day;
    }
    
    
}
