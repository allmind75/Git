package test11;

import java.util.Arrays;

public class Num08 {

	/*
	 * �Ʒ��� �����ʹ� ����б� ���� ���� �̴�.
	 * �Ʒ��� ������ �迭�� �����ϰ� �־��� ������ �ذ��ϴ� ���α׷� ��
	 */
	public static void main(String[] args) {
		System.out.println("[���� 7] ������ ����� �迭�� ���� �ް�, ���� ����� ����ϴ� �Լ� ��");
		
		int[] grade = new int[]{90, 98, 80, 85, 70, 75};
		double avg;
		
		avg = printArray(grade);
		
		System.out.println("�������� ��� : " +avg);

	}
	
	public static double printArray(int[] x) {
		
		double avg;
		int sum = 0;
		
		for(int n: x) {
			sum += n;
		}
		
		avg = (double) sum / x.length;
		return avg;
	}

}
