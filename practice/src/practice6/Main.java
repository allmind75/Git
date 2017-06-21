package practice6;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		Scanner sc = new Scanner(System.in);
		
		Product[] product = new Product[]{
				new Product("아이폰7", Company.Apple, 80, "2017-06-19"),
				new Product("갤럭시8", Company.Samsung, 80, "2017-06-20"),
				new Product("G6", Company.LG, 80, "2017-06-21")};
		
		System.out.println("[메뉴 - 제품정보를 알고 싶은 제조사 입력]");
		System.out.print("입력> ");
		str = sc.nextLine();
		
		for(Product p: product) {
			
			//문자열비교
			if(p.getCompany().name().equals(str)) {
				System.out.println("제품이름 : " + p.getName());
				System.out.println("제 조 사 : " + p.getCompany());
				System.out.println("가    격 : " + p.getPrice());
				System.out.println("제조날짜 : " + p.getDate());
			}
			
			//enum 비교(숫자 비교)
			if(p.getCompany() == Company.valueOf(str)) {
				System.out.println("다른방법");
			}
		}
		
		sc.close();
		
	}

}
