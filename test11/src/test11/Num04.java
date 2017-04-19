package test11;

import java.util.Scanner;

public class Num04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[문제 4] 삼각형의 세 내각을 입력 받고, 정삼각형인지를 판단하는 함수 작성");

		int a, b, c;
		Scanner sc = new Scanner(System.in);

		System.out.print("세 내각 입력> ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (checkInput(a, b, c)) {
			print(checkTri(a, b, c));
		} else {
			System.out.println("올바른 삼각형 내각 입력이 아님!");
		}

		sc.close();
	}

	static boolean checkInput(int a, int b, int c) {

		if ((a > 0 && b > 0 && c > 0) && a+b+c == 180) {
			return true;
		} else {
			return false;
		}
	}

	static boolean checkTri(int a, int b, int c) {

		if (a == b && b == c) {
			return true;
		} else {
			return false;
		}
	}

	static void print(boolean b) {
		if (b) {
			System.out.println("정삼각형 입니다.");
		} else {
			System.out.println("정삼각형 아님!");
		}
	}

}
