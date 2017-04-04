package test09;

import java.util.Scanner;

public class RepeatTest {
	
	static Scanner sc = new Scanner(System.in);
	int num;
	
	public RepeatTest(int num) {
		this.num = num;
	}
	
	public int sumOf3And5() {
		int sum = 0;
		for(int i=0 ; i<this.num ; i++) {
			if( i%3 == 0 || i%5 == 0)
				sum += i;
		}
		return sum;
	}
	
	public static int division(int dividend, int divisor) {
		return dividend / divisor;
	}
	
	public static int sum(int max) {
		
		int divident = max - 1;
		return division(divident, 3) + division(divident, 5) - division(divident, 15);
	}
	
	
	public static void main(String[] args) {
		
//		System.out.println("�ݺ��� ���� x = " + x);
//		System.out.println("3, 5 ����� �� : " + new RepeatTest(10).sumOf3And5());
//		System.out.println("3, 5�� ����� ���� : " + sum(10));
		
		name();
		multiple5();
		print();
		print5();
		print6();
		print7();
		print8();
	}
	
	public static void name() {
		/*
		 * [����]
		 * �ڽ��� �̸��� 7�� ����ϴ� ���α׷� �ۼ�
		 */
		int count = 0;
		while( count<7 ) {
			count++;
			System.out.println( count + ". ��ȯȣ");
		}
	}
	
	public static void multiple5() {
		/*
		 * �Ʒ��� ���� ��µǴ� ���α׷� �ۼ�
		 * 0 5 10 15 20 25 30
		 */
		int n = 0;
		while( n <= 30 ) {
			System.out.print(n + " ");
			n += 5;
		}
		System.out.println();
	}
	
	public static void print() {
		
		int n = -5;
		while( n < 6 ) {
			
			System.out.print(n + " ");			
			n++;
		}
		System.out.println();
	}
	
	public static void print5() {
		
		int n = -5;
		while( n < 6 ) {
			
			if( n < 0 )
				System.out.print(n * -1);
			else
				System.out.print(n);
			
			System.out.print(" ");
			
			n++;
		}
		System.out.println();
	}
	
	public static void print6() {
		/*
		 * [����]
		 * �Ʒ��� ���� ��µǴ� ���α׷��� �ۼ�
		 * 0 1 4 9 16 25 36
		 */
		
		int n = 0;
		
		while(n < 7) {
			System.out.print(n*n + " ");
			n++;
		}
	}
	
	public static void print7()	 {
		/*
		 * [����]
		 * �Ʒ��� ���� ��µǴ� ���α׷� �ۼ�
		 * @@@@@
		 * @@@@@
		 * @@@@@
		 * @@@@@ 
		 */
		int n = 0;
		
		while(n < 20) {
			if( n%5 == 0) System.out.println(" ");
			System.out.print("@");
			n++;
		}
		System.out.println();
	}
	
	public static void print8()	{
		/*
		 * [����]
		 * �Ʒ��� ���� ��µǴ� ���α׷� �ۼ�
		 * 100 97 94 91 88 85 82 79
		 */
		int n = 100;
		
		while(n > 78) {
			System.out.print(n + " ");
			n -= 3;
		}
	}
	
	
}
