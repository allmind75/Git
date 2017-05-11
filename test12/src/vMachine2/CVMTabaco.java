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

		System.out.println("�ź� Ȯ���� ���ؼ� ���̸� �Է��� �ּ���.");
		System.out.print("���� �Է�> ");

		try {
			age = sc.nextInt();

			if (age <= 19) {

				System.out.println("[�Ǹ��ߴ�]");
				return;

			} else {

				print();
				choice();
			}
		} catch (InputMismatchException e) {
			System.out.println("[�߸��� ���� �Է��ϼ̽��ϴ�.]");
		}
	}

	public void warning() {

		System.out.println("[��� : �̼����ڿ��Դ� �Ǹŵ��� �ʽ��ϴ�!!!]");
	}

	public void print() {

		System.out.println("[�Ǹ� �޴�]");
		for (int i = 0; i < cStuff.length; i++) {
			System.out.println(i + 1 + cStuff[i].getName() + "(" + cStuff[i].getPrice() + ")");
		}
		System.out.println();
	}

	public void choice() {

		String choice;
		Scanner sc = new Scanner(System.in);

		System.out.print("��ǰ�� �����ϼ��� > ");
		choice = sc.nextLine();

		if (choice.equals("1") || choice.equals("����")) {

			System.out.println("������ �����ϼ̽��ϴ�.");

		} else if (choice.equals("2") || choice.equals("������")) {

			System.out.println("�����θ� �����ϼ̽��ϴ�.");

		} else if (choice.equals("3") || choice.equals("��")) {

			System.out.println("�𽺸� �����ϼ̽��ϴ�.");

		} else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		
		System.out.println();

	}
}
