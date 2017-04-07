package algorithm;

import java.util.Scanner;

public class Num4344 {
	/*
	 * ���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. 
	 * ����� �׵鿡�� ���� ������ �˷���� �Ѵ�.
	 * 
	 * �Է�
	 * ù° �ٿ��� �׽�Ʈ���̽� C�� �־�����.
	 * ��° �ٺ��� �� �׽�Ʈ���̽� ���� ù ���� ���� 
	 * N(1 <= N <= 1000)���� �л��� �־����� 
	 * �� �������� N���� 0���� 100 ������ ������ �̾ �־�����.
	 * 
	 * 
	 * ���
	 * �� ���̽����� ���پ� ����� �Ѵ� 
	 * �л����� ������ �Ҽ��� ��°�ڸ����� �ݿø��Ͽ� ����Ѵ�.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int C, N;
		int[] array;
		
		Scanner sc = new Scanner(System.in);
		
		C = sc.nextInt();
		
		for(int i=0 ; i<C ; i++) {
			
			double avg = 0;
			int sum = 0;
			double result = 0;;
			int cnt = 0;
			
			N = sc.nextInt();
			array = new int[N];
			
			for(int j=0 ; j<N ; j++) {
				array[j] = sc.nextInt();
				sum += array[j];
			}
			
			avg = (double) sum / N;
			
			for(int n: array) {
				if(n > avg) {
					cnt++;
				}
			}
			
			result = (double) cnt / N * 100;
			System.out.printf("%.3f%%\n", result);
			
		}
	
		sc.close();
	}

}
