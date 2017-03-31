package test06;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//삼각형 넓이
		//triangleArea();
		
		//bmi 계산
		//bmiCalc();
		
		//초를 시, 분, 초로 바꾸기
		//timeCalc();
		
		//국어 수학 영어 점수 입력 후 총점과 평균 출력
		//gradeCalc();
		
		//편의점 상품가격, 콜라 : 1500, 우유 : 900, 생수 : 1200
		//1. 고객이 구매할 상품 수량을 입력받고 지불할 총금액 출력
		//2. 지불 금액을 만, 천, 백원 구분해서 출력
		gs25();
			
	}
	
	public static void triangleArea() {
		//삼각형 높이 밑변 입력, 삼각형 넓이 계산 후 출력
		double width;
		double height;
		double area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----삼각형 넓이 구하기 ----");
		
		System.out.print("삼각형 밑변 : ");
		width = sc.nextDouble();
		
		System.out.print("삼각형 높이 : ");
		height = sc.nextDouble();
		
		area = width * height / 2.0;
		
		System.out.println("삼각형 넓이 : " + area);
		System.out.println("----프로그램 종료----");

	}
	
	public static void bmiCalc() {
		//bmi를 계산해서 출력하는 프로그램 작성
		//입력 : 체중(kg), 키(m^2);
		//bmi = 체중(kg) / 키의 제곱(m^2)
		double weight;
		double height;
		double bmi;
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("----BMI 계산기(숫자만 입력)----");
		
		System.out.print("체중 입력(kg 단위로 입력) : ");
		weight = sc2.nextDouble();
		
		System.out.print("키 입력(m 단위로 입력) : ");
		height = sc2.nextDouble();
		
		bmi = weight / (height * height);
		
		System.out.println("BMI : " + bmi);
		System.out.println("----프로그램 종료----");
	}
	
	public static void timeCalc(){
		//초단위로 시간을 입력받고, 시, 분, 초로 출력
		int input;
		int hour;
		int min;
		int sec;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----시간 변환(초 -> 시 분 초)----");
		System.out.print("초를 입력 : ");
		
		input = sc.nextInt();
		
		hour = input / 3600;
		min = (input % 3600) / 60;
		sec = (input % 3600) % 60;
		
		System.out.println("결과 : " + hour + "시간 " + min + "분 " + sec + "초" );
		
		System.out.println("----프로그램 종료----");
	}
	
	public static void gradeCalc() {
		
		double korean;
		double math;
		double english;
		double sum;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----성적 계산----");
		System.out.print("국어 성적 입력 : ");
		korean = sc.nextDouble();
		
		System.out.print("수학 성적 입력 : ");
		math = sc.nextDouble();
		
		System.out.print("영어 성적 입력 : ");
		english = sc.nextDouble();
		
		sum = korean + math + english;
		avg = sum / 3.0;
		
		System.out.println("총점 : " + sum + "/ 평균 : " + avg);
		System.out.println("----프로그램 종료----");
	}
	
	public static void gs25() {
		int coke;
		int milk;
		int water;
		int total;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----GS25----");
		System.out.println("가격> " + "콜라(1500원)" + " 우유(900원)" + " 생수(1200원)");
		System.out.print("구매수량 입력> 콜라 : ");
		
		coke = sc.nextInt();
		
		System.out.print("구매수량 입력> 우유 : ");
		
		milk = sc.nextInt();
		
		System.out.print("구매수량 입력> 생수 : ");
		
		water = sc.nextInt();
		
		total = coke*1500 + milk*900 + water*1200;
		
		System.out.println("지불 금액 : " + total + "원");
		System.out.println("지불금액 : " + total/10000 +"만 " + (total%10000)/1000 +"천 " + ((total%10000)%1000)/100 +"백 원");
		System.out.println("----프로그램 종료----");
	}

}
