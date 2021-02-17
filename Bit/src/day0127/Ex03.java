package day0127;

import javax.swing.plaf.synth.SynthScrollBarUI;

/*
어느 학생의 기말고사 시험점수 (5과목)
int sum=0;
float average = 0f;
int[] jumsu = {100,55,90,60,78};

1. 총과목의 수
2. 과목의 합
3. 과목의 평균
단 2,3  문제는 하나의  for  으로 해결하세요
*/
public class Ex03 {
	public static void main(String[] args) {
		int sum=0;
		float average = 0f;
		int[] jumsu = {100,55,90,60,78};
		
		//1. 총 과목의 수
		int total = jumsu.length;
		
//		//2. 총 과목의 합
//		for(int i=0; i<jumsu.length; i++) {
//			sum += jumsu[i];
//		}
//		
//		//3. 과목의 평균
//	    average = (float) sum/jumsu.length;
//	    
		// 강사님 코드
		for(int i = 0; i < jumsu.length; i++) {
		    sum += jumsu[i];
		    if( i == jumsu.length-1) {
		        average = sum / (float)jumsu.length;
		    }
		}
		
		System.out.println(average);
		System.out.printf("총 과목수: [%d], 총점: [%d], 평균: [%f]", jumsu.length, sum, average);
	}
}
