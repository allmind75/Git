package algorithm;

import java.util.Scanner;

public class Num2675 {

	/*
	 * ����
	 * ���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� T�� ���� �� 
	 * ����ϴ� ���α׷��� �ۼ��Ͻÿ�.�ٽ� �������ڸ�, ù ��° ���ڸ� R�� �ݺ��ϰ�,
	 * �� ��° ���ڸ� R�� �ݺ��ϴ� ������ T�� ����� �ȴ�.
	 * S���� QR Code "alphanumeric" ���ڸ� ����ִ�.QR Code "alphanumeric" 
	 * ���ڴ� 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ$%*+-./: �̴�.
	 * 
	 * �Է�
	 * ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 <= T <= 1,000)�� �־�����. 
	 * �� �׽�Ʈ ���̽���  �ݺ� Ƚ�� R(1 <= R <= 8), ���ڿ� S�� �������� 
	 * ���еǾ� �־�����. S�� ���̴� ��� 1�̸�, 20���ڸ� ���� �ʴ´�. 
	 * 
	 * ���
	 * �� �׽�Ʈ ���̽��� ���� T�� ����Ѵ�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int T;
		int R;
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		for(int i=0 ; i<T ; i++) {
			String S;
			
			R = sc.nextInt();
			S = sc.nextLine();
			
			for(int j=1 ; j<S.length() ; j++) {
				
				for(int k=1 ; k<=R ; k++) {
					
					System.out.print(S.substring(j, j+1));
				}
				
			}
			System.out.println();
		}
		
		sc.close();
	}

}
