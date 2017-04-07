package algorithm;

import java.util.Scanner;

public class Calendar {

	/*
	 * ���� ������ 2007�� 1�� 1�� �������̴�. �׷��ٸ� 2007�� x�� y���� ���� �����ϱ�? �̸� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� ù° �ٿ� �� ĭ�� ���̿� �ΰ� x(1��x��12)�� y(1��y��31)�� �־�����. ����� 2007�⿡�� 1, 3, 5, 7,
	 * 8, 10, 12���� 31�ϱ���, 4, 6, 9, 11���� 30�ϱ���, 2���� 28�ϱ��� �ִ�.
	 * 
	 * ��� ù° �ٿ� x�� y���� ���� ���������� ���� SUN, MON, TUE, WED, THU, FRI, SAT�� �ϳ��� ����Ѵ�.
	 * 
	 * �Է� 1 1
	 * 
	 * ��� MON
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		int day;
		int total = 0;
		int cnt = 1;

		Scanner sc = new Scanner(System.in);

		month = sc.nextInt();
		day = sc.nextInt();

		while (cnt < month) {

			if (cnt == 1 || cnt == 3 || cnt == 5 || cnt == 7 || cnt == 8 || cnt == 10 || cnt == 12) {
				total += 31;
			} else if (cnt == 2) {
				total += 28;
			} else {
				total += 30;
			}
			cnt++;
		}

		day += total;
		day = day % 7;

		switch (day) {
		case 0:
			System.out.println("SUN");
			break;
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;

		}
		sc.close();
	}

}
