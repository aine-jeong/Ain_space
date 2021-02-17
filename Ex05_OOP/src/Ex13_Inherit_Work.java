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

/*
문제 풀어 보세요 ^^
요구사항

카트 (Cart)

카트에는 매장에 있는 모든 전자제품을 담을 수 있다 
카트의 크기는 고정되어 있다 (10개) : 1개 , 2개 담을 수 있고 최대 10개까지 담을 수 있다
고객이 물건을 구매 하면 ... 카트에 담는다

계산대에 가면 전체 계산
계산기능이 필요
summary() 기능 추가해 주세요 (###Buyer에 추가)
당신이 구매한 물건이름 과 가격정보 나열
총 누적금액 계산 출력

hint) 카트 물건을 담는 행위 (Buy() 함수안에서 cart 담는 것을 구현 ) (###Buy 호출하면 cart에 담기게)
hint) Buyer ..>> summary() main 함수에서 계산할때

구매자는 default 금액을 가지고 있고 초기금액을 설정할 수 도 있다
*/


class Product01{
    int price;
    int bonuspoint;
    
    Product01(int price) {
        this.price = price;
        this.bonuspoint = (int)(this.price / 10.0);
    }
}

class KtTv01 extends Product01{
    // 가격에 대한 정보는 부모가 가지고 있다.
    KtTv01() {
        super(500);
    }
    
    @Override
    public String toString() {
        return "KtTv";
    }
}

class Audio01 extends Product01{
    // 가격에 대한 정보는 부모가 가지고 있다.
    Audio01() {
        super(100);
    }
    
    @Override
    public String toString() {
        return "Audio";
    }
}

class NoteBook01 extends Product01{
    // 가격에 대한 정보는 부모가 가지고 있다.
    NoteBook01() {
        super(150);
    }
    
    @Override
    public String toString() {
        return "NoteBook";
    }
}


class Buyer01{
    int money;
    int bonuspoint;
    
    /// 장바구니생성 (모든 전자제품)
    Product01[] cart;
    int index = 0;
    /////
//    static int totalprice = 0;
    Buyer01() {
        this(1000,0);
    }
    
    Buyer01(int money, int bonuspoint) {
        cart = new Product01[10];
        this.money = money;
        this.bonuspoint = bonuspoint;
    }
    void Buy(Product01 product) { // 구매자가 어떤 물건 정보를 알아야한다. (그 물건의 가격 정보를 얻어올 수 있다)
        
        if(this.money < product.price) {
            System.out.println("고객님 잔액이 부족합니다 ^^! \n현재 잔액: " + this.money);
            return; // 함수의 종료(구매행위 종료)
        }
        
        // Cart의 범위 제한
        if(this.index >= 10) {
            System.out.println("[ 고객님 카트에 자리가 없어용..ㅠㅠ ]");
            return;
        }
        
        // 카트에 물건 담기
        cart[index++] = product;
        //실제 구매 행위
        this.money -= product.price; // 잔액
        this.bonuspoint += product.bonuspoint; // 누적
        System.out.println("구매한 물건: "+product.toString()); 
        System.out.println("잔액: "+ this.money);
        System.out.println("포인트: " + this.bonuspoint); 
    }
    
    void Sum(){
        int totalprice = 0;
        int totalbonuspoint = 0;
        String produclist = "";
        
        for(int i = 0; i < index; i++) {
                totalprice += cart[i].price;
                totalbonuspoint += cart[i].bonuspoint;
                produclist += cart[i].toString() + " ";
            }
        System.out.println("**********영수증**********");
        System.out.println("구매한 물건 총액: " + totalprice);
        System.out.println("포인트 총액: " + totalbonuspoint);
        System.out.println("구매한 물건 목록: "+produclist);
        System.out.println("**************************");
        
       
        }
    }
    



public class Ex13_Inherit_Work {
    public static void main(String[] args) {
        KtTv01 kttv = new KtTv01();
        Audio01 audio = new Audio01();
        NoteBook01 notebook = new NoteBook01();
        
        Buyer01 buyer = new Buyer01(10000,0);
        
        buyer.Buy(kttv);
        buyer.Buy(audio);
        buyer.Buy(kttv);
        buyer.Buy(notebook);
        buyer.Buy(kttv);
        
        buyer.Buy(kttv);
        
        buyer.Sum();
        
        
        
    }
}

