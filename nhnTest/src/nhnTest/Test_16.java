package nhnTest;

import java.util.Arrays;
import java.util.Scanner;

public class Test_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test_16 t = new Test_16();
		
		t.solution01();
	}

	public static void solution01() {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		long[] p = new long[N];
		
		for(int i=0 ; i<N ; i++) {
			p[i] = scan.nextLong();
		}
		
		Arrays.sort(p);
		
		long min_dist = p[1] - p[0];
		int min_left = 0;
		
		for(int i=0 ; i<N-1 ; i++) {
			
			int left = i;
			int right = i+1;
			long dist = p[right] - p[left];
			
			if(dist < min_dist) {
				min_dist = dist;
				min_left = i;
			}
		}
		
		System.out.println(p[min_left] + " " + p[min_left + 1]);
		scan.close();
	}
	
	public static void solution02() {
		
	}
}
