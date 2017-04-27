package vMachine;

public class VMachine {

	private Drink[] drink;
	
	VMachine(Drink[] drink) {
		this.drink = drink;
	}
	
	public void printDrink() {
		
		for(int i=0 ; i<drink.length ; i++) {
			System.out.print(drink[i].getProductNum() +". " + drink[i].getName() + "/" + drink[i].getPrice() + "\t");
		}
		System.out.println("5. 종료");
	}
	
	public void printChoice(int num) {
		System.out.println("[" + this.getNameByNum(num) + "구매를 선택 하셨습니다. 판매 가격은 " + this.getPriceByNum(num) + "입니다.");
		System.out.print("금액 투입 : ");
	}
	
	public void printChange(int num, int change) {
		
		if (change == -1) {
			System.out.println("투입 금액이 판매가격보다 적습니다.");
		} else {
			System.out.println(this.getNameByNum(num) + "을 구매하셨습니다. 판매 잔금 " + change + "원을 회수 하세요.");
		}
		System.out.println();
	}
		
	public int getChange(int num, int money) {
		
		int price = this.getPriceByNum(num);
		if(price > money) {
			return -1;
		} else {
			return (money - price);
		}
		
	}
	
	public int getPriceByNum(int num) {
		
		return drink[num-1].getPrice();
	}
	
	public String getNameByNum(int num) {
	
		return drink[num-1].getName();
	}
	
}
