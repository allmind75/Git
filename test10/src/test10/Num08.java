package test10;

public class Num08 {

	public static void main(String[] args) {
		System.out.println("[문제. 8]");

		String s = "지효, 쯔위, 정연, 미나, 채영, 나연, 모모, 사나, 다현";
		String[] array;

		array = s.split(",");

		for (int i = 0; i < array.length; i++) {

			array[i] = array[i].trim();
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
