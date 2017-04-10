package test10;

import java.util.Scanner;

public class ArrayTest {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] array1 = new int[]{6,5,4,3,2,1}; //배열 초기화
		// int[] array2 = {1,2,3,4,5}; //배열 초기화
		//
		// System.out.println(array1.length + " " + array2.length);

		// print01();
		//print02();
		//print03();
		print04();

	}

	public static void print01() {
		/*
		 * 문제 아래와 같은 데이터를 배열에 저장하고
		 * 
		 * 90.5 67.55 55.5 90 80
		 * 
		 * 출력하는 프로그램을 작성
		 */
		double[] array = new double[5];

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextDouble();
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void print02() {
		/*
		 * 문제 아래와 같은 데이터가 주어졌을 때 데이터를 저장하는 
		 * 배열을 선언하고 초기화하시오. 35 40 55 -20 -30 78
		 * 200 98
		 * 
		 * 그리고 아래의 문제를 해결하는 프로그램 작성
		 *  a. 배열 데이터 전체 출력 
		 *  b. 배열 데이터 중에서 음수만 출력
		 *  c. 배열 데이터의 절대값을 출력하시오.
		 *  d. 배열 데이터의 합 출력
		 */

		int array[] = new int[] { 35, 40, 55, -20, -30, 78, 200, 98 };
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		for(int n: array) {
			if(n < 0) {
				System.out.print(n + " ");
			}
		}
		System.out.println();
		for(int n: array) {
		
			if( n < 0) {
				System.out.print(-n + " ");
			} else {
				System.out.print(n + " ");
			}
		}
		System.out.println();
		for(int n: array) {
			
			sum += n;
		}
		System.out.println("배열 데이터의 합 : " + sum);
	
		System.out.println(" ");
	}
	
	public static void print03() {
		/*
		 * 문제
		 * 학교에서 영어 시험 점수가 아래와 같다
		 * 영어 시험 점수의 평균을 구해서 출력
		 * 번호		 이름	평균
		 * 	1		강호동	88.5
		 * 	2		유재석	85
		 * 	3		신동엽	77.65
		 * 	4		김연아	70
		 * 	5		송강호	90
		 * 	6		전지현	66
		 * 	7		김하늘	90
		 * 	8		송윤아	65
		 */
		
		double score[] = new double[]{88.5, 85, 77.65, 70, 90, 66, 90, 65};
		double sum = 0;
		double avg;	
		String name[] = new String[]{"강호동", "유재석", "신동엽", "김연아",
				"송강호", "전지현", "김하늘", "송윤아"};
		
		//영어 점수 목록 출력
		for(int i=0 ; i<name.length ; i++) {
			System.out.println((i+1) + "." + name[i] + " " + score[i]);
		}
		
		for(double n: score) {
			sum += n;
		}
		avg = sum / score.length;
		System.out.println("영어 시험 점수 평균 : " + avg + "점");

	}
	
	public static void print04() {
		/*
		 * 문제
		 * 태양계는 아래와 같은 행성들로 구성되어 있다.
		 * "태양", "수성", "금성", "지구", "화성", "목성", 
		 * "토성", "천왕성", "해왕성"
		 * a. 위의 행성 목록을 배열에 저장하고 출력
		 * b. 지구의 배열 인덱스 출력
		 * c. 토성의 배열 인덱스를 구하고, 토성과 지구사이에 있는 행성들을 출력
		 * 단, 순서는 역순으로
		 * 
		 */
		String[] solarSystem = new String[]{"태양", "수성", "금성", "지구", 
				"화성", "목성", "토성", "천왕성", "해왕성"};
		int index = 0;
		int saturnIndex = 0;
		
		for(int i=0 ; i<solarSystem.length ; i++) {
			System.out.print(solarSystem[i] + " ");
			
			if(solarSystem[i].equals("지구")) {
				index = i;
			}
			
			if(solarSystem[i].equals("토성")) {
				saturnIndex = i;
			}
		}
		System.out.println();
		System.out.println("지구의 배열 인덱스 : " + index); 
		
		System.out.print("토성과 지구사이에 있는 행성 : ");
		for(int i=saturnIndex ; i>=index ; i--) {
			System.out.print(solarSystem[i] + " ");
		}
	}
	
	public static void print05() {
		
	}
}
