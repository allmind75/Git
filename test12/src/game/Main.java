package game;

public class Main {

	Monster[] mon = new Monster[]{
			new BlueDragon(),
			new SilverDragon(),
			new RedDragon()};
	
	public void printAttack() {
		
		for(Monster m: mon) {
			m.attack();
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main main = new Main();
		
		main.printAttack();

	}
	


}
