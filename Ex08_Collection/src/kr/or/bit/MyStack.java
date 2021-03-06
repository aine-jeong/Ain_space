package kr.or.bit;

import java.util.Arrays;

// Stack 자료구조를 설계하기
// 1. 저장공간이 필요하다 : Array >> Object[] stackarr;
//   MyStack my = new MyStack(); >> 기본적으로 배열이 생성되어야 한다.
//                               ㄴ> 크기 설정이 가능하도록 해라 (파라미터로 받아서)
//   MyStack my = new MyStack(10); >> Object 배열 10개가 만들어지도록
// 2. 위치정보를 알고있어야 한다 (커서가 몇번째 방을 가리키고 있는지) : Pointer, position, index, top ...등의 이름으로!
//      ㄴ> 저장되는 값이 있는 위치 정보
// 3. 기능: push(Object) // Object pop // isEmpty(배열이 비어있는지 확인) // Full (배열이 꽉찼는지)

public class MyStack {

    private Object[] stackarr; // 저장 공간
    private int maxsize; // 최대 크기
    private int index; // 위치정보
    
//    Object pop; // pop실행시 들어있는 값을 리턴시킨 뒤 배열을 비우려고 만든 것......
    
    public MyStack(int maxsize) {
        stackarr = new Object[maxsize];
        this.maxsize = maxsize;
        index = -1;
    }
    
    public void push(Object object) {
        if (isFull()) {
           System.out.println("stack full....");
        } else {
//        index++;
            stackarr[++index] = object;
        }
    }
    
    public Object pop(){ 
//        if (isEmpty()) {
//            System.out.println("stack empty");
//        } else {
//            pop = stackarr[index];
//            stackarr[index] = null;
//            index--;
//        }
//        return pop;
        
        Object value = null;

        if (isEmpty()) {
            System.out.println("stack empty");

        } else {
            value = stackarr[index];
            index--;
        }

        return value;
    }
    
    public boolean isEmpty() {
        return (index == -1); // 같으면 true, 아니면 false
    }
    
    boolean isFull() {
        return ((maxsize-1) == index); // 같으면 true, 아니면 false
    }
    
    
    
    @Override
    public String toString() {
        return "MyStack [sarray=" + Arrays.toString(stackarr) + "]";
    }

    public static void main(String[] args) {
        MyStack my = new MyStack(10);
        my.push("AAA");
        System.out.println(my.pop());
        
        my.push("AAA");
        my.push("BBB");
        my.push("CCC");
        System.out.println(my.pop());
        System.out.println(my.pop());
        System.out.println(my.pop());
        
        System.out.println("비어있나용? " + my.isEmpty());
        System.out.println("꽉찼나용? " + my.isFull());
        System.out.println("maxsize: " + my.maxsize);
        
        System.out.println(my.toString());
    }
    
}
