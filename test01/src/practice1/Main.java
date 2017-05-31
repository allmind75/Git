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
		System.out.println("내 이름은 장환호 입니다.");
		System.out.println("내가 좋아하는 영화는 분노의 질주 입니다.");
	}

	public void exam2(int w, int h) {
		
		System.out.println("[exam2]");
		int round = w*2 + h*2;
		System.out.println("사각형 둘레의 길이 : " + round);
	}
	
	public void exam3() {
		
		System.out.println("[exam3]");
		int year, month, day;
		year = 2017;
		month = 1;
		day = 28;
		
		System.out.println(year + "년도 설연휴는 " + month +"월 " + day + "일 부터 시작됩니다.");
	}
	
	public void exam4() {
		
		System.out.println("[exam4]");
		int n1 = 250;
		int n2 = 60;
		int result = n1 / n2;
		int remainder = n1 % n2;
		
		System.out.println("몫 : " + result);
		System.out.println("나머지 : " + remainder);
	}
	
	public void exam5() {
		
		System.out.println("[exam5]");
		int second = 1205;
		int min = second / 60;
		int sec = second % 60;
		
		System.out.println("현재까지 게임이 진행된 시간은 " + min + "분 " + sec + "초 입니다.");
	}
	
	public void exam6() {
		
		System.out.println("[exam6]");
		int korean, english, math;
		double avg;
		int sum;
		
		System.out.println("국어 영어 수학 점수 입력");
		System.out.print("국어> ");
		korean = scan.nextInt();
		
		System.out.print("영어> ");
		english = scan.nextInt();
		
		System.out.print("수학> ");
		math = scan.nextInt();
		
		sum = korean + english + math;
		avg =  sum / 3.0;
		
		System.out.println("총점 : " + sum );
		System.out.println("평균 : " + avg );
		
	}
	
	public void exam7() {
		
		System.out.println("[exam7]");
		int ho, ver, height;
		int volume;
		
		System.out.println("가로 세로 높이 입력");
		System.out.print("가로> ");
		ho = scan.nextInt();
		
		System.out.print("세로> ");
		ver = scan.nextInt();
		
		System.out.println("높이> ");
		height = scan.nextInt();
		
		volume = ho * ver * height;
		
		System.out.println("부피 : " + volume);
	}
	
	public void exam8() {
		
		System.out.println("[exam8]");
		int x, y;
		
		System.out.println("정수 x, y 입력");
		System.out.print("x 입력> ");
		x = scan.nextInt();
		
		System.out.print("y 입력> ");
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
		
		System.out.println("사각형의 가로, 세로 길이 입력");
		System.out.print("가로> ");
		w = scan.nextInt();
		
		System.out.println("세로> ");
		h = scan.nextInt();
		
		System.out.println("가로길이 " + w + " 이고, 세로 길이가 " + h + " 인 사각형의 넓이는 " + (w*h) + " 입니다.");
	}
	
	public void exam10() {
		
		System.out.println("[exam10]");
		double w, h;
		double area;
		
		System.out.println("삼각형의 가로, 높이 입력");
		System.out.print("가로> ");
		w = scan.nextInt();
		
		System.out.print("세로> ");
		h = scan.nextInt();
		
		area = w * h / 2;
		System.out.println("****삼각형의 길이와 높이는 아래와 같다****");
		System.out.println("-삼각형의 길이 " + w);
		System.out.println("-삼각형의 높이 " + h);
		System.out.println("******************************************");
		System.out.println("삼각형의 넓이는 " + area);
	}
	
	public void exam11() {
		
		System.out.println("[exam11]");
		double x, y, z;
		System.out.println("[실수의 1/0]");
		x = 1;
		y = 0;
		
		try {
			z = x / y;
			System.out.println(z);
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("[실수의 0/0]");
		x = 0;
		y = 0;
		
		try {
			z = x / y;
			System.out.println(z + "(Not a Number)");
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("[정수의 1/0]");
		int a, b, c;
		a = 1;
		b = 0;
		
		try {
			c = a / b;
			System.out.println(c);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없음 : " + e.getMessage());
		}
	}
	
	
}
