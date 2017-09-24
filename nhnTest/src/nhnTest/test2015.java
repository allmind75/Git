package nhnTest;

import java.util.Scanner;

public class test2015 {

	private Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test2015 s = new test2015();

		s.solution();
	}

	public void solution() {

		int N;
		double[] arr = {};
		double min = 10000000000.0;
		double minSum = 2000000000.0;
		double X = 10000000000.0, Y = 10000000000.0;

		N = scan.nextInt();
		arr = new double[N];

		// INPUT
		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextDouble();
		}

		// PROCESS
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {

				if (i != j) {
					double x = arr[i];
					double y = arr[j];

					double len = Math.abs(x - y);

					if (len < min) {
						X = x;
						Y = y;
						min = len;
					} else if (len == min) {
						if ((x + y) < (minSum)) {
							X = x;
							Y = y;
							minSum = X + Y;
						}
					}
				}
			}
		}

		if (X < Y) {
			System.out.printf("%.0f ", X);
			System.out.printf("%.0f\n", Y);
		} else {
			System.out.printf("%.0f ", X);
			System.out.printf("%.0f\n", Y);
		}
	}

}
