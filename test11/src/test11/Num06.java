package test11;

import java.util.Scanner;

public class Num06 {

	public static void main(String[] args) {
		
		System.out.println("[문제 6] 2개의 문자열을 전달받고, 전달 받은 2개의 문자열을 연결한 후 출력하는 정적 메소드를 작성");
		
		String str1, str2, str3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2개의 문자열 입력");
		System.out.print("입력> ");
		str1 = sc.nextLine();
		
		System.out.print("입력> ");
		str2 = sc.nextLine();
		
		str3 = strCat(str1, str2);
		System.out.println("\n연결된 문자열: " + str3);
		
		sc.close();
	}
	
	public static String strCat(String s1, String s2) {
		
		return s1 + s2;
	}
	
}
