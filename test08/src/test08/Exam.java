package test08;

import java.util.Scanner;

public class Exam {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		//gs25();
		//satisfactionSearch();
		//compareString();
		
		
		sc.close();
	}

	public static void gs25() {
		/*
		 * 문제 
		 * 우유 1200 , 미성년자(19 미만) 100 할인 / 콜라 1500, 미성년자 0 할인 / 생수 800, 미성년자 200 할인
		 * 
		 * 입력> 우유 콜라 생수 구입 수량 각각 입력 고객의 나이 입력 할인행사를 고려
		 * 출력> 고객의 총 지불 비용을 출력
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
		 * 문제
		 * 상품에 대한 만족도를 조사하고 있다.
		 * 만족도는 1~5로 입력
		 * 5-매우만족, 4-만족, 3-보통, 2-불만족, 1-매우불만족
		 * 사용자로 부터 만족도 등급을 입력을 받고
		 * 등급에 해당하는 만족도를 출력하시오.
		 * (단, 5,4,3,2,1, 이외의 값이 입력되면 -> '잘못입력하였습니다.' 출력
		 */
		
		int satisfaction;
		
		System.out.println("----상품에 대한 만족도 조사----\n");
		System.out.print("만족도 등급을 입력하세요(1 ~ 5)> ");
		satisfaction = sc.nextInt();
		
		System.out.print("상품 만족도 : ");
		
		if ( satisfaction == 5) {
			
			System.out.println("매우만족");
		
		} else if ( satisfaction == 4) {
			
			System.out.println("만족");
			
		} else if ( satisfaction == 3 ) {
			
			System.out.println("보통");
			
		} else if ( satisfaction == 2 ) {

			System.out.println("불만족");
			
		} else if ( satisfaction == 1 ) {
			
			System.out.println("매우불만족");
			
		} else {
			
			System.out.println("잘못입력하였습니다.");
		
		}
		
		System.out.println("\n-----프로그램 종료-----");
	}

	public static void compareString() {
		
		/*
		 * 문제
		 * 다음주 날시 출력
		 * 입력> 요일 입력(월 ~ 금)
		 * 출력> 날씨
		 */
		
		String day;
		
		System.out.println("---요일 입력(ex: 월요일)----\n");
		System.out.print("입력> ");
		day = sc.nextLine();
		
		if( day.equals("월요일")) {
			
			System.out.println("날씨 - 맑음, 바람 - 남동풍");
			
		} else if( day.equals("화요일")) {
			
			System.out.println("날씨 - 맑음, 바람 - 북서풍");
			
		} else if( day.equals("수요일")) {
			
			System.out.println("날씨 - 흐림, 바람 - 없음");
			
		} else if( day.equals("목요일")) {
			
			System.out.println("날씨 - 흐림, 바람 - 남서풍");
			
		} else if( day.equals("금요일")) {
			
			System.out.println("날씨 - 맑음, 바람 - 없음");
			
		} else if( day.equals("토요일")) {
			
			System.out.println("날씨 - 맑음, 바람 - 없음");
			
		} else if( day.equals("일요일")) {
			
			System.out.println("날씨 - 비, 바람 - 없음");
			
		} else {
			System.out.println("잘못입력하였습니다.");
		}
		
		System.out.println("\n----프로그램 종료----");
	}

	public static void triangle() {
		
	}
}
