package tset07;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDataStructure {

	/* [Java Stack]
	 * 
	 * push : stack�� ���ο� data �߰�
	 * pop  : stack���� top�� ����Ű�� ������ ��ȯ
	 * peek : stack�� ����� top�� �� Ȯ��(��ȯ�� ����)
	 * 
	 */
	static Stack<Integer> stack = new Stack<>();
	
	public static void main(String[] args) {
		
		stackPushValues();

		System.out.println("peek() : " + stack.peek());
		
		//stack�� ����ִ� ���� ����ŭ ũ�� ��ȯ
		System.out.println("size() : " + stack.size());
		
		for(int i=0 ; i<5 ; i++) {
			System.out.println("pop() : " + stack.pop());
		}
		
		System.out.println("peek() : " + stack.peek());
		
		
		stackIsEmpty();
		
		//stack�� empty�� ������ pop()
		while(true) {
			
			try {
				System.out.println(stack.pop());
			} catch(EmptyStackException e) {
				System.out.println("catch!! stack is empty");
				break;
			}
		}
		
		stackPushValues();
		
		//stack���� ��� ��� ����
		stack.clear();
		
		stackIsEmpty();
	}
	
	static void stackPushValues() {
		for(int i=0 ; i<10 ; i++) {
			stack.push(i);
		}	
	}
	
	static void stackIsEmpty() {
		//stack.isEmpty() : stack�� ��������� true, �ƴϸ� false ��ȯ
		if(stack.isEmpty()) {
			System.out.println("stack is empty");
		} else {
			System.out.println("staic is not empty");
		}	
	}
}
