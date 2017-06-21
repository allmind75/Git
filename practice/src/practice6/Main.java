package practice6;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		Scanner sc = new Scanner(System.in);
		
		Product[] product = new Product[]{
				new Product("������7", Company.Apple, 80, "2017-06-19"),
				new Product("������8", Company.Samsung, 80, "2017-06-20"),
				new Product("G6", Company.LG, 80, "2017-06-21")};
		
		System.out.println("[�޴� - ��ǰ������ �˰� ���� ������ �Է�]");
		System.out.print("�Է�> ");
		str = sc.nextLine();
		
		for(Product p: product) {
			
			//���ڿ���
			if(p.getCompany().name().equals(str)) {
				System.out.println("��ǰ�̸� : " + p.getName());
				System.out.println("�� �� �� : " + p.getCompany());
				System.out.println("��    �� : " + p.getPrice());
				System.out.println("������¥ : " + p.getDate());
			}
			
			//enum ��(���� ��)
			if(p.getCompany() == Company.valueOf(str)) {
				System.out.println("�ٸ����");
			}
		}
		
		sc.close();
		
	}

}
