package test11;

import java.util.Scanner;

public class Num04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[���� 4] �ﰢ���� �� ������ �Է� �ް�, ���ﰢ�������� �Ǵ��ϴ� �Լ� �ۼ�");

		int a, b, c;
		Scanner sc = new Scanner(System.in);

		System.out.print("�� ���� �Է�> ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (checkInput(a, b, c)) {
			print(checkTri(a, b, c));
		} else {
			System.out.println("�ùٸ� �ﰢ�� ���� �Է��� �ƴ�!");
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
			System.out.println("���ﰢ�� �Դϴ�.");
		} else {
			System.out.println("���ﰢ�� �ƴ�!");
		}
	}

}
