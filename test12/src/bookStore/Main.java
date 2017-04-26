package bookStore;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		BookInfo[] bookList = new BookInfo[]{
				new BookInfo("자바공부", "한빛미디어", "홍길동", 20000, 10),
				new BookInfo("부자되기", "하늘과 바다", "유재석", 25000, 20),
				new BookInfo("좋은 시간 관리", "한빛미디어", "강호동", 17000, 30),
				new BookInfo("성공하기", "하늘과 바다", "유재석", 25000, 5)};
		
		BookStore bookStore = new BookStore(bookList);
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("\t\t===================[Book Store]===================");
		while(run) {
			
			int choice;
			String str;
			
			System.out.println("[1.모든 도서 정보 출력" + "\t" + "2.도서명 검색" + "\t" + "3.출판사 검색" + "\t" + "4.저자 검색" + "\t" + "5.종료]");
			
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				bookStore.printBookList();
				break;
			case 2:
				System.out.print("도서명 입력> ");
				str = sc.nextLine();
				bookStore.searchBookName(str);
				break;
			case 3:
				System.out.print("출판사 입력> ");
				str = sc.nextLine();
				bookStore.searchBookPublisher(str);
				 break;
			case 4:
				System.out.print("저자 입력> ");
				str = sc.nextLine();
				bookStore.searchBookAuthor(str);
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