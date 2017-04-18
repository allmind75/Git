package algorithm;

import java.util.Scanner;

public class Num13241 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N;
		int[] array;
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		sc.nextLine();
		
		array = new int[N];
		
		for(int i=0 ; i<N ; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int i=0 ; i<N-1 ; i++) {
			int g = gcd(array[0], array[i+1]);
			System.out.println(array[0]/g + "/" + array[i+1]/g);
		}
		sc.close();
	}
	
	public static int gcd(int a, int b) {
		if(b == 0) 
			return a;
		return gcd(b, a%b);
	}

}
