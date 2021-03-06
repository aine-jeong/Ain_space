import java.util.Stack;

import kr.or.bit.MyStack;

/*
 JAVA API
> Stack , Queue 제공


### Stack 자료구조 그림 그리고 암기하기~!~!~! ###
 */


public class Ex05_Stack_Collection {
    public static void main(String[] args) {
        Stack s = new Stack(); // JAVA API가 제공
        s.push("A");
        s.push("B");
        System.out.println(s.pop());
        System.out.println(s.pop());
//        System.out.println(s.pop()); // java.util.EmptyStackException / 더이상 꺼낼 데이터가 없는뎅...
        System.out.println(s.isEmpty()); // 너 데이터 없어 ? >> true
        
        
        MyStack my = new MyStack(5);
        System.out.println("비어있니? " + my.isEmpty());
        my.push("A");
        my.push("B");
        my.push("C");
        my.push("D");
        my.push("E");
//        my.push("F");
        
        System.out.println(my.pop());
        System.out.println(my.pop());
        System.out.println(my.pop());
        System.out.println(my.pop());
        System.out.println(my.pop());
        System.out.println(my.pop()); 
        
        
        
    }
}
