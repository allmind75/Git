package tset07;

public class ClassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc calc = new Calc();
		
		int[] data = new int[]{1, 2, 3};
		System.out.println("sum1 : " + calc.sum1(data));
		
		System.out.println("sum2 : " + calc.sum2(1,2,3,4,5));
		
		System.out.println("sum2 : " + calc.sum2(6,7,8,9,10,11,12,13));
	}

}

class Calc {
	
	//�迭�� �׸� ���� ȣ���� �� ��
	int sum1(int[] n) {
		
		int sum = 0;
		for(int i: n) {
			sum += i;
		}
		return sum;
	}
	
	//�Ű������� ... �� ����ϸ�, �޼ҵ� ȣ�� �� �Ѱ��� ���� ���� ���� �ڵ����� �迭�� �����ǰ� �Ű������� ��
	int sum2(int ... n) {
		
		int sum = 0;
		for(int i: n) {
			sum += i;
		}
		return sum;
	}
}
