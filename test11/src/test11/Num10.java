package test11;

public class Num10 {

	/*
	 * ���ڿ��� �־�������, ���ڿ��� �迭�� ����� �־��� ������ �ذ��ϴ� ���α׷� �ۼ�
	 * "������", "����", "����", "����"
	 * 
	 *1. ������ ������ ���ڿ� �迭�� ���� �޾Ƽ�, �迭�� �ִ� ��Ʈ���� ����ϴ� �Լ��� �ۼ�
	 *
	 *2. ���޵� �迭�� �������� �ٸ� �迭�� �����ϰ�, ���� �迭�� ��ȯ�Ͻ�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] fruit = new String[] {"������", "����", "����", "����"};
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
