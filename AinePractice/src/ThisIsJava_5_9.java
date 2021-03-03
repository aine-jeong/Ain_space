
import java.util.Scanner;

public class ThisIsJava_5_9 {
    public static void main(String[] args) {
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;
        Scanner scanner = new Scanner(System.in);
        while (run) {
            System.out.println("--------------------");
            System.out.println();
            System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("--------------------");
            System.out.println("선택> ");
            int selectNo = scanner.nextInt();
            if (selectNo == 1) {
                System.out.print("학생수 > ");
                studentNum = scanner.nextInt();

            } else if (selectNo == 2) {
                scores = new int[studentNum];
                for (int i = 0; i < scores.length; i++) {
                    System.out.print("scores[" + i + "]" + "> ");
                    scores[i] = scanner.nextInt();
                }
            } else if (selectNo == 3) {
                for (int i = 0; i < scores.length; i++) {
                    int a = scores[i];
                    System.out.print("scores[" + i + "]" + ": " + a + "\n");
                }
            } else if (selectNo == 4) {
                int sum = 0;
                double average = 0;
                int max = 0;
                for (int i = 0; i < scores.length; i++) {
                    sum += scores[i];
                    if(max < scores[i]) {
                        max = scores[i];
                    }
                }
                average = (double)sum / scores.length;
                System.out.println("최고 점수 : " + max);
                System.out.println("평균 점수 : " + average);
            } else if (selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}