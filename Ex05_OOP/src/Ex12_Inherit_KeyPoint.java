// 시나리오만 보고 코드를 다 짤 수 있게 외워둬야 한다~~~~~~~~
// 꼭~!~!~!~!~!~!~


/*
 시나리오(요구사항)
 저희는 가전제품 매장 솔루션을 개발하는 사업팀입니다.
 A라는 전자제품 매장이 오픈되면
 [클라이언트 요구사항]
 가전제품은 제품의 가격, 제품의 포인트 정보를 공통적으로 가지고 있습니다.
 각각의 가전제품은 제품별 고유한 이름을 가지고 있다.
 ex)
 각각의 전자제품은 이름을 가지고 있다. (ex. Tv, Audio, Computer ...)
 각각의 전자제품은 다른 가격을 가지고 있다.(ex. Tv:5000, Audio: 6000 ... ) 
 제품의 포인트는 가격의  10%를 적용한다.
 
 
 시뮬레이션 시나리오
 구매자: 제품을 구매하기 위한 금액정보, 포인트 정보를 가지고 있다.
 예를 들면: 10만원 , 포인트 0
 구매자는 제품을 구매할 수 있다. 구매행위를 하게 되면 가지고 있는 돈은 감소하고 포인트는
 구매자는 처음 초기 금액을 가질 수 있다
 
 ---------------------------------------------
 1차 코드 (물건이 3개.. 구매할 수 있는 함수)
 
 1차 오픈
 - 하와이 휴가 보내주셨다
 
 공식오픈 day
 매장에 제품이 1000개의 다른 종류의 제품이 들어왔다..... (마우스, 토스터기 ... )
 제품 등록은 포스시스템이 들어와서 자동화되어있다. -> 자동으로 할수있음!
 매장에 1000개의 제품이 전시되었다.
 고객 >> 고객 불만 >> 제품은 1000갠데 고객이 살 수 있는 물건은 3개...... >> 997개 판매 불가
 
 사장한테 욕먹음 >> 남은 휴가 3일동안 PC방에서 '무엇'을 하고 돌아왔당.....
 무엇? : 997개의 함수를 만들었다 ㅎㅎ......
 
 문제점: 변화에 대응하는 코드를 만들지 못했다 ........
 
 
 >> 즐거운 휴가를 보내기 위한 방법은 ???
 1. 함수를 하나로 통합할 방법
 2. 제품의 이름을 어찌어찌 ...
 3. buy함수를 하나만 만들어서 파라미터를 product 객체로 받으면 될 것 같습니다.
 
 */

class Product{
    int price;
    int bonuspoint;
    
    Product(int price) {
        this.price = price;
        this.bonuspoint = (int)(this.price / 10.0);
    }
}

class KtTv extends Product{
    // 가격에 대한 정보는 부모가 가지고 있다.
    KtTv() {
        super(500);
    }
    
    @Override
    public String toString() {
        return "KtTv";
    }
}

class Audio extends Product{
    // 가격에 대한 정보는 부모가 가지고 있다.
    Audio() {
        super(100);
    }
    
    @Override
    public String toString() {
        return "Audio";
    }
}

class NoteBook extends Product{
    // 가격에 대한 정보는 부모가 가지고 있다.
    NoteBook() {
        super(150);
    }
    
    @Override
    public String toString() {
        return "NoteBook";
    }
}

class Buyer{
    int money = 1000;
    int bonuspoint;
    
    // 구매자는 구매 행위를 할 수 있다. (기능 -> method)
    // 구매행위(잔액 - 제품의 가격 , 포인트 정보 갱신(증가))
    // ******구매자는 매장에 있는 모든 물건을 구매할 수 있다******
  /*   
    void KttvBuy(KtTv n) { // 구매자가 어떤 물건 정보를 알아야한다. (그 물건의 가격 정보를 얻어올 수 있다)
        if(this.money < n.price) {
            System.out.println("고객님 잔액이 부족합니다 ^^! \n현재 잔액: " + this.money);
            return; // 함수의 종료(구매행위 종료)
        }
        //실제 구매 행위
        this.money -= n.price; // 잔액
        this.bonuspoint += n.bonuspoint; // 누적
        System.out.println("구매한 물건: "+n.toString());
    }
    
    void AudioBuy(Audio n) { // 구매자가 어떤 물건 정보를 알아야한다. (그 물건의 가격 정보를 얻어올 수 있다)
        if(this.money < n.price) {
            System.out.println("고객님 잔액이 부족합니다 ^^! \n현재 잔액: " + this.money);
            return; // 함수의 종료(구매행위 종료)
        }
        //실제 구매 행위
        this.money -= n.price; // 잔액
        this.bonuspoint += n.bonuspoint; // 누적
        System.out.println("구매한 물건: "+n.toString());
    }
    
    void NoteBookBuy(NoteBook n) { // 구매자가 어떤 물건 정보를 알아야한다. (그 물건의 가격 정보를 얻어올 수 있다)
        if(this.money < n.price) {
            System.out.println("고객님 잔액이 부족합니다 ^^! \n현재 잔액: " + this.money);
            return; // 함수의 종료(구매행위 종료)
        }
        //실제 구매 행위
        this.money -= n.price; // 잔액
        this.bonuspoint += n.bonuspoint; // 누적
        System.out.println("구매한 물건: "+n.toString());
    }
    
    */
    
    // 2차 개선: 하나의 이름으로 여러가지 기능을 하도록(overloading)
    // 반복되는 코드를 줄여보자 >> 모든 제품이 Product를 상속받았다 >> 모든 제품의 부모는 product다!
    //  ㄴ> 다형성을 쓸 수 있다!
    
    // Product p;
    // KtTv t = new Kttv();
    // p = t;
    
    // 다형성~~~~~~~
    void Buy(Product n) { // 구매자가 어떤 물건 정보를 알아야한다. (그 물건의 가격 정보를 얻어올 수 있다)
        if(this.money < n.price) {
            System.out.println("고객님 잔액이 부족합니다 ^^! \n현재 잔액: " + this.money);
            return; // 함수의 종료(구매행위 종료)
        }
        //실제 구매 행위
        this.money -= n.price; // 잔액
        this.bonuspoint += n.bonuspoint; // 누적
        System.out.println("구매한 물건: "+n.toString()); 
        // toString -> 왜 주소값 아니고 제품의 이름이 찍히지 ? >> 재정의해뒀으니까~~~~~~
        // 만약에 재정의 안했다면 super썼어야 한다.
        // ㄴ> 자식클래스에서 오버라이딩된 toString()을 재정의되기 전 원래 기능으로 쓰려면 
        // super.toString() 으로 쓰면 된다.
    }
    
}


public class Ex12_Inherit_KeyPoint {
    public static void main(String[] args) {
        KtTv kttv = new KtTv();
        Audio audio = new Audio();
        NoteBook notebook = new NoteBook();
        
        Buyer buyer = new Buyer();
        buyer.Buy(kttv);
        buyer.Buy(audio);
        buyer.Buy(notebook);
        buyer.Buy(kttv);
        
        
        
    }
}
