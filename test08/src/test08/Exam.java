package test08;

import java.util.Scanner;

public class Exam {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// gs25();
		// satisfactionSearch();
		// compareString();
		// compare();
		// rightTriangle();
		// bmi();
		// max();
		// absoluteValue();
		sort();
		sc.close();
	}

	public static void gs25() {
		/*
		 * 문제 우유 1200 , 미성년자(19 미만) 100 할인 / 콜라 1500, 미성년자 0 할인 / 생수 800, 미성년자
		 * 200 할인
		 * 
		 * 입력> 우유 콜라 생수 구입 수량 각각 입력 고객의 나이 입력 할인행사를 고려 출력> 고객의 총 지불 비용을 출력
		 */

		int age;
		int milk, coke, water;
		int total;

		int milkDiscount = 100;
		int cokeDiscount = 0;
		int waterDiscount = 200;

		int milkPrice;
		int cokePrice;
		int waterPrice;

		System.out.println("-----------------GS 25-----------------");
		System.out.println("우유(1200), 콜라(1500), 생수(800)");
		System.out.println("미성년자(19세미만) - 우유 100 할인, 생수 200할인");
		System.out.println("구입할 물품의 수량을 입력하세요");
		System.out.print("우유> ");
		milk = sc.nextInt();

		System.out.print("콜라> ");
		coke = sc.nextInt();

		System.out.print("생수> ");
		water = sc.nextInt();

		System.out.print("고객나이입력> ");
		age = sc.nextInt();

		if (age < 19) {

			milkPrice = milk * (1200 - milkDiscount);
			cokePrice = coke * (1500 - cokeDiscount);
			waterPrice = water * (800 - waterDiscount);

		} else {

			milkPrice = milk * 1200;
			cokePrice = coke * 1500;
			waterPrice = water * 800;

		}

		total = milkPrice + cokePrice + waterPrice;

		System.out.println("\n우유 : " + milkPrice);
		System.out.println("콜라 : " + cokePrice);
		System.out.println("생수 : " + waterPrice);
		System.out.println("총 지불비용> " + total + "원");
		System.out.println("-------------프로그램 종료-------------");
	}

	public static void satisfactionSearch() {
		/*
		 * 문제 상품에 대한 만족도를 조사하고 있다. 만족도는 1~5로 입력 5-매우만족, 4-만족, 3-보통, 2-불만족,
		 * 1-매우불만족 사용자로 부터 만족도 등급을 입력을 받고 등급에 해당하는 만족도를 출력하시오. (단, 5,4,3,2,1,
		 * 이외의 값이 입력되면 -> '잘못입력하였습니다.' 출력
		 */

		int satisfaction;

		System.out.println("----상품에 대한 만족도 조사----\n");
		System.out.print("만족도 등급을 입력하세요(1 ~ 5)> ");
		satisfaction = sc.nextInt();

		System.out.print("상품 만족도 : ");

		if (satisfaction == 5) {

			System.out.println("매우만족");

		} else if (satisfaction == 4) {

			System.out.println("만족");

		} else if (satisfaction == 3) {

			System.out.println("보통");

		} else if (satisfaction == 2) {

			System.out.println("불만족");

		} else if (satisfaction == 1) {

			System.out.println("매우불만족");

		} else {

			System.out.println("잘못입력하였습니다.");

		}

		System.out.println("\n-----프로그램 종료-----");
	}

	public static void compareString() {

		/*
		 * 문제 다음주 날시 출력 입력> 요일 입력(월 ~ 금) 출력> 날씨
		 */

		String day;

		System.out.println("---요일 입력(ex: 월요일)----\n");
		System.out.print("입력> ");
		day = sc.nextLine();

		if (day.equals("월요일")) {

			System.out.println("날씨 - 맑음, 바람 - 남동풍");

		} else if (day.equals("화요일")) {

			System.out.println("날씨 - 맑음, 바람 - 북서풍");

		} else if (day.equals("수요일")) {

			System.out.println("날씨 - 흐림, 바람 - 없음");

		} else if (day.equals("목요일")) {

			System.out.println("날씨 - 흐림, 바람 - 남서풍");

		} else if (day.equals("금요일")) {

			System.out.println("날씨 - 맑음, 바람 - 없음");

		} else if (day.equals("토요일")) {

			System.out.println("날씨 - 맑음, 바람 - 없음");

		} else if (day.equals("일요일")) {

			System.out.println("날씨 - 비, 바람 - 없음");

		} else {
			System.out.println("잘못입력하였습니다.");
		}

		System.out.println("\n----프로그램 종료----");
	}

	public static void compare() {

		/*
		 * 문제 사용자로부터 국적, 성별을 입력을 받고 입력받은 국적과 성별로 아래와 같이 판단하는 프로그램작성
		 * 
		 * [입력] 국적 : 한국(대한민국), 일본 성별 : 여성, 남성
		 * 
		 * [출력] 1. 한국 여성 2. 한국 남성 3. 일본 여성 4. 일본 남성
		 * 
		 * 입력은 문자열로 입력 받음,
		 * 
		 * 
		 */

		String country;
		String gender;
		String korea = "한국";
		String korea2 = "대한민국";
		String japen = "일본";
		String man = "남성";
		String woman = "여성";

		System.out.println("----국적,성별 입력----\n");
		System.out.print("국적(한국, 대한민국, 일본)> ");
		country = sc.nextLine();

		System.out.print("성별(남성, 여성)> ");
		gender = sc.nextLine();

		//&& 연산자가 || 연산자보다 우선순위가 높음
		if ((country.equals(korea) || country.equals(korea2)) && gender.equals(woman)) {

			System.out.println("1. 한국 여성");
		} else if ((country.equals(korea) || country.equals(korea2)) && gender.equals(man)) {

			System.out.println("2. 한국 남성");
		} else if (country.equals(japen) && gender.equals(woman)) {

			System.out.println("3. 일본 여성");
		} else if (country.equals(japen) && gender.equals(man)) {

			System.out.println("4. 일본 남성");
		} else {

			System.out.println("판단할 수 없음.");
		}

		System.out.println("\n----프로그램 종료----");
	}

	public static void rightTriangle() {

		/*
		 * 문제 직각삼각형판단 [입력] 3개의 각을 입력
		 * 
		 * [출력] 직각삼각형 or 노노
		 */

		int A, B, C;
		int sum;

		System.out.println("----직각삼각형 세 각을 입력----");
		System.out.print("A> ");
		A = sc.nextInt();

		System.out.print("B> ");
		B = sc.nextInt();

		System.out.print("C> ");
		C = sc.nextInt();

		sum = A + B + C;
		
		if (sum == 180) {
			if (A == 90 || B == 90 || C == 90) {
		
				System.out.println("직각삼각형입니다.");
			} else {

				System.out.println("직각삼각형이 아닙니다.");
			}
		} else {
			System.out.println("삼각형이 아닙니다.");
		}

	}

	public static void bmi() {
		/*
		 * [문제] 키보드에서 체중과 신장을 입력을 받아
		 * BMI를 계산하고, BMI 등급을 출력하는 프로그램 작성
		 * 
		 * BMI = 체중(kg) / (키(m)*키(m))
		 * 
		 * BMI 등급
		 * 	18.5 미만 : 저체중
		 * 	18.5 ~ 23 : 정상체중
		 * 	23 ~ 25   : 과체중
		 * 	25 ~ 30   : 경도비만
		 * 	30 ~ 35   : 중등도비만
		 * 	35이상    : 고도비만
		 */
		
		double weight;
		double height;
		double bmi;
		
		System.out.println("---BMI 계산----");
		System.out.print("몸무게 입력(kg)> ");
		weight = sc.nextDouble();
		
		System.out.print("키 입력(cm)> ");
		height = sc.nextDouble() / 100;
		
		bmi = weight / (height*height);
		
		if( 0 <= bmi && bmi < 18.5) {
			System.out.println("저체중");
		} else if( 18.5 <= bmi && bmi < 23) {
			
			System.out.println("정상체중");

		} else if( 23 <= bmi && bmi < 25) {
			
			System.out.println("과체중");

		} else if( 25 <= bmi && bmi < 30) {
			
			System.out.println("경도비만");

		} else if( 30 <= bmi && bmi < 35) {
			
			System.out.println("중등도비만");

		} else {
			System.out.println("고도비만");

		}
		
		System.out.println("----프로그램 종료");
	}
	
	public static void max() {
		/*
		 * [문제] 세개의 숫자(정수 또는 실수)를 입력 받고
		 * 입력받은 값중에서 최대값을 출력하는 프로그램 작성
		 */
		
		double a, b, c;
		double max = 0.0;
		
		System.out.println("----최대값 출력, 세개의 숫자(정수 또는 실수) 입력----");
		System.out.print("입력> ");
		a = sc.nextDouble();
		
		System.out.print("입력> ");
		b = sc.nextDouble();
		
		System.out.print("입력> ");
		c = sc.nextDouble();
		
		if( a > b ) {
			
			if( a > c ) max = a;
			
			else max = c;
			
		} else {
			
			if( b > c) max = b;
			
			else max = c;
			
		}
		
		System.out.println("출력> " + a + ", " + b + ", " + c + "의 최대값 : " + max);
	}

	public static void absoluteValue() {
		/*
		 * [문제] 숫자(정수 또는 실수)를 입력을 받고, 입력받은 숫자의
		 * 절대값을 출력하는 프로그램의 작성
		 */
		
		double num;
		
		System.out.println("----절대값 출력----");
		System.out.print("입력(정수 또는 실수)> ");
		num = sc.nextDouble();
		
		if(num < 0) {
			System.out.println("절대값 : " + num * -1);
		} else {
			System.out.println("절대값 : " + num);
		}
	}
	
	public static void sort() {
		/*
		 * [문제]
		 * 세개의 숫자(정수 또는 실수)를 입력 받고,
		 * 입력된 값을 크기 순서로 출력하시오.
		 * 
		 * 출력 : 가장 큰값, 중간값, 가장 작은값
		 */
		
		 double n1, n2, n3;
		 
		 System.out.println("----숫자 정렬(3개의 숫자 입력)----");
		 System.out.print("입력(정수 또는 실수)> ");
		 n1 = sc.nextDouble();
		 
		 System.out.print("입력(정수 또는 실수)> ");
		 n2 = sc.nextDouble();
		 
		 System.out.print("입력(정수 또는 실수)> ");
		 n3 = sc.nextDouble();
		 
		 System.out.print("출력> ");
		 
		  
	}
}
