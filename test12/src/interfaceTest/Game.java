package interfaceTest;

public class Game {

	private String name;
	private int hp;
	
	public Game(String name, int hp) {
		
		this.name = name;
		this. hp = hp;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
}
