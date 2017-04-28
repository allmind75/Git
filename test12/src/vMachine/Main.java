package vMachine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Drink[] drink = new Drink[] { new Drink(1, "�ݶ�", 1000), new Drink(2, "���̴�", 1500), new Drink(3, "���ڿ���", 1200),
				new Drink(4, "���⿡��", 1200) };

		VMachine vMachine = new VMachine(drink);

		boolean run = true;
		int menu = 0;
		int money;
		int change;
		
		while (run) {
			
			
			System.out.print("��ǰ����] ");
			vMachine.printDrink(); // ��ǰ���� �޴� ���
			
			System.out.print("��ǰ����> ");
			
			try {
				menu = sc.nextInt(); // ��ǰ��ȣ �Է�
				sc.nextLine();
				
				switch (menu) {
				case 1:
				case 2:
				case 3:
				case 4:
					vMachine.printChoice(menu); // ������ ��ǰ ���

					money = sc.nextInt(); // �ݾ� ����
					sc.nextLine();
					
					change = vMachine.getChange(menu, money); // �ܵ���ȯ

					vMachine.printChange(menu, change); // �ܵ� �Ǵ� �ݾ׺��� ���
					break;
				case 5:
					run = false;
					System.out.println("[���α׷� ����]");
					break;
				default:
					System.out.println("[������ ��ǰ�� �����ϴ�.]");
				}
			} catch (InputMismatchException e) {
				sc = new Scanner(System.in);
				System.out.println("�߸��Է��ϼ̽��ϴ�.\n");
				//e.printStackTrace();
			}

		}

		
		sc.close();
	}
}
