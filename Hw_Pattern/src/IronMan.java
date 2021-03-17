public abstract class IronMan {

    String ironManName;
    
    public void 부품준비() {
        System.out.println(ironManName + "의 머리를 가져옵니다.");
        System.out.println(ironManName + "의 몸통을 가져옵니다.");
        System.out.println(ironManName + "의 다리를 가져옵니다.");
        System.out.println(ironManName + "의 팔을 가져옵니다.");
    }

    public void 조립() {
        System.out.println(ironManName + "의 몸통과 다리를 조립합니다.");
        System.out.println(ironManName + "의 몸통과 팔을 조립합니다.");
        System.out.println(ironManName + "의 몸통과 머리를 조립합니다.");
    }

    public void 자비스삽입() {
        System.out.println("자비스 소프트웨어를 설치하였습니다.");
    }

    public void 전원On() {
        System.out.println("전원 ON 하였습니다.");
        System.out.println(ironManName + "이 눈을 떴습니다!!");
    }
}