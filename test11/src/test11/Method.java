package test11;

import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double width, height;
		double area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ﰢ�� ���� ���� �Է�");
		System.out.print(" ���� �Է�> ");
		width = sc.nextDouble();

		System.out.print(" ���� �Է�> ");
		height = sc.nextDouble();
		
		area = triArea(width, height);
		System.out.println("�ﰢ���� ���� = " +area);
		
		sc.close();

	}
	

	static double triArea(double x, double y) {
	
		return x*y/2;
	}


}
