package tset07;

import java.util.Scanner;

public class TypeBoolean {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
//		int x = 100;
//		int y = 100;
//		
//		boolean b1, b2, b3, b4, b5, b6;
//		
//		b1 = x == y;
//		b2 = x != y;
//		b3 = x > y;
//		b4 = x >= y;
//		b5 = x < y;
//		b6 = x <= y;
//		
//		System.out.println("x = " + x + " y = " + y);
//		
//		
//		if( x == y ) {
//			System.out.println("x == y ? " + b1);
//		}
		
		//amPm();
		rectangle();
		
		
		sc.close();
	}
	
	public static void amPm() {
		
		/*
		 * 문제
		 * 현재시간을 입력(24시간 단위, 0~23)을 받고
		 * 오전인지 오후인지 출력하시오
		 * 오전(0~11), 오후(12~23)
		 */
		
		int time;
		
		time = sc.nextInt();
		
		if(time < 12) {
			System.out.println("오전 " + time + "시");
		}
		if(time >= 12){
			System.out.println("오후 " + time + "시");
		}
	}

	public static void rectangle() {
		
		/*
		 * 문제
		 * 사각형의 가로, 세로 길이 입력 받아
		 * 정사각형인지, 직사각형인지 구분해서 출력
		 */
		
		double width, height;
		
		System.out.println("---사각형의 가로, 세로 길이 입력---");
		System.out.print("가로길이 입력>");
		width = sc.nextDouble();
		
		System.out.print("세로길이 입력>");
		height = sc.nextDouble();
		
		if(width == height) {
			System.out.println("정사각형 입니다.");
		}
		
		if(width != height) {
			System.out.println("직사각형 입니다.");
		}
		
		System.out.println("----프로그램 종료----");
	}
}
