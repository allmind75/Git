package practice2;

import java.util.InputMismatchException;
import java.util.Scanner;

import practice2.Database;
import practice2.Main;
import practice2.Staff;

public class Main {

	public Staff[] staffs = new Staff[] { 
			new Staff(1, "유재석", 31, "영업부", "부장", "대전광역시 중구 선화동"),
			new Staff(2, "박명수", 32, "영업부", "과장", "대전광역시 중구 은행동"), 
			new Staff(3, "정준하", 33, "영업부", "대리", "대전광역시 동구") };

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
			System.out.println("[1.사원 목록 출력\t 2.사원검색(번호)\t 3.사원검색(이름)\t 4.종료]");
			System.out.print("메뉴 번호 입력> ");

			try {
				input = scan.nextInt();
				scan.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("[숫자만 입력해 주세요]");
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

				System.out.print("사원번호 입력> ");
				number = scan.nextInt();
				scan.nextLine();

				result = m.searchStaffNumber(number);
				if (result != null) {
					result.print();
					System.out.println("[DB]");
					db.searchNumber(number);
				} else {
					System.out.println("검색된 사원이 없음");
				}
				break;
			case 3:
				String name = null;
				Staff result1 = null;

				System.out.print("사원이름 입력> ");
				name = scan.nextLine();
				result1 = m.searchStaffName(name);
				if (result1 != null) {
					result1.print();
					System.out.println("[DB]");
					db.searchName(name);
				} else {
					System.out.println("검색된 사원이 없음");
				}
				break;
			case 4:
				run = false;
				System.out.println("[프로그램 종료]");
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