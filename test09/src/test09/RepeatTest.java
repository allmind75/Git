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
		 * [����]
		 * �ڽ��� �̸��� 7�� ����ϴ� ���α׷� �ۼ�
		 */
		int count = 0;
		while( count < 7 ) {
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
		
		/*
		 * �Ʒ��� ���� ��µǴ� ���α׷� �ۼ�
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
		 * �Ʒ��� ���� ��µǴ� ���α׷� �ۼ�
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
		 * [����5]
		 * �Ʒ��� ���� ��µǴ� ���α׷��� �ۼ�
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
		 * [����6]
		 * �Ʒ��� ���� ��µǴ� ���α׷� �ۼ�
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
		 * [����7]
		 * �Ʒ��� ���� ��µǴ� ���α׷� �ۼ�
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
		 * [����8]
		 * 1024�� ����� ����ϴ� ���α׷� �ۼ�
		 */
		
		int n = 1024;
		int count = 0;
		
		for(int i=1 ; i<=1024 ; i++){
			if(n%i == 0) {
				System.out.print(i + " ");
				count++;
			}
		}
		
		System.out.println("\n1024�� ����� ���� : " + count);
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
		 * [����]
		 * 1 ~ 100 ������ ���� �߿��� 2 �Ǵ� 3�� ����� ���
		 */
		for(int i = 1 ; i<=100 ; i++) {
			if(i%2 == 0 || i%3 == 0)
				System.out.println("2 �Ǵ� 3�� ��� : " + i);
		}
	}
	
	public static void print12() {
		/*
		 * [����]
		 * 11 12 13 14 16 17 18 19 21 22 23 24 26 27 28 29 (5�ǹ������)
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
		 * [����]
		 * +1-2+3-4+....-10(¦�� -, Ȧ�� +)
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
		 * [����]
		 * 0.1 0.2 0.3 0.4 0.5 0.6 0.7 0.8 0.9 1.0
		 */
		for(double i=0.1 ; i<=1.0 ; i+=0.1) {
			System.out.printf("%.1f ", i);
		}
		System.out.println();
	}
	
	public static void print15() {
		/*
		 * [����]
		 * 1���� 100������ ���� �߿��� 4�� ����� ����ϴ� ���α׷� �ۼ�
		 * ��, 10�� ����� ��¿��� ����
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
		 * [����]
		 * �Ʒ��� �����Ͽ� 4�ڸ��� ������ Kaprika ���� ���ϴ� ���α׷� �ۼ�
		 * 
		 * kaprika��?
		 * �� �ڸ� ���� 2025�� ����� ���󺸸� 20�� 25�� �ΰ��� ���ڰ� �����
		 * �� �ΰ��� ���ڸ� ���ϸ� 45�̰� 45�� �����ϸ� 2025�� �Ǿ� �����·� ���ư���.
		 * 
		 */
		
		String s;
		String a, b;
		int n1, n2;
		int sum;
		
		System.out.print("Karprika �� : ");
		for(int i=1000 ; i<10000 ; i++) {
			
			//���1
			s = Integer.toString(i);
			a = s.substring(0, s.length()/2);
			b = s.substring(s.length()/2, s.length());
			
			n1 = Integer.parseInt(a);
			n2 = Integer.parseInt(b);
			
			sum = n1 + n2;
			if( i == (sum*sum)) {
				System.out.print(i + " ");
			}
			
			//���2
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
 		 *[����]
 		 *������ �� �� ���� ��������� Ű����� ���� �Է�
 		 *�Է� ���� �������� ���
 		 */
 		
 		int dan;
 		System.out.println("----������ ���----");
 		System.out.print("�� �Է�> ");
 		dan = sc.nextInt();
 		
 		for(int i=1 ; i<10 ; i++) {
 			System.out.println(dan + " * " + i + " = " + dan*i);
 		}
 		System.out.println();
 	}

 	public static void print18() {
 		/*
 		 * 2017�� 1�� �޷� ���
 		 * 1 2 3 4 5 6 7 
 		 * 8 9 10 11 12 13 14
 		 * 15 16 17 18 19 20 21
 		 * 22 23 24 25 26 27 28
 		 * 29 30 31
 		 */
 		
 		System.out.println("-------2017�� 1�� �޷�-------");
 		System.out.println(" ��  ȭ  ��  ��  ��  ��  ��");
 		for(int i=1 ; i<=31 ; i++) {
 			System.out.printf("%3d ", i);
 			if(i%7 == 0) System.out.println();
 		}
 		System.out.println();
 		System.out.println("-----------------------------");
 	}

 	public static void print19() {
 		/*
 		 * [����]
 		 * �Ǻ���ġ ����
 		 * n��° ���ڴ� ���� 2���� ���ڸ� ���ؼ� ��������
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
 		 * A���� 2000�⵵�� 100������ �����ߴ�. ���࿡���� ���� 10%�� ����������
 		 * ���ڰ� ���ǰ�, ������ �߰����� ���ݰ� ����� ���ٰ� �� ��,
 		 * A���� 2020�⵵�� �� ���ݾ��� ���ϴ� ���α׷��� �ݺ����� �̿��� �ۼ�
 		 * 
 		 * ��������� : �� ���ݾ� = ���� ���ݾ� + ���翹�ݾ� * ���� ������
 		 */
 		
 		int money = 1000000;
 		int interest = 10;
 		for(int i=0 ; i<10 ; i++) {
 			money = money + money/interest;
 		}
 		System.out.println("�� ���ݾ� : " + money + "��");
 	}
 	
 	public static void print21() {
 		
 		/*
 		 * [����]
 		 * 20���� 100������ ���� �߿��� ���� ���� 17�� ����� ���Ͻÿ�.
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
 		 * [����]
 		 * 1���� 1000������ ���� �߿���
 		 * ���� ū 13�� ����� ���Ͻÿ�
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
 		 * [����]
 		 * �ڽ��� ���������� ����ϴ� ���ΰ��� �ۼ�
 		 * ��, �Ʒ��� ���� ���α׷��� �����ؾ���.
 		 * 
 		 * (1) �Ʒ��� ���� �޴��� �����
 		 * �޴�] 1.�̸�  |  2.���  |  3.�����ϴ¿�ȭ  |  4.����
 		 * 
 		 * (2) ���� �޴� ��°� ������ ��� �ݺ��̵ǰ�, 4 �޴� ���� �� ����
 		 * 
 		 * (3) 1 �޴��� �����ϸ�, �̸� ���
 		 *     2 �޴��� �����ϸ�, ��� ���
 		 */
 		
 		 String name = "Jang Hwan Ho";
 		 String hobby = "StarCraft";
 		 String movie = "Fast and Furious";
 		 int choice;
 		 int cnt = 1;
 		 
 		System.out.println("--------�ڽ��� �������� ���-------");
 		 for(;;) {

 			 System.out.println("�޴�] 1.�̸�  |  2.���  |  3.�����ϴ� ��ȭ  |  4.����");
 			 System.out.print("�޴� ����> ");
 			 choice = sc.nextInt();
 			 
 			 if(choice == 4) break;
 			 
 			 switch(choice) {
 			 case 1:
 				 System.out.println("�̸��� " + name + " �Դϴ�.");
 				 break;
 			 case 2:
 				 System.out.println("��̴� " + hobby + " �Դϴ�.");
 				 break;
 			 case 3:
 				 System.out.println("�����ϴ� ��ȭ�� " + movie + " " + cnt+ " �Դϴ�.");
 	 			 if(cnt > 7) cnt=1;
 	 			 else cnt++;
 				 break;
 			 default:
 				 System.out.println("�߸��� �Է��Դϴ�.");
 			 }
 		 }
 		 System.out.println("--------���α׷� ����-------");
 	}

 	public static void print24() {
 		/*
 		 * ����
 		 * 1+2+3 ... + 100�� ��� ���
 		 */
 		int sum = 0;
 		for(int i=1; i<=100 ; i++) {
 			sum += i;
 		}
 		System.out.println(sum);
 	}
 	
 	public static void print25() {
 		/*
 		 * ����
 		 * 1-2+3-4....-100�� ��� ���
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
 		 * ����
 		 * 10! ���
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
 		 * [����]
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
 		 * [����]
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
