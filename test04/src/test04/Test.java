package test04;

import java.util.Scanner;

import nono.Twice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("----[단위변환(cm -> in) 프로그램]----");
		
		double cm;
		double inch;
		final double cmToInch = 0.393701;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("cm 입력 : ");
		cm = sc.nextDouble();
		
		inch = cm * cmToInch;
		
		System.out.println("결과 : " + cm + "cm는 " + inch + "in");
		System.out.println("----------[종            료]---------");
		
		
		System.out.println("hasNextInt(), hasNext()");
		System.out.print("입력 ->");
		while(sc.hasNextInt()) {
			int i = sc.nextInt();
			System.out.println(i);
		}
		
		System.out.println("--------------------");
		while(sc.hasNext()) {
			String s = sc.next();
			System.out.println(s);
			if(s.equals("exit")) break;
		}
		sc.nextLine();
		System.out.print("입력 : ");
		int count = 0;
		while(sc.hasNext()) {
			String word = sc.next();
			System.out.println(word);
			count++;			
			System.out.println(sc.hasNext());
			System.out.println(sc.nextLine());
			System.out.println(sc.hasNext());
		}
		System.out.println("단어개수 : " + count);
		
		
		sc.close();
	}

}
