package vMachine2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CStuff[] drink = new CStuff[]{
			new CStuff("콜라", 1000),
			new CStuff("사이다", 1500),
			new CStuff("초코에몽", 1200),
			new CStuff("딸기에몽", 1200)};
			
		CStuff[] tabaco = new CStuff[]{
				new CStuff("더원", 4500),
				new CStuff("말보로", 1500),
				new CStuff("디스", 1200)};
		
		IMenu[] menu = new IMenu[]{new CVMDrink(drink), new CVMTabaco(tabaco)};
		
		Scanner sc = new Scanner(System.in);
		int choice;
		boolean run = true;
		
		while(run) {
			
			System.out.println("[메뉴 : 1.음료구매하기, 2.담배구매하기, 3.종료]");
			System.out.print("메뉴선택(숫자입력) > ");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				menu[0].Menu();
				break;
			case 2:
				menu[1].Menu();
				break;
			case 3:
				System.out.println("[판매종료]");
				run = false;
				break;		
			}
		}
		
		sc.close();
		
	}

}
