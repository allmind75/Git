package test03;

import java.util.Scanner;

public class test {

	/*
	 * [문제1]
	 * 국어(80), 수학(75), 영어(85)
	 * 1. 총점을 구해서 출력하시오
	 * 2. 평균 을 구해서 출력하시오 
	 */
	
	/*
	 * [문제2]
	 * 10cm -> inch로 변환
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문제1
		int korean;
		int math;
		int english;
		int sum;
		double avg;
		
		korean = 85;
		math = 75;
		english = 85;
		
		sum = korean + math + english;
		avg = (double) sum / (double)3 + 0.005;
		
		System.out.println("[문제] 국어 : " + korean + " / " + "수학 : " + math + " / " + "영어 : " + english);
		System.out.println("1. 총점을 구해서 출력하시오. - 총점 = " + sum + "점");
		System.out.println("2. 평균을 구해서 출력하시오. - 평균 = " + avg + "점");
		System.out.printf("2. 평균을 구해서 출력하시오. - 평균 = %5.4f점\n\n", avg);
		
		//문제2
		double cm = 10;
		double inch;
		final double cmToInch = 0.393701;
		
		inch = cm * cmToInch;
		
		System.out.println(cm + "cm는 " + inch + "in임.");
		
		//큰 정수 표현시 java7 부터 _ 지원
		//java의 정수 리터럴은 int, 부동 소수점은 double
		//long 타입 표현시 L, l
		//float 타입 표현시 F, f
		long n = 1999_9999_9999_9999L; //명시적 데이터 값(literal)
		if(n < 1000_0000_0000_0000L) {
			System.out.println(n);
		} else {
			System.out.println("\n범위초과 : " + n);
		}
	}

}
