package dbTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DbTestMain {

	private CCustomers customers;
	private Database db;
	private Scanner scan = new Scanner(System.in);
	private boolean run = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DbTestMain m = new DbTestMain();

		m.db = new Database();

		m.menu();

		m.scan.close();
	}

	public void menu() {
		int menuNum = -1;

		while (run) {
			System.out.println("[1.��ü������, 2.���߰�, 3.������, 4.���˻�, 5.����]");
			System.out.print("�Է�> ");
			try {
				menuNum = scan.nextInt();
				scan.nextLine();
			} catch (InputMismatchException e) {
				e.getMessage();
				scan = new Scanner(System.in);
				continue;
			}

			switch (menuNum) {
			case 1:
				db.print();
				break;
			case 2:
				customersInfoInsert();
				break;
			case 3:
				customersInfoDelete();
				break;
			case 4:
				customersSearch();
				break;
			case 5:
				db.closeConnection();
				System.out.println("[���α׷� ����]");
				run = false;
				break;
			}
		}
	}

	public void customersInfoInsert() {

		String[] strArray = new String[5];
		String input;
		System.out.println("[���̵�, ��й�ȣ, �̸�, ��ȭ��ȣ, �̸��� �Է�]");
		input = scan.nextLine();
		strArray = input.split(" ");

		db.insert(strArray);
	}

	public void customersInfoDelete() {
		String name;
		System.out.println("[������ ���̸� �Է�]");
		System.out.print("�Է� > ");
		name = scan.nextLine();

		db.delete(name);
	}

	public void customersSearch() {
		String name;
		System.out.println("[�� �̸� �Է�]");
		System.out.print("�Է� > ");
		name = scan.nextLine();

		db.searchName(name);
	}

}
