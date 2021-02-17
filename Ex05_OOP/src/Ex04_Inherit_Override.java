/*
 
 ##Today Point##
 [상속관계]에서 override: 상속관계에서 자식이 부모의 함수를 [재정의]하는 것
 [상속관계]에서 [자식클래스]가 [부모클래스]의 함수 내용을 바꾼다 : 재정의
 재정의: 틀의 변화는 없고 "함수의 이름, 타입, parameter) 내용만 변화
 
### 오버로딩은 하나의 이름으로 여러가지 기능을 사용하는 것이고,
### 오버라이딩은 상속관계에서 부모의 메소드를 재정의하는 것이다.
 
 
 */

class Point2 {
    int x =4;
    int y =5;
    
    String getPosition() {
        return this.x + " / " + this.y;
    }
}

class Point3D extends Point2 {
    int z = 6;
    
//    String getPosition3() {
//        return null;
//    }
    // 재사용하려면 -> 재정의
    
    // 함수가 반드시 재정의 함수였으면 좋겠다..
    //Annotation은 Java code만으로 전달할 수 없는 부가적인 정보를 [컴파일러]나 [개발툴]로 전달할 수 있다.
    // @Override -> 지금 이 함수가 재정의가 맞게 되었는지 확인해봐라.
    @Override
    String getPosition() {
        return this.x + " / " + this.y + " / " + this.z;
    }
}

public class Ex04_Inherit_Override {
    public static void main(String[] args) {
        Point3D point = new Point3D();
        String result = point.getPosition();
        System.out.println(result);
    }
}
