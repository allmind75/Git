package test10;

public class Num02 {

	public static void main(String[] args) {
		System.out.println("[����. 2]");

		int[] array = new int[] { 100, 123, -45, 56, 300, 250, 78, -256, 43, -145, 0 };
		int minus = 0;
		int plus = 0;
		int zero = 0;

		System.out.println("a. �迭 ���");
		for (int n : array) {
			if (n > 0) {
				System.out.print("+" + n + " ");
				plus = plus + 1;
			} else if (n < 0) {
				System.out.print(n + " ");
				minus++;
			} else {
				System.out.println(n + " ");
				zero++;
			}

		}
		System.out.println("\nb. ����, ���, 0�� ���� ���");
		System.out.println("����� ���� : " + plus);
		System.out.println("������ ���� : " + minus);
		System.out.println("0 �� ���� : " + zero);
	}
}
