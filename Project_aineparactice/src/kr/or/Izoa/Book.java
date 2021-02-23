package kr.or.Izoa;

import java.io.Serializable;

public class Book implements Serializable{
//    Calendar cal = Calendar.getInstance();
//    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");
//    String date = dateFormat.format(cal.getTime());
    
    String id; // 예약한 사람
    
    String book_date; // 예약 날짜
    String book_Time; // 예약 시간
    String hairStyle;
//    List<String> hairStyle = new ArrayList<String>(); // 예약 시술 카트 만들어서 넣기
    // 그 전까지는 일단 헤어스타일 종류로 만들어 뒀다 (생성자 수정)
    
    // String id; // 예약한 사람의 id
    // String booking_time; // 예약한 시간 ? ? ?? 
    public Book(String book_date, String book_Time, String hairStyle) {
        this.book_date = book_date;
        this.book_Time = book_Time;
        this.hairStyle = hairStyle;
    }
    
    public Book(String id, String book_date, String book_Time, String hairStyle) {
        this.id = id;
        this.book_date = book_date;
        this.book_Time = book_Time;
        this.hairStyle = hairStyle;
    }

    @Override
    public String toString() {
        return "고객ID: " + id + "/ 예약 날짜: " + book_date +
                "/ 예약 시간: " + book_Time + "/ 시술종류: " + hairStyle;
    }
    
    
    
    
    
    
}
