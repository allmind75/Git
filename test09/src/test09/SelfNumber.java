package test09;

import java.util.ArrayList;

public class SelfNumber {

	/*
	 * Self Number ã��
	 * 
	 * � �ڿ��� n�� ���� ��, d(n)�� n�� �� �ڸ��� ���ڵ��
	 * n �ڽ��� ���� ����
	 * 
	 * ex) d(91) = 9 + 1 + 91 = 101
	 * �̶� n�� d(n)�� ���׷�����(generator)
	 * 
	 * ���׷����Ͱ� ���� ���� -> �����ѹ�
	 * ex) 1, 3, 5, 7, 9,  20, 31 . . . . . 
	 * 
	 * 1�̻��̰� 10000���� ���� ���� �ѹ����� ���� ���϶�.
	 */
	
	//���׷����͸� ���� arrayList�� �ְ� contains�� �̿���
	//���� ����� ���ڸ� ����
	
	private static ArrayList<Integer> generator;
	
	public static void main(String[] args) {
		
		calcNumber();
		int sum = 0;
		
		for(int i=1 ; i<10000 ; i++) {
			if(!hasGenerator(i)) sum += i;
		}
		
		System.out.println("1�̻� ~ 5000�̸��� Self Number�� �� :  " + sum);
		
		for(int i=1 ; i<10000 ; i++) {
			if(!hasGenerator(i))
				System.out.println(i);
		}
		

	}
	
	private static boolean hasGenerator(int n) {
		return generator.contains(n);
	}
	
	private static void calcNumber() {
		
		generator = new ArrayList<Integer>();
		
		for(int i=1 ; i<10000 ; i++) {
			
			String s = String.valueOf(i);
			int sum = 0;
			
			for(int j=0 ; j<s.length() ; j++) {
				sum += Integer.parseInt(s.substring(j, j+1));
			}
			
			generator.add(sum+i);
		}
		
	}
}
