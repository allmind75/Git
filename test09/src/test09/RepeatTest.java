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
		
//		name();
//		multiple5();
//		print();
//		print5();
//		print6();
//		print7();
//		print8();
//		print9();
//		print10();
//		print11();
//		print12();
//		print13();
//		print14();
//		print15();
//		print16();
//		print17();
//		print18();
//		print19();
//		print20();
//		print21();
//		print22();
//		print23();
//		print24();
//		print25();
//		print26();
//		print27();
		print28();
		print29();
		
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
		 * [문제5]
		 * 아래와 같이 출력되는 프로그램을 작성
		 * 0 1 4 9 16 25 36
		 */
		
		int n = 0;
		
		while(n < 7) {
			System.out.print(n*n + " ");
			n++;
		}
		System.out.println();
	}
	
	public static void print7()	 {
		/*
		 * [문제6]
		 * 아래와 같이 출력되는 프로그램 작성
		 * @@@@@
		 * @@@@@
		 * @@@@@
		 * @@@@@ 
		 */
		int n = 0;
		
		while(n < 20) {
			System.out.print("@");
			n++;
			if( n%5 == 0) System.out.println(" ");
			
			
		}
		System.out.println();
	}
	
	public static void print8()	{
		/*
		 * [문제7]
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
		 * [문제8]
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
	
	public static void print10() {
		
		for(int i=0 ; i<1000 ; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			} else if(i%3 == 0) {
				System.out.println("\t" + i);
			} else if(i%5 == 0) {
				System.out.println("\t\t" + i);
			} else if(i%7 == 0) {
				System.out.println("\t\t\t" + i);
			}else {
				System.out.println("\t\t\t\t" + i);
			}
		}
	}
	
	public static void print11() {
		
		/*
		 * [문제]
		 * 1 ~ 100 사이의 정수 중에서 2 또는 3의 배수를 출력
		 */
		for(int i = 1 ; i<=100 ; i++) {
			if(i%2 == 0 || i%3 == 0)
				System.out.println("2 또는 3의 배수 : " + i);
		}
	}
	
	public static void print12() {
		/*
		 * [문제]
		 * 11 12 13 14 16 17 18 19 21 22 23 24 26 27 28 29 (5의배수제외)
		 */
		
		int n = 29;
		for(int i=11; i<=n ; i++) {
			if(i%5 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	public static void print13() {
		/*
		 * [문제]
		 * +1-2+3-4+....-10(짝수 -, 홀수 +)
		 */
		for(int i=1 ; i<=10 ; i++) {
			if(i%2 == 0) {
				System.out.print(" - " + i);
			} else {
				System.out.print(" + " + i);
			}
		}
		System.out.println();
	}
	
	public static void print14() {
		/*
		 * [문제]
		 * 0.1 0.2 0.3 0.4 0.5 0.6 0.7 0.8 0.9 1.0
		 */
		for(double i=0.1 ; i<=1.0 ; i+=0.1) {
			System.out.printf("%.1f ", i);
		}
		System.out.println();
	}
	
	public static void print15() {
		/*
		 * [문제]
		 * 1에서 100사이의 정수 중에서 4의 배수를 출력하는 프로그램 작성
		 * 단, 10의 배수를 출력에서 제외
		 */
		for(int i=1 ; i<=100 ; i++) {
			if(i%4 == 0 && i%10 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
 	public static void print16() {
		/*
		 * [문제]
		 * 아래를 참고하여 4자리로 구성된 Kaprika 수를 구하는 프로그램 작성
		 * 
		 * kaprika란?
		 * 네 자리 숫자 2025의 가운데를 갈라보면 20과 25의 두개의 숫자가 생긴다
		 * 이 두개의 숫자를 더하면 45이고 45를 제곱하면 2025가 되어 원상태로 돌아간다.
		 * 
		 */
		
		String s;
		String a, b;
		int n1, n2;
		int sum;
		
		System.out.print("Karprika 수 : ");
		for(int i=1000 ; i<10000 ; i++) {
			
			//방법1
			s = Integer.toString(i);
			a = s.substring(0, s.length()/2);
			b = s.substring(s.length()/2, s.length());
			
			n1 = Integer.parseInt(a);
			n2 = Integer.parseInt(b);
			
			sum = n1 + n2;
			if( i == (sum*sum)) {
				System.out.print(i + " ");
			}
			
			//방법2
			int n3 = i/100;
			int n4 = i%100;
			if( (n3+n4)*(n3+n4) == i) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

 	public static void print17() {
 		
 		/*
 		 *[문제]
 		 *구구단 중 몇 단을 출력할지를 키보드로 부터 입력
 		 *입력 받은 구구단을 출력
 		 */
 		
 		int dan;
 		System.out.println("----구구단 출력----");
 		System.out.print("단 입력> ");
 		dan = sc.nextInt();
 		
 		for(int i=1 ; i<10 ; i++) {
 			System.out.println(dan + " * " + i + " = " + dan*i);
 		}
 		System.out.println();
 	}

 	public static void print18() {
 		/*
 		 * 2017년 1월 달력 출력
 		 * 1 2 3 4 5 6 7 
 		 * 8 9 10 11 12 13 14
 		 * 15 16 17 18 19 20 21
 		 * 22 23 24 25 26 27 28
 		 * 29 30 31
 		 */
 		
 		System.out.println("-------2017년 1월 달력-------");
 		System.out.println(" 월  화  수  목  금  토  일");
 		for(int i=1 ; i<=31 ; i++) {
 			System.out.printf("%3d ", i);
 			if(i%7 == 0) System.out.println();
 		}
 		System.out.println();
 		System.out.println("-----------------------------");
 	}

 	public static void print19() {
 		/*
 		 * [문제]
 		 * 피보나치 수열
 		 * n번째 숫자는 앞의 2개의 숫자를 더해서 구해진다
 		 * 1 1 2 3 5 8 13 21 34 . .  .
 		 */
 		int n1 = 1;
 		int n2 = 1;
 		int n3;
 		int size = 1000;
 		
 		System.out.print(n1 + " " + n2 + " ");
 		for(int i=0 ; i<1000 ; i++) {
 			n3 = n1 + n2;
 			System.out.print(n3 + " ");
 			n1 = n2;
 			n2 = n3;
 		}
 		System.out.println();
 	}
 	
 	public static void print20() {
 		/*
 		 * A씨는 2000년도에 100만원을 예금했다. 은행에서는 연간 10%의 복리법으로
 		 * 이자가 계산되고, 이후의 추가적인 예금과 출금이 없다고 할 때,
 		 * A씨의 2020년도의 총 예금액을 구하는 프로그램을 반복문을 이용해 작성
 		 * 
 		 * 복리법계산 : 총 예금액 = 현재 예금액 + 현재예금액 * 복리 이자율
 		 */
 		
 		int money = 1000000;
 		int interest = 10;
 		for(int i=0 ; i<10 ; i++) {
 			money = money + money/interest;
 		}
 		System.out.println("총 예금액 : " + money + "원");
 	}
 	
 	public static void print21() {
 		
 		/*
 		 * [문제]
 		 * 20에서 100사이의 정수 중에서 가장 작은 17의 배수를 구하시오.
 		 */
 		for(int i=20 ; i<=100 ; i++) {
 			if(i%17 == 0) {
 				System.out.println(i);
 				break;
 			}
 		}
 	}
 	
 	public static void print22() {
 		/*
 		 * [문제]
 		 * 1에서 1000사이의 정수 중에서
 		 * 가장 큰 13의 배수를 구하시오
 		 */
 		for(int i=1000 ; i>0 ; i--) {
 			if(i%13 == 0) {
 				System.out.println(i);
 				break;
 			}
 		}
 	}
 	
 	public static void print23() {
 		/*
 		 * [문제]
 		 * 자신의 개인정보를 출력하는 프로개름 작성
 		 * 단, 아래와 같이 프로그램이 동작해야함.
 		 * 
 		 * (1) 아래와 같은 메뉴를 출력함
 		 * 메뉴] 1.이름  |  2.취미  |  3.좋아하는영화  |  4.종료
 		 * 
 		 * (2) 위의 메뉴 출력과 선택은 계속 반복이되고, 4 메뉴 선택 시 종료
 		 * 
 		 * (3) 1 메뉴를 선택하면, 이름 출력
 		 *     2 메뉴를 선택하면, 취미 출력
 		 */
 		
 		 String name = "Jang Hwan Ho";
 		 String hobby = "StarCraft";
 		 String movie = "Fast and Furious";
 		 int choice;
 		 int cnt = 1;
 		 
 		System.out.println("--------자신의 개인정보 출력-------");
 		 for(;;) {

 			 System.out.println("메뉴] 1.이름  |  2.취미  |  3.좋아하는 영화  |  4.종료");
 			 System.out.print("메뉴 선택> ");
 			 choice = sc.nextInt();
 			 
 			 if(choice == 4) break;
 			 
 			 switch(choice) {
 			 case 1:
 				 System.out.println("이름은 " + name + " 입니다.");
 				 break;
 			 case 2:
 				 System.out.println("취미는 " + hobby + " 입니다.");
 				 break;
 			 case 3:
 				 System.out.println("좋아하는 영화는 " + movie + " " + cnt+ " 입니다.");
 	 			 if(cnt > 7) cnt=1;
 	 			 else cnt++;
 				 break;
 			 default:
 				 System.out.println("잘못된 입력입니다.");
 			 }
 		 }
 		 System.out.println("--------프로그램 종료-------");
 	}

 	public static void print24() {
 		/*
 		 * 문제
 		 * 1+2+3 ... + 100의 결과 출력
 		 */
 		int sum = 0;
 		for(int i=1; i<=100 ; i++) {
 			sum += i;
 		}
 		System.out.println(sum);
 	}
 	
 	public static void print25() {
 		/*
 		 * 문제
 		 * 1-2+3-4....-100의 결과 출력
 		 */
 		int sum = 0;
 		for(int i=1 ; i<=100 ; i++) {
 			if(i%2 == 0) {
 				sum -= i;
 			} else {
 				sum += i;
 			}
 		}
 		System.out.println(sum);
 	}
 	
 	public static void print26() {
 		/*
 		 * 문제
 		 * 10! 출력
 		 */
 		int facto = 1;
 		
 		for(int i=1; i<=10 ; i++) {
 			facto *= i;
 		}
 		System.out.println(facto);
 	}

 	public static void print27() {
 		
 		double sum = 0.0;
 		
 		for(double i=1 ; i<100 ; i++) {
 			
 			if(i%2 == 0) {
 				sum += (i/(i+1));
 			} else {
 				sum -= (i/(i+1));
 			}
 		}
 		System.out.println(sum);
 	}

 	public static void print28() {
 		/*
 		 * [문제]
 		 *  1  2  3  4  5  6
 		 *  7  8  9 10 11 12 
 		 * 13 14 15 16 17 18
 		 */
 		for(int i=0 ; i<=2 ; i++) {
 			for(int j=i*6 ; j<=(i*6)+6 ; j++) {
 				System.out.printf("%3d ", j);
 			}
 			System.out.println();
 		}
 	}
 	
 	public static void print29() {
 		/*
 		 * [문제]
 		 * @
 		 * @@
 		 * @@@
 		 * @@@@
 		 * ...
 		 * @@@@@@@@@@
 		 */
 		for(int i=1 ; i<=10 ; i++) {
 			for(int j=1 ; j<=i ; j++) {
 				System.out.print("@");
 			}
 			System.out.println();
 		}
 	}
 	 	
}
