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

//람다식을 위한 인터페이스에서 추상메소드는 단 하나!
//@FunctionalInterface - 인터페이스에 메소드 두개 이상 선언하면 유효하지 않다는 오류 발생

@FunctionalInterface
interface Func {
	public int calc(int a, int b);
}
