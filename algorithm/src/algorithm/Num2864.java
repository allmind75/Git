package algorithm;

import java.util.Scanner;

public class Num2864 {

	public static int max = 0;
	public static int min = 9999999; 
	
	public static void minMax(int n) {
		
		if(n > max) {
			max = n;
		} else {
			if(n < min) {
				min = n;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strN1, strN2;
		char[] temp;
		
		Scanner sc = new Scanner(System.in);
		
		strN1 = sc.nextLine();
		strN2 = sc.nextLine();
		
		for(int i=0 ; i<strN1.length() ; i++) {
			
			int sum;
			
			temp = strN1.toCharArray();
			if(temp[i] == '5') {
				temp[i] = '6';
			}
				

		}
		
		sc.close();
	}
	
	
}
