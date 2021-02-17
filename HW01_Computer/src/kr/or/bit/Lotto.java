package kr.or.bit;

import java.util.Scanner;
import java.util.Random;

/*
1. 1~45까지의 난수를 발생시켜 6개의 배열에 담으세요
(int)(Math.random()*45 + 1)
lotto[0] = 44 , lotto[1] = 1 .... lotto[5] = 33
2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안되요 (중복값 검증 :별찍기 비슷)
3. 배열에 있는 6개의 값은 낮은 순으로 정렬 시키세요 (정렬 : 자리바꿈)
4. 위 결과를 담고 있는 배열을 출력하세요 (화면 출력)
*/
//기능 >> method >> 함수 하나당 기능 하나
//public >> 참조변수
//private >> 내부 사용 (공통)
//실번호 추출해 주세요
//중복값 나오면 안되요
//낮은 순으로 정렬해 주세요
//화면에 출력해 주세요
//메뉴 기능을 만들어 주세요
class LottoStart {
    private int[] numbers; // 초기화
    private Scanner scanner;
    private Random r;

    public LottoStart() {
        numbers = new int[6];
        scanner = new Scanner(System.in);
        r = new Random();
    }

    public void number() {
        while (true) {
            System.out.println("***************************");
            System.out.println("**1.당첨 예상 번호 추출하기");
            System.out.println("**2. 프로그램 종료 ^^!^^! ");
            System.out.println("***************************");
            System.out.print("원하는 메뉴 번호를 입력하세요: ");
            int userChoice = scanner.nextInt();

            while(userChoice > 2) {
                System.out.println("메뉴 번호를 잘못 입력하셨습니다.");
                System.out.print("원하는 메뉴 번호를 입력하세요: ");
                userChoice = scanner.nextInt();
            }
            
            if (userChoice == 1) {
               random();
               asc();
               print();
               avg(); 
               // 동기화함수 ( 이렇게 작성하는 것은 위험할 수도 있다 )
               // 나중에는 비동기적 함수도 나타난다. (꼭 순서대로 작업이 완료되는 것이 아님)
               // 함수를 일렬로 나열하기 보다는 조건으로빼거나 제어문안에 집어 넣어서
               // 어떤 상황을 명확하게 알려주는게 좋다 (return)
               // 어떤 조건이 충족되면 다음으로 넘어가고~ 이런식으로 작성해두는 것이 좋다.
               
               //###########시간꼭지켜서 프로그램짜기#############
            } else if (userChoice == 2) {
                System.out.println("사용해주셔서 감사합니다");
                break;
            } 
        }
    }

   
    public void random() {// 중복값 제거
        for(int i=0; i< this.numbers.length; i++){
            this.numbers[i] = r.nextInt(45)+1;
        }
        for(int i=0; i<this.numbers.length-1; i++){
            for(int j=i+1; j<this.numbers.length;j++){
                if(this.numbers[i] == this.numbers[j]){  
                    numbers[j]=r.nextInt(45)+1;
                    j--;
                }
            }
        }
    }
    
     public void asc() { // 오름차순 정렬
         for(int i = 0; i <this.numbers.length -1; i++) {
             if(this.numbers[i] > this.numbers[i+1]) {
                 int temp = this.numbers[i];
                 this.numbers[i] = this.numbers[i+1];
                 this.numbers[i+1] = temp;
                 i = -1;
             } 
         }
     }
     
     public void print() {
         System.out.println("[ 선택한 Lotto 번호 ]");
         for(int i = 0; i < this.numbers.length; i++) {
             System.out.printf("[%d] ",this.numbers[i]);
         }
         System.out.println();
     }
     public void avg() {
         int sum = 0;
         for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
         }
         System.out.println("평균: "+sum/numbers.length);
      }
     
    
} // class Lotto end


public class Lotto {
    public static void main(String[] args) {
        LottoStart lotto = new LottoStart();
        lotto.number();
    }
}