

class Human{
    String name;
}

class Test {
    int add(int i, int j) {
        return i + j;
    }
    
    //# 배열은 객체다 (배열은 주소값을 가지고 있다 = 배열은 Heap메모리에 생성된다.)
    int[] add2(int[] param) { // 함수의 리턴타입이 배열이다
                     // ㄴ int[]의 주소값을 리턴하겠다. = int[] 배열의 주소값을 받겠다 
        
//        return null; // 가능
//        return new int[5]; // 가능 / return new Tv()
        int[] arr = new int[param.length];
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = param[i]+1;
        }
        
        return arr;
        
    }
    
 // 서태희님 코드
    int[]add3(int[] so, int[] so2){

        int[] max = (so.length>so2.length) ? so : so2;
        int[] min = (so.length<so2.length) ? so : so2;

        int result[] = new int[max.length];

        for(int i=0; i< max.length; i++){
            if(i >=min.length){
                result[i]=max[i];
            }
            else{
                result[i] = max[i]+min[i];
            }
        }

        return result;
    }
    // 함수 안의 코드를 여러분 마음대로 작성하시고
    // main함수 안에서 가지고 놀아보세요
    // add3()을 에러 없이 놀아봐랑~~~
    
    
}


public class Ex03_MethodCall_Array {
    public static void main(String[] args) {
        Test t = new Test();
        int result = t.add(10,10);
        System.out.println("result: "+result);
        
        int[] array = {10,20,30};
        int[] resultarray = t.add2(array);
        for(int i : resultarray) {
            System.out.println("i: "+i);
        }
        
     // 서태희님 코드
        int[] array2 = {1,2,3,4,5};
        int[] array3 = {6,7,8};
        int[] resultarray2 = t.add3(array2,array3);

        for(int i:resultarray2){
            System.out.print(i + " ");
        }
        
//        int[] arr = {1,2,3,4,5}
//
//        for(int i = 0; i < arr.length; i++) {
//              System.out.print( i ) 
//        }
//
//        # 개선된 for문
//        for(int i : arr) { // 앞에는 배열의 타입을 적고, 콜론 뒤에 배열 이름을 써라
//          System.out.print( i ) 
//         // for문이 알아서 배열의 개수만큼 루프를 돌면서 각 방의 값을 i에 넣으면서 사용해준다
//         // 출력이나 연산이나 해라 알아서!!
        
        
        
    } // main end
} // class end
