package test12;

abstract class Monster {

	public abstract void attack();
}

class Orc extends Monster {
	
	@Override
	public void attack() {
		System.out.println("Orc Attack!");
	}
}

class Elf extends Monster {
	
	@Override
	public void attack() {
		System.out.println("Elf Attcak!");
	}
}


public class Game {
	
	public static void main(String[] args) {
		
		Monster[] monster = new Monster[]{new Orc(), new Elf()};
		
		for(Monster m: monster) {
			m.attack();
		}
	}
}