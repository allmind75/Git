package tset07;

import java.util.Scanner;

public class SwitchCaseTest {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		restaurant();
		restaurant2();
		
		
		sc.close();
	}

	public static void restaurant() {
		/*
		 * [����] �Ʒ��� ���� �Ĵ翡 �޴��� ������ �ֵ�
		 * 
		 * 1. ¥��� 4000�� 2. «�� 4000�� 3. ������ 5000��
		 * 
		 * �޴���ȣ�� �Է¹ް� �Է� ���� �޴��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *
		 */

		int menuNum;

		System.out.println("------------�޴� �Է�------------");
		System.out.println("[�޴�] 1.¥��� | 2.«�� | 3.������");
		System.out.print("�Է�> ");
		menuNum = sc.nextInt();

		switch (menuNum) {
		case 1:
			System.out.println("¥��� : 4000��");
			break;
		case 2:
			System.out.println("«�� : 4000��");
			break;
		case 3:
			System.out.println("������ : 5000��");
			break;
		default:
			System.out.println("�߸��Է�");
		}

		System.out.println("------------���α׷� ����------------");
	}

	public static void restaurant2() {
		/*
		 * [����] �Ʒ��� ���� �Ĵ翡 �޴��� ������ �ֵ�
		 * 
		 * 1. ¥��� 4000�� 2. «�� 4000�� 3. ������ 5000��
		 * 
		 * �޴���ȣ�� �Է¹ް� �Է� ���� �޴��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *
		 */

		int menuNum;

		System.out.println("------------�޴� �Է�------------");
		System.out.println("[�޴�] 1.¥��� | 2.«�� | 3.������");
		System.out.print("�Է�> ");
		menuNum = sc.nextInt();

		if (menuNum == 1) {
			
			System.out.println("¥��� : 4000��");
			
		} else if (menuNum == 2) {
			
			System.out.println("«�� : 4000��");
			
		} else if (menuNum == 3) {
			
			System.out.println("������ : 5000��");
			
		} else {

			System.out.println("�߸��Է�");
		}

		System.out.println("------------���α׷� ����------------");
	}
}
