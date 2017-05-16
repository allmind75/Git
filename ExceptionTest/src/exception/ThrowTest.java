package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowTest {

	public static int div(int x, int y) throws ArithmeticException {
		
		if( y == 0) {
			
			throw new ArithmeticException("0 ������ �ȵ�!");
		}
		return  x / y;
		
	}
	
	public static void main(String[] args) {

		int x = 0, y = 0, z = 0;
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {

				System.out.print("ù��° ���� �Է�> ");
				x = sc.nextInt();

				System.out.print("�ι�° ���� �Է�> ");
				y = sc.nextInt();

//				if (y == 0) {
//					throw new ArithmeticException("0 ������ �ȵ�!");
//				}

				z = div(x, y);

				System.out.println("z : " + z);
				break;

			} catch (ArithmeticException e) {
				
				System.out.println("[���ܹ߻� : " + e.getMessage() + "]");
				System.out.println("[�и� 0�� �ƴ� ������ �Է��ϼ���]");

			} catch(InputMismatchException e) {
				
				System.out.println("[������ �Է��� �ּ���]");
				
			} finally {
				sc = new Scanner(System.in);
			}
		}

		sc.close();
	}
}
