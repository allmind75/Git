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
		char index = 0;
		int length;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		
		s = sc.nextLine();
		length = s.length();
		s = s.toUpperCase();	//�빮�ڷ� ����
		
		for(int i=0 ; i<length ; i++) {
			int n;
			temp = s.charAt(i);
			n = temp - 'A';
			alphabet[n]++;
			
			if(alphabet[n] > max) {
				max = alphabet[n];
				index = temp;
			}
		}
		
		for(int i=0 ; i<26 ; i++) {
			if(alphabet[i] == max) {
				cnt++;
			}
		}
		
		if(cnt > 1) {
			System.out.println("?");
		} else {
			System.out.println(index);
		}
		
		
		sc.close();
	}
}
