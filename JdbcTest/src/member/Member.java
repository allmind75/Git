package member;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Member {

	private Scanner scan = new Scanner(System.in);
	private boolean run = true;;
	private DAO dao;
	private DTOBean dto;
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

			System.out.println("[�޴� : 1.ȸ������ | 2.�α��� | 3. �α׾ƿ� | 4.�������� | 5.Ż�� | 6.ȸ������ | 7.����]");
			System.out.print("�޴�����> ");

			try {
				menu = scan.nextInt();
				scan.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("������ �Է� " + e.getMessage());
				scan = new Scanner(System.in);
				continue;
			}

			try {
				switch (menu) {
				case 1:
					memberReg();
					if (dao.reg(dto)) {
						System.out.println("[ȸ�����ԿϷ�]");
					} else {
						;
						System.out.println("[ȸ�����Խ���]");
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
					memberLogout();
					break;
				case 4:
					if (session.getAttribute("UserID") != null) {
						memberUpdate();
						if (dao.update(dto)) {
							System.out.println("[ȸ������ ���� �Ϸ�]");
						} else {
							System.out.println("[ȸ������ ���� ����]");
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
				case 6:
					dao.print();
					break;
				case 7:
					run = false;
					System.out.println("[���α׷� ����]");
					break;
				}
			} catch (ClassNotFoundException e) {
				System.out.println("Connector Error : " + e.getMessage());
			} catch (SQLException e1) {
				System.out.println("SQL Error : " + e1.getMessage());
			}

		}
	}

	public void memberReg() {
		String id, pw, name;
		dto = new DTOBean();

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
		dto = new DTOBean();

		System.out.println("[�α��� - ���̵�, ��й�ȣ]");
		System.out.print("���̵�> ");
		id = scan.nextLine();
		System.out.print("��й�ȣ> ");
		pw = scan.nextLine();

		dto.setId(id);
		dto.setPw(pw);

	}

	public void memberLogout() {
		if (session.getAttribute("UserID") != null) {
			session.removeAttribute("UserID");
			System.out.println("[�α׾ƿ�]");
		} else {
			System.out.println("[�α������� ����]");
		}
	}

	public void memberDelete() {
		dto = new DTOBean();
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
