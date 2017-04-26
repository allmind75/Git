package tset07;

import java.util.Arrays;

public class charArrayToString {

	
	public static void main(String[] args) {
		
		char[] charArray1 = {'a', 'b', 'c'};
		char[] charArray2;
		int[] intArray1 = {1, 2, 3};
		
		//char 배열을 String으로 변환
		String str1 = String.valueOf(charArray1);
		String str2 = new String(charArray1);
		
		//Arrays.toString()는 "[ 배열요소, 배열요소, 배열요소 ...]" 형태 문자열 변환
		String str3 = Arrays.toString(intArray1);
		
		//String 문자열을 char 배열로 변환
		charArray2 = str1.toCharArray();
		
		//출력
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("Arrays.toString(charArray1) : " + Arrays.toString(charArray1)); //배열을 문자열로 변환해서 출력
		System.out.print("charArray2 : ");
		for(int i=0 ; i<charArray2.length ; i++) {
			System.out.print(charArray2[i] + " ");
		}
	}
}
