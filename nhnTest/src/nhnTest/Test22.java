package nhnTest;

import java.util.Arrays;
import java.util.Scanner;

public class Test22 {


	private static int[][] arr;
	private static int[] count = new int[100];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		int[] result;
		int N = scan.nextInt();
		scan.nextLine();
		
		arr = new int[N+2][N+2];
		
		//INPUT
		for(int i=1 ; i<= N ; i++) {
			for(int j=1 ; j<=N ; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		//PROCESS
		for(int i=1 ; i<= N ; i++) {
			for(int j=1 ; j<= N; j++) {
				if(arr[i][j] == 1) {
					dfs(i, j , cnt);
					cnt++;
				}
			}
		}
		
		result = new int[cnt];
		for(int i=0 ; i<cnt ; i++) {
			result[i] = count[i];
		}
		
		System.out.println(cnt);
		Arrays.sort(result);
		for(int i=0 ; i<cnt ; i++) {
			System.out.print(result[i]);
			if(i < cnt - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
		scan.close();
	}

	public static void dfs(int a, int b, int cnt) {
	
		if(arr[a][b] != 1) {
			return;
		} else {
			arr[a][b] = 0;
			count[cnt]++;
		}
		
		dfs(a + 1, b, cnt);
		dfs(a - 1, b, cnt);
		dfs(a, b + 1, cnt);
		dfs(a, b - 1, cnt);
	}
}
