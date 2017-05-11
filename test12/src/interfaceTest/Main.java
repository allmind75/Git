package interfaceTest;

public class Main {

	static IGame[] game = new IGame[]{new Human("»ç¶÷", 100), new Chicken("´ß", 10)};

	public static void move() {
		
		for(IGame g: game) {
			g.move();
		}
	}
	
	public static void attack() {
		
		for(IGame g: game) {
			g.attack();
		}
	}
	
	public static void name() {
		
		for(IGame g: game) {
			System.out.println(g.getName());
		}
	}
	
	public static void hp() {
		
		for(IGame g: game) {
			System.out.println(g.getHp());
		}
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
		
		main.move();
		main.attack();
		main.name();
		main.hp();

	}
}
