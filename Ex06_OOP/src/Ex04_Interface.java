
interface Irepairable{ 
}

class Unit2{
    int hitpoint; // 기본 에너지
    final int MAX_HP; // 최대 에너지
    Unit2(int hp) {
        this.MAX_HP = hp;
    }
}

// 지상 유닛
class GroundUnit extends Unit2{
    GroundUnit(int hp) {
        super(hp);
    }
}

// 공중 유닛
class AirUnit extends Unit2{
    AirUnit(int hp) {
        super(hp);
    }
}

// 건물
class CommandCenter implements Irepairable{
}

class Tank2 extends GroundUnit implements Irepairable{
    Tank2() {
        super(50);
        this.hitpoint = this.MAX_HP;
    }
    
    @Override
    public String toString() {
        return "[Tank2]";
    }
}

class Marine2 extends GroundUnit{
    Marine2() {
        super(50);
        this.hitpoint = this.MAX_HP;
    }
    
    @Override
    public String toString() {
        return "[Marine2]";
    }
}

//Scv 자원채취 (광물, 치료 ... 에너지)
class Scv extends GroundUnit implements Irepairable{
    Scv() {
        super(50);
        this.hitpoint = this.MAX_HP;
    }
    
    @Override
    public String toString() {
        return "[Scv]";
    }
    
    // Scv만이 갖는 구체화, 특수화된 기능
    // repair(수리)
    /*
    void repair(Tank2 tank) {
        if(tank.hitpoint != tank.MAX_HP) {
            System.out.println("너 맞았구나....고쳐줄게");
            tank.hitpoint += 5;
        }
    }
    
    void repair(Scv scv) {
        if(scv.hitpoint != scv.MAX_HP) {
            System.out.println("너 맞았구나....고쳐줄게");
            scv.hitpoint += 5;
        }
    }
    
    > Unit의 종류가 30개라고 가정 (25개는 Scv가 치료할 수 있다)
    > Scv repair 해야하는 Unit의 개수가 증가하면 함수의 개수도 같이 증가
    > 고민: 하나의 함수가 Unit들을 repair할 수 있으면 되는고아닌가 ..???
    > 전자제품 매장에서 뭐썼더라 ?
    > 상속 관계에서 다형성을 썼었지! ... 같은거아니야?
    
    void repair(Unit2 unit) {} >> 문제점:유닛 중에 마린은 Scv가 치료하는게 아닌뎅 ....
    void repair(GroundUnit unit) {} >> 마린은 GroundUnit에도 속하는뎅.....
    > 헤엑 게다가 커맨드센터도 Scv가 repair할수있는데 ?!?!?!? (Unit과 연관성이 없는뎅 ......ㅠ_ㅠ)
    > 공통적인 애들의 부모를 만들어주까 ...?
    
    인터페이스 Irepairable > 부모로 만들어보자 .......
    > 위에다가 Irepairable 인터페이스 만들고, 적용
    class Scv extends GroundUnit   implements Irepairable
    class Tank2 extends GroundUnit implements Irepairable
    class CommandCenter            implements Irepairable
    
    Irepairable는 Scv의 부모타입이다 (o)
    Irepairable는 Tank2의 부모타입이다 (o)
    Irepairable는 CommandCenter의 부모타입이다 (o)
    > 부모타입은 자식타입의 주소를 가질 수 있당~~~~~
    */

    void repair(Irepairable repairunit) {
       // Irepairable repairunit는 Irepairable 인터페이스를 구현하는 객체의 주소값이 올 수 있다.
       // void repair(new Tank2()) 가능하냐 -> O 
       // void repair(new CommandCenter()) 가능하냐 -> O 
       // void repair(new Scv()) 가능하냐 -> O
       // 문제는 모냐 -> 부모는 자식타입의 주소를 받을 수 있으나 부모 것만 볼 수 있다.
       //              인터페이스도 자기것만 볼 수 있다 .........
        
       //정리
       //1. CommandCenter와 Tank2, Scv의 수리방법이 다르다.
       //2. Irepairable repairunit는 수리할 자원을 가지고 있지 않다.
       // 그럼, Irepairable repairunit를 통해서 위 3가지 Unit이 온다고 가정하고 분류해보자
        
       // CommandCenter와 Tank2, Scv의 구분점은 Unit2이냐 아니냐....
       // 일단 받아서 너 Unit2 타입이니 아니니? 하고 물어보자
       //  ㄴ> 타입 비교 >> 자바에 타입비교 연산자가 있당: instanceof!! 
       // https://cafe.naver.com/bit2021/141
        
       if(repairunit instanceof Unit2) { // 부모타입이 Unit2인 경우
                               // 만약에 Tank2가 들어오면 > 너 Unit2 타입이니? 하고 물어본다
           Unit2 unit = (Unit2)repairunit; //unit >> Tank2, Marine
           // Tank2에서 부모타입인 Unit2 자원만 접근
           
           // ****** 부모타입의 주소를 자식이 가지려면 자식타입으로 캐스팅해야한다. *******
           if(unit.hitpoint != unit.MAX_HP) {
               unit.hitpoint = unit.MAX_HP;
           }
       }else {//부모타입이 Unit2가 아닌 경우
           System.out.println("Unit2 타입이 아니예요.. 다른 충전방식을 통해서 충전해보아요");
       }
    }
}


public class Ex04_Interface {
    public static void main(String[] args) {
        Tank2 tank = new Tank2();
        Marine2 marine = new Marine2();
        Scv scv = new Scv();
        
        // 전투
        tank.hitpoint -= 20;
        System.out.println("탱크 체력: " + tank.hitpoint);
        System.out.println("Scv 수리요청");
        scv.repair(tank);
        System.out.println("탱크 수리 완료: " + tank.hitpoint);
        
        scv.hitpoint -= 10;
        System.out.println("scv 체력: " + scv.hitpoint);
        System.out.println("Scv 수리요청");
        scv.repair(scv);
        System.out.println("scv 수리 완료: " + scv.hitpoint);
        
        CommandCenter center = new CommandCenter();
        scv.repair(center);
        
//        scv.repair(marine); // 컴파일 불가능
    }
}
