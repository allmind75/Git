package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Num11656 {

	public static void main(String[] args) {
		
		String str;
		ArrayList<String> strList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		str = sc.nextLine();
		
		for(int i=0 ; i<str.length() ; i++) {
			strList.add(str.substring(i, str.length()));
		}
		
		Collections.sort(strList);
		
		for(String s: strList) {
			System.out.println(s);
		}
		sc.close();
	}
}
