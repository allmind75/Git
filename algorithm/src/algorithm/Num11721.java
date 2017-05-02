package algorithm;

import java.util.Scanner;

public class Num11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		char[] temp;
		int length;
		Scanner sc = new Scanner(System.in);
		
		str = sc.nextLine();
		length = str.length();
		temp = str.toCharArray();
		
		for(int i=0 ; i<length ; i++) {
			
			System.out.print(temp[i]);
			if((i+1)%10 == 0) {
				System.out.println();
			}
		}
		
		sc.close();
	}

}
