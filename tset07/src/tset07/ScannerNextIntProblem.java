package tset07;

import java.util.Scanner;

public class ScannerNextIntProblem {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		String str;
		
		System.out.print("num �Է�> ");
//		num = scan.nextInt();
//		scan.nextLine();
		try {
			num = Integer.parseInt(scan.nextLine());
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.print("str �Է�> ");
		str = scan.nextLine();
		
		System.out.println();
		System.out.println("num : " + num);
		System.out.println("str : " + str);
		scan.close();
	}
}
