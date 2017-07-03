package member;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Member {

	private Scanner scan = new Scanner(System.in);
	private boolean run = true;;
	private DAO dao;
	private DTO dto;
	private Session session;

	public static void main(String[] args) {

		Member member = new Member();

		member.dao = new DAO();
		member.session = new Session();

		member.menu();
	}

	public void menu() {
		int menu;

		while (run) {

			System.out.println("[메뉴 : 1.회원가입 | 2.로그인 | 3. 로그아웃 | 4.정보수정 | 5.탈퇴 | 6.비밀번호 변경 | 7.회원보기 | 8.종료]");
			System.out.print("메뉴선택> ");

			try {
				menu = scan.nextInt();
				scan.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("[정수만 입력 " + e.getMessage() + "]");
				scan = new Scanner(System.in);
				continue;
			}

			try {
				switch (menu) {
				case 1:
					if (session.getAttribute("UserID") == null) {
						memberReg();
						if (dao.reg(dto)) {
							System.out.println("[회원가입완료]");
						} else {
							;
							System.out.println("[회원가입실패]");
						}
					} else {
						System.out.println("[로그인 상태입니다]");
					}
					break;
				case 2:

					if (session.getAttribute("UserID") == null) {
						memeberLogin();

						if (dao.login(dto)) {
							session.setAttribute("UserID", dto.getId());

							dao.updateLoginCnt(dto.getId());
							System.out.println("[로그인성공 - ID : " + session.getAttribute("UserID") + "]");
						} else {
							System.out.println("[로그인실패]");
						}
					} else {
						System.out.println("[로그인 상태입니다]");
					}
					break;
				case 3:
					if (session.getAttribute("UserID") != null) {
						memberLogout();
					} else {
						System.out.println("[로그인하지 않음]");
					}
					break;
				case 4:
					if (session.getAttribute("UserID") != null) {
						// 로그인한 사용자 정보 출력
						String id = session.getAttribute("UserID");
						DTO dtoInfo = dao.getInfo(id);

						if (dtoInfo != null) {
							System.out.println("[비밀번호 : " + dtoInfo.getPw() + "]");
							System.out.println("[이    름 : " + dtoInfo.getName() + "]");

							// 정보수정
							memberUpdate();
							if (dao.updateMemberInfo(dto)) {
								System.out.println("[회원정보 변경 완료]");
							} else {
								System.out.println("[회원정보 변경 실패]");
							}

						} else {
							System.out.println("[회원정보 가져오기 실패]");
						}

					} else {
						System.out.println("[로그인하지 않음]]");
					}
					break;
				case 5:
					if (session.getAttribute("UserID") != null) {
						memberDelete();
						if (dao.delete(dto)) {
							System.out.println("[탈퇴완료 - " + dto.getId() + "]");
						} else {
							System.out.println("[탈퇴 실패]");
						}
					} else {
						System.out.println("[로그인하지 않음]]");
					}
					break;
				case 6:
					if (session.getAttribute("UserID") != null) {
						String pw;
						DTO dto = new DTO();

						System.out.println("[기존 비밀번호 입력]");
						System.out.print("입력> ");
						pw = scan.nextLine();

						dto.setId(session.getAttribute("UserID"));
						dto.setPw(pw);

						if (dao.selectPW(dto)) {
							System.out.println("[비밀번호같음]");
							System.out.println("[변경할 비밀번호 입력]");

							pw = scan.nextLine();
							dto.setPw(pw);

							if (dao.updateChgPW(dto)) {
								System.out.println("[새로운 비밀번호 변경 완료]");
							} else {
								System.out.println("[비밀번호 변경 실패]");
							}
						} else {
							System.out.println("[비밀번호 틀림]");
						}
					} else {
						System.out.println("[로그인하지 않음]");
					}
					break;
				case 7:
					dao.print();
					break;
				case 8:
					run = false;
					System.out.println("[프로그램 종료]");
					break;
				}
			} catch (SQLException e1) {
				System.out.println("SQL Error : " + e1.getMessage());
			}

		}
	}

	public void memberReg() {
		String id, pw, name;
		dto = new DTO();

		System.out.println("[회원가입 - 아이디, 비밀번호, 이름]");
		System.out.print("아이디> ");
		id = scan.nextLine();
		System.out.print("비밀번호> ");
		pw = scan.nextLine();
		System.out.print("이름> ");
		name = scan.nextLine();

		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
	}

	public void memeberLogin() {
		String id, pw;
		dto = new DTO();

		System.out.println("[로그인 - 아이디, 비밀번호]");
		System.out.print("아이디> ");
		id = scan.nextLine();
		System.out.print("비밀번호> ");
		pw = scan.nextLine();

		dto.setId(id);
		dto.setPw(pw);

	}

	public void memberLogout() {
		session.removeAttribute("UserID");
		System.out.println("[로그아웃]");
	}

	public void memberDelete() {
		dto = new DTO();
		dto.setId(session.getAttribute("UserID"));
		session.removeAttribute("UserID");
	}

	public void memberUpdate() {
		String name;
		System.out.println("[정보수정 - 이름]");
		System.out.print("변경할 이름> ");
		name = scan.nextLine();

		dto.setName(name);
		dto.setId(session.getAttribute("UserID"));
	}

}
