package algorithm;

import java.util.Scanner;

public class Num4948 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {
			n = sc.nextInt();
			
			if( n == 0) {
				run = false;
				break;
			}
			
			System.out.println(primeNumber(n));
		}
		
		
		
		sc.close();
	}
	
	public static int primeNumber(int n) {
		
		int cnt = 0;
		int[] prime = new int[n*2 + 1];
		
		prime[0] = -1;
		prime[1] = -1;
		
		for(int i=2 ; i<=Math.sqrt(n*2) ; i++) {
			if(prime[i] == -1) {
				continue;
			}
			for(int j=i+i ; j<=n*2 ; j+=i) {
				prime[j] = -1;
			}
		}
		
		for(int i=n+1 ; i<n*2+1 ; i++) {
			if(prime[i] != -1) {
				cnt++;
			}
		}
			
		return cnt;
	}

}
