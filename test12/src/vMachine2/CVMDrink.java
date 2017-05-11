package vMachine2;

import java.util.Scanner;

public class CVMDrink implements IMenu {
	
	private CStuff[] cStuff;
	
	public CVMDrink(CStuff[] cStuff) {
		this.cStuff = cStuff;
	}
	
	@Override
	public void Menu() {
		
		print();
		choice();
	}
	
	public void print() {
		
		System.out.println("[판매 메뉴]");
		for(int i=0 ; i<cStuff.length ; i++) {
			System.out.println(i+1 + cStuff[i].getName() + "(" + cStuff[i].getPrice() + ")" );
		}
		System.out.println();
	}
	
	public void choice() {
		
		String choice;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("제품을 선택하세요 > ");
		choice = sc.nextLine();
		
		if(choice.equals("1") || choice.equals("콜라")) {
			
			System.out.println("콜라를 구매하셨습니다.");
	
		} else if(choice.equals("2") || choice.equals("사이다")) {
			
			System.out.println("사이다를 구매하셨습니다.");
			
		} else if(choice.equals("3") || choice.equals("초코에몽")) {
			
			System.out.println("초코에몽을 구매하셨습니다.");
			
		} else if(choice.equals("4") || choice.equals("딸기에몽")) {
			
			System.out.println("딸기에몽을 구매하셨습니다.");
			
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		System.out.println();
	}
	

}
