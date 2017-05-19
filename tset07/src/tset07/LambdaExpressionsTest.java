package tset07;

public class LambdaExpressionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		Func add = (int a, int b) -> a + b;
		Func sub = (int a, int b) -> a - b;
		Func add2 = (int a, int b) -> {return a + b;};
		
		
		int result = add.calc(1, 2) + sub.calc(2, 2) + add2.calc(5, 6);		//3 + 0 + 11
		
		System.out.println(result);
		
	}


}

//���ٽ��� ���� �������̽����� �߻�޼ҵ�� �� �ϳ�!
//@FunctionalInterface - �������̽��� �޼ҵ� �ΰ� �̻� �����ϸ� ��ȿ���� �ʴٴ� ���� �߻�

@FunctionalInterface
interface Func {
	public int calc(int a, int b);
}
