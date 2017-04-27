package algorithm;

import java.util.Scanner;

public class Num1912 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int sum = 0;
		int input;
		int max = -999999;

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {

			input = sc.nextInt();

			sum += input;

			if (sum > max) {
				max = sum;
			}
			sum = -9999999;

		}

		System.out.println(max);

		sc.close();

	}

}
