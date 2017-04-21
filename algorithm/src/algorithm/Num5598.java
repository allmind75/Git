package algorithm;

import java.util.Scanner;

public class Num5598 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		char[] temp;
		
		Scanner sc = new Scanner(System.in);
		
		str = sc.nextLine();
		temp = str.toCharArray();
		
		for(int i=0 ; i<temp.length ; i++) {
			int t = temp[i];
			
			if(65<= t && t<=67) {
				t += 23;
			} else {
				t -= 3;
			}
			temp[i] = (char) t;
			
		}
		
		str = String.valueOf(temp);
		System.out.println(str);

		sc.close();
	}

}
