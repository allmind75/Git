package algorithm;

import java.util.Scanner;

public class Num10451_dfs {

	public static int T;
	public static int N;
	public static int count;
	
	public static int[][] graph = new int[1002][1002];
	public static int[] visited = new int[1002];
	
	public static boolean dfs(int v) {
		
		boolean flag = false;
		
		for(int i=1 ; i<=N ; i++) {
			if(graph[v][i] == 1 && visited[i] == 0) {
				visited[i] = 1;
				dfs(i);
				flag = true;
			}
		}
		
		return flag;
	}
	
	public static void initVisited() {
		for(int i=1 ; i<=N ; i++) {
			visited[i] = 0;
		}
	}
	
	public static void initGraph() {
		for(int i=1 ; i<=N ; i++) {
			for(int j=1 ; j<=N ; j++) {
				graph[i][j] = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		
		for(int t=0 ; t<T ; t++) {
			
			initGraph();
			initVisited();
			count = 0;
			
			//INPUT
			N = sc.nextInt();
			for(int i=1 ; i<=N ; i++) {
				
				int num = sc.nextInt();
				graph[i][num] = 1;
			}
			
			//PROCESS
			for(int i=1 ; i<=N ; i++) {
				
				if(dfs(i)) count++;
			}
			
			
			System.out.println(count);
			
		}
		
		sc.close();
	}	

}
