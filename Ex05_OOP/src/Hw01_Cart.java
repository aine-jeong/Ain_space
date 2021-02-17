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


class Product001{
    int price;
    int bonuspoint;
    
    Product001(int price) {
        this.price = price;
        this.bonuspoint = (int)(this.price / 10.0);
    }
}

class KtTv001 extends Product001{
    // 가격에 대한 정보는 부모가 가지고 있다.
    KtTv001() {
        super(500);
    }
    
    @Override
    public String toString() {
        return "KtTv";
    }
}

class Audio001 extends Product001{
    // 가격에 대한 정보는 부모가 가지고 있다.
    Audio001() {
        super(100);
    }
    
    @Override
    public String toString() {
        return "Audio";
    }
}

class NoteBook001 extends Product001{
    // 가격에 대한 정보는 부모가 가지고 있다.
    NoteBook001() {
        super(150);
    }
    
    @Override
    public String toString() {
        return "NoteBook";
    }
}


class Buyer001{
    int money = 2000;
    int bonuspoint;
    
    Product001[] cart = new Product001[10];
    static int total = 0;
    static int totalprice = 0;
    
    void Buy(Product001 n) { // 구매자가 어떤 물건 정보를 알아야한다. (그 물건의 가격 정보를 얻어올 수 있다)
//        if(this.money < n.price) {
//            System.out.println("고객님 잔액이 부족합니다 ^^! \n현재 잔액: " + this.money);
//            return; // 함수의 종료(구매행위 종료)
//        }
        //실제 구매 행위
//        this.money -= n.price; // 잔액
//        this.bonuspoint += n.bonuspoint; // 누적
//        System.out.println("구매한 물건: "+n.toString()); 
        
        //카트에 물건 담기
        if(total > 9) {
            System.out.println("더이상 물건을 담을 수 없습니다.");
        } else {
            this.cart[total] = n;
            total++;
            totalprice += n.price;
        }
    }
    
    void Sum(){
        System.out.println("**********영수증**********");
        for(int i = 0; i < total; i++) {
                System.out.printf(" %-18s :%d \n",cart[i].toString(),cart[i].price);
            }
        System.out.println("-------------------------");
        System.out.printf("총 합계 금액:    [%d]만원 \n",totalprice);
        System.out.println("**************************");
        
        if(totalprice > this.money) {
            System.out.println("고객님 한도초과입니다. ^^!");
        }
        }
    }
    



public class Hw01_Cart {
    public static void main(String[] args) {
        KtTv001 kttv = new KtTv001();
        Audio001 audio = new Audio001();
        NoteBook001 notebook = new NoteBook001();
        
        Buyer001 buyer = new Buyer001();
        buyer.Buy(kttv);
        buyer.Buy(audio);
        buyer.Buy(kttv);
        buyer.Buy(notebook);
        buyer.Buy(kttv);
        
        buyer.Buy(kttv);
       
        
        
        
        buyer.Sum();
        
        
        
    }
}

