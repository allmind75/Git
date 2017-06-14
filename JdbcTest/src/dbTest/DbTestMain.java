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
			System.out.println("[1.전체고객보기, 2.고객추가, 3.고객삭제, 4.고객검색, 5.종료]");
			System.out.print("입력> ");
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
				System.out.println("[프로그램 종료]");
				run = false;
				break;
			}
		}
	}

	public void customersInfoInsert() {

		String[] strArray = new String[5];
		String input;
		System.out.println("[아이디, 비밀번호, 이름, 전화번호, 이메일 입력]");
		input = scan.nextLine();
		strArray = input.split(" ");

		db.insert(strArray);
	}

	public void customersInfoDelete() {
		String name;
		System.out.println("[삭제할 고객이름 입력]");
		System.out.print("입력 > ");
		name = scan.nextLine();

		db.delete(name);
	}

	public void customersSearch() {
		String name;
		System.out.println("[고객 이름 입력]");
		System.out.print("입력 > ");
		name = scan.nextLine();

		db.searchName(name);
	}

}
