package algorithm;

import java.util.Scanner;

public class Num2864 {

	public static String minStr(String str) {
		
		char[] temp = str.toCharArray();
		
		for(int i=0 ; i<str.length() ; i++) {
			
			if(temp[i] == '6') {
				temp[i] = '5';
			}
		}
		
		return String.valueOf(temp);
	}
	
	public static String maxStr(String str) {
		
		char[] temp = str.toCharArray();
		
		for(int i=0 ; i<str.length() ; i++) {
			
			if(temp[i] == '5') {
				temp[i] = '6';
			}
		}
		
		return String.valueOf(temp);
	}
	
	public static int min(String str1, String str2) {
		
		int min;
		
		min = Integer.parseInt(str1) + Integer.parseInt(str2);
		
		return min;
	}
	
	public static int max(String str1, String str2) {
	
		int max;
		
		max = Integer.parseInt(str1) + Integer.parseInt(str2);
		
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strN1, strN2;
		int min = 0, max = 0;
		
		Scanner sc = new Scanner(System.in);
		
		strN1 = sc.next();
		strN2 = sc.next();
		
		min = min(minStr(strN1), minStr(strN2));
		max = max(maxStr(strN1), maxStr(strN2));
		
		System.out.println(min + " " + max);
		
		sc.close();
	}
	
	
}
