package test10;

public class Num05 {

	public static void main(String[] args) {
		System.out.println("[문제. 5]");

		int[] array1 = new int[] { 11, 14, 39, 22, 44 };
		int[] array2 = new int[] { 33, 56, 78, 33, 45, 35, 90 };
		int[] array3;
		int length;
		int index = 0;

		length = array1.length + array2.length;

		array3 = new int[length];

		for (int i = 0; i < array1.length; i++) {

			array3[index++] = array1[i];
		}

		for (int i = 0; i < array2.length; i++) {

			array3[index++] = array2[i];
		}

		System.out.print("결과배열 : ");
		for (int n : array3) {

			System.out.print(n + " ");
		}

		System.out.println();
	}
}
