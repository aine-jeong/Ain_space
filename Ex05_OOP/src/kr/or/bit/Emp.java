package kr.or.bit;

public class Emp { //extends Object가 생략되어 있다.
    private int empno;
    private String ename;
    
    public Emp(int empno, String ename) {
        this.empno = empno;
        this.ename = ename;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    //Object: 내가 toString()을 가지고 있는데, 니가 원하면 이거 재정의해서 써랑
    // 개발자: 그럼 member field를 검증하는 용도로 써볼꽈 ... (관습적으로 사용하게 되었다)
    
    //Object가 가지는 toString()을 재정의 
    //     ㄴ> member field를 검증하는 용도로 쓴 것(값이 잘 들어가 있낭?)
    @Override
    public String toString() {
        return "Emp [empno=" + empno + ", ename=" + ename + "]";
    }
    
    
    
    
    
}
