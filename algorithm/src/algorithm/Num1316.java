package algorithm;

import java.util.Scanner;

public class Num1316 {

	/*
	 * https://www.acmicpc.net/problem/1316
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		Scanner sc = new Scanner(System.in);
		int wordCnt = 0;

		N = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < N; i++) {

			int length;
			boolean flag = true;
			char[] arrayChr;
			boolean[] alphabet = new boolean[26];
			String s;
			
			s = sc.nextLine();
			length = s.length();
					
			arrayChr = new char[length];
			arrayChr = s.toCharArray();

			for (int j = 0; j < length; j++) {

				int temp = arrayChr[j] - 'a';

				if (j + 1 < length) {
					if (!alphabet[temp]) {
						if (arrayChr[j] != arrayChr[j + 1]) {
							alphabet[temp] = true;
						}
					} else {
						flag = false;
						break;
					}
				} else {
					if (length != 1) {
						if (arrayChr[j - 1] != arrayChr[j]) {
							if (alphabet[temp]) {
								flag = false;
							}
						}
					}
				}
			}

			if (flag) {
				wordCnt++;
			}
		}

		System.out.println(wordCnt);

		sc.close();
	}

}
