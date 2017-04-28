package vMachine;

public class VMachine {

	private Drink[] drink;
	
	public VMachine(Drink[] drink) {
		this.drink = drink;
	}
	
	public void printDrink() {
		
		for(int i=0 ; i<drink.length ; i++) {
			System.out.print(drink[i].getProductNum() +". " + drink[i].getName() + "/" + drink[i].getPrice() + "\t");
		}
		System.out.println("5. ����");
	}
	
	public void printChoice(int num) {
		System.out.println("[" + this.getNameByNum(num) + "���Ÿ� ���� �ϼ̽��ϴ�. �Ǹ� ������ " + this.getPriceByNum(num) + "�� �Դϴ�.]");
		System.out.print("�ݾ� ���� : ");
	}
	
	public void printChange(int num, int change) {
		
		if (change < 0) {
			System.out.println("���� �ݾ��� �ǸŰ��ݺ��� " + (-change) +  "�� �����ϴ�.");
		} else {
			System.out.println(this.getNameByNum(num) + "�� �����ϼ̽��ϴ�. �Ǹ� �ܱ� " + change + "���� ȸ�� �ϼ���.");
		}
		System.out.println();
	}
		
	public int getChange(int num, int money) {
		
		return money -  this.getPriceByNum(num);
		
	}
	
	public int getPriceByNum(int num) {
		
		return drink[num-1].getPrice();
	}
	
	public String getNameByNum(int num) {
	
		return drink[num-1].getName();
	}
	
}
