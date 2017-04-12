package algorithm;

import java.util.Scanner;

public class Num1475 {

	/*
	 * https://www.acmicpc.net/problem/1475
	 */
	static int[] num = new int[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String s;
		Scanner sc = new Scanner(System.in);
		int length;
		int result = 0;
		
		s = sc.nextLine();
		length = s.length();
		
		for(int i=0 ; i<length ; i++) {
			String temp = s.substring(i, i+1);
			int index = Integer.parseInt(temp);
			
			if(index == 6 || index == 9) {
				if(num[6] == 0 && num[9] != 0) {
					num[9] -= 1;
				} else if (num[6] != 0 && num[9] == 0){
					num[6] -=1 ;
				} else if(num[6] !=0 && num[9] !=0) {
					num[index] -= 1;
				}else {
					result++;
					buy();
					num[index] -= 1;
				}
			} else {
				if(num[index] == 0) {
					result++;
					buy();
					num[index] -= 1;
				} else {
					num[index] -= 1;
				}
				
			}
		}
		
		System.out.println(result);
		
	}

	public static void buy() {
		for (int i = 0; i < 10; i++) {
			num[i] += 1;
		}
	}
}
