package test12;


class Fish {
	
	public String type = "ºØ¾î»§";
	public int price = 500;
	public static int cnt = 0;
	private static Fish instatnce = new Fish();
	
	private Fish() {
		
	}
	
	private Fish(String type, int price) {
		this.type = type;
		this.price = price;
	}
	
	public static Fish getInstance() {
		
		if(instatnce == null) {
			instatnce = new Fish();
			Fish.cnt++;
		} 
		
		return instatnce;
	}
	
	public static Fish getInstance(String type, int price) {
		
		if(instatnce == null) {
			instatnce = new Fish(type, price);
			Fish.cnt++;
		} else {
			instatnce.type = type;
			instatnce.price = price;	
		}
	
		return instatnce;
	}
	
}
public class Main {

	public static void main(String[] args) {

		Fish fish1 = Fish.getInstance();		
		System.out.println("fish1.type : " + fish1.type);
		System.out.println("fish1.price : " + fish1.price);
		System.out.println("fish1.cnt : " + Fish.cnt);
		System.out.println();
		
		Fish fish2 = Fish.getInstance();	
		System.out.println("fish2.type : " + fish2.type);
		System.out.println("fish2.price : " + fish2.price);
		System.out.println("fish2.cnt : " + Fish.cnt);
		System.out.println();
		
		Fish fish3 = Fish.getInstance("½´Å©¸²ºØ¾î»§", 700);	
		System.out.println("fish3.type : " + fish3.type);
		System.out.println("fish3.price : " + fish3.price);
		System.out.println("fish3.cnt : " + Fish.cnt);
		System.out.println();
		
		if(fish1 == fish2 && fish2 == fish3) {
			System.out.println("fish1 == fish2 == fish3\n");
		}
		
		System.out.println("fish1 ÂüÁ¶°ª : " + fish1);
		System.out.println("fish2 ÂüÁ¶°ª : " + fish2);
		System.out.println("fish3 ÂüÁ¶°ª : " + fish3);
	}

}
