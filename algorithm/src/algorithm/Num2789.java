package algorithm;

import java.util.Scanner;

public class Num2789 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		char[] cam = new char[]{'C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E'};
		char[] temp;
		int length;
		Scanner sc = new Scanner(System.in);
		
		str = sc.nextLine();
		length = str.length();
		temp = new char[length];
		temp = str.toCharArray();
		
		for(int i=0 ; i<length ; i++) {
			
			boolean flag = true;
			
			for(int j=0 ; j<cam.length ; j++) {
				if(temp[i] == cam[j]) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.print(temp[i]);
			}
		}
		System.out.println();
		sc.close();
	}

}
