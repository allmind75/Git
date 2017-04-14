package algorithm;

import java.util.Scanner;

public class Num2775 {

	/*
	 * https://www.acmicpc.net/problem/2775
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T;
		int k, n;
		int[][] array = new int[15][15];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0 ; i<15 ; i++) {
			for(int j=0 ; j<15 ; j++) {
				if(i == 0) {
					array[0][j] = j + 1;
				} else {
					int sum = 0;
					for(int x=0 ; x<=j ; x++) {
						sum += array[i-1][x];
					}
					array[i][j] = sum;
				}
			}
			
		}
		
		T = sc.nextInt();
		for(int t=0 ; t<T ; t++) {
			
			k = sc.nextInt();
			n = sc.nextInt();
			
			System.out.println(array[k][n-1]);
		}
		
		sc.close();
	}

}
