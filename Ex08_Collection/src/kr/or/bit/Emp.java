package kr.or.bit;

public class Emp {
    private int empno;
    private String ename;
    private String job;
    
    public Emp() {
        
    }
    
    // 오버로딩 컨스트럭터
    public Emp(int empno, String ename, String job) {
        super();
        this.empno = empno;
        this.ename = ename;
        this.job = job;
    }
    
    // 게터 세터
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    // toString 오버라이드
    @Override
    public String toString() {
        return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + "]";
    }
    
    

}
