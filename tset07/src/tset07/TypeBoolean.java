package tset07;

import java.util.Scanner;

public class TypeBoolean {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
//		int x = 100;
//		int y = 100;
//		
//		boolean b1, b2, b3, b4, b5, b6;
//		
//		b1 = x == y;
//		b2 = x != y;
//		b3 = x > y;
//		b4 = x >= y;
//		b5 = x < y;
//		b6 = x <= y;
//		
//		System.out.println("x = " + x + " y = " + y);
//		
//		
//		if( x == y ) {
//			System.out.println("x == y ? " + b1);
//		}
		
		//amPm();
		rectangle();
		
		
		sc.close();
	}
	
	public static void amPm() {
		
		/*
		 * ����
		 * ����ð��� �Է�(24�ð� ����, 0~23)�� �ް�
		 * �������� �������� ����Ͻÿ�
		 * ����(0~11), ����(12~23)
		 */
		
		int time;
		
		time = sc.nextInt();
		
		if(time < 12) {
			System.out.println("���� " + time + "��");
		}
		if(time >= 12){
			System.out.println("���� " + time + "��");
		}
	}

	public static void rectangle() {
		
		/*
		 * ����
		 * �簢���� ����, ���� ���� �Է� �޾�
		 * ���簢������, ���簢������ �����ؼ� ���
		 */
		
		double width, height;
		
		System.out.println("---�簢���� ����, ���� ���� �Է�---");
		System.out.print("���α��� �Է�>");
		width = sc.nextDouble();
		
		System.out.print("���α��� �Է�>");
		height = sc.nextDouble();
		
		if(width == height) {
			System.out.println("���簢�� �Դϴ�.");
		}
		
		if(width != height) {
			System.out.println("���簢�� �Դϴ�.");
		}
		
		System.out.println("----���α׷� ����----");
	}
}
