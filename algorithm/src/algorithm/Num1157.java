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
		boolean flag = false;
		int index = 0;
		
		Scanner sc = new Scanner(System.in);
		
		s = sc.nextLine();
		
		for(int i=0 ; i<s.length() ; i++) {
			int n;
			s = s.toUpperCase();
			temp = s.charAt(i);
			n = temp - 'A';
			alphabet[n] += 1;
		}
		
		for(int i=0 ; i<alphabet.length ; i++) {
			if(alphabet[i] > max) {
				max = alphabet[i];
				index = i;
			} else if(alphabet[i] == max) {
				flag = true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("?");
		} else {
			char c = (char) (65 + index);
			System.out.println(c);
		}
		sc.close();
	}
}
