package tset07;

import java.util.Scanner;

public class Hexadeciaml {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int x = 10;
		int y = 0xFF00FF; // 16진수, 0x
		int z = 017; // 8진수, 0
		int b = 0b1010; // 2진수, 0b

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		System.out.println("b = " + b);

		System.out.println("\n2진수  : " + Integer.toBinaryString(x));
		System.out.println("8진수  : " + Integer.toOctalString(x));
		System.out.println("16진수 : " + Integer.toHexString(x));

		// %x 소문자출력, %X 대문자출력
		System.out.printf("\nx의 10진수 : %d / y의 16진수 : 0x%X \n\n", x, y);

		// 문제-16진수 변환 프로그램
		// 10진수 입력 -> 입력 값을 16진수로 출력
		//exam1();
		
		binary();

	}

	public static void exam1() {

		int num;

		System.out.println("----16진수 변환 프로그램----");
		System.out.print("10진수 입력 : ");
		num = sc.nextInt();

		System.out.println("16진수 = 0x" + Integer.toHexString(num).toUpperCase());

		System.out.println("---프로그램 종료----");
	}

	public static void binary() {
		int num;
		int temp;
		int bi = 0;;
		
		System.out.print("10진수 입력(0<= 범위 <=15) : ");
		num = sc.nextInt();
		
		bi += num % 2;
		temp = num / 2;
		
		bi += (temp % 2)*10;
		temp = temp / 2;
		
		bi += (temp % 2)*100;
		temp = temp / 2;
		
		bi += temp * 1000;
		
		System.out.println("10진수= " + num + " // 2진수= " + bi);
		
	}
}
