package test11;

import java.util.Scanner;

public class Num03 {

	public static void main(String[] args) {
		System.out.println("[���� 3] �簢���� ����, ���� ���� �Է¹ް�, �Է¹��� �簢���� ���簢������ �Ǵ��ϴ� �Լ� �ۼ�");
		
		int width, height;
		Scanner sc = new Scanner(System.in);
	
		System.out.print("���� �Է�> ");
		width = sc.nextInt();
		
		System.out.print("���� �Է�> ");
		height = sc.nextInt();
		
		print(checkSquare(width, height));
		
		sc.close();
	}
	
	static boolean checkSquare(int a, int b) {
		
		 
		if( a == b) {
			return true;
		} else {
			return false;
		}
	}
	
	static void print(boolean b) {
		if(b) {
			System.out.println("\n���簢��");
		} else {
			System.out.println("\n���簢��");			
		}
		
	}
}
