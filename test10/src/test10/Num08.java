package test10;

public class Num08 {

	public static void main(String[] args) {
		System.out.println("[����. 8]");

		String s = "��ȿ, ����, ����, �̳�, ä��, ����, ���, �糪, ����";
		String[] array;

		array = s.split(",");

		for (int i = 0; i < array.length; i++) {

			array[i] = array[i].trim();
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
