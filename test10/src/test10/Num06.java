package test10;

import java.util.Arrays;

public class Num06 {

	public static void main(String[] args) {
		System.out.println("[문제. 6]");

		Integer[] array = new Integer[] { 10, 45, 1, 3, 100, -10, 200, 5 };
		int[] array2 = new int[] { 10, 45, 1, 3, 100, -10, 200, 5};
		int[] array3 = new int[] { 10, 45, 1, 3, 100, -10, 200, 5};
		
		int length = array3.length;
		
		for(int i=length-1; i>=0 ; i--) {
			for(int j=0 ; j<i ; j++) {
				if(array3[j] > array3[j+1]) {
					int temp = array3[j];
					array3[j] = array3[j+1];
					array3[j+1] = temp;
				}
			}
		}

		System.out.print("결과(버블정렬, 오름차순) : ");
		for(int n: array3) {
			System.out.print(n + " ");
		}
		System.out.println();

		Arrays.sort(array2);
		System.out.println("결과(오름차순) : " + Arrays.toString(array2));
		
		Arrays.sort(array, new CompareIntSort());
		System.out.println("결과(내림차순) : " + Arrays.toString(array));
	

		
	}
	
	
}
