package algorithm;

import java.util.Scanner;

public class Num1100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cnt = 0;
		Scanner sc = new Scanner(System.in);

		for (int t = 0; t < 8; t++) {
			char[] chrArray = new char[8];
			String line;

			line = sc.nextLine();

			chrArray = line.toCharArray();

			for (int i = 0; i < 8; i++) {
				if (t % 2 == 0) {
					if (i % 2 == 0) {
						if (chrArray[i] == 'F') {
							cnt++;
						}
					}
				} else {
					if(i % 2 != 0) {
						if(chrArray[i] == 'F') {
							cnt++;
						}
					}

				}
			}
		}

		System.out.println(cnt);

		sc.close();
	}

}
