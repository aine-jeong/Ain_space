import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/*
 Set 인터페이스를 구현하는 클래스
 Set: 원 안에 들어가세요 (순서를 보장하지 않음, 중복x)
 : 순서가 없고 중복을 허락하지 않는 데이터 집합
 
 HashSet, TreeSet
 */
public class Ex09_Set {
    public static void main(String[] args) {
        
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(1);
        hs.add(100);
        boolean bo2 = hs.add(55);
        System.out.println(bo2);
        
        bo2 = hs.add(1); // 중복값이 들어가지 않도록 보장
        System.out.println(bo2);
        
        System.out.println(hs.toString());
        
        hs.add(2);
        System.out.println(hs.toString()); // 순서가 보장되지 않아요(배열이 아니니까)
        
        //////////////////////////////
        
        HashSet<String> hs2 = new HashSet<String>();
        hs2.add("b");
        hs2.add("A");
        hs2.add("F");
        hs2.add("c");
        hs2.add("Z");
        hs2.add("A");
        hs2.add("A");
        hs2.add("A");

        System.out.println(hs2.toString()); // >>[A, b, c, F, Z] 중복값 없어용
        
        String[] obj = {"A","B","C","D","D","A"};
        HashSet<String> hs3 = new HashSet<String>();
        for(int i = 0; i < obj.length ; i++) {
            hs3.add(obj[i]);
        }
        System.out.println(hs3.toString()); // 중복되지 않는 값을 뽑아낼 수 있다.
        
        //Quiz
        //HashSet을 사용해서 1~45까지의 난수 6개를 넣으세요
        
        // 풀어본고
        Random r = new Random();
        HashSet<Integer> lotto = new HashSet<Integer>();
        for(int i = 0 ; lotto.size() < 6 ; i++) {
            lotto.add(r.nextInt(45)+1);
        }
        System.out.println(lotto);
        
        
        //강사님꾸
        HashSet<Integer> t_lotto = new HashSet<Integer>();
        for(int i = 0 ; t_lotto.size() < 6 ; i++) {
            int num =  (int)(Math.random()*45 + 1);
            t_lotto.add(num);
            System.out.println("i : " + i + " num :" + num);
        }
        System.out.println(t_lotto.size());
        System.out.println(t_lotto);
        
        // 2번째 방법
        Set set2 = new HashSet();
        while(set2.size() < 6) {
            int num = (int)(Math.random()*45 + 1);
            set2.add(num);
        }
        System.out.println("lotto: "+set2);
        
        
        HashSet<String> set3 = new HashSet<String>();
        set3.add("AA");
        set3.add("DD");
        set3.add("ABC");
        set3.add("FFF");
        System.out.println(set3.toString());
        
        //iterator로 출력하세용
        Iterator<String> st = set3.iterator();
        while(st.hasNext()) {
            System.out.println(st.next()); // set 배열 아니예용~~~ 순차적으로 데이터 출력 가능
        }
        
        
    }
}
