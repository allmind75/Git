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
		// 목록 글쓰기 내용 검색
		int menu;

		while (run) {
			System.out.println("[1.목록 | 2.글쓰기 | 3.내용 | 4.검색 | 5.종료]");
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
				search();
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
			print(list, dao.boardCount("", 1));
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
		ReplyDTO replyDto = new ReplyDTO();
		String reply;
		ArrayList<ReplyDTO> list;

		System.out.println("[글 번호 입력]");
		System.out.print("입력> ");
		try {
			num = sc.nextInt();
			sc.nextLine();
			dto = dao.contentPrint(num);		//내용 가져오기

			if (dto != null) {
				System.out.println("< " + dto.getTitle() + " >");
				System.out.println("- " + dto.getContent());

				list = replyDao.printReply(dto.getNum());		//댓글출력
				if (list != null) {
					for (ReplyDTO d : list) {
						System.out.println(d.getContent());
					}
				} else {
					System.out.println("[댓글 없음]");
				}

				while (true) {
					System.out.println("[1. 댓글 | 2. 글삭제 | 3.홈]");
					num = sc.nextInt();
					sc.nextLine();

					if (num == 1) {

						System.out.print("댓글입력> ");
						reply = sc.nextLine();

						replyDto.setLink(dto.getNum());
						replyDto.setContent(reply);

						replyDao.insert(replyDto);

					} else if (num == 2) {
						if(dao.delete(dto.getNum())) {
							replyDao.delete(dto.getNum());		//글삭제시 관련 댓글 삭제
							System.out.println("[" + num + ". 글 삭제완료]");
							break;
						} else {
							System.out.println("[글 삭제 실패]");
						}
					} else if (num == 3) {
						break;
					} else {
						System.out.println("[메뉴에 없는 번호 선택]");
					}
				}

			} else {
				System.out.println("[입력한 번호 게시물 없음]");
			}
		} catch (InputMismatchException e) {
			System.out.println("[정수만 입력]");
			sc = new Scanner(System.in);
		}
	}

	public void search() {
		int num;
		String text;
		ArrayList<BoardDTO> boardList = new ArrayList<BoardDTO>();

		System.out.println("[1.제목검색 | 2.내용검색 | 3.제목 + 내용 검색]");
		System.out.print("입력> ");
		try {
			num = sc.nextInt();
			sc.nextLine();
			
			if (num == 1) {
				System.out.print("검색> ");
				text = sc.nextLine();
				boardList = dao.search(text, num);
				if (boardList != null) {
					print(boardList, dao.boardCount(text, num));
				} else {
					System.out.println("[검색 결과 없음]");
				}
			} else if (num == 2 || num == 3) {
				System.out.print("검색> ");
				text = sc.nextLine();
				boardList = dao.search(text, num);
				if (boardList != null) {
					printContent(boardList, dao.boardCount(text, num));
				} else {
					System.out.println("[검색 결과 없음]");
				}
			} else {
				System.out.println("[해당 메뉴 없음]");
			}
		} catch (InputMismatchException e) {
			sc = new Scanner(System.in);
			System.out.println("[정수만 입력]");
		}

	}

	public void print(ArrayList<BoardDTO> list, int boardCnt) {
		System.out.printf("%5s | %30s | %5s | %11s\n", "num", "title", "count", "reg_date");
		for (BoardDTO dto : list) {
			System.out.printf("%5d | ", dto.getNum());
			System.out.printf("%30s | ", dto.getTitle());
			System.out.printf("%5d | ", dto.getCount());
			System.out.printf("%11s\n", dto.getDatetime().substring(0,10));
		}
		System.out.println("[" + boardCnt + "개의 글이 검색]");
	}

	public void printContent(ArrayList<BoardDTO> list, int boardCnt) {
		System.out.printf("%5s | %30s | %5s | %11s | %s\n", "num", "title", "count", "reg_date", "content");
		for (BoardDTO dto : list) {
			System.out.printf("%5d | ", dto.getNum());
			System.out.printf("%30s | ", dto.getTitle());
			System.out.printf("%5d | ", dto.getCount());
			System.out.printf("%11s |", dto.getDatetime().substring(0,10));
			System.out.println(" " + dto.getContent());
		}
		System.out.println("[" + boardCnt + "개의 글이 검색]");
	}

}
