package test04;

import java.util.Scanner;

import nono.Twice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("----[������ȯ(cm -> in) ���α׷�]----");
		
		double cm;
		double inch;
		final double cmToInch = 0.393701;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("cm �Է� : ");
		cm = sc.nextDouble();
		
		inch = cm * cmToInch;
		
		System.out.println("��� : " + cm + "cm�� " + inch + "in");
		System.out.println("----------[��            ��]---------");
		
		
		System.out.println("hasNextInt(), hasNext()");
		System.out.print("�Է� ->");
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
		System.out.print("�Է� : ");
		int count = 0;
		while(sc.hasNext()) {
			String word = sc.next();
			System.out.println(word);
			count++;			
			System.out.println(sc.hasNext());
			System.out.println(sc.nextLine());
			System.out.println(sc.hasNext());
		}
		System.out.println("�ܾ�� : " + count);
		
		
		sc.close();
	}

}
