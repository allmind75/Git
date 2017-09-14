package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Num1915 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y;
		String[][] board = new String[1001][1001];

		Scanner scan = new Scanner(System.in);

		x = scan.nextInt();
		y = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < x; i++) {

			String str = scan.nextLine();
			String[] strArr = str.split("");
			board[i] = strArr;
	
		}
		
		System.out.println(solution(board, x , y));
		
		scan.close();

	}

	public static int min(int a, int b) {
		return a < b ? a : b;
	}

	public static int solution(String[][] board, int x, int y) {

		int max = 0;

		int[][] dp = new int[1001][1001];

		for (int j = 1; j < y + 1; j++) {
			for (int i = 1; i < x + 1; i++) {

				if (board[j - 1][i - 1].equals("1")) {

					dp[j][i] = min(dp[j - 1][i], min(dp[j - 1][i - 1], dp[j][i - 1])) + 1;

					if (dp[j][i] > max)
						max = dp[j][i];
				}

				// System.out.print(dp[j][i] + ",");
			}
			// System.out.println();
		}
		return max * max;
	}

}
