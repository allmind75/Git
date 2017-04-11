package algorithm;

import java.util.Scanner;

public class Num2941 {

	/*
	 * https://www.acmicpc.net/problem/2941
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s;
		int cnt = 0;
		int length;

		s = sc.nextLine();
		length = s.length();

		for (int i = 0; i < length; i++) {

			if (i + 1 < length) {

				if (s.substring(i, i + 2).equals("c=")) {
					cnt++;
					i++;
				} else if (s.substring(i, i + 2).equals("c-")) {
					cnt++;
					i++;
				} else if (s.charAt(i) == 'd' && s.charAt(i+1) == 'z' && s.charAt(i+2) == '=') {
					cnt++;
					i+=2;
				} else if(s.charAt(i) == 'd' && s.charAt(i+1) == '-') {
					cnt++;
					i++;
				} else if (s.substring(i, i + 2).equals("lj")) {
					cnt++;
					i++;
				} else if (s.substring(i, i + 2).equals("nj")) {
					cnt++;
					i++;
				} else if (s.substring(i, i + 2).equals("s=")) {
					cnt++;
					i++;
				} else if (s.substring(i, i + 2).equals("z=")) {
					cnt++;
					i++;
				} else {
					cnt++;
				}
			} else if (s.charAt(i) == '=' || s.charAt(i) == '-') {
				break;
			} else {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
