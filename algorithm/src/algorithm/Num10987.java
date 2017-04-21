package algorithm;

import java.util.Scanner;

public class Num10987 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] collection = new char[]{'a', 'e', 'i', 'o', 'u'};
		char[] temp;
		String str;
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		
		str = sc.nextLine();
		
		temp = str.toCharArray();
		
		for(int i=0 ; i<temp.length ; i++) {
			for(int j=0 ; j<collection.length ; j++) {
				if(temp[i] == collection[j]) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		
		sc.close();
		
	}

}
