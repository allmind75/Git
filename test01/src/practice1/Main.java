package practice1;

import java.util.Scanner;

public class Main {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main m = new Main();
		
		m.exam1();
		m.exam2(30, 40);
		m.exam3();
		m.exam4();
		m.exam5();
		m.exam6();
		m.exam7();
		m.exam8();
		m.exam9();
		m.exam10();
		m.exam11();
		
		scan.close();
	}
	
	public void exam1() {
		
		System.out.println("[exam1]");
		System.out.println("�� �̸��� ��ȯȣ �Դϴ�.");
		System.out.println("���� �����ϴ� ��ȭ�� �г��� ���� �Դϴ�.");
	}

	public void exam2(int w, int h) {
		
		System.out.println("[exam2]");
		int round = w*2 + h*2;
		System.out.println("�簢�� �ѷ��� ���� : " + round);
	}
	
	public void exam3() {
		
		System.out.println("[exam3]");
		int year, month, day;
		year = 2017;
		month = 1;
		day = 28;
		
		System.out.println(year + "�⵵ �����޴� " + month +"�� " + day + "�� ���� ���۵˴ϴ�.");
	}
	
	public void exam4() {
		
		System.out.println("[exam4]");
		double n1 = 250;
		double n2 = 60;
		double result = n1 / n2;
		double remainder = n1 % n2;
		
		System.out.println("�� : " + n1);
		System.out.println("������ : " + n2);
	}
	
	public void exam5() {
		
		System.out.println("[exam5]");
		int second = 1205;
		int min = second / 60;
		int sec = second % 60;
		
		System.out.println("������� ������ ����� �ð��� " + min + "�� " + sec + "�� �Դϴ�.");
	}
	
	public void exam6() {
		
		System.out.println("[exam6]");
		int korean, english, math;
		double avg;
		int sum;
		
		System.out.println("���� ���� ���� ���� �Է�");
		System.out.print("����> ");
		korean = scan.nextInt();
		
		System.out.print("����> ");
		english = scan.nextInt();
		
		System.out.print("����> ");
		math = scan.nextInt();
		
		sum = korean + english + math;
		avg =  sum / 3.0;
		
		System.out.println("���� : " + sum );
		System.out.println("��� : " + avg );
		
	}
	
	public void exam7() {
		
		System.out.println("[exam7]");
		int ho, ver, height;
		int volume;
		
		System.out.println("���� ���� ���� �Է�");
		System.out.print("����> ");
		ho = scan.nextInt();
		
		System.out.print("����> ");
		ver = scan.nextInt();
		
		System.out.println("����> ");
		height = scan.nextInt();
		
		volume = ho * ver * height;
		
		System.out.println("���� : " + volume);
	}
	
	public void exam8() {
		
		System.out.println("[exam8]");
		int x, y;
		
		System.out.println("���� x, y �Է�");
		System.out.print("x �Է�> ");
		x = scan.nextInt();
		
		System.out.print("y �Է�> ");
		y = scan.nextInt();
		
		System.out.println(x + " + " + y + " = " + (x+y));
		System.out.println(x + " - " + y + " = " + (x-y));
		System.out.println(x + " * " + y + " = " + (x*y));
		System.out.println(x + " / " + y + " = " + (x/y));
		System.out.println(x + " % " + y + " = " + (x%y));
	}
	
	public void exam9() {
		
		System.out.println("[exam9]");
		int w, h;
		
		System.out.println("�簢���� ����, ���� ���� �Է�");
		System.out.print("����> ");
		w = scan.nextInt();
		
		System.out.println("����> ");
		h = scan.nextInt();
		
		System.out.println("���α��� " + w + " �̰�, ���� ���̰� " + h + " �� �簢���� ���̴� " + (w*h) + " �Դϴ�.");
	}
	
	public void exam10() {
		
		System.out.println("[exam10]");
		double w, h;
		double area;
		
		System.out.println("�ﰢ���� ����, ���� �Է�");
		System.out.print("����> ");
		w = scan.nextInt();
		
		System.out.print("����> ");
		h = scan.nextInt();
		
		area = w * h / 2;
		System.out.println("****�ﰢ���� ���̿� ���̴� �Ʒ��� ����****");
		System.out.println("-�ﰢ���� ���� " + w);
		System.out.println("-�ﰢ���� ���� " + h);
		System.out.println("******************************************");
		System.out.println("�ﰢ���� ���̴� " + area);
	}
	
	public void exam11() {
		
		System.out.println("[exam11]");
		double x, y, z;
		System.out.println("[�Ǽ��� 1/0]");
		x = 1;
		y = 0;
		
		try {
			z = x / y;
			System.out.println(z);
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("[�Ǽ��� 0/0]");
		x = 0;
		y = 0;
		
		try {
			z = x / y;
			System.out.println(z + "(Not a Number)");
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("[������ 1/0]");
		int a, b, c;
		a = 1;
		b = 0;
		
		try {
			c = a / b;
			System.out.println(c);
		} catch(ArithmeticException e) {
			System.out.println("0���� ������ ���� : " + e.getMessage());
		}
	}
	
	
}
