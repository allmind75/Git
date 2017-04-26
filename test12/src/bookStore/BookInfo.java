package bookStore;

public class BookInfo {
	
	private String name;
	private String publisher;
	private String author;
	private int price;
	private int stock;
	
	BookInfo(String name, String publisher, String author, int price, int stock) {
		this.name = name;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}
	
	public void printBookInfo() {
		System.out.println(this.name + "\t" + this.publisher + "\t" + this.author + "\t" + this.price
				 + "\t" + this.stock);
	}
	
	public String getBookName() {
		return this.name;
	}
	
	public String getBookPublisher() {
		return this.publisher;
	}
	
	public String getBookAuthor() {
		return this.author;
	}
	
	public int getBookPrice() {
		return this.price;
	}
	
	public void setBookPrice(int price) {
		this.price = price;
	}
	
	public int getBookStock() {
		return this.stock;
	}
	
	public void setBookStock(int stock) {
		this.stock = stock;
	}
}