import kr.or.bit.Fclass;
import kr.or.bit.Tv;


public class Ex02_MethodCall {
    public static void main(String[] args) {
        Fclass fclass = new Fclass();
        fclass.m(); // 함수 호출
        fclass.m2(100);
        
        int result = fclass.m3();
        System.out.println(result);
        
        result = fclass.m4(200);
        System.out.println(result);
        
        result = fclass.sum(10,20,30);
        System.out.println(result);
        
        fclass.callSubSum(); // tip: 블럭으로 긁어서 F3누르면 해당 클래스가 만들어진 부분으로 이동한다!
        
        boolean bo = fclass.opSum(100);
        System.out.println(bo);
        
        
        Tv tv = fclass.tCall(); //Tv 타입을 가지는 주소값을 받는다.
        System.out.println("tv의 주소: "+tv); 
        // 출력 결과> tv의 주소: kr.or.bit.common.Tv@4926097b
        // fClass의 t와 주소가 같다.
        
        Tv tv2 = new Tv();
        System.out.println("tv2의 주소값: "+tv2);
        fclass.tCall2(tv2);
        
    }
}
