/*
 변수 <-> 상수
 
 상수: 한번 값이 초기화(최초 값의 할당)되면 변경 불가
 상수자원: 고유값(주민번호), 수학: PI=3.141592... , 버전번호, 시스템관리번호 등등
 상수는 관용적으로 대문자로 작성한다.
 
 java: final int NUM = 10;
 c#  : const integer NUM = 10;
 
 final 키워드
 final class Car() >> 상속금지
 함수 앞에 >> public final void print() {} >> 상속관계에서 재정의금지 (override 금지)
 public static final void print() >> 객체간 공유 자원(한번 정의되면 바꿀 수 없는것)
 */

class Vcard{
    final String KIND = "heart";
    final int NUM = 10;
    void method() {
        System.out.println(Math.PI);
    }
}

class Vcard2{
    final String KIND;
    final int NUM;
    
    // 초기화를 보장받는 방법
    // 꼭 값을 처음부터 줘야하는 것은 아니다.
    Vcard2() {
        this.KIND = "heart";
        this.NUM = 10;
    }
    
    Vcard2(String kind, int num) {
        this.KIND = kind;
        this.NUM = num;
    }

    @Override
    public String toString() {
        return "Vcard2 [KIND=" + KIND + ", NUM=" + NUM + "]";
    }

    
    
    
}

public class Ex07_Final {
    public static void main(String[] args) {
        Vcard vcard = new Vcard();
        System.out.println(vcard.KIND);
        vcard.method();
        
        Vcard2 vcard2 = new Vcard2();
        System.out.println(vcard2);
        
        Vcard2 vcard3 = new Vcard2("spade", 10);
        System.out.println(vcard3);
        
    }
}
