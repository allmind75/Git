package algorithm;

import java.util.Scanner;

public class MiniNum {

	/*
	 * ���� N���� �̷���� ���� A�� ���� X�� �־�����. �� ��, 
	 * A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է�
	 * ù° �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000)
	 * ��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. 
	 * �־����� ������ ��� 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.
	 * 
	 * ���
	 * X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. 
	 * X���� ���� ���� ��� �ϳ� �����Ѵ�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N, X;
		int i = 0;
		int[] array = new int[10000];
		String line;
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2;
		
		N = sc1.nextInt();
		X = sc1.nextInt();
		sc1.nextLine();
		
		if(sc1.hasNext()) {
			line = sc1.nextLine();
			sc2 = new Scanner(line).useDelimiter(" ");
			
			while(sc2.hasNext()) {
				array[i] = sc2.nextInt();
				i++;
			}
			sc2.close();
		}
		
		for(int j=0 ; j<N ; j++) {
			if(array[j] < X) {
				System.out.print(array[j] + " ");
			}
		}
		sc1.close();
		
		System.out.println();
	}

}
