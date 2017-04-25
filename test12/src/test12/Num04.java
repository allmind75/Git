package test12;

public class Num04 {

	public static void main(String[] args) {
		
		BookList[] bookList = new BookList[]{
				new BookList("�ڹٰ���", "�Ѻ��̵��", "ȫ�浿", 20000, 10),
				new BookList("���ڵǱ�", "�ϴð� �ٴ�", "���缮", 25000, 20),
				new BookList("���� �ð� ����", "�Ѻ��̵��", "��ȣ��", 17000, 30),
				new BookList("�����ϱ�", "�ϴð� �ٴ�", "���缮", 25000, 5)};
		
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
		System.out.println("�� �� �� : " + this.name);
		System.out.println("�� �� �� : " + this.publisher);
		System.out.println("��    �� : " + this.author);
		System.out.println("�� �� �� : " + this.price);
		System.out.println("������ : " + this.stock);
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
