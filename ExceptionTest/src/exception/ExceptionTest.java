package exception;

import java.util.InputMismatchException;
import java.util.Scanner;


class NoException extends Exception {
	NoException() {
		super("[음수 입력 노노노!]");
	}
}


public class ExceptionTest {

	public static boolean inputCheck(int num) throws NoException {
		
		if(num < 0) {
			throw new NoException();
		} else {
			return true;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		Scanner sc = new Scanner(System.in);

		try {
			
			System.out.print("입력 > ");
			num = sc.nextInt();
			
			inputCheck(num);
			
		} catch (NoException e) {
			
			System.out.println(e.getMessage());
			
		} catch(InputMismatchException e) {
			
			
			System.out.println("[정수만 입력해주세요.]");
			
		}finally {
			
			System.out.println("입력값 : " + num);

		}
		
		sc.close();
		
	}

}
