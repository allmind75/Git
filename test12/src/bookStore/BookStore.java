package bookStore;

public class BookStore {
	
	private BookInfo[] bookList; 
	
	BookStore(BookInfo[] bookList) {
		this.bookList = bookList;
	}
	
	public void printBookList() {

		System.out.println("[��� ���� ���� ���]");
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
			System.out.println("ã�� �������� �����ϴ�.");
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
			System.out.println("ã�� ���ǻ簡 �����ϴ�.");
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
			System.out.println("ã�� ���ڰ� �����ϴ�.");
		}
	}
	
	public void printTitle() {

		System.out.println("[������" +"\t\t" + "���ǻ�" + "\t\t" + "����" + "\t" + "�ǸŰ�" + "\t" + "������]");
	}
	
}
