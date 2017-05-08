package algorithm;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Num10828 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack = new Stack<>();
		int N;
		String input;
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		sc.nextLine();

		for (int t = 0; t < N; t++) {

			String[] strArray = new String[2];

			input = sc.nextLine();
			strArray = input.split("\\s");

			switch (strArray[0]) {
			case "push":
				stack.push(Integer.parseInt(strArray[1]));
				break;
			case "pop":
				try {
					System.out.println(stack.pop());
				} catch (EmptyStackException e) {
					System.out.println(-1);
				}
				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "empty":
				if (stack.empty()) {
					System.out.println(1);
				} else {
					;
					System.out.println(0);
				}
				break;
			case "top":
				try {
					System.out.println(stack.peek());
				} catch (EmptyStackException e) {
					System.out.println(-1);
				}
				break;
			}

		}

		sc.close();
	}

}
