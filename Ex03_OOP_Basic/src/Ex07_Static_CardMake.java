import kr.or.bit.Card;

public class Ex07_Static_CardMake {
    public static void main(String[] args) {
        // Card 53장
        // heap 메모리에 만들어진다 (객체니까)
        
        Card c = new Card();
        c.number = 1;
        c.kind = "heart";
        c.h = 80; // 한번만 바꾸면 아래의 카드 모두 적용된다.
        c.w = 50; 
        c.cardInfo();
        
        Card c2 = new Card();
        c2.number = 1;
        c2.kind = "heart";
        c2.cardInfo();
        
        // 고객 변심 -> 카드가 너무 작아요 ㅠㅠ
        // h=80, w=50 요구사항
        // 방법1. 53장 카드의 h, w를 하나하나 변경한다.
        // 방법2. 설계도를 아예 바꾸기(설계도 변경) -> 다시 인쇄


        
    }
}
