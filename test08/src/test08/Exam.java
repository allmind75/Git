package test08;

import java.util.Scanner;

public class Exam {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		//gs25();
		//satisfactionSearch();
		//compareString();
		
		
		sc.close();
	}

	public static void gs25() {
		/*
		 * ���� 
		 * ���� 1200 , �̼�����(19 �̸�) 100 ���� / �ݶ� 1500, �̼����� 0 ���� / ���� 800, �̼����� 200 ����
		 * 
		 * �Է�> ���� �ݶ� ���� ���� ���� ���� �Է� ���� ���� �Է� ������縦 ���
		 * ���> ���� �� ���� ����� ���
		 */

		int age;
		int milk, coke, water;
		int total;

		int milkDiscount = 100;
		int cokeDiscount = 0;
		int waterDiscount = 200;

		int milkPrice;
		int cokePrice;
		int waterPrice;

		System.out.println("-----------------GS 25-----------------");
		System.out.println("����(1200), �ݶ�(1500), ����(800)");
		System.out.println("�̼�����(19���̸�) - ���� 100 ����, ���� 200����");
		System.out.println("������ ��ǰ�� ������ �Է��ϼ���");
		System.out.print("����> ");
		milk = sc.nextInt();

		System.out.print("�ݶ�> ");
		coke = sc.nextInt();

		System.out.print("����> ");
		water = sc.nextInt();

		System.out.print("�������Է�> ");
		age = sc.nextInt();

		if (age < 19) {

			milkPrice = milk * (1200 - milkDiscount);
			cokePrice = coke * (1500 - cokeDiscount);
			waterPrice = water * (800 - waterDiscount);

		} else {

			milkPrice = milk * 1200;
			cokePrice = coke * 1500;
			waterPrice = water * 800;

		}
		
		total = milkPrice + cokePrice + waterPrice;
		
		System.out.println("\n���� : " + milkPrice);
		System.out.println("�ݶ� : " + cokePrice);
		System.out.println("���� : " + waterPrice);
		System.out.println("�� ���Һ��> " + total + "��");
		System.out.println("-------------���α׷� ����-------------");
	}

	public static void satisfactionSearch() {
		/*
		 * ����
		 * ��ǰ�� ���� �������� �����ϰ� �ִ�.
		 * �������� 1~5�� �Է�
		 * 5-�ſ츸��, 4-����, 3-����, 2-�Ҹ���, 1-�ſ�Ҹ���
		 * ����ڷ� ���� ������ ����� �Է��� �ް�
		 * ��޿� �ش��ϴ� �������� ����Ͻÿ�.
		 * (��, 5,4,3,2,1, �̿��� ���� �ԷµǸ� -> '�߸��Է��Ͽ����ϴ�.' ���
		 */
		
		int satisfaction;
		
		System.out.println("----��ǰ�� ���� ������ ����----\n");
		System.out.print("������ ����� �Է��ϼ���(1 ~ 5)> ");
		satisfaction = sc.nextInt();
		
		System.out.print("��ǰ ������ : ");
		
		if ( satisfaction == 5) {
			
			System.out.println("�ſ츸��");
		
		} else if ( satisfaction == 4) {
			
			System.out.println("����");
			
		} else if ( satisfaction == 3 ) {
			
			System.out.println("����");
			
		} else if ( satisfaction == 2 ) {

			System.out.println("�Ҹ���");
			
		} else if ( satisfaction == 1 ) {
			
			System.out.println("�ſ�Ҹ���");
			
		} else {
			
			System.out.println("�߸��Է��Ͽ����ϴ�.");
		
		}
		
		System.out.println("\n-----���α׷� ����-----");
	}

	public static void compareString() {
		
		/*
		 * ����
		 * ������ ���� ���
		 * �Է�> ���� �Է�(�� ~ ��)
		 * ���> ����
		 */
		
		String day;
		
		System.out.println("---���� �Է�(ex: ������)----\n");
		System.out.print("�Է�> ");
		day = sc.nextLine();
		
		if( day.equals("������")) {
			
			System.out.println("���� - ����, �ٶ� - ����ǳ");
			
		} else if( day.equals("ȭ����")) {
			
			System.out.println("���� - ����, �ٶ� - �ϼ�ǳ");
			
		} else if( day.equals("������")) {
			
			System.out.println("���� - �帲, �ٶ� - ����");
			
		} else if( day.equals("�����")) {
			
			System.out.println("���� - �帲, �ٶ� - ����ǳ");
			
		} else if( day.equals("�ݿ���")) {
			
			System.out.println("���� - ����, �ٶ� - ����");
			
		} else if( day.equals("�����")) {
			
			System.out.println("���� - ����, �ٶ� - ����");
			
		} else if( day.equals("�Ͽ���")) {
			
			System.out.println("���� - ��, �ٶ� - ����");
			
		} else {
			System.out.println("�߸��Է��Ͽ����ϴ�.");
		}
		
		System.out.println("\n----���α׷� ����----");
	}

	public static void triangle() {
		
	}
}
