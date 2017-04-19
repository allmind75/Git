package test11;

import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double width, height;
		double area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("삼각형 가로 세로 입력");
		System.out.print(" 가로 입력> ");
		width = sc.nextDouble();

		System.out.print(" 세로 입력> ");
		height = sc.nextDouble();
		
		area = triArea(width, height);
		System.out.println("삼각형의 넓이 = " +area);
		
		sc.close();

	}
	

	static double triArea(double x, double y) {
	
		return x*y/2;
	}


}
