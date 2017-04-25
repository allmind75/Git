package test12;

public class Num04 {

	public static void main(String[] args) {
		
		BookList[] bookList = new BookList[]{
				new BookList("자바공부", "한빛미디어", "홍길동", 20000, 10),
				new BookList("부자되기", "하늘과 바다", "유재석", 25000, 20),
				new BookList("좋은 시간 관리", "한빛미디어", "강호동", 17000, 30),
				new BookList("성공하기", "하늘과 바다", "유재석", 25000, 5)};
		
		for(BookList b: bookList) {
			b.printBookInfo();
			System.out.println();
		}
	}
}

class BookList {
	
	String name;
	String publisher;
	String author;
	int price;
	int stock;
	
	BookList(String name, String publisher, String author, int price, int stock) {
		this.name = name;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}
	
	public void printBookInfo() {
		System.out.println("도 서 명 : " + this.name);
		System.out.println("출 판 사 : " + this.publisher);
		System.out.println("저    자 : " + this.author);
		System.out.println("판 매 가 : " + this.price);
		System.out.println("재고수량 : " + this.stock);
	}
	
	public String bookName() {
		return this.name;
	}
	
	public String bookPublisher() {
		return this.publisher;
	}
	
	public String bookAuthor() {
		return this.author;
	}
	
	public int bookPrice() {
		return this.price;
	}
	
	public void bookPriceChange(int price) {
		this.price = price;
	}
	
	public int bookStock() {
		return this.stock;
	}
	
	public void bookStockChange(int stock) {
		this.stock = stock;
	}
}
