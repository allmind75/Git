package algorithm;

import java.util.Scanner;

public class Grade {

	/*
	 * 9498��
	 * ���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 
	 * 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� 
	 * ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * ù° �ٿ� ���� ������ �־�����. ���� ������ 0���� ũ�ų� ����, 
	 * 100���� �۰ų� ���� �ڿ����̴�.
	 * 
	 * 100
	 * 
	 * A
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int grade;
		Scanner sc = new Scanner(System.in);
		
		grade = sc.nextInt();
		
		if(grade >= 90) {
			System.out.println("A");

		} else if(grade >= 80) {
			System.out.println("B");

		} else if(grade >= 70) {
			System.out.println("C");

		} else if(grade >= 60) {
			System.out.println("D");

		} else {
			System.out.println("F");
		}
		
		sc.close();
	}

}
