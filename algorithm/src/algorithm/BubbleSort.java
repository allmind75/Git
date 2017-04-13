package algorithm;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N;
		int[] array;
		
		N = sc.nextInt();
		array = new int[N];
		
		for(int i=0 ; i<N ; i++) {
			array[i] = sc.nextInt();
		}
				
		for(int i=N-1 ; i>0 ; i--) {
			System.out.print("\n 버블정렬 " + (N-i) + "단계");
			for(int j=0 ; j<i ; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				System.out.printf("\n\t");
				for(int n: array) {
					System.out.printf("%3d", n);
				}
			}
			System.out.println();			
		}
		
		for(int i=0 ; i<N ; i++) {
			System.out.println(array[i]);
		}
		sc.close();
	}

}
