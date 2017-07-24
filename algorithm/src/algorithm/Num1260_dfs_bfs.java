package algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num1260_dfs_bfs {

	/*
	 * https://www.acmicpc.net/problem/1260
	 */
	
	public static int N, M, V;
	public static int x, y;
	
	public static int[][] graph = new int[1001][1001];
	public static boolean visited[] = new boolean[10001];
	
	public static void DFS(int V) {
		
		System.out.print(V + " ");
		visited[V] = true;
		
		for(int i=1 ; i<=N ; i++) {
			if(graph[V][i] == 1 && visited[i] == false) {
				DFS(i);
			}
		}
	}
	
	public static void BFS(int V) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		int out;
		
		//ť�� ������ �߰�
		queue.offer(V);
		visited[V] = true;
		System.out.print(V + " ");
		
		//ť�� ���� ���������� ����
		while(!queue.isEmpty()) {
			//ť���� �� ������
			out = queue.poll();
			
			for(int i=1 ; i<= N ; i++) {
				if(graph[out][i] == 1 && visited[i] == false) {
					//�湮���� ���� ã����, ť�� ����
					queue.offer(i);
					visited[i] = true;
					System.out.print(i + " ");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		V = sc.nextInt();
		
		//�� ������ 2���� �迭�� ����
		//������̹Ƿ� graph[x][y] = graph[y][x] = 1 �� ����
		for(int i=1 ; i<=M ; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			graph[x][y] = graph[y][x] = 1;
		}
		
		
		DFS(V);
		
		//reset visited
		for(int i=1 ; i<=N ; i++){
			visited[i] = false;
		}
		
		System.out.println();
		BFS(V);
		
		sc.close();
	
	}

}
