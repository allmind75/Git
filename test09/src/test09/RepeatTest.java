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
		
//		System.out.println("반복문 종료 x = " + x);
//		System.out.println("3, 5 배수의 합 : " + new RepeatTest(10).sumOf3And5());
//		System.out.println("3, 5의 배수의 갯수 : " + sum(10));
		
		name();
		multiple5();
		print();
		print5();
		print6();
		print7();
		print8();
		print9();
	
	}
	
	public static void name() {
		/*
		 * [문제]
		 * 자신의 이름을 7번 출력하는 프로그램 작성
		 */
		int count = 0;
		while( count < 7 ) {
			count++;
			System.out.println( count + ". 장환호");
		}
	}
	
	public static void multiple5() {
		/*
		 * 아래와 같이 출력되는 프로그램 작성
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
		
		/*
		 * 아래와 같이 출력되는 프로그램 작성
		 * -5 -4 -3 -2 -1 0 1 2 3 4 5
		 */
		int n = -5;
		while( n <= 5 ) {
			
			System.out.print(n + " ");			
			n++;
		}
		System.out.println();
	}
	
	public static void print5() {
		
		/*
		 * 아래와 같이 출력되는 프로그램 작성
		 * 5 4 3 2 1 0 1 2 3 4 5
		 */
		int n = -5;
		while( n <= 5 ) {
			
			if( n < 0 )
				System.out.print(-n);
			else
				System.out.print(n);
			
			System.out.print(" ");
			
			n++;
		}
		System.out.println();
	}
	
	public static void print6() {
		/*
		 * [문제]
		 * 아래와 같이 출력되는 프로그램을 작성
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
		 * [문제]
		 * 아래와 같이 출력되는 프로그램 작성
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
		 * [문제]
		 * 아래와 같이 출력되는 프로그램 작성
		 * 100 97 94 91 88 85 82 79
		 */
		int n = 100;
		
		while(n > 78) {
			System.out.print(n + " ");
			n -= 3;
		}
		System.out.println();
	}
	
	public static void print9() {
		/*
		 * [문제]
		 * 1024의 약수를 출력하는 프로그램 작성
		 */
		
		int n = 1024;
		int count = 0;
		
		for(int i=1 ; i<=1024 ; i++){
			if(n%i == 0) {
				System.out.print(i + " ");
				count++;
			}
		}
		
		System.out.println("\n1024의 약수의 갯수 : " + count);
	}
	
	
	
}
