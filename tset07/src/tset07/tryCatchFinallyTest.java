package tset07;

public class tryCatchFinallyTest {

	public void shouldBeRun() {
		System.out.println("Bye Bye");
	}
	
	public static void main(String[] args) {
		
		tryCatchFinallyTest test = new tryCatchFinallyTest();
		int c = 0;
		
		try {
			
			c = 4 / 0 ;
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException : " + e);
			c = -1;
		} finally {
			
			test.shouldBeRun();
		}
	}
}
