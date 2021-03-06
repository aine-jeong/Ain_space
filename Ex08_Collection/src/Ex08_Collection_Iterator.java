import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 Collection Framework
 "나열된 자원에 대해 순차적으로 접근해서 값을 리턴하는 것"을 표준화시키자! >> 인터페이스 설계하자
 
 Iterator 인터페이스
 >> hasNext() , Next(), remove() 등등의 추상함수
 >> 구현: Arraylist 가 Iterator 를 구현하고있다.
 
 public Iterator iterator() {
     return new A implements Iterator
 }
 
 
 */
public class Ex08_Collection_Iterator {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(100);
        list.add(200);
        list.add(300);
        
        //출력 - 이렇게 식으로 써도 문제는 없다
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //표준화된 출력 방식 사용(조건: 데이터가 나열되어 있어야 한다)
        // list.iterator() >> 인터페이스 리턴 (재정의한 것만 보게 된다)
        Iterator it = list.iterator();
        // ArrayList가 Collection 인터페이스가 가지고 있는 추상함수를 구현
        // public Iterator iterator(); >> 라는 인터페이스 타입을 구현했을 것
        while(it.hasNext()) {
            System.out.println(it.next());
        } 
        // 논리를 직접 작성하지 않았다 -> 표준화되어있으니까!! 
        // 표준화 된 것을 사용해야 하는 이유: 실수할 여지가 없다 / 누가 작성해도 똑같은 값이 나올 것
        
        // Ex07_ETC -> wrapper class 확인하고 오기
        
        ArrayList<Integer> intlist = new ArrayList<Integer>();
        intlist.add(10);
        intlist.add(11);
        intlist.add(12);
        
        Iterator<Integer> it2 = intlist.iterator();
        while(it2.hasNext()) {
            System.out.println(it2.next());
        }
        // Iterator는 순차적인 방향으로만 가능하다
        
        System.out.println("********************");
        
        //Iterator 인터페이스
        //역방향 조회 (조건: 순방향으로 갔다가 다시 역방향으로 돌아와야 한다)
        ListIterator<Integer> it3 = intlist.listIterator();
        
        // 순방향
        while(it3.hasNext()) {
            System.out.println(it3.next());
        }
        
        // 역방향
        while(it3.hasPrevious()) {
            System.out.println(it3.previous());
        }
        
        
        
        
        
        
    }
}
