package algorithm;

import java.util.Scanner;

public class Num10988 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		StringBuffer strBuf;
		
		Scanner sc = new Scanner(System.in);
		
		str = sc.nextLine();
		
		strBuf = new StringBuffer(str);
		
		if(str.equals(strBuf.reverse().toString())) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		sc.close();
		
	}

}
