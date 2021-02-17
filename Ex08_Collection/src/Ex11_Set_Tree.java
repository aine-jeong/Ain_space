import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_Set_Tree {
    public static void main(String[] args) {
        // Set 인터페이스: 순서를 보장하지 않고, 중복을 허용하지 않는다.
        HashSet<String> hs = new HashSet<String>();
        
        hs.add("B");
        hs.add("A");
        hs.add("F");
        hs.add("K");
        hs.add("G");
        hs.add("D");
        hs.add("P");
        hs.add("A");
        hs.add("C");
        
        System.out.println(hs.toString());
        // >> [P, A, B, C, D, F, G, K]

        
        //TreeSet
        //순서가 없고, 중복도 없음 -> 근데 정렬좀 해주세용..
        //(데이터집합을) 검색하거나 데이터를 정렬할 때 필요로하는 자료구조 > TreeSet
        
        //1. 이진트리구조 (하나가 가질수 있는 최대 개수가 2개당)
        //2. 데이터가 저장될 때 정렬된다.
        
        //TreeSet: 순서x 중복x, 정렬o
        
        Set<Integer> lotto = new TreeSet<Integer>();
        for(int i = 0; lotto.size() < 6 ; i++) {
            lotto.add((int)(Math.random()*45 + 1));
        }
        System.out.println(lotto.toString());
    }
}
