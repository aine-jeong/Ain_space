package day2;

public class HomeworkTest {
 public static void main(String[] args) {
	 int startDan = 2;   // 시작 단
	 int endDan = 9;     // 끝 단
	 int danPerLine = 3; // 한 줄에 출력할 단수.
	 int maxGudan = 9;   // 계산할 구단수
	 for (int dadan = startDan; dadan <= endDan; dadan += danPerLine) {
	     // dadan: 맨 왼쪽 단
	     for (int gudan = 1; gudan <= maxGudan; gudan++) {
	         int currentDanMax = dadan + (danPerLine - 1);  // 현재 줄에서 가장 오른쪽에 놓일 단
	         for (int danline = dadan;
	                 danline <= ((currentDanMax <= endDan) ? currentDanMax : endDan);
	                 danline++) {
	             // 왼쪽 단부터 오른쪽 단까지 한 단씩 출력.
	             // 단 오른쪽 단이 계산할 구단수보다 많으면 그 단 출력 안 함.
	             System.out.print(danline + " x " + gudan+ "\t");
	         }
	         // 다음 줄로 넘기기
	         System.out.println();
	     }
	     // 지난 문단의 단들과 간격 만들기
	     System.out.println();

}
}
}
