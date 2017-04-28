package algorithm;

import java.util.Scanner;

public class Num5586 {

	public static void main(String[] args) {

		String str;
		char[] charArray;
		int iCnt = 0;
		int jCnt = 0;
		int length;

		Scanner sc = new Scanner(System.in);

		str = sc.nextLine();
		length = str.length();
		charArray = new char[length];
		charArray = str.toCharArray();

		for (int i = 0; i < length-2; i++) {

			if(charArray[i] == 'J' && charArray[i+1] == 'O' && charArray[i+2] == 'I') {
				jCnt++;
			} else if(charArray[i] == 'I' && charArray[i+1] == 'O' && charArray[i+2] == 'I') {
				iCnt++;
			}
 
		}
		
		System.out.println(jCnt);
		System.out.println(iCnt);
		sc.close();

	}
}
