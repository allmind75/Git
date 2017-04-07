package algorithm;

import java.util.Scanner;

public class MiniNum {

	/*
	 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이 때, 
	 * A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
	 * 
	 * 입력
	 * 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
	 * 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 
	 * 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
	 * 
	 * 출력
	 * X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. 
	 * X보다 작은 수는 적어도 하나 존재한다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N, X;
		int i = 0;
		int[] array = new int[10000];
		String line;
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2;
		
		N = sc1.nextInt();
		X = sc1.nextInt();
		sc1.nextLine();
		
		if(sc1.hasNext()) {
			line = sc1.nextLine();
			sc2 = new Scanner(line).useDelimiter(" ");
			
			while(sc2.hasNext()) {
				array[i] = sc2.nextInt();
				i++;
			}
			sc2.close();
		}
		
		for(int j=0 ; j<N ; j++) {
			if(array[j] < X) {
				System.out.print(array[j] + " ");
			}
		}
		sc1.close();
		
		System.out.println();
	}

}
