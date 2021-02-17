// 게임 : Unit()

// Unit: 공통 기능 (이동좌표, 이동, 멈춤) -> unit의 추상화되고 일반화된 자원
// Unit: 이동 방법은 다르다 (이동 방법은 Unit마다 별도의 구현이 필요하다)
// 추상클래스로 설계해보자

abstract class  Unit{
    int x,y;
    abstract void move(int x, int y); // 구현부가 없다 -> 추상자원 -> 사용할 사람이 구현해라(강제구현)
    
    void stop() {
        System.out.println("Unit Stop");
    }
}

// Tank
class Tank extends Unit {

    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Tank 이동: " + this.x + "," + this.y);
    }
    
    // Tank가 가지고 있는 구체화,특수화 된 것
    void changeMode() {
        System.out.println("탱크 변환 모드");
    }
}

class Marine extends Unit {
    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Marine 이동: " + this.x + "," + this.y);
    }
    
    // Marine이 가지고 있는 구체화,특수화 된 것
    void stimpack() {
        System.out.println("스팀팩 기능");
    }
}

class DropShip extends Unit {
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("DropShip 이동: " + this.x + "," + this.y);
    }
    
    //DropShip이 가지고 있는 구체화, 특수화된 것
    void load() {
        System.out.println("Unit Load...");
    }
    
    void unload() {
        System.out.println("Unit Unload...");
    }
}

public class Ex02_abstract_class {
    public static void main(String[] args) {
        /*
        Tank t = new Tank();
        t.move(500, 200);
        t.stop();
        t.changeMode();
        
        Marine m = new Marine();
        m.move(500, 200);
        m.stop();
        m.stimpack();
        */
        
        // 1. Tank 3대를 만들고, 같은 좌표로 이동시키세요(555, 444)
        Tank[] tanks = {new Tank(), new Tank(), new Tank()};
        for(Tank tank : tanks) {
            tank.move(555, 444);
        }
        
        
        // 2. Tank 1, Marine 1, DropShip 1 -> 같은 좌표로 이동시키세요(666,444)
        // 다형성
        Unit[] units = {new Tank(),  new Marine(), new DropShip()};
        
        for(Unit unit : units) {
            unit.move(666, 444);
        }
        
    }
}
