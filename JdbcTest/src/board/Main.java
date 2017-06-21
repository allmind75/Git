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
		// 목록 글쓰기 내용 검색
		int menu;

		while (run) {
			System.out.println("[1.목록 | 2.글쓰기 | 3.내용 | 4.검색 | 5.종료]]");
			System.out.print("메뉴선택> ");
			try {
				menu = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("[정수만 입력]");
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
				System.out.println("[프로그램 종료]");
				break;
			default:
				System.out.println("[메뉴에 없는 번호 선택]");
			}
		}
	}

	public void listPrint() {
		System.out.println("[전체 목록]");
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
			System.out.println("[글 존재 안함]");
		}
	}

	public void write() {
		String title;
		String content;
		BoardDTO dto = new BoardDTO();

		System.out.println("[글쓰기 - 제목, 내용]");
		System.out.print("제목입력> ");
		title = sc.nextLine();
		System.out.print("내용입력> ");
		content = sc.nextLine();

		dto.setTitle(title);
		dto.setContent(content);

		if (dao.insert(dto)) {
			System.out.println("[글쓰기 저장 완료]");
		} else {
			System.out.println("[글쓰기 저장 실패]");
		}
	}

	public void contentPrint() {
		int num;
		BoardDTO dto;

		System.out.println("[글 번호 입력]");
		System.out.print("입력> ");
		try {
			num = sc.nextInt();
			sc.nextLine();
			dto = dao.contentPrint(num);

			if (dto != null) {
				System.out.println("< " + dto.getTitle() + " >");
				System.out.println("- " + dto.getContent());
			} else {
				System.out.println("[입력한 번호 게시물 없음]");
			}
		} catch (InputMismatchException e) {
			System.out.println("[정수만 입력]");
			sc = new Scanner(System.in);
		}
	}

}
