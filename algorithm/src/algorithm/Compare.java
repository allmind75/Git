package algorithm;

import java.util.Scanner;

public class Compare {
	/*
	 * 10817��
	 * 
	 * �� ���� A, B, C�� �־�����. �� ��, �� ��°�� ū ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * ù° �ٿ� �� ���� A, B, C�� �������� ���еǾ� �־�����. (1 �� A, B, C �� 100)
	 * 
	 * �� ��°�� ū ������ ����Ѵ�.
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
