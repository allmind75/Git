package test10;

public class Num03 {
	
	public static void main(String[] args) {
		System.out.println("[문제. 3]");

		int[] array = new int[] { 34, 56, 78, 44, 98, 33, 65, 66, 76, 54, 44, 56, 11 };

		System.out.print("십자리와 일의자리가 같은 숫자는 : ");
		for (int i = 0; i < array.length; i++) {

			if (array[i]%11 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();
	}
}
