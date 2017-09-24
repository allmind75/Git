package nhnTest;

import java.util.Scanner;

public class Test_17_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test_17_01 m = new Test_17_01();
		
		m.solution();
	}
	
	public static void solution() {
		
		Scanner scan = new Scanner(System.in);
		int N;
		int[][] tMatrix = {};
		
		N = scan.nextInt();
		scan.nextLine();
		
		tMatrix = new int[N][N];
		
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<N ; j++) {
				
				int num = scan.nextInt();
				
				tMatrix[j][i] = num;
			}
			scan.nextLine();
		}
		
		for(int i=0; i<N ; i++) {
			for(int j=0 ; j<N ; j++) {
				System.out.print(tMatrix[i][j]);
				
				if(j < N-1) System.out.print(" ");
			}
			System.out.println();
		}
	}

}
