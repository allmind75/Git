package test08;

import java.util.Scanner;

public class Exam {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// gs25();
		// satisfactionSearch();
		// compareString();
		// compare();
		// rightTriangle();
		// bmi();
		// max();
		// absoluteValue();
		sort();
		sc.close();
	}

	public static void gs25() {
		/*
		 * ���� ���� 1200 , �̼�����(19 �̸�) 100 ���� / �ݶ� 1500, �̼����� 0 ���� / ���� 800, �̼�����
		 * 200 ����
		 * 
		 * �Է�> ���� �ݶ� ���� ���� ���� ���� �Է� ���� ���� �Է� ������縦 ��� ���> ���� �� ���� ����� ���
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
		 * ���� ��ǰ�� ���� �������� �����ϰ� �ִ�. �������� 1~5�� �Է� 5-�ſ츸��, 4-����, 3-����, 2-�Ҹ���,
		 * 1-�ſ�Ҹ��� ����ڷ� ���� ������ ����� �Է��� �ް� ��޿� �ش��ϴ� �������� ����Ͻÿ�. (��, 5,4,3,2,1,
		 * �̿��� ���� �ԷµǸ� -> '�߸��Է��Ͽ����ϴ�.' ���
		 */

		int satisfaction;

		System.out.println("----��ǰ�� ���� ������ ����----\n");
		System.out.print("������ ����� �Է��ϼ���(1 ~ 5)> ");
		satisfaction = sc.nextInt();

		System.out.print("��ǰ ������ : ");

		if (satisfaction == 5) {

			System.out.println("�ſ츸��");

		} else if (satisfaction == 4) {

			System.out.println("����");

		} else if (satisfaction == 3) {

			System.out.println("����");

		} else if (satisfaction == 2) {

			System.out.println("�Ҹ���");

		} else if (satisfaction == 1) {

			System.out.println("�ſ�Ҹ���");

		} else {

			System.out.println("�߸��Է��Ͽ����ϴ�.");

		}

		System.out.println("\n-----���α׷� ����-----");
	}

	public static void compareString() {

		/*
		 * ���� ������ ���� ��� �Է�> ���� �Է�(�� ~ ��) ���> ����
		 */

		String day;

		System.out.println("---���� �Է�(ex: ������)----\n");
		System.out.print("�Է�> ");
		day = sc.nextLine();

		if (day.equals("������")) {

			System.out.println("���� - ����, �ٶ� - ����ǳ");

		} else if (day.equals("ȭ����")) {

			System.out.println("���� - ����, �ٶ� - �ϼ�ǳ");

		} else if (day.equals("������")) {

			System.out.println("���� - �帲, �ٶ� - ����");

		} else if (day.equals("�����")) {

			System.out.println("���� - �帲, �ٶ� - ����ǳ");

		} else if (day.equals("�ݿ���")) {

			System.out.println("���� - ����, �ٶ� - ����");

		} else if (day.equals("�����")) {

			System.out.println("���� - ����, �ٶ� - ����");

		} else if (day.equals("�Ͽ���")) {

			System.out.println("���� - ��, �ٶ� - ����");

		} else {
			System.out.println("�߸��Է��Ͽ����ϴ�.");
		}

		System.out.println("\n----���α׷� ����----");
	}

	public static void compare() {

		/*
		 * ���� ����ڷκ��� ����, ������ �Է��� �ް� �Է¹��� ������ ������ �Ʒ��� ���� �Ǵ��ϴ� ���α׷��ۼ�
		 * 
		 * [�Է�] ���� : �ѱ�(���ѹα�), �Ϻ� ���� : ����, ����
		 * 
		 * [���] 1. �ѱ� ���� 2. �ѱ� ���� 3. �Ϻ� ���� 4. �Ϻ� ����
		 * 
		 * �Է��� ���ڿ��� �Է� ����,
		 * 
		 * 
		 */

		String country;
		String gender;
		String korea = "�ѱ�";
		String korea2 = "���ѹα�";
		String japen = "�Ϻ�";
		String man = "����";
		String woman = "����";

		System.out.println("----����,���� �Է�----\n");
		System.out.print("����(�ѱ�, ���ѹα�, �Ϻ�)> ");
		country = sc.nextLine();

		System.out.print("����(����, ����)> ");
		gender = sc.nextLine();

		//&& �����ڰ� || �����ں��� �켱������ ����
		if ((country.equals(korea) || country.equals(korea2)) && gender.equals(woman)) {

			System.out.println("1. �ѱ� ����");
		} else if ((country.equals(korea) || country.equals(korea2)) && gender.equals(man)) {

			System.out.println("2. �ѱ� ����");
		} else if (country.equals(japen) && gender.equals(woman)) {

			System.out.println("3. �Ϻ� ����");
		} else if (country.equals(japen) && gender.equals(man)) {

			System.out.println("4. �Ϻ� ����");
		} else {

			System.out.println("�Ǵ��� �� ����.");
		}

		System.out.println("\n----���α׷� ����----");
	}

	public static void rightTriangle() {

		/*
		 * ���� �����ﰢ���Ǵ� [�Է�] 3���� ���� �Է�
		 * 
		 * [���] �����ﰢ�� or ���
		 */

		int A, B, C;
		int sum;

		System.out.println("----�����ﰢ�� �� ���� �Է�----");
		System.out.print("A> ");
		A = sc.nextInt();

		System.out.print("B> ");
		B = sc.nextInt();

		System.out.print("C> ");
		C = sc.nextInt();

		sum = A + B + C;
		
		if (sum == 180) {
			if (A == 90 || B == 90 || C == 90) {
		
				System.out.println("�����ﰢ���Դϴ�.");
			} else {

				System.out.println("�����ﰢ���� �ƴմϴ�.");
			}
		} else {
			System.out.println("�ﰢ���� �ƴմϴ�.");
		}

	}

	public static void bmi() {
		/*
		 * [����] Ű���忡�� ü�߰� ������ �Է��� �޾�
		 * BMI�� ����ϰ�, BMI ����� ����ϴ� ���α׷� �ۼ�
		 * 
		 * BMI = ü��(kg) / (Ű(m)*Ű(m))
		 * 
		 * BMI ���
		 * 	18.5 �̸� : ��ü��
		 * 	18.5 ~ 23 : ����ü��
		 * 	23 ~ 25   : ��ü��
		 * 	25 ~ 30   : �浵��
		 * 	30 ~ 35   : �ߵ��
		 * 	35�̻�    : ����
		 */
		
		double weight;
		double height;
		double bmi;
		
		System.out.println("---BMI ���----");
		System.out.print("������ �Է�(kg)> ");
		weight = sc.nextDouble();
		
		System.out.print("Ű �Է�(cm)> ");
		height = sc.nextDouble() / 100;
		
		bmi = weight / (height*height);
		
		if( 0 <= bmi && bmi < 18.5) {
			System.out.println("��ü��");
		} else if( 18.5 <= bmi && bmi < 23) {
			
			System.out.println("����ü��");

		} else if( 23 <= bmi && bmi < 25) {
			
			System.out.println("��ü��");

		} else if( 25 <= bmi && bmi < 30) {
			
			System.out.println("�浵��");

		} else if( 30 <= bmi && bmi < 35) {
			
			System.out.println("�ߵ��");

		} else {
			System.out.println("����");

		}
		
		System.out.println("----���α׷� ����");
	}
	
	public static void max() {
		/*
		 * [����] ������ ����(���� �Ǵ� �Ǽ�)�� �Է� �ް�
		 * �Է¹��� ���߿��� �ִ밪�� ����ϴ� ���α׷� �ۼ�
		 */
		
		double a, b, c;
		double max = 0.0;
		
		System.out.println("----�ִ밪 ���, ������ ����(���� �Ǵ� �Ǽ�) �Է�----");
		System.out.print("�Է�> ");
		a = sc.nextDouble();
		
		System.out.print("�Է�> ");
		b = sc.nextDouble();
		
		System.out.print("�Է�> ");
		c = sc.nextDouble();
		
		if( a > b ) {
			
			if( a > c ) max = a;
			
			else max = c;
			
		} else {
			
			if( b > c) max = b;
			
			else max = c;
			
		}
		
		System.out.println("���> " + a + ", " + b + ", " + c + "�� �ִ밪 : " + max);
	}

	public static void absoluteValue() {
		/*
		 * [����] ����(���� �Ǵ� �Ǽ�)�� �Է��� �ް�, �Է¹��� ������
		 * ���밪�� ����ϴ� ���α׷��� �ۼ�
		 */
		
		double num;
		
		System.out.println("----���밪 ���----");
		System.out.print("�Է�(���� �Ǵ� �Ǽ�)> ");
		num = sc.nextDouble();
		
		if(num < 0) {
			System.out.println("���밪 : " + num * -1);
		} else {
			System.out.println("���밪 : " + num);
		}
	}
	
	public static void sort() {
		/*
		 * [����]
		 * ������ ����(���� �Ǵ� �Ǽ�)�� �Է� �ް�,
		 * �Էµ� ���� ũ�� ������ ����Ͻÿ�.
		 * 
		 * ��� : ���� ū��, �߰���, ���� ������
		 */
		
		 double n1, n2, n3;
		 
		 System.out.println("----���� ����(3���� ���� �Է�)----");
		 System.out.print("�Է�(���� �Ǵ� �Ǽ�)> ");
		 n1 = sc.nextDouble();
		 
		 System.out.print("�Է�(���� �Ǵ� �Ǽ�)> ");
		 n2 = sc.nextDouble();
		 
		 System.out.print("�Է�(���� �Ǵ� �Ǽ�)> ");
		 n3 = sc.nextDouble();
		 
		 if(n1 > n2 && n1 > n3) {
			 if(n2 > n3) {
				 System.out.println(n1 + " " + n2 + " " + n3 );
			 } else {
				 System.out.println(n1 + " " + n3 + " " + n2 );
			 }
		 } else if( n2 > n1 && n2 > n3) {
			 if(n1 > n3) {
				 System.out.println(n2 + " " + n1 + " " + n3 );
			 } else {
				 System.out.println(n2 + " " + n3 + " " + n1 );
			 }
		 } else {
			 if(n1 > n2) {
				 System.out.println(n3 + " " + n1 + " " + n2 );
			 } else {
				 System.out.println(n3 + " " + n2 + " " + n1 );
			 }
		 }
		
		  
	}
}
