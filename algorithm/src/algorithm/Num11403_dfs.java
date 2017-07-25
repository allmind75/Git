package algorithm;

import java.util.Scanner;

public class Num11403_dfs {

	/*
	 * https://www.acmicpc.net/problem/11403
	 */
	public static int N;
	public static int[][] graph = new int[100][100];
	public static int[][] result = new int[100][100];
	public static int[] visited = new int[100];

	public static void dfs(int V) {

		for (int i = 0; i < N; i++) {
			if (graph[V][i] == 1 && visited[i] == 0) {
				visited[i] = 1;
				System.out.print("[" + i + "]" + " ");
				dfs(i);
			}
			System.out.println("");
		}
	}

	public static void initVisited() {
		for(int i=0 ; i<N ; i++) {
			visited[i] = 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int n = sc.nextInt();
				graph[i][j] = n;
			}
		}

		//모든 점들에 대해 dfs 실행
		for (int i = 0; i < N; i++) {
			
			initVisited();
			dfs(i);
			
			for(int j=0 ; j<N ; j++)
				result[i][j] = visited[j];
		}

		print();
		
		sc.close();
	}

	public static void print() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

}
