package test12;

import java.util.Scanner;

public class Num04 {

	public static void main(String[] args) {
		
		BookInfo[] bookList = new BookInfo[]{
				new BookInfo("�ڹٰ���", "�Ѻ��̵��", "ȫ�浿", 20000, 10),
				new BookInfo("���ڵǱ�", "�ϴð� �ٴ�", "���缮", 25000, 20),
				new BookInfo("���� �ð� ����", "�Ѻ��̵��", "��ȣ��", 17000, 30),
				new BookInfo("�����ϱ�", "�ϴð� �ٴ�", "���缮", 25000, 5)};
		
		BookStore bookStore = new BookStore(bookList);
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("[Book Store]");
		while(run) {
			
			int choice;
			String str;
			
			System.out.println("1.��� ���� ���� ���" + "\t" + "2.������ �˻�" + "\t" + "3.���ǻ� �˻�" + "\t" + "4.���� �˻�" + "\t" + "5.����");
			
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				bookStore.printBookList();
				break;
			case 2:
				System.out.print("������ �Է�> ");
				str = sc.nextLine();
				bookStore.searchBookName(str);
				break;
			case 3:
				System.out.print("���ǻ� �Է�> ");
				str = sc.nextLine();
				bookStore.searchBookPublisher(str);
				 break;
			case 4:
				System.out.print("���� �Է�> ");
				str = sc.nextLine();
				bookStore.searchBookAuthor(str);
				break;
			case 5:
				run =false;
				System.out.println("���α׷�����");
				break;
			}
			
		}
		
		sc.close();
	}
}

class BookInfo {
	
	String name;
	String publisher;
	String author;
	int price;
	int stock;
	
	BookInfo(String name, String publisher, String author, int price, int stock) {
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

class BookStore {
	
	BookInfo[] bookList; 
	
	BookStore(BookInfo[] bookList) {
		this.bookList = bookList;
	}
	
	public void printBookList() {
		System.out.println("[��� ���� ���� ���]");
		System.out.println("������" +"\t\t" + "���ǻ�" + "\t\t" + "����" + "\t" + "�ǸŰ�" + "\t" + "������");
		for(int i=0 ; i<bookList.length ; i++) {
			System.out.println(bookList[i].name + "\t" + bookList[i].publisher + "\t" + bookList[i].author + "\t" + bookList[i].price
					 + "\t" + bookList[i].stock);

		}
		System.out.println();
		
	}
	
	public void searchBookName(String name) {
		
		int cnt = 0;
		for(BookInfo b: bookList) {
			if(b.getBookName().equals(name)) {
				b.printBookInfo();
				System.out.println();
				cnt++;
			}
		}
		
		if(cnt == 0) {
			System.out.println("ã�� �������� �����ϴ�.");
		}
	}
	
	public void searchBookPublisher(String publisher) {
		
		int cnt = 0;
		
		for(BookInfo b: bookList) {
			if(b.getBookPublisher().equals(publisher)) {
				b.printBookInfo();
				System.out.println();
				cnt++;
			}	
		}
		
		if(cnt == 0) {
			System.out.println("ã�� ���ǻ簡 �����ϴ�.");
		}
	}

	public void searchBookAuthor(String Author) {
		
		int cnt = 0;
		
		for(BookInfo b: bookList) {
			if(b.getBookAuthor().equals(Author)) {
				b.printBookInfo();
				System.out.println();
				cnt++;
			}
		}
		
		if(cnt == 0) {
			System.out.println("ã�� ���ڰ� �����ϴ�.");
		}
	}
}
