package vMachine;

public class Drink {

	private int productNum;
	private String name;
	private int price;
	
	public Drink(int productNum, String name, int price) {
		
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
	
	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}
