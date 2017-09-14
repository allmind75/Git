package algorithm;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InsertionSort main = new InsertionSort();
		
		int[] arr2 = new int[]{20, 19, 14, 16, 18};
		int[] result;
		
		System.out.println(Arrays.toString(arr2));
		
		main.insertionSort(arr2);
		
		System.out.println(Arrays.toString(arr2));
		
		
		
	}

	public int[] insertionSort(int[] arr) {
		
		for(int idx = 1 ; idx < arr.length ; idx++) {
			
			int temp = arr[idx];
			int size = idx - 1;
			
			while( (size >= 0) && (arr[size] > temp) ) {
				
				arr[size + 1] = arr[size];
				size--;
			}
			
			arr[size + 1] = temp;
		}
		
		return arr;
	}
}
