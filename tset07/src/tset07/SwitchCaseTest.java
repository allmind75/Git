package tset07;

import java.util.Scanner;

public class SwitchCaseTest {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		restaurant();
		restaurant2();
		
		
		sc.close();
	}

	public static void restaurant() {
		/*
		 * [문제] 아래와 같이 식당에 메뉴와 가격이 있따
		 * 
		 * 1. 짜장면 4000원 2. 짬뽕 4000원 3. 볶음밥 5000원
		 * 
		 * 메뉴번호를 입력받고 입력 받은 메뉴의 가격을 출력하는 프로그램을 작성하시오.
		 *
		 */

		int menuNum;

		System.out.println("------------메뉴 입력------------");
		System.out.println("[메뉴] 1.짜장면 | 2.짬뽕 | 3.볶음밥");
		System.out.print("입력> ");
		menuNum = sc.nextInt();

		switch (menuNum) {
		case 1:
			System.out.println("짜장면 : 4000원");
			break;
		case 2:
			System.out.println("짬뽕 : 4000원");
			break;
		case 3:
			System.out.println("볶음밥 : 5000원");
			break;
		default:
			System.out.println("잘못입력");
		}

		System.out.println("------------프로그램 종료------------");
	}

	public static void restaurant2() {
		/*
		 * [문제] 아래와 같이 식당에 메뉴와 가격이 있따
		 * 
		 * 1. 짜장면 4000원 2. 짬뽕 4000원 3. 볶음밥 5000원
		 * 
		 * 메뉴번호를 입력받고 입력 받은 메뉴의 가격을 출력하는 프로그램을 작성하시오.
		 *
		 */

		int menuNum;

		System.out.println("------------메뉴 입력------------");
		System.out.println("[메뉴] 1.짜장면 | 2.짬뽕 | 3.볶음밥");
		System.out.print("입력> ");
		menuNum = sc.nextInt();

		if (menuNum == 1) {
			
			System.out.println("짜장면 : 4000원");
			
		} else if (menuNum == 2) {
			
			System.out.println("짬뽕 : 4000원");
			
		} else if (menuNum == 3) {
			
			System.out.println("볶음밥 : 5000원");
			
		} else {

			System.out.println("잘못입력");
		}

		System.out.println("------------프로그램 종료------------");
	}
}
