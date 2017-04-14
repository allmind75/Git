package algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Num1427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		String s;
		int length;
		Integer[] array;
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		s = String.valueOf(num);
		length = s.length();
		
		array = new Integer[length];
		
		for(int i=0 ; i<length ; i++) {
			
			int ten = 1;
			
			for(int j=i ; j<length - 1 ; j++) {
				ten *= 10;
			}
			
			array[i] = num / ten;
			num -= array[i] * ten;
		}
		
		Arrays.sort(array, new CompareIntSort());
		
		for(Integer i: array) {
			System.out.print(i);
		}
		
		sc.close();
	}
	
	public static class CompareIntSort implements Comparator<Integer> {

		@Override
		public int compare(Integer a, Integer b) {
			
			if(a > b) {
				return -1;
			} else if(a == b) {
				return 0;
			} else {
				return 1;
			}
		}
	}


}
