package kr.or.bit;
/*
 
 사원은 사번을 가지고 있고 사번은 숫자 데이터로 관리하려고 한다.
 사원은 이름을 가지고 있고 이름은 문자열 데이터로 관리하려고 한다.
 사원은 직종을 가지고 있다. 직종은 (IT, SALES) 등의 데이터로 관리된다.
 사원은 급여를 받는다. 급여는 숫자 데이터로 관리된다.
 사원은 신체정보를 가지고 있다. 신체 정보는 키와 몸무게 데이터로 관리된다. >> 부품 정보
 >> 신체정보 >> 하나의 타입 >> 사용자(개발자) >> class
 
 만들어보세요
 
 */

public class Person {
    public int empno; // default 0
    public String ename; // null
    public String job; // null
    public int sal; // 0
    
    public BodyInfo bodyinfo; // BodyInfo 설계도를 여기서 참조하는 것
            // 초기화가 되지 않음
    
}
