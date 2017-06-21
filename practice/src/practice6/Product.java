package practice6;

public class Product {

	private String name;
	private Company company;
	private int price;
	private String date;
	
	public Product(String name, Company company, int price, String date) {
		this.name = name;
		this.company = company;
		this.price = price;
		this. date = date;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
