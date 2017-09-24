package nhnTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Queue<Character> queue = new LinkedList<>();
		int size = 0;
		boolean flag = false;
		
		String input = scan.nextLine();

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == ' ') {
				continue;
			} else {				
				if(size < 3) {
					queue.add(c);
					size++;
				} else {
					if(c != queue.peek()) {
						System.out.println(queue.peek());
						flag = true;
					}
					queue.remove();
					queue.add(c);
				}
			}
		}
		
		if(!flag) {
			System.out.println(0);
		}

	}

}
