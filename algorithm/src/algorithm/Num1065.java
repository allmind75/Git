package algorithm;

import java.util.Scanner;

public class Num1065 {

	/*
	 * � ���� ���� X�� �ڸ����� ���������� �̷�ٸ�, 
	 * �� ���� �Ѽ���� �Ѵ�. ���������� ���ӵ� �� ���� ���� 
	 * ���̰� ������ ������ ���Ѵ�. N�� �־����� ��, 
	 * 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� 
	 * ���α׷��� �ۼ��Ͻÿ�. 
	 * 
	 * �Է�
	 * ù° �ٿ� 1,000���� �۰ų� ���� �ڿ��� N�� �־�����.
	 * 
	 * ���
	 * ù° �ٿ� 1���� ũ�ų� ����,
	 * N���� �۰ų� ���� �Ѽ��� ������ ����Ѵ�.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N;
		int result = 0;
		String s;
		String a, b, c;
		int n1, n2;
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		for(int i=1 ; i<=N ; i++) {
			if(i < 100) {
				result++;
				continue;
			} else {
				s = Integer.toString(i);
				a = s.substring(0, 1);
				b = s.substring(1, 2);
				c = s.substring(2, 3);
				
				n1 = Integer.parseInt(a) - Integer.parseInt(b);
				n2 = Integer.parseInt(b) - Integer.parseInt(c);
				
				if(n1 == n2) {
					result++;
				}
				
				
			}
		}
		
		System.out.println(result);
		
		sc.close();
	}

}
