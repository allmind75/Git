package test11;

import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int width, height;
		int area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사각형의 가로 세로 입력");
		System.out.print("가로 입력> ");
		width = sc.nextInt();
		
		System.out.print("세로 입력> ");
		height = sc.nextInt();
		
		area = rect(width, height);
		System.out.println("사각형의 넓이 = " +area);
		
		sc.close();

	}
	

	static int rect(int x, int y) {
	
		return x*y;
	}


}
