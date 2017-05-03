package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Num1181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < N; i++) {
			String s = sc.nextLine();
			if (!list.contains(s)) {
				list.add(s);
			}
		}

		Collections.sort(list, new StringCompare());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		sc.close();
	}

}

class StringCompare implements Comparator<String> {

	@Override
	public int compare(String a, String b) {
		if (a.length() > b.length()) {
			return 1; // 오름차순
		} else if (a.length() == b.length()) {

			return a.compareTo(b);
		} else {
			return -1;
		}
	}
}