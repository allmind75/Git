package test12;

import java.util.Scanner;

public class Num04 {

	public static void main(String[] args) {
		
		BookInfo[] bookList = new BookInfo[]{
				new BookInfo("자바공부", "한빛미디어", "홍길동", 20000, 10),
				new BookInfo("부자되기", "하늘과 바다", "유재석", 25000, 20),
				new BookInfo("좋은 시간 관리", "한빛미디어", "강호동", 17000, 30),
				new BookInfo("성공하기", "하늘과 바다", "유재석", 25000, 5)};
		
		BookStore bookStore = new BookStore(bookList);
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("==============================[Book Store]==============================");
		while(run) {
			
			int choice;
			String str;
			
			System.out.println("1.모든 도서 정보 출력" + "\t\t" + "2.도서명 검색" + "\t\t" + "3.출판사 검색" + "\t\t" + "4.저자 검색" + "\t\t" + "5.종료");
			
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				bookStore.printBookList();
				break;
			case 2:
				System.out.println("");
				break;
			case 3:
				 break;
			case 4:
				break;
			case 5:
				run =false;
				System.out.println("프로그램종료");
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
		System.out.println("도 서 명 : " + this.name);
		System.out.println("출 판 사 : " + this.publisher);
		System.out.println("저    자 : " + this.author);
		System.out.println("판 매 가 : " + this.price);
		System.out.println("재고수량 : " + this.stock);
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
	
	public void bookPriceChange(int price) {
		this.price = price;
	}
	
	public int getBookStock() {
		return this.stock;
	}
	
	public void bookStockChange(int stock) {
		this.stock = stock;
	}
}

class BookStore {
	
	BookInfo[] bookList; 
	
	BookStore(BookInfo[] bookList) {
		this.bookList = bookList;
	}
	
	public void printBookList() {
		System.out.println("[모든 도서 정보 출력]");
		System.out.println("도서명" +"\t\t" + "출판사" + "\t\t" + "저자" + "\t" + "판매가" + "\t" + "재고수량");
		for(int i=0 ; i<bookList.length ; i++) {
			System.out.println(bookList[i].name + "\t" + bookList[i].publisher + "\t" + bookList[i].author + "\t" + bookList[i].price
					 + "\t" + bookList[i].stock);

		}
		System.out.println();
		
	}
	
	public void searchBookName(String name) {
		
		for(BookInfo b: bookList) {
			if(b.getBookName().equals(name)) {
				b.printBookInfo();
			}
		}
	}
	
	public void searchBookPublisher(String publisher) {
		
		for(BookInfo b: bookList) {
			if(b.getBookPublisher().equals(publisher)) {
				b.printBookInfo();
			}
		}
	}

	public void searchBookAuthor(String Author) {
		
		for(BookInfo b: bookList) {
			if(b.getBookAuthor().equals(Author)) {
				b.printBookInfo();
			}
		}
	}
}
