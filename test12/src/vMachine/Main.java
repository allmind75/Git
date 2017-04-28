package vMachine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Drink[] drink = new Drink[] { new Drink(1, "콜라", 1000), new Drink(2, "사이다", 1500), new Drink(3, "초코에몽", 1200),
				new Drink(4, "딸기에몽", 1200) };

		VMachine vMachine = new VMachine(drink);

		boolean run = true;
		int menu = 0;
		int money;
		int change;
		
		while (run) {
			
			
			System.out.print("제품선택] ");
			vMachine.printDrink(); // 제품선택 메뉴 출력
			
			System.out.print("제품선택> ");
			
			try {
				menu = sc.nextInt(); // 제품번호 입력
				sc.nextLine();
				
				switch (menu) {
				case 1:
				case 2:
				case 3:
				case 4:
					vMachine.printChoice(menu); // 선택한 제품 출력

					money = sc.nextInt(); // 금액 투입
					sc.nextLine();
					
					change = vMachine.getChange(menu, money); // 잔돈반환

					vMachine.printChange(menu, change); // 잔돈 또는 금액부족 출력
					break;
				case 5:
					run = false;
					System.out.println("[프로그램 종료]");
					break;
				default:
					System.out.println("[선택한 제품이 없습니다.]");
				}
			} catch (InputMismatchException e) {
				sc = new Scanner(System.in);
				System.out.println("잘못입력하셨습니다.\n");
				//e.printStackTrace();
			}

		}

		
		sc.close();
	}
}
