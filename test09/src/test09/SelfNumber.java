package test09;

import java.util.ArrayList;

public class SelfNumber {

	/*
	 * Self Number 찾기
	 * 
	 * 어떤 자연수 n이 있을 때, d(n)을 n의 각 자릿수 숫자들과
	 * n 자신을 더한 숫자
	 * 
	 * ex) d(91) = 9 + 1 + 91 = 101
	 * 이때 n을 d(n)의 제네레이터(generator)
	 * 
	 * 제네레이터가 없는 숫자 -> 셀프넘버
	 * ex) 1, 3, 5, 7, 9,  20, 31 . . . . . 
	 * 
	 * 1이상이고 10000보다 작은 셀프 넘버들의 합을 구하라.
	 */
	
	//제네레이터를 만들어서 arrayList에 넣고 contains를 이용해
	//없는 경우의 숫자를 더함
	
	private static ArrayList<Integer> generator;
	
	public static void main(String[] args) {
		
		calcNumber();
		int sum = 0;
		
		for(int i=1 ; i<10000 ; i++) {
			if(!hasGenerator(i)) sum += i;
		}
		
		System.out.println("1이상 ~ 5000미만의 Self Number의 합 :  " + sum);
		
		for(int i=1 ; i<10000 ; i++) {
			if(!hasGenerator(i))
				System.out.println(i);
		}
		

	}
	
	private static boolean hasGenerator(int n) {
		return generator.contains(n);
	}
	
	private static void calcNumber() {
		
		generator = new ArrayList<Integer>();
		
		for(int i=1 ; i<10000 ; i++) {
			
			String s = String.valueOf(i);
			int sum = 0;
			
			for(int j=0 ; j<s.length() ; j++) {
				sum += Integer.parseInt(s.substring(j, j+1));
			}
			
			generator.add(sum+i);
		}
		
	}
}
