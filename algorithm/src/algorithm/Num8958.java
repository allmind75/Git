package algorithm;

import java.util.Scanner;

public class Num8958 {

	/*
	 * "OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. ������ ���� ��� ��
	 * ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�. "OOXXOXXOOO"�� ������
	 * 1+2+0+0+1+0+0+1+2+3 = 10���̴�. OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է�
	 * 
	 * ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���̰� 0���� ũ�� 80���� ���� ���ڿ���
	 * �־�����. ���ڿ��� O�� X������ �̷���� �ִ�.
	 * 
	 * ��� �� �׽�Ʈ ���̽����� ������ ����Ѵ�.
	 */
	public static void main(String[] args) {

		int T;
		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();
		sc.nextLine();
		for (int t = 0; t < T; t++) {
			int sum = 0;
			int cnt = 1;
			String s;
			s = sc.nextLine();

			for (int i = 0; i < s.length(); i++) {

				if (s.substring(i, i + 1).equals("O")) {
					sum += cnt;
					cnt++;
				} else {
					cnt = 1;
				}
			}
			System.out.println(sum);
		}
		
		sc.close();
	}
}
