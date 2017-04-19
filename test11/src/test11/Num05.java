package test11;

import java.util.Scanner;

public class Num05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[문제 5] 아래와 같이 동작하는 함수 작성");
		System.out.println("(1) 문자열을 전달받고");
		System.out.println("(2) 전달받은 문자열 및 길이를 출력");

		String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력> ");
		str = sc.nextLine();
		functionStr(str);
		
		sc.close();
	}

	static void functionStr(String s) {
		
		System.out.println("\n문자열 : " + s);
		System.out.println("문자열 길이 : " + s.length());
	}
}
