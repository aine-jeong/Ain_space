import kr.or.bit.Car;
import kr.or.bit.Mouse;
import kr.or.bit.NoteBook;

//20210201 두번째 시간-1
public class Ex04_MethodCall {
    public static void main(String[] args) {
        
        NoteBook notebook = new NoteBook();
        notebook.setColor("red");
        notebook.setYear(-2000);
        
        System.out.println(notebook.getColor());
        System.out.println(notebook.getYear());
        
        Mouse mouse = new Mouse();
        notebook.handle(mouse);
        System.out.println(mouse.x);
        System.out.println(mouse.y);
        
//======================================================================
        //Q. notebook 3대 생성하고
        //2000, red
        //2010, blue
        //2020, white
        //명시하고 정보를 출력하세요
        
        // ##Today point##
        // 객체 배열은 방의 생성과 객체 생성 각각 작업해주어야 한다. (총 2번)
        
        // 1번째 방법
        NoteBook[] notebooks = new NoteBook[3];
        // 위와 같이 작성했을 때 -> 각 방이 만들어지는 거지 각 방에 노트북을 가지고 있는 것이 아니다.
        // 각 방에 null이 들어가있음 (빈 방)
        // 각 방은 notebook 객체의 '주소'를 넣는 방일 뿐, 객체를 넣는 방이 아니다.
        
        //so, 각 방에 객체를 넣는 과정.
        notebooks[0] = new NoteBook();
        notebooks[1] = new NoteBook();
        notebooks[2] = new NoteBook();
        
        notebooks[0].setYear(2000);
        notebooks[0].setColor("red");
        
        notebooks[1].setYear(2010);
        notebooks[1].setColor("blue");

        notebooks[2].setYear(2020);
        notebooks[2].setColor("white");
        
        for(int i =0; i < notebooks.length; i++) {
            notebooks[i].noteBookInfo();
        }
        // 개선된 for문
        for(NoteBook no : notebooks) {
            no.noteBookInfo();
        }
        
        // 2번째 방법
        // int[] arr = new int[] {1,2,3};
        NoteBook[] notebooks2 = new NoteBook[] {new NoteBook(), new NoteBook(), new NoteBook()};
        
        // 3번째 방법
        // 사용 빈도: int[] arr = {1,2,3};
        // 아래와 같이 작성하면 컴파일러가 new 부분을 처리해주는고!
        NoteBook[] notebooks3 = {new NoteBook(), new NoteBook(), new NoteBook()};
        
        
        //==================================
        // 20210201-3번째 시간-2
        
        Car car = new Car();
        car.speedUp();
        car.speedUp();
        System.out.println(car.getSpeed());
        
        car.speedDown();
        car.speedDown();
        car.speedDown();
        car.speedDown();
        car.speedDown();
        System.out.println(car.getSpeed());
        
        
    }
}


















