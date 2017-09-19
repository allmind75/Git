package nhnTest;

import java.util.Arrays;
import java.util.Scanner;

public class test3 {

	private static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		solution();
		
	}

	public static void solution() {
		
		String input;	
		
		input = scan.nextLine();		
		
		String[] arry = input.split(" ");
		int len = arry.length;
		int r1 = 0, r2 = 0;
		
		for(int i=0 ; i<len ; i++) {
			
			String str = arry[i];
			char[] temp = str.toCharArray();
			int len2 = temp.length;
			
			//1
			for(int j=0 ; j<len2 ; j++) {
				
			}

		}
		
	}
}
