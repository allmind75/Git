package nhnTest;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Test01 {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test01 t = new Test01();
		
		t.solution();
	}
	
	public static void solution() {
		
		int T;
		
		
		T = scan.nextInt();
		scan.nextLine();
		
		for(int t=0 ; t<T ; t++) {
			
			Stack<Character> stack = new Stack<>();
			boolean flag = true;
			String str = scan.nextLine();
			int len = str.length();
			char[] temp = new char[len];
			
			temp = str.toCharArray();
			
			for(int i=0 ; i<len ; i++) {
				
				if(temp[i] == '(' || temp[i] == '{' || temp[i] == '[') {
					stack.push(temp[i]);
				} else if(temp[i] == ')') {
					
					try {
						if(stack.peek() == '(') stack.pop();
						else {
							flag = false;
							break;
						}
					} catch(EmptyStackException e) {
						flag = false;
						break;
					}
				} else if(temp[i] == '}') {
					
					try {
						if(stack.peek() == '{') stack.pop();
						else {
							flag = false;
							break;
						}
					} catch(EmptyStackException e) {
						flag = false;
						break;
					}
				} else if(temp[i] == ']') {
					
					try {
						if(stack.peek() == '[') stack.pop();
						else {
							flag = false;
							break;
						}
					} catch(EmptyStackException e) {
						flag = false;
						break;
					}
				}
			}
			
			if(stack.isEmpty() && flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
