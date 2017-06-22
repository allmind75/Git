package board;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private Scanner sc = new Scanner(System.in);
	private boolean run = true;
	private BoardDAO dao = BoardDAO.getInstance();
	private ReplyDAO replyDao = ReplyDAO.getInstance();

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
				search();
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
			print(list);
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
		ReplyDTO replyDto = new ReplyDTO();
		String reply;
		ArrayList<ReplyDTO> list;

		System.out.println("[�� ��ȣ �Է�]");
		System.out.print("�Է�> ");
		try {
			num = sc.nextInt();
			sc.nextLine();
			dto = dao.contentPrint(num);

			if (dto != null) {
				System.out.println("< " + dto.getTitle() + " >");
				System.out.println("- " + dto.getContent());

				list = replyDao.printReply(dto.getNum());
				if (list != null) {
					for (ReplyDTO d : list) {
						System.out.println(d.getContent());
					}
				} else {
					System.out.println("[��� ����]");
				}

				while (true) {
					System.out.println("[1. ��� | 2. �ۻ��� | 3.Ȩ]");
					num = sc.nextInt();
					sc.nextLine();

					if (num == 1) {

						System.out.print("����Է�> ");
						reply = sc.nextLine();

						replyDto.setLink(dto.getNum());
						replyDto.setContent(reply);

						replyDao.insert(replyDto);

					} else if (num == 2) {
						if(dao.delete(dto.getNum())) {
							replyDao.delete(dto.getNum());
							System.out.println("[" + num + ". �� �����Ϸ�]");
							break;
						} else {
							System.out.println("[�� ���� ����]");
						}
					} else if (num == 3) {
						break;
					} else {
						System.out.println("[�޴��� ���� ��ȣ ����]");
					}
				}

			} else {
				System.out.println("[�Է��� ��ȣ �Խù� ����]");
			}
		} catch (InputMismatchException e) {
			System.out.println("[������ �Է�]");
			sc = new Scanner(System.in);
		}
	}

	public void search() {
		int num;
		String text;
		ArrayList<BoardDTO> boardList = new ArrayList<BoardDTO>();

		System.out.println("[1.����˻� | 2.����˻�]");
		System.out.print("�Է�> ");
		try {
			num = sc.nextInt();
			sc.nextLine();

			if (num == 1) {
				System.out.print("����˻�> ");
				text = sc.nextLine();

				boardList = dao.searchTitle(text);

				if (boardList != null) {
					print(boardList);
				} else {
					System.out.println("[�˻� ��� ����]");
				}

			} else if (num == 2) {
				System.out.print("����˻�> ");
				text = sc.nextLine();

				boardList = dao.searchContent(text);

				if (boardList != null) {
					printContent(boardList);
				} else {
					System.out.println("[�˻� ��� ����]");
				}
			} else {

			}
		} catch (InputMismatchException e) {
			sc = new Scanner(System.in);
			System.out.println("[������ �Է�]");
		}

	}

	public void print(ArrayList<BoardDTO> list) {
		System.out.printf("%5s | %30s | %5s | %11s\n", "num", "title", "count", "reg_date");
		for (BoardDTO dto : list) {
			System.out.printf("%5d | ", dto.getNum());
			System.out.printf("%30s | ", dto.getTitle());
			System.out.printf("%5d | ", dto.getCount());
			System.out.printf("%11s\n", dto.getDatetime().substring(0,10));

		}
	}

	public void printContent(ArrayList<BoardDTO> list) {
		System.out.printf("%5s | %30s | %5s | %11s | %s\n", "num", "title", "count", "reg_date", "content");
		for (BoardDTO dto : list) {
			System.out.printf("%5d | ", dto.getNum());
			System.out.printf("%30s | ", dto.getTitle());
			System.out.printf("%5d | ", dto.getCount());
			System.out.printf("%11s |", dto.getDatetime().substring(0,10));
			System.out.println(" " + dto.getContent());

		}

	}

}
