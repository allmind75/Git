package algorithm;

import java.util.Scanner;

public class Num5622 {

	/*
	 * https://www.acmicpc.net/problem/5622
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int time = 0;
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		
		for(int i=0 ; i<s.length() ; i++) {
			
			char temp = s.charAt(i);

			if(temp == 'A' || temp == 'B' || temp == 'C') {
				time += 3;
			} else if(temp == 'D' || temp == 'E' || temp == 'F') {
				time += 4;
			} else if(temp == 'G' || temp == 'H' || temp == 'I') {
				time += 5;
			} else if(temp == 'J' || temp == 'K' || temp == 'L') {
				time += 6;
			} else if(temp == 'M' || temp == 'N' || temp == 'O') {
				time += 7;
			} else if(temp == 'P' || temp == 'Q' || temp == 'R' || temp == 'S') {
				time += 8;
			} else if(temp == 'T' || temp == 'U' || temp == 'V') {
				time += 9;
			} else {
				time += 10;
			}
		}
		
		System.out.println(time);
	}

}
