package test09;

import java.util.ArrayList;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		primeNumber01();
		primeNumber02();

	}

	public static void primeNumber01() {
		
		int n = 50000;
		boolean flag = true;
		int count = 0;
		
		long start = System.nanoTime();
		for(int i=2 ; i<=n ; i++) {
			flag= true;
			for(int j=2 ; j<i/2 + 1 ; j++) {
				if(i%j == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				count++;
				//System.out.println(i);
			}
			
		}
		double end = (System.nanoTime() - start) / 1000000;
		System.out.println("1.����ð� : " + end + "ms" + " / �Ҽ�����: " + count);
		
		count = 0;
		long start2 = System.nanoTime();
		for(int i=2 ; i<=n ; i++) {
			flag= true;
			for(int j=2 ; j<i ; j++) {
				if(i%j == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				count++;
				//System.out.println(i);
			}
			
		}
		double end2 = (System.nanoTime() - start2) / 1000000;
		System.out.println("2.����ð� : " + end2 + "ms" +" / �Ҽ�����: " + count);
	}
	
	public static void primeNumber02() {
		
		//System.nanoTime(), �и��ʺ��� �鸸 ��(1,000,000) �� ��Ȯ�� ���� ��
		/*
		 * 1ns(nano second) * 1000000 = 1ms(mille second)
		 * 1ms * 1000 = 1s(second)
		 */
		long start = System.nanoTime();
		
		int[] array = new int[50000];
		int count = 0;
		
		
		//�ʱ�ȭ
		for(int i=2 ; i<array.length ; i++)
			array[i] = i;
		
		
		//�Ҽ��� �ƴ� ��� üũ
		//��Ʈn������ Ȯ���ص� ��!
		for(int i=2 ; i<Math.sqrt(array.length) ; i++) {
			if(array[i] == 0)
				continue;
			
			//i�� ������ i�� ������� 0���� üũ
			for(int j=i+i ; j< array.length ; j+= i)
				array[j] = 0;
		}
		
		
		for(int i=2 ; i<array.length ; i++) {
			if(array[i] != 0)
				count++;
		}
		long end = (System.nanoTime() - start) / 1000000;
		System.out.println("3. ����ð� : " + end + "ms" + " / �Ҽ�����: " + count);
		System.out.println();
	}
}
