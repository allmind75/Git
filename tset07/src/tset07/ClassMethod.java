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
	
	//배열의 항목 수는 호출할 때 결
	int sum1(int[] n) {
		
		int sum = 0;
		for(int i: n) {
			sum += i;
		}
		return sum;
	}
	
	//매개변수를 ... 를 사용하면, 메소드 호출 시 넘겨준 값의 수에 따라 자동으로 배열이 생성되고 매개값으로 사
	int sum2(int ... n) {
		
		int sum = 0;
		for(int i: n) {
			sum += i;
		}
		return sum;
	}
}
