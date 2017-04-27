package vMachine;

import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Drink[] drink = new Drink[] { new Drink(1, "콜라", 1000), new Drink(2, "사이다", 1500), new Drink(3, "초코에몽", 1200),
				new Drink(4, "딸기에몽", 1200) };

		VMachine vMachine = new VMachine(drink);

		boolean run = true;

		while (run) {

			int menu;

			System.out.print("제품선택] ");
			vMachine.printDrink();

			menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				menuChoice(vMachine, menu);
				break;
			case 2:
				menuChoice(vMachine, menu);
				break;
			case 3:
				menuChoice(vMachine, menu);
				break;
			case 4:
				menuChoice(vMachine, menu);
				break;
			case 5:
				run = false;
				System.out.println("[프로그램 종료]");
				break;
			default:
				System.out.println("[선택한 제품이 없습니다.]");
			}

		}

		sc.close();

	}

	public static void menuChoice(VMachine vMachine, int menu) {

		int money;
		int change;

		vMachine.printChoice(menu);
		money = sc.nextInt();
		sc.nextLine();

		change = vMachine.getChange(menu, money);

		vMachine.printChange(menu, change);
	}
}
