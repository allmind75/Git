package algorithm;

import java.util.Scanner;

public class Num2857 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		int length;
		char[] temp;
		int[] result = new int[5];
		int flag = 0;
		boolean check = false;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			
			str = sc.nextLine();
			length = str.length();
			temp = new char[length];
			temp = str.toCharArray();
			
			if (str.contains("FBI")) {
				for (int j = 0; j < length; j++) {
					
					if((65 <= (int)temp[j] && (int)temp[j] <= 90) || temp[j] == '-' || (48 <= (int)temp[j] && (int)temp[j] <= 57)) {
						check = true;
					} else {
						check = false;
						flag++;
						break;
					}
					
				}
				
				if(check) {
					result[i] = i+1;
				}
				
			} else {
				flag++;
			}

		}
		
		if(flag == 5) {
			System.out.println("HE GOT AWAY!");
		} else {
			for(int i=0 ; i<5 ; i++) {
				if(result[i] != 0) {
					System.out.print(result[i] + " ");
				}
			}
		}
		sc.close();
	}

}
