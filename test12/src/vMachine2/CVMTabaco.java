package vMachine2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CVMTabaco implements IMenu {

	private CStuff[] cStuff;

	public CVMTabaco(CStuff[] cStuff) {
		this.cStuff = cStuff;
	}

	@Override
	public void Menu() {

		int age;
		Scanner sc = new Scanner(System.in);

		warning();

		System.out.println("신분 확인을 위해서 나이를 입력해 주세요.");
		System.out.print("나이 입력> ");

		try {
			age = sc.nextInt();

			if (age <= 19) {

				System.out.println("[판매중단]");
				return;

			} else {

				print();
				choice();
			}
		} catch (InputMismatchException e) {
			System.out.println("[잘못된 값을 입력하셨습니다.]");
		}
	}

	public void warning() {

		System.out.println("[경고 : 미성년자에게는 판매되지 않습니다!!!]");
	}

	public void print() {

		System.out.println("[판매 메뉴]");
		for (int i = 0; i < cStuff.length; i++) {
			System.out.println(i + 1 + cStuff[i].getName() + "(" + cStuff[i].getPrice() + ")");
		}
		System.out.println();
	}

	public void choice() {

		String choice;
		Scanner sc = new Scanner(System.in);

		System.out.print("제품을 선택하세요 > ");
		choice = sc.nextLine();

		if (choice.equals("1") || choice.equals("더원")) {

			System.out.println("더원을 구매하셨습니다.");

		} else if (choice.equals("2") || choice.equals("말보로")) {

			System.out.println("말보로를 구매하셨습니다.");

		} else if (choice.equals("3") || choice.equals("디스")) {

			System.out.println("디스를 구매하셨습니다.");

		} else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		System.out.println();

	}
}
