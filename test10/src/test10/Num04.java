package test10;

import java.util.Scanner;

public class Num04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[����. 4]");

		String[] name = new String[] { "�迬��", "���缮", "�۰�ȣ", " ��ȣ��", "���汸" };
		int[] num = new int[] { 1, 2, 3, 2, 3 };
		boolean run = true;

		while (run) {

			int input;

			System.out.println("�޴� 1.��ü ������  2.������ ��Ÿ  3.���׸�  4.��ȭ���  5.������");
			input = sc.nextInt();
			sc.nextLine();
			switch (input) {
			case 1:
				System.out.print("1. ��ü ������ : ");
				for (String s : name) {
					System.out.print(s + " ");
				}
				System.out.println();
				break;
			case 2:
				System.out.print("2. ������ ��Ÿ : ");
				for (int i = 0; i < num.length; i++) {
					if (num[i] == 1) {
						System.out.print(name[i] + " ");
					}
				}
				System.out.println();
				break;
			case 3:
				System.out.print("3. ���׸� : ");
				for (int i = 0; i < num.length; i++) {
					if (num[i] == 2) {
						System.out.print(name[i] + " ");
					}
				}
				System.out.println();
				break;
			case 4:
				System.out.print("4. ��ȭ��� : ");
				for (int i = 0; i < num.length; i++) {
					if (num[i] == 3) {
						System.out.print(name[i] + " ");
					}
				}
				System.out.println();
				break;
			case 5:
				run = false;
				break;
			}
			System.out.println();

		}
		
		sc.close();
	}
}
