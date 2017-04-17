package algorithm;

import java.util.Scanner;

public class Num1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		int[] numbers;

		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		numbers = new int[N];
		
		for(int i=0 ; i<N ; i++) {
			numbers[i] = sc.nextInt();
		}
		
		System.out.println(primeNumber(numbers));
		sc.close();
	}
	
	
	public static int primeNumber(int[] numbers) {
		
		int count = 0;
		
		for(int i=0 ; i<numbers.length ; i++) {
			int c = -1;
			
			for(int j=1 ; j<=numbers[i] ; j++) {
				if(numbers[i] == 1) {
					continue;
				}else if(numbers[i] % j == 0) {
					c++;
				}
			}
			
			if(c < 2 && c != -1) {
				count++;
			}
		}
		
		return count;
	}
	
	

}
