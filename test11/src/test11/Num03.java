package test11;

import java.util.Scanner;

public class Num03 {

	public static void main(String[] args) {
		System.out.println("[문제 3] 사각형의 가로, 세로 길이 입력받고, 입력받은 사각형이 정사각형인지 판단하는 함수 작성");
		
		int width, height;
		Scanner sc = new Scanner(System.in);
	
		System.out.print("가로 입력> ");
		width = sc.nextInt();
		
		System.out.print("세로 입력> ");
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
			System.out.println("\n정사각형");
		} else {
			System.out.println("\n직사각형");			
		}
		
	}
}
