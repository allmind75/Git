package test03;

import java.util.Scanner;

public class test {

	/*
	 * [����1]
	 * ����(80), ����(75), ����(85)
	 * 1. ������ ���ؼ� ����Ͻÿ�
	 * 2. ��� �� ���ؼ� ����Ͻÿ� 
	 */
	
	/*
	 * [����2]
	 * 10cm -> inch�� ��ȯ
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����1
		int korean;
		int math;
		int english;
		int sum;
		double avg;
		
		korean = 85;
		math = 75;
		english = 85;
		
		sum = korean + math + english;
		avg = (double) sum / (double)3 + 0.005;
		
		System.out.println("[����] ���� : " + korean + " / " + "���� : " + math + " / " + "���� : " + english);
		System.out.println("1. ������ ���ؼ� ����Ͻÿ�. - ���� = " + sum + "��");
		System.out.println("2. ����� ���ؼ� ����Ͻÿ�. - ��� = " + avg + "��");
		System.out.printf("2. ����� ���ؼ� ����Ͻÿ�. - ��� = %5.4f��\n\n", avg);
		
		//����2
		double cm = 10;
		double inch;
		final double cmToInch = 0.393701;
		
		inch = cm * cmToInch;
		
		System.out.println(cm + "cm�� " + inch + "in��.");
		
		//ū ���� ǥ���� java7 ���� _ ����
		//java�� ���� ���ͷ��� int, �ε� �Ҽ����� double
		//long Ÿ�� ǥ���� L, l
		//float Ÿ�� ǥ���� F, f
		long n = 1999_9999_9999_9999L; //����� ������ ��(literal)
		if(n < 1000_0000_0000_0000L) {
			System.out.println(n);
		} else {
			System.out.println("\n�����ʰ� : " + n);
		}
	}

}
