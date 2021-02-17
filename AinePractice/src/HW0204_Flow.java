import java.util.Scanner;

public class HW0204_Flow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int unit = 10000;
        int num = 0;
        int sw = 0;

        System.out.print("금액을 입력해주세요> ");
        int money = sc.nextInt();

        while (true) {
            num = money / unit; // 입력받은 금액을 화폐단위로 나누기
            System.out.println(unit+"원: " + num + "개");
            if (unit <= 1) { // 1원까지 찾았으면 그만하기
                break;
            }

            money = money - unit * num; // 나눈 뒤 남은 금액

            if (sw == 0) {
                unit = unit / 2; // 5000원 -> 500원 -> 5원
                sw = 1;
            } else {
                unit = unit / 5; // 1000원 -> 100원 -> 1원
                sw = 0;
            }
        }
        sc.close();
    }
}
