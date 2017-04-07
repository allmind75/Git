package algorithm;

/*	
 * 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 
 * 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 
 * 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 
 * 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다. 
 * 상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 
 * 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 
 * 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
 * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 
 * 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
 * 
 * 첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)
 * 
 * 상근이가 배달하는 봉지의 최소 개수를 출력한다. 
 * 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.
 * 
 * 입력 
 * 18
 * 
 * 출력
 * 4
 * 
 * https://www.acmicpc.net/status/?user_id=allmind75&problem_id=2839&from_mine=1
 */
import java.util.Scanner;

public class sugar {

	public static void main(String[] args) {

		int sugar;
		int count1 = 9999;
		int count2 = 9999;
		int count3 = 9999;
		int cnt = 0;

		Scanner sc = new Scanner(System.in);
		sugar = sc.nextInt();

		if (sugar % 3 == 0) {
			count1 = sugar / 3;
		}
		if (sugar % 5 == 0) {
			count2 = sugar / 5;
		}

		while (sugar > 0) {
			sugar -= 3;
			cnt++;
			if (sugar % 5 == 0) {
				count3 = sugar / 5;
				break;
			} else {
				continue;
			}
		}
		count3 += cnt;

		if (compare(count1, count2, count3) > 9999) {
			System.out.println(-1);
		} else {
			System.out.println(compare(count1, count2, count3));
		}

		sc.close();
	}

	public static int compare(int a, int b, int c) {

		if (a < b && a < c) {
			return a;
		} else if (b < a && b < c) {
			return b;
		} else {
			return c;
		}
	}

}
