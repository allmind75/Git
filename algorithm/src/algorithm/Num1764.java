package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Num1764 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> strArray1 = new ArrayList<String>();
		HashSet<String> set = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		int N, M;
		
		N = sc.nextInt();
		M = sc.nextInt();
		sc.nextLine();
		
		
		for(int i=0 ; i<N ; i++) {
			set.add(sc.nextLine());
		}
				
		for(int i=0 ; i<M ; i++) {
			
			String str = sc.nextLine();
			if(set.contains(str)) {
				strArray1.add(str);
			}
			
		}
		
		Collections.sort(strArray1);
		
		System.out.println(strArray1.size());
		for(String s: strArray1) {
			System.out.println(s);
		}
		
		sc.close();
		
	}

}
