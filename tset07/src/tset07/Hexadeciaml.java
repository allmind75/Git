package tset07;

import java.util.Scanner;

public class Hexadeciaml {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int x = 10;
		int y = 0xFF00FF; // 16����, 0x
		int z = 017; // 8����, 0
		int b = 0b1010; // 2����, 0b

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		System.out.println("b = " + b);

		System.out.println("\n2����  : " + Integer.toBinaryString(x));
		System.out.println("8����  : " + Integer.toOctalString(x));
		System.out.println("16���� : " + Integer.toHexString(x));

		// %x �ҹ������, %X �빮�����
		System.out.printf("\nx�� 10���� : %d / y�� 16���� : 0x%X \n\n", x, y);

		// ����-16���� ��ȯ ���α׷�
		// 10���� �Է� -> �Է� ���� 16������ ���
		//exam1();
		
		binary();

	}

	public static void exam1() {

		int num;

		System.out.println("----16���� ��ȯ ���α׷�----");
		System.out.print("10���� �Է� : ");
		num = sc.nextInt();

		System.out.println("16���� = 0x" + Integer.toHexString(num).toUpperCase());

		System.out.println("---���α׷� ����----");
	}

	public static void binary() {
		int num;
		int temp;
		int bi = 0;;
		
		System.out.print("10���� �Է�(0<= ���� <=15) : ");
		num = sc.nextInt();
		
		bi += num % 2;
		temp = num / 2;
		
		bi += (temp % 2)*10;
		temp = temp / 2;
		
		bi += (temp % 2)*100;
		temp = temp / 2;
		
		bi += temp * 1000;
		
		System.out.println("10����= " + num + " // 2����= " + bi);
		
	}
}
