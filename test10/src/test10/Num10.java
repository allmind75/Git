package test10;

import java.util.Scanner;

public class Num10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[배열2 - 문제. 1]");

		int[][] fruit = new int[][] { { 500, 400, 300, 600 }, { 1000, 900, 1200, 1500 }, { 10000, 9000, 8000, 7000 },
				{ 1000, 800, 1200, 900 } };
		String[] fruitName = new String[] { "토마토", "참외", "수박", "우유" };
		String[] mart = new String[] { "하나로 마트", "행복한 마트", "더 좋은 마트", "세븐 일레븐" };
		boolean run = true;
		int index = 0;

		while (run) {
			int choice;
			int choiceMenu;

			System.out.println("\n메뉴] 1.마트별 판매시세 \t 2.품목별 판매시세 \t 3.최저가 시세보기 \t 4.종료하기");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("마트별 판매 시세] 1.하나로 마트 \t 2.행복한 마트 \t 3.더 좋은 마트 \t 4.세븐 일레븐");
				choiceMenu = sc.nextInt();
				index = choiceMenu - 1;

				System.out.print(mart[index] + " : ");
				for (int i = 0; i < fruitName.length; i++) {
					if (i == mart.length - 1) {
						System.out.print(fruitName[i] + " " + fruit[i][index] + "원");
					} else {
						System.out.print(fruitName[i] + " " + fruit[i][index] + "원, ");	
					}
				}
				System.out.println();
				break;
			case 2:
				System.out.println("품목별 판매 시세] 1.토마토 \t 2.참외 \t 3.수박 \t 4.우유");
				choiceMenu = sc.nextInt();
				index = choiceMenu - 1;

				System.out.print(fruitName[index] + " : ");
				for (int i = 0; i < fruitName.length; i++) {
					if (i == mart.length - 1) {
						System.out.print(mart[i] + " " + fruit[index][i] + "원");
					} else {
						System.out.print(mart[i] + " " + fruit[index][i] + "원, ");	
					}
				}
				System.out.println();
				break;
			case 3:
				int min;

				System.out.println("과일" + "\t" + "최저가" + "\t" + "판매마트");
				for(int i=0 ; i<fruitName.length ; i++) {
					
					min = fruit[i][0];
					for(int j=0 ; j<fruit[0].length ; j++) {
						if(fruit[i][j] < min) {
							min = fruit[i][j];
							index = j;
						}
					}
					System.out.println(fruitName[i] + "\t" + min + "\t" + mart[index]);
				}
				break;
			case 4:
				run = false;
				System.out.println("프로그램 종료");
				break;
			}
		}
		sc.close();
		
	}

}
