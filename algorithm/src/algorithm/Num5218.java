package algorithm;

import java.util.Scanner;

public class Num5218 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int T;
		String str1, str2;
		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();
		sc.nextLine();

		for (int t = 0; t < T; t++) {
			
			str1 = sc.next();
			str2 = sc.next();
			
			char[] char1 = new char[str1.length()];
			char[] char2 = new char[str2.length()];
			
			char1 = str1.toCharArray();
			char2 = str2.toCharArray();
			
			System.out.print("Distances: ");
			for(int i=0 ; i<char1.length ; i++) {
				
				int t1 = char1[i] - 64;
				int t2 = char2[i] - 64;
								
				if(t1 > t2) {
					System.out.print(((t2+26) - t1));
				} else {
					System.out.print(t2 -t1);
				}
				
				if(i == char1.length - 1) {
					continue;
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		sc.close();
	}

}
