package tset07;

public class TypeArray {
	
	public static void main(String[] args) {
		
		/*
		 * �迭�̶� �ڷ����� ����
		 */
		int[] odds = {1, 3, 5, 7, 9};
		int[] evens = new int[5];
		
		evens[0] = 2;
		evens[1] = 4;
		evens[2] = 6;
		evens[3] = 8;
		evens[4] = 10;
		
		for(int i = 0 ; i < odds.length ; i++) {
			System.out.println("odds : " + odds[i]);
		}
		System.out.println("");
		
		for(int i = 0 ; i < evens.length ; i++) {
			System.out.println("evens : " + evens[i]);
		}
	}
}
