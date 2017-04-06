package test05;

import java.util.Scanner;

import javax.swing.JFrame;


/*
 * scanner 클래스에서
 * while문 종료시켜보기
 * http://egloos.zum.com/LucasLee/v/571015 
 */
public class ScannerDelimiter {

	public static void main(String[] args) {
		int strNum = 0;
		String line;

		System.out.print("입력 : ");
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		if(sc1.hasNext()) {
			line = sc1.nextLine();
			sc2 = new Scanner(line).useDelimiter(" ");
			
			while(sc2.hasNext()) {
				String s = sc2.next();
				System.out.println(s);
				strNum++;
			}
		}
		
		System.out.println("입력한 문자열 중 단어 수는 : " + strNum);
		
		sc1.close();
		sc2.close();
	}
}
