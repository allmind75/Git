
public class Game {

	Monster[] monster = new Monster[]{new Orc(), new Elf()};

	public void attack() {
		
		for(Monster m: monster) {
			m.attack();
		}
	}
	public static void main(String[] args) {
		
		Game game = new Game();
		
		game.attack();
		
	}
}
