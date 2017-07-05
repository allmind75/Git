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

			//System.out.println("[�޴� : 1.ȸ������ | 2.�α��� | 3. �α׾ƿ� | 4.�������� | 5.Ż�� | 6.��й�ȣ ���� | 7.ȸ������ | 8.����]");
			System.out.println("[�޴� : 1.ȸ������ | 2.�α��� | 3. �α׾ƿ� | 4.�������� | 5.Ż�� | 6.����]");
			System.out.print("�޴�����> ");

			try {
				menu = scan.nextInt();
				scan.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("[������ �Է� " + e.getMessage() + "]");
				scan = new Scanner(System.in);
				continue;
			}

			try {
				switch (menu) {
				case 1:
					if (session.getAttribute("UserID") == null) {
						memberReg();
						if (dao.reg(dto)) {
							System.out.println("[ȸ�����ԿϷ�]");
						} else {
							;
							System.out.println("[ȸ�����Խ���]");
						}
					} else {
						System.out.println("[�α��� �����Դϴ�]");
					}
					break;
				case 2:

					if (session.getAttribute("UserID") == null) {
						memeberLogin();

						if (dao.login(dto)) {
							session.setAttribute("UserID", dto.getId());

							dao.updateLoginCnt(dto.getId());
							System.out.println("[�α��μ��� - ID : " + session.getAttribute("UserID") + "]");
						} else {
							System.out.println("[�α��ν���]");
						}
					} else {
						System.out.println("[�α��� �����Դϴ�]");
					}
					break;
				case 3:
					if (session.getAttribute("UserID") != null) {
						memberLogout();
					} else {
						System.out.println("[�α������� ����]");
					}
					break;
				case 4:
					if (session.getAttribute("UserID") != null) {
						// �α����� ����� ���� ���
						String id = session.getAttribute("UserID");
						DTO dtoInfo = dao.getInfo(id);

						if (dtoInfo != null) {
							System.out.println("[��й�ȣ : " + dtoInfo.getPw() + "]");
							System.out.println("[��    �� : " + dtoInfo.getName() + "]");

							// ��������
							memberUpdate();
							if (dao.updateInfo(dto)) {
								System.out.println("[ȸ������ ���� �Ϸ�]");
							} else {
								System.out.println("[ȸ������ ���� ����]");
							}

						} else {
							System.out.println("[ȸ������ �������� ����]");
						}

					} else {
						System.out.println("[�α������� ����]]");
					}
					break;
				case 5:
					if (session.getAttribute("UserID") != null) {
						memberDelete();
						if (dao.delete(dto)) {
							System.out.println("[Ż��Ϸ� - " + dto.getId() + "]");
						} else {
							System.out.println("[Ż�� ����]");
						}
					} else {
						System.out.println("[�α������� ����]]");
					}
					break;
//				case 6:
//					if (session.getAttribute("UserID") != null) {
//						String pw;
//						DTO dto = new DTO();
//
//						System.out.println("[���� ��й�ȣ �Է�]");
//						System.out.print("�Է�> ");
//						pw = scan.nextLine();
//
//						dto.setId(session.getAttribute("UserID"));
//						dto.setPw(pw);
//
//						if (dao.selectPW(dto)) {
//							System.out.println("[��й�ȣ����]");
//							System.out.println("[������ ��й�ȣ �Է�]");
//
//							pw = scan.nextLine();
//							dto.setPw(pw);
//
//							if (dao.updateChgPW(dto)) {
//								System.out.println("[���ο� ��й�ȣ ���� �Ϸ�]");
//							} else {
//								System.out.println("[��й�ȣ ���� ����]");
//							}
//						} else {
//							System.out.println("[��й�ȣ Ʋ��]");
//						}
//					} else {
//						System.out.println("[�α������� ����]");
//					}
//					break;
//				case 7:
//					dao.print();
//					break;
				case 6:
					run = false;
					System.out.println("[���α׷� ����]");
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

		System.out.println("[ȸ������ - ���̵�, ��й�ȣ, �̸�]");
		System.out.print("���̵�> ");
		id = scan.nextLine();
		System.out.print("��й�ȣ> ");
		pw = scan.nextLine();
		System.out.print("�̸�> ");
		name = scan.nextLine();

		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
	}

	public void memeberLogin() {
		String id, pw;
		dto = new DTO();

		System.out.println("[�α��� - ���̵�, ��й�ȣ]");
		System.out.print("���̵�> ");
		id = scan.nextLine();
		System.out.print("��й�ȣ> ");
		pw = scan.nextLine();

		dto.setId(id);
		dto.setPw(pw);

	}

	public void memberLogout() {
		session.removeAttribute("UserID");
		System.out.println("[�α׾ƿ�]");
	}

	public void memberDelete() {
		dto = new DTO();
		dto.setId(session.getAttribute("UserID"));
		session.removeAttribute("UserID");
	}

	public void memberUpdate() {
		String name;
		System.out.println("[�������� - �̸�]");
		System.out.print("������ �̸�> ");
		name = scan.nextLine();

		dto.setName(name);
		dto.setId(session.getAttribute("UserID"));
	}

}
