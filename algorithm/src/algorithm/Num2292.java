package algorithm;

import java.util.Scanner;

public class Num2292 {

	/*
	 * https://www.acmicpc.net/problem/2292
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		int cnt = 1;
		int j = 0;
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		for(int i=1 ; i<N ; i = i + j*6) {
			cnt++;
			j++;
		}
		System.out.println(cnt);
	
		sc.close();
	}
}
