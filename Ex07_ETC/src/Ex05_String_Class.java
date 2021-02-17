/*
 
 String >> 클래스 >> new를 통해서 사용 가능 > but, 일반적인 값타입처럼 사용해도 문제가 없다.
 String은 많은 함수를 가지고 있다(문자열 -> 조작(합치고 자르고 붙이고)을 자주 한다)
 String이 가지는 다양한 함수를 활용해보자 (static 함수 + 일반함수)
 최소 15~20개 정도의 함수를 암기해두는게 좋다 ...
 
 */

public class Ex05_String_Class {
    public static void main(String[] args) {
        String str = "";
        System.out.println(">"+str+"<");
        // 사용방법: int, double 처럼 사용한다
        
        String[] strarr = {"aaa","bbb","ccc"};
        for(String s : strarr) {
            System.out.println(s);
        }
        /////////////////////////////
        String str2 = "홍길동";
        System.out.println(str2.length()); // 오잉 원래 length는 배열에 나오는건뎁?
        System.out.println(str2.toString()); //toString() 재정의
        System.out.println(str2); // toString()이 생략되어있는 것
        
        String str3 = new String("김유신"); // 원래는 이렇게 만드는게 맞당.......
        
        //1. String name = "가나다라마";
        //String class의 내부적으로 저장되는 자료구조 -> char[] >> [가][나][다][라][마]
        //class String extends Object {char[] value ... toString()... length()... }
        
        String str4 = "AAA";
        String str5 = "AAA";
        
        System.out.println(str4);
        System.out.println(str5.toString());
        System.out.println(str4 == str5); // true
        // == : 연산자 값을 비교 (str4(주소값), str5(주소값)) -> 같게 나온다
        // 같은 값이 있는 String이 있으면, 새로 같은 값을 담는 String을 만들 때 같은 주소를 참조하게 만들어버린다.
        // 같은 주소다 but 우리가 원하는 것은 주소가 아니라 실제 가지고 있는 값을 비교하고 싶은 것(문자열)
        // String의 비교는 '=='을 사용하지 않는다
        
        String str6 = new String("BBB");
        String str7 = new String("BBB");
        System.out.println(str6 == str7); // false
        // String 만들 때 new를 사용하면 강제적으로 메모리를 할당하는 것
        // == 사용하면 주소값을 비교하는 것 -> 같은 메모리이지만 다른 주소값이므로 false가 출력되는 것이다.
        System.out.println(str6.equals(str7)); // 주소값이 아닌 실제 메모리에 있는 값을 비교하는 것
        
        // 문자열 비교는 equals를 사용하라~~~~
        
        // 넌센스
        String s = "A"; // Heap에 A가 들어있는 배열 생성됨
        s += "B"; // Heap에 AB가 들어있는 배열 생성됨
        s += "C"; // Heap에 ABC가 들어있는 배열 생성됨
                    // why??? String은 정적배열이라서..... 배열 칸을 늘릴 수 없는고..
        System.out.println(s);
        // 만약 여기서
        s = "A"; // 이렇게하면 원래 만들어뒀던 A가 들어있는 배열을 재활용하게 되는고.....
        
        // 질문 (성능)
        // String 1000개의 문자를 누적해라 ??
        // 그냥 누적시키는 것은 성능에 좋지 않당 ......
        // ㄴ> 누적데이터.....
        // StringBuffer
        // StringBuilder
    }
}
