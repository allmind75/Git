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
		
		System.out.println("[�Ǹ� �޴�]");
		for(int i=0 ; i<cStuff.length ; i++) {
			System.out.println(i+1 + cStuff[i].getName() + "(" + cStuff[i].getPrice() + ")" );
		}
		System.out.println();
	}
	
	public void choice() {
		
		String choice;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ǰ�� �����ϼ��� > ");
		choice = sc.nextLine();
		
		if(choice.equals("1") || choice.equals("�ݶ�")) {
			
			System.out.println("�ݶ� �����ϼ̽��ϴ�.");
	
		} else if(choice.equals("2") || choice.equals("���̴�")) {
			
			System.out.println("���̴ٸ� �����ϼ̽��ϴ�.");
			
		} else if(choice.equals("3") || choice.equals("���ڿ���")) {
			
			System.out.println("���ڿ����� �����ϼ̽��ϴ�.");
			
		} else if(choice.equals("4") || choice.equals("���⿡��")) {
			
			System.out.println("���⿡���� �����ϼ̽��ϴ�.");
			
		} else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		
		System.out.println();
	}
	

}
