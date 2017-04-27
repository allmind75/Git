package vMachine;

import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Drink[] drink = new Drink[] { new Drink(1, "�ݶ�", 1000), new Drink(2, "���̴�", 1500), new Drink(3, "���ڿ���", 1200),
				new Drink(4, "���⿡��", 1200) };

		VMachine vMachine = new VMachine(drink);

		boolean run = true;

		while (run) {

			int menu;

			System.out.print("��ǰ����] ");
			vMachine.printDrink();	//��ǰ���� �޴� ���

			menu = sc.nextInt();	//��ǰ��ȣ �Է�

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
				System.out.println("[���α׷� ����]");
				break;
			default:
				System.out.println("[������ ��ǰ�� �����ϴ�.]");
			}

		}

		sc.close();

	}

	public static void menuChoice(VMachine vMachine, int menu) {

		int money;
		int change;

		vMachine.printChoice(menu);	//������ ��ǰ ���
		
		money = sc.nextInt();	//�ݾ� ����

		change = vMachine.getChange(menu, money);	//�ܵ���ȯ

		vMachine.printChange(menu, change);		//�ܵ� �Ǵ� �ݾ׺��� ���
	}
}
