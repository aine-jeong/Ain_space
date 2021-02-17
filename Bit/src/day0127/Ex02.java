package day0127;
/*
int[] number = new int[10];
10개의 방의 값을 1~10까지 값으로 초기화 해라
*/

public class Ex02 {
	public static void main(String[] args) {
	
		int[] number = new int[10];
		
		for(int i = 0; i < number.length; i++) {
			number[i] = i+1;
		}
		
		
	}
}
