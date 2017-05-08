package algorithm;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Stack;

public class Num9012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int T;
		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();
		sc.nextLine();

		for (int t = 0; t < T; t++) {

			Stack<Character> stack = new Stack<>();
			String input;
			char[] temp;
			int length;
			boolean flag = true;

			input = sc.nextLine();
			length = input.length();
			temp = new char[length];
			temp = input.toCharArray();

			for (int i = 0; i < length; i++) {

				if (temp[i] == '(') {
					stack.push(temp[i]);

				} else if (temp[i] == ')') {

					try {
						
						if (stack.peek() == '(') {
							stack.pop();
						} else {
							flag = false;
							break;
						}

					} catch (EmptyStackException e) {
						flag = false;
						break;
					}
				}
			}

			if (stack.isEmpty() && flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

		sc.close();

	}

}
