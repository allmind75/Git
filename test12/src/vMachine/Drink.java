package vMachine;

public class Drink {

	private int productNum;
	private String name;
	private int price;
	
	Drink(int productNum, String name, int price) {
		
		this.productNum = productNum;
		this.name = name;
		this.price = price;
	}
	
	public int getProductNum(){
		return this.productNum;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
}
