package algorithm;

import java.util.Scanner;

public class Grade {

	/*
	 * 9498번
	 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 
	 * 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 
	 * 프로그램을 작성하시오.
	 * 
	 * 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 
	 * 100보다 작거나 같은 자연수이다.
	 * 
	 * 100
	 * 
	 * A
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int grade;
		Scanner sc = new Scanner(System.in);
		
		grade = sc.nextInt();
		
		if(grade >= 90) {
			System.out.println("A");

		} else if(grade >= 80) {
			System.out.println("B");

		} else if(grade >= 70) {
			System.out.println("C");

		} else if(grade >= 60) {
			System.out.println("D");

		} else {
			System.out.println("F");
		}
		
		sc.close();
	}

}
