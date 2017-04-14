package algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Num1427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//정수로 입력받아서 풀기
		int num;
		String s;
		int length;
		Integer[] array;
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		long startTime = System.nanoTime();
		
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
		System.out.println();
		long end = System.nanoTime();
		double second = (end - startTime);
		System.out.println(second);
		
		
		
		
		//문자열 이용해서 풀기
		String str;
		Scanner sc2 = new Scanner(System.in);
		
		str = sc2.nextLine();
		
		long startTime2 = System.nanoTime();
		
		
		char[] array2 = str.toCharArray();	//char 배열로 변경
		
		Arrays.sort(array2);	
		
		str = String.valueOf(array2);	//char 배열을 문자열로 변환
		
		str = new StringBuffer(str).reverse().toString();	//내림차순하기위해 문자열 뒤집기
		
		System.out.println(str);
		
		long end2 = System.nanoTime();
		double second2 = (end2 - startTime2);
		
		System.out.println();
		System.out.println(second2);
		
		
		sc.close();
		sc2.close();
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
