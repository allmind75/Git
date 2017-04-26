package bookStore;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		BookInfo[] bookList = new BookInfo[]{
				new BookInfo("�ڹٰ���", "�Ѻ��̵��", "ȫ�浿", 20000, 10),
				new BookInfo("���ڵǱ�", "�ϴð� �ٴ�", "���缮", 25000, 20),
				new BookInfo("���� �ð� ����", "�Ѻ��̵��", "��ȣ��", 17000, 30),
				new BookInfo("�����ϱ�", "�ϴð� �ٴ�", "���缮", 25000, 5)};
		
		BookStore bookStore = new BookStore(bookList);
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("\t\t===================[Book Store]===================");
		while(run) {
			
			int choice;
			String str;
			
			System.out.println("[1.��� ���� ���� ���" + "\t" + "2.������ �˻�" + "\t" + "3.���ǻ� �˻�" + "\t" + "4.���� �˻�" + "\t" + "5.����]");
			
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