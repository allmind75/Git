package algorithm;

import java.util.Scanner;

public class Num1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M, N;
		int[] primeNumber = new int[1000001];

		Scanner sc = new Scanner(System.in);

		M = sc.nextInt();
		N = sc.nextInt();

		//√ ±‚»≠
		primeNumber[0] = -1;
		primeNumber[1] = -1;
		
		
		for (int i = 2; i <= Math.sqrt(N); i++) {
			
			if(primeNumber[i] == -1) {
				continue;
			}
			for (int k = i + i; k <= N; k += i) {
				primeNumber[k] = -1;
			}

		}

		for (int i = M; i <= N; i++) {

			if (primeNumber[i] != -1) {
				System.out.println(i);
			}
		}

		sc.close();
	}

}
