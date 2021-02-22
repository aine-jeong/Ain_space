package kr.or.bit;

import java.io.Serializable;

/*
 객체 통신 (Ex15_ObjectDataOutputStream)
 객체(Car, Tv객체 등) 네트워크, 또는 파일 간(txt write, read), 프로세스(독립적인 프로그램)간의 통신
 직렬화: 객체를 분해해서 줄을 세워 보내는 전반적인 과정
 역직렬화: 객체를 다시 조립하는 과정
 
 실습
 > 파일에 UserInfo객체를 write (직렬화)
 > 파일에 직렬화된 UserInfo객체를 read해서 재조립하기 (역직렬화)
 
 조립식: 본드 붙여서 하는거..
 레고식: 붙였다 뗐다 할 수 있는거...
 UserInfo implements Serializable (조립분해 가능)
  >>> implements Serializable -> 직렬화 가능한 객체!
 
 
 */


public class UserInfo implements Serializable {
    private String name;
    private String  pwd;
    private int age;
    public UserInfo(String name, String pwd, int age) {
        super();
        this.name = name;
        this.pwd = pwd;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getPwd() {
        return pwd;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "UserInfo [name=" + name + ", pwd=" + pwd + ", age=" + age + "]";
    }
    
    
}
