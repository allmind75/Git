package algorithm;

import java.util.Scanner;

public class Num1157 {
	/*
	 * ����
	 * ���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, 
	 * �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� 
	 * ���α׷��� �ۼ��Ͻÿ�. ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.
	 * 
	 * �Է�
	 * ù° �ٿ� ���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־�����. �־����� �ܾ��� ���̴� 1,000,000�� ���� �ʴ´�.


	 * ���
	 * ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. 
	 * ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.
	 */
	public static void main(String[] args) {
		
		String s;
		int[] alphabet = new int[26];
		char temp;
		int max = 0;
		boolean flag = false;
		int index = 0;
		
		Scanner sc = new Scanner(System.in);
		
		s = sc.nextLine();
		
		for(int i=0 ; i<s.length() ; i++) {
			int n;
			s = s.toUpperCase();
			temp = s.charAt(i);
			n = temp - 'A';
			alphabet[n] += 1;
		}
		
		for(int i=0 ; i<alphabet.length ; i++) {
			if(alphabet[i] > max) {
				max = alphabet[i];
				index = i;
			} else if(alphabet[i] == max) {
				flag = true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("?");
		} else {
			char c = (char) (65 + index);
			System.out.println(c);
		}
		sc.close();
	}
}
