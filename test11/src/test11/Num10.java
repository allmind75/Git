package test11;

public class Num10 {

	/*
	 * 문자열이 주어졌을때, 문자열을 배열에 저장고 주어진 문제를 해결하는 프로그램 작성
	 * "복숭아", "딸기", "포도", "수박"
	 * 
	 *1. 위에서 저장한 문자열 배열을 전달 받아서, 배열에 있는 스트링을 출력하는 함수를 작성
	 *
	 *2. 전달된 배열을 역순으로 다른 배열에 저장하고, 역순 배열을 반환하시
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] fruit = new String[] {"복숭아", "딸기", "포도", "수박"};
		String[] fruitReverse = new String[fruit.length];
		
		printFruit(fruit);
		fruitReverse = strArrayReverse(fruit);
		
		printFruit(fruitReverse);
		
	}
	
	public static void printFruit(String[] fruit) {
		
		for(String s: fruit) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
	
	public static String[] strArrayReverse(String[] fruit) {
		
		String[] fruitReverse = new String[fruit.length];
		int index = fruit.length-1;
		for(int i=0 ; i<fruitReverse.length ; i++) {
			fruitReverse[i] = fruit[index--];
		}
		
		return fruitReverse;
	}
}
