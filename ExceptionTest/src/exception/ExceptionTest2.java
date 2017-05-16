package exception;

public class ExceptionTest2 {

	public static void main(String[] args) {

		while (true) {

			System.out.println("print");
			try {

				Thread.sleep(5000);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
