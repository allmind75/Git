package algorithm;

import java.util.Scanner;

public class Num1065 {

	/*
	 * 어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 
	 * 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 
	 * 차이가 일정한 수열을 말한다. N이 주어졌을 때, 
	 * 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 
	 * 프로그램을 작성하시오. 
	 * 
	 * 입력
	 * 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
	 * 
	 * 출력
	 * 첫째 줄에 1보다 크거나 같고,
	 * N보다 작거나 같은 한수의 개수를 출력한다.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N;
		int result = 0;
		String s;
		String a, b, c;
		int n1, n2;
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		for(int i=1 ; i<=N ; i++) {
			if(i < 100) {
				result++;
				continue;
			} else {
				s = Integer.toString(i);
				a = s.substring(0, 1);
				b = s.substring(1, 2);
				c = s.substring(2, 3);
				
				n1 = Integer.parseInt(a) - Integer.parseInt(b);
				n2 = Integer.parseInt(b) - Integer.parseInt(c);
				
				if(n1 == n2) {
					result++;
				}
				
				
			}
		}
		
		System.out.println(result);
		
		sc.close();
	}

}
