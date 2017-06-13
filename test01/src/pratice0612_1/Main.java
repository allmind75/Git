package pratice0612_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public Staff[] staffs = new Staff[] { 
			new Staff(1, "���缮", 31, "������", "����", "���������� �߱� ��ȭ��"),
			new Staff(2, "�ڸ��", 32, "������", "����", "���������� �߱� ���ൿ"), 
			new Staff(3, "������", 33, "������", "�븮", "���������� ����") };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main m = new Main();
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		int input = 0;
		
		//Database
		Database db = new Database();
		
		
//		for(Staff s: m.staffs) {
//			db.insert(s);
//		}


		while (run) {
			System.out.println("[1.��� ��� ���\t 2.����˻�(��ȣ)\t 3.����˻�(�̸�)\t 4.����]");
			System.out.print("�޴� ��ȣ �Է�> ");

			try {
				input = scan.nextInt();
				scan.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("[���ڸ� �Է��� �ּ���]");
				scan = new Scanner(System.in);
				continue;
			}

			switch (input) {
			case 1:
				m.printStaff();
				break;
			case 2:
				int number;
				Staff result;

				System.out.print("�����ȣ �Է�> ");
				number = scan.nextInt();
				scan.nextLine();

				result = m.searchStaffNumber(number);
				if (result != null) {
					result.print();
					System.out.println("[DB]");
					db.searchNumber(number);
				} else {
					System.out.println("�˻��� ����� ����");
				}
				break;
			case 3:
				String name = null;
				Staff result1 = null;

				System.out.print("����̸� �Է�> ");
				name = scan.nextLine();
				result1 = m.searchStaffName(name);
				if (result1 != null) {
					result1.print();
					System.out.println("[DB]");
					db.searchName(name);
				} else {
					System.out.println("�˻��� ����� ����");
				}
				break;
			case 4:
				run = false;
				System.out.println("[���α׷� ����]");
				break;
			}

		}
		
		scan.close();

	}

	public void printStaff() {
		for (Staff s : staffs) {
			s.print();
		}
	}

	public Staff searchStaffNumber(int number) {

		Staff result = null;

		for (Staff s : staffs) {
			if (s.getNumber() == number) {
				result = s;
			}
		}

		return result;
	}

	public Staff searchStaffName(String name) {

		Staff result = null;

		for (Staff s : staffs) {
			if (s.getName().equals(name)) {
				result = s;
			}
		}

		return result;
	}

}
