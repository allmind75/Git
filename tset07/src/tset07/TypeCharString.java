package tset07;

import java.util.Scanner;

public class TypeCharString {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//java char�� 2byte, �����ڵ� ����ϱ� ������
		char x = 0xAC00;
		char y = '��';
		char ch;
		
		String str;
		
		
		//char �Է¹ޱ�, charAt(index) -> �Է¹��� ���ڿ����� index �ڸ� ���� char�� ����
		
		ch = sc.next().charAt(0);
		
		
		sc.nextLine();
		str = sc.nextLine();
		
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(ch);
		System.out.println(str);
		
		System.out.printf("%s\n", str);
		System.out.printf("%30s\n", str);
		System.out.printf("%S\n", str);
		
		String movieTitle;
		 
		System.out.print("�����ϴ� ��ȭ���� �Է� : ");
		movieTitle = sc.nextLine();
		
		System.out.println("�����ϴ� ��ȭ������ " + movieTitle + " �Դϴ�.");
		
		sc.close();
		
	}
}
