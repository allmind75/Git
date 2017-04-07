package algorithm;

/*	
 * ����̴� ���� �������忡�� ������ ����ϰ� �ִ�. 
 * ����̴� ���� �������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ����ؾ� �Ѵ�. 
 * �������忡�� ����� ������ ������ ����� �ִ�. 
 * ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�. 
 * ����̴� ������ ������, �ִ��� ���� ������ ��� ������ �Ѵ�. 
 * ���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷� ���� 6���� �������� ������, 
 * 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, �� ���� ������ ������ ����� �� �ִ�.
 * ����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, 
 * ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * ù° �ٿ� N�� �־�����. (3 �� N �� 5000)
 * 
 * ����̰� ����ϴ� ������ �ּ� ������ ����Ѵ�. 
 * ����, ��Ȯ�ϰ� Nų�α׷��� ���� �� ���ٸ� -1�� ����Ѵ�.
 * 
 * �Է� 
 * 18
 * 
 * ���
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
