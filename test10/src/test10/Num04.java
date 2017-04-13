package test10;

import java.util.Scanner;

public class Num04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[문제. 4]");

		String[] name = new String[] { "김연아", "유재석", "송강호", " 강호동", "설경구" };
		int[] num = new int[] { 1, 2, 3, 2, 3 };
		boolean run = true;

		while (run) {

			int input;

			System.out.println("메뉴 1.전체 연예인  2.스포츠 스타  3.개그맨  4.영화배우  5.끝내기");
			input = sc.nextInt();
			sc.nextLine();
			switch (input) {
			case 1:
				System.out.print("1. 전체 연예인 : ");
				for (String s : name) {
					System.out.print(s + " ");
				}
				System.out.println();
				break;
			case 2:
				System.out.print("2. 스포츠 스타 : ");
				for (int i = 0; i < num.length; i++) {
					if (num[i] == 1) {
						System.out.print(name[i] + " ");
					}
				}
				System.out.println();
				break;
			case 3:
				System.out.print("3. 개그맨 : ");
				for (int i = 0; i < num.length; i++) {
					if (num[i] == 2) {
						System.out.print(name[i] + " ");
					}
				}
				System.out.println();
				break;
			case 4:
				System.out.print("4. 영화배우 : ");
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
