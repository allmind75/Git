package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Num1181 {

	/*
	 * https://www.acmicpc.net/problem/1181
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s = null;
		int N;
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		sc.nextLine();
		s = new String[N];
		
		for(int i=0 ; i<N ; i++) {
			s[i] = sc.nextLine();
		}
		

		sc.close();
	}

}
