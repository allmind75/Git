package member;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Member {

	private Scanner scan = new Scanner(System.in);
	private boolean run = true;;
	private DAO dao;
	private DTOBean dto;
	private boolean isLogin;
	
	public static void main(String[] args) {

		Member member = new Member();
		member.dao = new DAO();
		
		member.menu();
	}

	public void menu() {
		int menu;

		while (run) {

			System.out.println("[�޴� : 1.ȸ������ | 2.�α��� | 3. �α׾ƿ� | 4.�������� | 5.Ż�� | 6.����]");
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
					dao.reg(dto);
					break;
				case 2:
					memeberLogin();
					isLogin = dao.login(dto);
					break;
				case 3:
					memberLogout();
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
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
		if(isLogin) {
			System.out.println("[�α׾ƿ�]");
			isLogin = false;
		} else {
			System.out.println("[�α������� �ʾҽ��ϴ�]");
		}
	}
}
