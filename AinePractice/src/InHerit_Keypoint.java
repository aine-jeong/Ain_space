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

    // 모든 제품이 Product를 상속받았다 >> 모든 제품의 부모는 product다!
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
    }
    
}


public class InHerit_Keypoint {
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

