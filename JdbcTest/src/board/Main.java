package board;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private Scanner sc = new Scanner(System.in);
	private boolean run = true;
	private BoardDAO dao = BoardDAO.getInstance();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();

		m.menu();

	}

	public void menu() {
		// ��� �۾��� ���� �˻�
		int menu;

		while (run) {
			System.out.println("[1.��� | 2.�۾��� | 3.���� | 4.�˻� | 5.����]]");
			System.out.print("�޴�����> ");
			try {
				menu = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("[������ �Է�]");
				sc = new Scanner(System.in);
				continue;
			}

			switch (menu) {
			case 1:
				listPrint();
				break;
			case 2:
				write();
				break;
			case 3:
				contentPrint();
				break;
			case 4:

				break;
			case 5:
				run = false;
				System.out.println("[���α׷� ����]");
				break;
			default:
				System.out.println("[�޴��� ���� ��ȣ ����]");
			}
		}
	}

	public void listPrint() {
		System.out.println("[��ü ���]");
		ArrayList<BoardDTO> list = dao.listPrint();

		if (list != null) {
			System.out.printf("%5s | %30s | %5s | %20s\n", "num", "title", "count", "reg_date");
			for (BoardDTO dto : list) {
				System.out.printf("%5d | ", dto.getNum());
				System.out.printf("%30s | ", dto.getTitle());
				System.out.printf("%5d | ", dto.getCount());
				System.out.printf("%20s\n", dto.getDatetime());

			}
		} else {
			System.out.println("[�� ���� ����]");
		}
	}

	public void write() {
		String title;
		String content;
		BoardDTO dto = new BoardDTO();

		System.out.println("[�۾��� - ����, ����]");
		System.out.print("�����Է�> ");
		title = sc.nextLine();
		System.out.print("�����Է�> ");
		content = sc.nextLine();

		dto.setTitle(title);
		dto.setContent(content);

		if (dao.insert(dto)) {
			System.out.println("[�۾��� ���� �Ϸ�]");
		} else {
			System.out.println("[�۾��� ���� ����]");
		}
	}

	public void contentPrint() {
		int num;
		BoardDTO dto;

		System.out.println("[�� ��ȣ �Է�]");
		System.out.print("�Է�> ");
		try {
			num = sc.nextInt();
			sc.nextLine();
			dto = dao.contentPrint(num);

			if (dto != null) {
				System.out.println("< " + dto.getTitle() + " >");
				System.out.println("- " + dto.getContent());
			} else {
				System.out.println("[�Է��� ��ȣ �Խù� ����]");
			}
		} catch (InputMismatchException e) {
			System.out.println("[������ �Է�]");
			sc = new Scanner(System.in);
		}
	}

}
