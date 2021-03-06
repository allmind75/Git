package algorithm;

import java.util.Scanner;

public class Num1157 {
	/*
	 * 문제
	 * 알파벳 대소문자로 된 단어가 주어지면, 
	 * 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 
	 * 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
	 * 
	 * 입력
	 * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.


	 * 출력
	 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 
	 * 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
	 */
	public static void main(String[] args) {
		
		String s;
		int[] alphabet = new int[26];
		char temp;
		int max = 0;
		char index = 0;
		int length;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		
		s = sc.nextLine();
		length = s.length();
		s = s.toUpperCase();	//대문자로 변경
		
		for(int i=0 ; i<length ; i++) {
			int n;
			temp = s.charAt(i);
			n = temp - 'A';
			alphabet[n]++;
			
			if(alphabet[n] > max) {
				max = alphabet[n];
				index = temp;
			}
		}
		
		for(int i=0 ; i<26 ; i++) {
			if(alphabet[i] == max) {
				cnt++;
			}
		}
		
		if(cnt > 1) {
			System.out.println("?");
		} else {
			System.out.println(index);
		}
		
		
		sc.close();
	}
}
