package tset07;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDataStructure {

	/* [Java Stack]
	 * 
	 * push : stack에 새로운 data 추가
	 * pop  : stack에서 top이 가리키는 데이터 반환
	 * peek : stack에 저장된 top의 값 확인(반환은 안함)
	 * 
	 */
	static Stack<Integer> stack = new Stack<>();
	
	public static void main(String[] args) {
		
		stackPushValues();

		System.out.println("peek() : " + stack.peek());
		
		//stack에 들어있는 값의 수만큼 크기 반환
		System.out.println("size() : " + stack.size());
		
		for(int i=0 ; i<5 ; i++) {
			System.out.println("pop() : " + stack.pop());
		}
		
		System.out.println("peek() : " + stack.peek());
		
		
		stackIsEmpty();
		
		//stack이 empty될 때까지 pop()
		while(true) {
			
			try {
				System.out.println(stack.pop());
			} catch(EmptyStackException e) {
				System.out.println("catch!! stack is empty");
				break;
			}
		}
		
		stackPushValues();
		
		//stack안의 모든 요소 제거
		stack.clear();
		
		stackIsEmpty();
	}
	
	static void stackPushValues() {
		for(int i=0 ; i<10 ; i++) {
			stack.push(i);
		}	
	}
	
	static void stackIsEmpty() {
		//stack.isEmpty() : stack이 비어있으면 true, 아니면 false 반환
		if(stack.isEmpty()) {
			System.out.println("stack is empty");
		} else {
			System.out.println("staic is not empty");
		}	
	}
}
