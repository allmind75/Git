package algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num10845 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> queue = new LinkedList();
		int N;
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		sc.nextLine();
		
		for(int i=0 ; i<N ; i++) {
			
			String input;
			input = sc.nextLine();
			String[] temp = input.split("\\s");
			
			switch(temp[0]) {
			case "push":
				queue.offer(Integer.parseInt(temp[1]));
				break;
			case "pop":
				System.out.println(queue.remove());
				break;
			case "size":
				System.out.println(queue.size());
				break;
			case "empty":
				if(queue.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			case "front":
				if(queue.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(queue.peek());
				}
				break;
			case "back":
				
				break;
			}
			
		}
		
	}

}
