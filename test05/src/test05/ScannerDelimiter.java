package test05;

import java.util.Scanner;

import javax.swing.JFrame;


/*
 * scanner Ŭ��������
 * while�� ������Ѻ���
 * http://egloos.zum.com/LucasLee/v/571015 
 */
public class ScannerDelimiter {

	public static void main(String[] args) {
		int strNum = 0;
		String line;

		System.out.print("�Է� : ");
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		if(sc1.hasNext()) {
			line = sc1.nextLine();
			sc2 = new Scanner(line).useDelimiter(" ");
			
			while(sc2.hasNext()) {
				String s = sc2.next();
				System.out.println(s);
				strNum++;
				if(!sc2.hasNext()) break;
			}
		}
		
		System.out.println("�Է��� ���ڿ� �� �ܾ� ���� : " + strNum);
		
		sc1.close();
		sc2.close();
	}
}
