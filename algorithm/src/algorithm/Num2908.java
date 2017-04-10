package algorithm;

import java.util.Scanner;

public class Num2908 {

	/*
	 * ������� ���� ����� ������ ���� ���Ѵ�. ����� ���ڸ� �дµ� ������ �ִ�. 
	 * �̷��� ������ ���ϴ� ����� ���ؼ� ����̴� ���� ũ�⸦ ���ϴ� ������ 
	 * ���־���. ����̴� �� �ڸ� ���� �� ���� ĥ�ǿ� ���־���. 
	 * �� ������ ũ�Ⱑ ū ���� ���غ���� �ߴ�.����� ���� �ٸ������ �ٸ��� 
	 * �Ųٷ� �д´�. ���� ���, 734�� 893�� ĥ�ǿ� �����ٸ�, 
	 * ����� �� ���� 437�� 398�� �д´�. 
	 * ����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.
	 * �� ���� �־����� ��, ����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
	 * 
	 * �Է�
	 * ù° �ٿ� ����̰� ĥ�ǿ� ���� �� �� A�� B�� �־�����. 
	 * �� ���� ���� ������, 0�� ���ԵǾ� ���� �ʴ�.
	 * 
	 * ���
	 * ù° �ٿ� ����� ����� ����Ѵ�.
	 * 
	 * 734 893
	 * 
	 * 437
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		int n1, n2;
		
		s1 = sc.next();
		s2 = sc.next();
		
		n1 = Integer.parseInt(change(s1));
		n2 = Integer.parseInt(change(s2));
		
		if(n1 > n2) {
			System.out.println(n1); 
		} else {
			System.out.println(n2);
		}
		
	}
	
	public static String change(String s) {
		
		StringBuffer sbr = new StringBuffer();
		sbr.append(s.substring(2,3));
		sbr.append(s.substring(1, 2));
		sbr.append(s.substring(0, 1));
		
		return sbr.toString();
	}

}
