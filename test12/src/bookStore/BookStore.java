package bookStore;

public class BookStore {
	
	private BookInfo[] bookList; 
	
	BookStore(BookInfo[] bookList) {
		this.bookList = bookList;
	}
	
	public void printBookList() {

		System.out.println("[모든 도서 정보 출력]");
		printTitle();
		for(int i=0 ; i<bookList.length ; i++) {
			bookList[i].printBookInfo();
		}
		System.out.println();
		
	}
	
	public void searchBookName(String name) {
		
		int cnt = 0;
		
		
		for(BookInfo b: bookList) {
			if(b.getBookName().equals(name)) {
				if(cnt == 0) {
					printTitle();
				}
				b.printBookInfo();
				cnt++;
			}
		}
		
		if(cnt == 0) {
			System.out.println("찾는 도서명이 없습니다.");
		}
	}
	
	public void searchBookPublisher(String publisher) {
		
		int cnt = 0;
		
		for(BookInfo b: bookList) {
			if(b.getBookPublisher().equals(publisher)) {
				if(cnt == 0) {
					printTitle();
				}
				b.printBookInfo();
				cnt++;
			}	
		}
		
		if(cnt == 0) {
			System.out.println("찾는 출판사가 없습니다.");
		}
	}

	public void searchBookAuthor(String Author) {
		
		int cnt = 0;
		
		for(BookInfo b: bookList) {
			if(b.getBookAuthor().equals(Author)) {
				if(cnt == 0) {
					printTitle();
				}
				b.printBookInfo();
				cnt++;
			}
		}
		
		if(cnt == 0) {
			System.out.println("찾는 저자가 없습니다.");
		}
	}
	
	public void printTitle() {

		System.out.println("[도서명" +"\t\t" + "출판사" + "\t\t" + "저자" + "\t" + "판매가" + "\t" + "재고수량]");
	}
	
}
