package algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num1260_dfs_bfs {

	/*
	 * https://www.acmicpc.net/problem/1260
	 */
	
	static int[][] graph;
	static boolean visited[];
	static int N;
	static int E;
	static int startPoint;
	
	public static void dfs(int i) {
		visited[i] = true;
		System.out.print(i + " ");
		
		for(int j=1 ; j<=N ; j++) {
			//System.out.println("search - (" + i + ", " + j + ")");
			
			if(graph[i][j] == 1 && visited[j] == false) {
				
				//System.out.println("\tfind - (" + i + ", " + j + ")");
				dfs(j);
			}
		}
	}
	
	
	public static void bfs(int i) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(i);
		visited[i] = true;
		System.out.print(i + " ");
		
		int temp;
		while(!q.isEmpty()) {
			temp = q.poll();
			for(int j=1 ; j <= N ; j++) {
				
				//System.out.println("\nsearch - (" + temp + ", " + j + ")");

				if(graph[temp][j] == 1 && visited[j] == false) {
					
					//System.out.println("\tfind - (" + temp + ", " + j + ")");

					q.offer(j);
					visited[j] = true;
					System.out.print(j + " ");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		
		graph = new int[1001][1001];
		visited = new boolean[10001];
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		E = sc.nextInt();
		startPoint = sc.nextInt();
		
		
		//DFS
		for(int i=1 ; i<=E ; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			graph[a][b] = graph[b][a] = 1;
		}
		
		dfs(startPoint);
		
		
		//BFS
		for(int i=1 ; i <= N ; i++) {
			visited[i] = false;
		}
		
		System.out.println();
		
		bfs(startPoint);
		sc.close();
	}

}
