package tset07;

public class TimeCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1ns * 1000000 = 1ms
		 * 1ms * 1000 = 1s
		 * 1ns * 1000000000 = 1s
		 */
		long start = System.nanoTime();
		
		for(int i=0 ; i<21000 ; i++) {
			System.out.println(i);
		}
		
		long end = System.nanoTime();
		double time = (end - start) / 1000000000.0;		//�����ʸ� �ʷ� ��ȯ��
		
		
		
		System.out.println(time);
	}

}
