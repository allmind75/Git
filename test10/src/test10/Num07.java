package test10;

import java.util.Arrays;

public class Num07 {

	public static void main(String[] args) {
		System.out.println("[문제. 7]");

		String[] array = new String[] { "사과", "배", "수박", "토마토", "딸기", "참외" };

		Arrays.sort(array);

		System.out.println("결과 : " + Arrays.toString(array));
	}
}
