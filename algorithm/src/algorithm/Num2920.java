package algorithm;

import java.util.Scanner;

public class Num2920 {

	/*
	 * �������� c d e f g a b C, �� 8�� ������ �̷�����ִ�. 
	 * �� �������� 8�� ���� ������ ���� ���ڷ� �ٲپ� ǥ���Ѵ�. 
	 * c�� 1��, d�� 2��, ..., C�� 8�� �ٲ۴�.
	 * 1���� 8���� ���ʴ�� �����Ѵٸ� ascending, 
	 * 8���� 1���� ���ʴ�� �����Ѵٸ� descending, 
	 * �� �� �ƴ϶�� mixed �̴�.������ ������ �־����� ��, 
	 * �̰��� ascending����, descending����, �ƴϸ� mixed���� 
	 * �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է�
	 * ù° �ٿ� 8�� ���ڰ� �־�����. 
	 * �� ���ڴ� ���� ������ ������ ���̸�, 1���� 8���� ���ڰ� �� ���� �����Ѵ�.
	 * 
	 * ���
	 * ù° �ٿ� ascending, descending, mixed �� �ϳ��� ����Ѵ�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = new int[8];
		Scanner sc = new Scanner(System.in);
		boolean flag1 = false;
		boolean flag2 = false;
		int cnt = 8;
		
		for(int i=0 ; i<8 ; i++) {
			n[i] = sc.nextInt();
			if(n[i] == i+1) {
				flag1 = true;
			} else {
				flag1 = false;
			}
		}
		for(int i=0 ; i<8 ; i++) {
			if(n[i] == i+1) {
				flag1 = true;
			} else {
				flag1 = false;
				break;
			}
		}
		for(int i=0 ; i<8 ; i++) {
			if(n[i] == cnt) {
				flag2 = true;
				cnt--;
			} else {
				flag2 = false;
				break;
			}
		}
		
		if(flag1) {
			System.out.println("ascending");
		} else if(flag2){
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
		
		sc.close();
	}

}
