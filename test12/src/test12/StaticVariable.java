package test12;

class A {
	static int x;
}

public class StaticVariable {

	public static void main(String[] arg) {
		
		A.x = 100;
	
		A a1 = new A();
		A a2 = new A();
		
		a1.x = 200;
		a2.x = 100;
		
		System.out.println(a1.x);
		System.out.println(a2.x);
	}
}
