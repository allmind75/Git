package tset07;

import java.util.Scanner;

public class StringToken {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
//		String str = "0123456";
//		int length;
//		char chr;
		
//		str = sc.nextLine();
//		length = str.length();			//문자열 길이
//		chr = str.charAt(0);			//index 번째 문자
//		str2 = str.substring(0, 3);		//index 범위만큼 문자열 자르기
//		
//		System.out.println("문자열 길이 : " + length);
//		System.out.println("0번 째 문자 : " + chr);
//		System.out.println("0~3 sub string : " + str2);
//		while(sc.hasNext()) {
//			System.out.println(sc.nextLine());
//		}
		
		
//		String str2 = "하이브리드웹/앱콘텐츠제작";
//		int index;
//		int len;
//		String sub1, sub2;
//		
//		len = str2.length();
//		index = str2.indexOf('/');
//		
//		sub1 = str2.substring(0, index);
//		sub2 = str2.substring(index+1, len);
//		
//		System.out.println("str2의 문자열의 길이 : " + len);
//		System.out.println("'/'문자의 인덱스 번호 : " +index);
//		
//		System.out.println("sub1 : " + sub1);
//		System.out.println("sub2 : " + sub2);
		
		
		
		
		//phoneNumber();
		
		stringIndex();
		//calc();
		
		
		
		sc.close();
	}
	
	
	//next, nextline
	public static void address() {
		//문제
		/*
		 * 우편번호, 주소, 상세주소를 따로 입력받고
		 * 입력받은 우편번호 주소 상세주소를
		 * 하나의 문자열로 연결해서  출력하시오
		 */
		
		String zipCode;
		String addr1;
		String addr2;
		String addr3;
		
		
		
		System.out.println("---우편번호, 주소, 상세주로를 입력하세요----");
		System.out.print("우편번호 입력 : ");
		
		zipCode = sc.next();	//단어입력(공백기준), 뒤의 개행문자(\n)은 놔둠
		sc.nextLine(); // \n 처리
		
		//sc.skip("[\\r\\n'+");	//개행문자 skip
		
		System.out.print("\n주소 입력 :");
		addr1 = sc.nextLine();
		
		System.out.print("상세주소 입력 :");
		addr2 = sc.nextLine();
		
		addr3 = "("+zipCode+ ")" + " " + addr1 + " " + addr2;
		System.out.println("전체주소는 : " + addr3);
		
		System.out.println("----프로그램 종료----");
	}

	
	public static void phoneNumber() {
		//문제
		//전화번호 입력받고 분리
		//입력 '-' 없이 휴대폰 번호 입력
		//출력 '-' 추가해서 출력
		
		String phoneNumber;
		//	      01034377184
		//index   01234576789
		
		System.out.println("----휴대폰 번호 입력('-' 제외하고 입력)----");
		System.out.print("휴대폰번호 입력> ");
		phoneNumber = sc.nextLine();
		
		//substring(0,3) -> 0번째 index에서 3번째 index 전까지 // 출력 : 010
		System.out.println("휴대폰번호 : " + phoneNumber.substring(0, 3) + " - " + phoneNumber.substring(3, 7) + " - " + phoneNumber.substring(7, 11));
		
	}

	public static void stringIndex() {
		
		/*
		 * 문제
		 * 입력 : 정수 + 정수
		 * 출력 : 첫번째 숫자 + 기호 + 두번째 숫자
		 */
		
		String str;
		int len;
		int index;
		String sub1, sub2, sub3;
		char symbol;
		int sum = 0;
	
		System.out.println("----정수숫자 + 정수숫자 입력하세요----");
		System.out.print("입력> ");
		
		str = sc.nextLine();		//입력 : 100+32
		
		len = str.length();			//입력받은 문자열 길이
		index = str.indexOf('+');	//문자열에서 '+' index

		sub1 = str.substring(0, index);		//100
		sub2 = str.substring(index+1, len);	//32   str.substring(index+1)로 해도 됨, index+1 부터 str 마지막까지 잘라줌
		sub3 = str.substring(index, index+1);
		symbol = str.charAt(index);			//+
			
		
		
		
		//System.out.println("equals(+) : " + sub3.equals("+"));
		
		if(sub3.equals("+")) {
			
			int num1, num2;
			double dNum1, dNum2;
			
			num1 = Integer.parseInt(sub1);
			num2 = Integer.parseInt(sub2);
			
			dNum1 = Double.parseDouble(sub1);
			dNum2 = Double.parseDouble(sub2);
			
			sum =  num1 + num2;	//Integer.parseIng(string);문자열을 정수로 변환해서 계산
			
			System.out.println("double, sum = " + (dNum1 + dNum2));
		}
		
		System.out.println("\n1.1 입력문자열에서 첫번째 숫자> " + sub1);
		System.out.println("1.2 입력문자열에서 기호> " + symbol);
		System.out.println("1.3 입력문자열에서 두번째 숫자 출력> " + sub2);
		System.out.println("2.0 문자로 입력된 숫자를 정수로 변환해서 덧셈 결과 출력> " + sum);
		
		System.out.println("\n----프로그램 종료----\n");
		
	}
	
	public static void calc() {
		/*
		 * 문제
		 * 입력 : 정수 + - * / 정수
		 * 출력 : 첫번째 숫자 + 기호 + 두번째 숫자
		 */
		
		String str;
		int len;
		int index = 0;
		String sub1, sub2;
		char symbol;
		int result = 0;
		
		System.out.println("----정수숫자 '+ - * / ' 정수숫자 입력하세요----");
		System.out.print("입력> ");
		str = sc.nextLine();
		
		len = str.length();
		
		if(str.indexOf('+') != -1) {
			index = str.indexOf('+');
			
		} else if(str.indexOf('-') != -1) {
			index = str.indexOf('-');
			
		} else if(str.indexOf('*') != -1) {
			index = str.indexOf('*');
			
		} else if(str.indexOf('/') != -1) {
			index = str.indexOf('/');
			
		}
		
		sub1 = str.substring(0, index);		
		sub2 = str.substring(index+1, len);
		symbol = str.charAt(index);
				
		System.out.println("1.1 입력문자열에서 첫번째 숫자> " + sub1);
		System.out.println("1.2 입력문자열에서 기호> " + symbol);
		System.out.println("1.3 입력문자열에서 두번째 숫자 출력> " + sub2);

		switch(symbol) {
		
		case '+':
			result = Integer.parseInt(sub1) + Integer.parseInt(sub2);
			break;
		case '-':
			result = Integer.parseInt(sub1) - Integer.parseInt(sub2);
			break;
		case '*':
			result = Integer.parseInt(sub1) * Integer.parseInt(sub2);
			break;
		case '/':
			result = Integer.parseInt(sub1) / Integer.parseInt(sub2);
			break;
		}
		
		System.out.println("결과> " + result);
		
		System.out.println("\n----프로그램 종료----\n");
	}
}
