package nhnTest;

import java.util.Scanner;

public class test2015 {

	private Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test2015 s = new test2015();
		
		s.solution();
	}
	
	public void solution() {
		
		int N;
		int[] arr = {};
		int min = 999999;
		int X = 99999, Y = 99999;
		N = scan.nextInt();
		arr = new int[N];
		
		//INPUT
		for(int i=0 ; i<N ; i++) {
			arr[i] = scan.nextInt();
		}
		
		//PROCESS
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<N ; j++) {
				
				int x = arr[i];
				int y = arr[j];
				
				int len = Math.abs(x-y);
				
				
				if(len < min && len != 0) {					
					X = x;
					Y = y;
					
					min = len;

				} else if (len == min && len != 0) {
					if((x+y) < (X+Y)) {
						X = x;
						Y = y;
					}
				}
			}
		}
		
		if(X < Y) {
			System.out.println(X + " " + Y);	
		} else {
			System.out.println(Y + " " + X);
		}		
	}

}
