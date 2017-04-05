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
		System.out.println("1.수행시간 : " + end + "ms" + " / 소수갯수: " + count);
		
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
		System.out.println("2.수행시간 : " + end2 + "ms" +" / 소수갯수: " + count);
	}
	
	public static void primeNumber02() {
		
		//System.nanoTime(), 밀리초보다 백만 배(1,000,000) 더 정확한 나노 초
		/*
		 * 1ns(nano second) * 1000000 = 1ms(mille second)
		 * 1ms * 1000 = 1s(second)
		 */
		long start = System.nanoTime();
		
		int[] array = new int[50000];
		int count = 0;
		
		
		//초기화
		for(int i=2 ; i<array.length ; i++)
			array[i] = i;
		
		
		//소수가 아닌 놈들 체크
		//루트n까지만 확인해도 됨!
		for(int i=2 ; i<Math.sqrt(array.length) ; i++) {
			if(array[i] == 0)
				continue;
			
			//i를 제외한 i의 배수들을 0으로 체크
			for(int j=i+i ; j< array.length ; j+= i)
				array[j] = 0;
		}
		
		
		for(int i=2 ; i<array.length ; i++) {
			if(array[i] != 0)
				count++;
		}
		long end = (System.nanoTime() - start) / 1000000;
		System.out.println("3. 수행시간 : " + end + "ms" + " / 소수갯수: " + count);
		System.out.println();
	}
}
