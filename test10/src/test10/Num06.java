package test10;

import java.util.Arrays;

public class Num06 {

	public static void main(String[] args) {
		System.out.println("[����. 6]");

		Integer[] array = new Integer[] { 10, 45, 1, 3, 100, -10, 200, 5 };
		int[] array2 = new int[] { 10, 45, 1, 3, 100, -10, 200, 5};
		
		Arrays.sort(array2);
		System.out.println("���(��������) : " + Arrays.toString(array2));
		
		Arrays.sort(array, new CompareIntSort());
		System.out.println("���(��������) : " + Arrays.toString(array));
	}
}
