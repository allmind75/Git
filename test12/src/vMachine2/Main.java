package vMachine2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CStuff[] drink = new CStuff[]{
			new CStuff("�ݶ�", 1000),
			new CStuff("���̴�", 1500),
			new CStuff("���ڿ���", 1200),
			new CStuff("���⿡��", 1200)};
			
		CStuff[] tabaco = new CStuff[]{
				new CStuff("����", 4500),
				new CStuff("������", 1500),
				new CStuff("��", 1200)};
		
		IMenu[] menu = new IMenu[]{new CVMDrink(drink), new CVMTabaco(tabaco)};
		
		Scanner sc = new Scanner(System.in);
		int choice;
		boolean run = true;
		
		while(run) {
			
			System.out.println("[�޴� : 1.���ᱸ���ϱ�, 2.��豸���ϱ�, 3.����]");
			System.out.print("�޴�����(�����Է�) > ");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				menu[0].Menu();
				break;
			case 2:
				menu[1].Menu();
				break;
			case 3:
				System.out.println("[�Ǹ�����]");
				run = false;
				break;		
			}
		}
		
		sc.close();
		
	}

}
