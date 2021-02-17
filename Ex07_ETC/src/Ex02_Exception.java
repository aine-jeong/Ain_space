
public class Ex02_Exception {
    public static void main(String[] args) {
        int num = 100;
        int result = 0;
        System.out.println("main Start");
        
//        for(int i = 0; i <10 ; i++) {
//            result = num / (int)(Math.random()*10); // 0~9까지 정수부만 나온당
//            System.out.println("result: "+result+"i: "+i);
//        } // 오류가 날 수 있는데, 운이 좋으면 오류가 안난 결과를 보게 될 수도 있다.
//            // 혹시 모르니 예외처리를 하는게 좋당~~
        
        
        // ## 문제를 해결해주는 것이 아니라, 문제를 파악하는 과정이라는 것을 기억하자 ##
        try {
            for(int i = 0; i <10 ; i++) {
                result = num / (int)(Math.random()*10); // 0~9까지 정수부만 나온당
                System.out.println("result: "+result+"i: "+i);
            }
        } catch (ArithmeticException e) { // Exception으로 쓸 수도 있고, ArithmeticException로 써도 된다.
                              // 하위 예외(구체화된 예외)를 써 주는 것이 가장 좋음 -> 가독성 good
            System.out.println("문제가 발생되었다는 로그를 기록하고 관리자에게 메일 발송");
            System.out.println("원인: "+e.getMessage());
        } catch (NullPointerException e) { // catch를 여러개 사용할 거라면,
                                    // 하위 예외를 먼저 선언한 뒤 상위 예외를 선언해주어야 한다.
                                    // Exception 먼저 잡고, ArithmeticException를 잡는건 불가능
            
        } catch (Exception e) {
            // ArithmeticException, NullPointerException도 아닌 나머지 예외는 여기서 해결해라
        }
        
        System.out.println("main end");
    }
}
