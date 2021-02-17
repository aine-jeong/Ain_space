package kr.or.bit;
//20210201 두번째 시간-2
public class NoteBook {
    private String color;
    private int year;
    
    // 직접할당을 막고 간접할당을 하겠다.
    // 간접할당의 구현: 함수로 하겠다 >> 특수한 목적 (setter , getter)
    // 자동화 코드의 이점: 코드 생략
    
    // 직접 작성
    public void setYear(int y) { // setter
        if(y <= 0) {
            year = 1999;
        }else {
            year = y;
        }
    }
    public int getYear() { // getter
        return year;
    }
    
    // 자동화
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    //마우스를 가지고 있다.
    //마우스는 그 안에 여러 개의 속성과 기능을 가지고 있다.
//    Mouse mouse;
    // 모든 설계도가 다른 설계도를 '가지고있지'는 않다.
//    public Mouse handle(Mouse m) { // Mouse의 주소값을 받아서 처리
//        m.x = 100;
//        m.y = 200;
//        return m;
//    }
    // 주소가 같으므로, 꼭 리턴값을 줄 필요가 없을 것.
    public void handle(Mouse m) { // Mouse의 주소값을 받아서 처리
      m.x = 100;
      m.y = 200;
  }
  
    public void noteBookInfo() {
        System.out.println("color: "+color+"/ year:"+year);
    }
       
    
}
