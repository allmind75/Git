package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowTest {

	public static int div(int x, int y) throws ArithmeticException {
		
		if( y == 0) {
			
			throw new ArithmeticException("0 나누기 안됨!");
		}
		return  x / y;
		
	}
	
	public static void main(String[] args) {

		int x = 0, y = 0, z = 0;
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {

				System.out.print("첫번째 정수 입력> ");
				x = sc.nextInt();

				System.out.print("두번째 정수 입력> ");
				y = sc.nextInt();

//				if (y == 0) {
//					throw new ArithmeticException("0 나누기 안됨!");
//				}

				z = div(x, y);

				System.out.println("z : " + z);
				break;

			} catch (ArithmeticException e) {
				
				System.out.println("[예외발생 : " + e.getMessage() + "]");
				System.out.println("[분모가 0이 아닌 정수를 입력하세요]");

			} catch(InputMismatchException e) {
				
				System.out.println("[정수만 입력해 주세요]");
				
			} finally {
				sc = new Scanner(System.in);
			}
		}

		sc.close();
	}
}
