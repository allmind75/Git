package test11;

import java.util.Scanner;

public class Num05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[���� 5] �Ʒ��� ���� �����ϴ� �Լ� �ۼ�");
		System.out.println("(1) ���ڿ��� ���޹ް�");
		System.out.println("(2) ���޹��� ���ڿ� �� ���̸� ���");

		String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�> ");
		str = sc.nextLine();
		functionStr(str);
		
		sc.close();
	}

	static void functionStr(String s) {
		
		System.out.println("\n���ڿ� : " + s);
		System.out.println("���ڿ� ���� : " + s.length());
	}
}
