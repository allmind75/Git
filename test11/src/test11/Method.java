package test11;

import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int width, height;
		int area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�簢���� ���� ���� �Է�");
		System.out.print("���� �Է�> ");
		width = sc.nextInt();
		
		System.out.print("���� �Է�> ");
		height = sc.nextInt();
		
		area = rect(width, height);
		System.out.println("�簢���� ���� = " +area);
		
		sc.close();

	}
	

	static int rect(int x, int y) {
	
		return x*y;
	}


}
