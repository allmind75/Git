package algorithm;

import java.util.Scanner;

public class Num10769 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		char[] temp;
		int length;
		Scanner sc = new Scanner(System.in);
		int happyCnt = 0;
		int sadCnt = 0;
		
		str = sc.nextLine();
		length = str.length();
		temp = new char[length];
		temp = str.toCharArray();
		
		for(int i=0 ; i<length-2 ; i++) {
			
			if(temp[i] == ':' && temp[i+1] == '-' && temp[i+2] == ')') {
				happyCnt++;
			} else if(temp[i] == ':' && temp[i+1] == '-' && temp[i+2] == '(') {
				sadCnt++;
			}
		}
		
		if(happyCnt == 0 && sadCnt == 0) {
			System.out.println("none");
		} else if(happyCnt == sadCnt) {
			System.out.println("unsure");
		} else if(happyCnt > sadCnt) {
			System.out.println("happy");
		} else {
			System.out.println("sad");
		}
		
		sc.close();
		
	}

}
