package algorithm;

import java.util.Scanner;

public class Num2667_dfs {

	public static int N;
	public static int[][] graph = new int[26][26];
	
	public static int dfs(int v, int cnt) {
		
		boolean flag = false;
		
		for(int i=0 ; i<N ; i++) {
			if(graph[v][i] == 1) {
				dfs(i, cnt++);
				flag = true;
			}
		}
		if(flag) {
			return cnt;
		} else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		int[] countArr = new int[26];
		int index = 0;
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		sc.nextLine();
		
		for(int i=0 ; i<N ; i++) {
			String str = sc.nextLine();
			char[] strArray = str.toCharArray();
			
			for(int j=0 ; j<str.length() ; j++) {
				graph[i][j] = (int) strArray[j] - 48;
			}
		}
		
		//PROCESS
		
		for(int i=0 ; i<N ; i++) {
			int temp = dfs(i, 0);
			if(temp != -1) {
				count++;
				countArr[index++] = temp;
			}
		}
		
		System.out.println(count);
		for(int i=0 ; i<index ; i++) {
			System.out.println(countArr[i]);
		}
		
		sc.close();
	}
	
	public static void print() {
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<N ; j++) {
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}
	}

}
