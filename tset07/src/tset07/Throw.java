package tset07;

import java.util.Scanner;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է� : ");

		try {
			int num = sc.nextInt();
			System.out.println(inputNum(num));
		} catch (NegativeException ne) {
			System.out.println(ne);
		}
	}
	
	public static int inputNum(int num) throws NegativeException {
		
		if(num < 0) {
			NegativeException ext = new NegativeException();
			throw ext;
		} else
			return num;
	}
}

class NegativeException extends Exception {
	public NegativeException() {
		super("���� �Է� �ȵ�");
	}
}