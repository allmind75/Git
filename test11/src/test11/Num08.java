package test11;

import java.util.Arrays;

public class Num08 {

	/*
	 * 아래의 데이터는 고등학교 국어 점수 이다.
	 * 아래의 점수를 배열에 저장하고 주어진 문제를 해결하는 프로그램 작
	 */
	public static void main(String[] args) {
		System.out.println("[문제 7] 점수가 저장된 배열을 전달 받고, 점수 평균을 출력하는 함수 작");
		
		int[] grade = new int[]{90, 98, 80, 85, 70, 75};
		double avg;
		
		avg = printArray(grade);
		
		System.out.println("국어점수 평균 : " +avg);

	}
	
	public static double printArray(int[] x) {
		
		double avg;
		int sum = 0;
		
		for(int n: x) {
			sum += n;
		}
		
		avg = (double) sum / x.length;
		return avg;
	}

}
