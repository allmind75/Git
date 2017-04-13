package test10;

public class Num01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("[¹®Á¦. 1]");

		int[] array = new int[21];
		int temp = -10;

		for (int i = 0; i < array.length; i++) {
			array[i] = temp++;
		}
		for (int n : array) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
