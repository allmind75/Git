package algorithm;

import java.util.HashMap;
import java.util.Scanner;

public class Num1620 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N, M;
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> poketmonList1 = new HashMap<Integer, String>();
		HashMap<String, Integer> poketmonList2 = new HashMap<String, Integer>();
		
		N = sc.nextInt();
		M = sc.nextInt();
		sc.nextLine();
		
		for(int i=0 ; i<N ; i++) {
			String str = sc.nextLine();
			poketmonList1.put(i, str);
			poketmonList2.put(str, i);
		}
		
		for(int i=0 ; i<M ; i++) {
			String str = sc.nextLine();
			char[] temp = str.toCharArray();
			if(65 <= temp[0] && temp[0] <= 90) {
				System.out.println(poketmonList2.get(str)+1);
			} else {
				int num = Integer.valueOf(str);
				System.out.println(poketmonList1.get(num-1));
			}
		}
		
		sc.close();
	}

}
