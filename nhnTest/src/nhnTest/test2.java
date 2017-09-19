package nhnTest;

import java.util.Scanner;

public class test2 {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test2 t = new test2();
		
		int n;
		n = scan.nextInt();
		
		System.out.println(t.F(n, 1));
		
	}

	public int F(int n, int cnt) {
		
		//F(n) = n + R(n)
		//4자리 이내의 팰린드론
		//3번 이내의 연산
		//10000미만
		  
		if(cnt > 3) {
			return -1;
		}
			
		if(n >= 10000) {
			return -1;
		}
		
		if(palindromeCheck(n)) {
			return n;
		}
		cnt++;
		return F((n + reverseInt(n)), cnt);
	}
	
	public int reverseInt(int n) {
	
		String strN = Integer.toString(n);
		
		strN = new StringBuffer(strN).reverse().toString();
		
		return Integer.parseInt(strN);		
	}
	
	public boolean palindromeCheck(int n) {
		
		int[] arr = new int[4];
		int idx = 0;
		while(n > 0) {
			arr[idx++] = n % 10;
			n = n / 10;
		}
		
		for(int i=0 ; i<idx/2 ; i++) {
			if(arr[i] == arr[--idx]) {
				continue;
			} else {
				return false;
			}
		}
		
		return true;
	}
}
