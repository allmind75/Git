package tset07;

import java.util.Scanner;

public class TypeCharString {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//java char는 2byte, 유니코드 사용하기 때문에
		char x = 0xAC00;
		char y = '가';
		char ch;
		
		String str;
		
		
		//char 입력받기, charAt(index) -> 입력받은 문자열에서 index 자리 값을 char에 저장
		
		ch = sc.next().charAt(0);
		
		
		sc.nextLine();
		str = sc.nextLine();
		
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(ch);
		System.out.println(str);
		
		System.out.printf("%s\n", str);
		System.out.printf("%30s\n", str);
		System.out.printf("%S\n", str);
		
		String movieTitle;
		 
		System.out.print("좋아하는 영화제목 입력 : ");
		movieTitle = sc.nextLine();
		
		System.out.println("좋아하는 영화제목은 " + movieTitle + " 입니다.");
		
		sc.close();
		
	}
}
