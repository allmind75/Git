package test11;

import java.util.Scanner;

public class Num06 {

	public static void main(String[] args) {
		
		System.out.println("[���� 6] 2���� ���ڿ��� ���޹ް�, ���� ���� 2���� ���ڿ��� ������ �� ����ϴ� ���� �޼ҵ带 �ۼ�");
		
		String str1, str2, str3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2���� ���ڿ� �Է�");
		System.out.print("�Է�> ");
		str1 = sc.nextLine();
		
		System.out.print("�Է�> ");
		str2 = sc.nextLine();
		
		str3 = strCat(str1, str2);
		System.out.println("\n����� ���ڿ�: " + str3);
		
		sc.close();
	}
	
	public static String strCat(String s1, String s2) {
		
		return s1 + s2;
	}
	
}
