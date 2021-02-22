/*
 Collection (Vector, ArrayList 비교)
 동기화를 보장(안정성)하느냐 보장하지 않느냐(성능)
 
 한강 고수부지 화장실(공유자원): 여러명의 사용자(Thread)가 동시에 접근
 화장실 1개, 사람(Thread) 여러명이 동시에 사용
 
 문제점: Lock장치가 없다. (동시에 들어가서 동시에 일을 본다 ...)
 해결방안: Lock 만들기 (함수 단위)
 
  synchronized void openDoor : synchronized 동기화 보장!!
  
  반대
  
  비빔밥: 동시에 먹는 것이 효율적 -> 자원을 보호(LOCK) 할 필요가 없다.
 */

class Wroom {
    synchronized void openDoor (String name) {
        System.out.println(name + "님 화장실 입장^^");
        for(int i = 0; i < 100; i++) {
            System.out.println(name + " 사용중 " + i);
            if(i==10) {
                System.out.println(name + "님 say: 끙~~~");
            }
        }
        System.out.println("시원하시죠 ^^!");
    }
}

class User extends Thread {
    Wroom wr; // 화장실 주소를 알고있어야 한다.
    String who;
    User(String name, Wroom w) {
        this.who = name;
        this.wr = w;
    }
    
    @Override
    public void run() {
        wr.openDoor(this.who);
    }
}


public class Ex10_Sync_Thread {
    public static void main(String[] args) {
        // 이곳은 한강 고수부지 입니다.
        Wroom w = new Wroom();
        
        // 사람들 (Thread)
        User kim = new User("김씨", w);
        User park = new User("박씨", w);
        User lee = new User("이씨", w);
        
        //배가 아파요
        kim.start();
        park.start();
        lee.start();
        
    }
}
