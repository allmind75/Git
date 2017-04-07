package algorithm;

import java.util.Scanner;

public class Compare {
	/*
	 * 10817번
	 * 
	 * 세 정수 A, B, C가 주어진다. 이 때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.
	 * 
	 * 첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
	 * 
	 * 두 번째로 큰 정수를 출력한다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A, B, C;
		Scanner sc = new Scanner(System.in);

		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();

		if (A > B && A > C) {
			if(B > C) {
				System.out.println(B);
			} else {
				System.out.println(C);
			}
		} else if (B > A && B > C) {
			if(A > C) {
				System.out.println(A);
			} else {
				System.out.println(C);
			}
		} else {
			if(A > B) {
				System.out.println(A);
			} else {
				System.out.println(B);
			}
		}

		sc.close();

	}

}
