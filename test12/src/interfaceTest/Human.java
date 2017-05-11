package interfaceTest;

public class Human extends Game implements IGame{
	
	public Human(String name, int hp) {
		super(name, hp);
	}
	
	@Override
	public void move() {
		
		System.out.println("달려서 이동");
	}
	
	@Override
	public void attack() {
		
		System.out.println("주먹 공격");
	}
	
	@Override
	public String getName() {
		return super.getName();
	}
	
	@Override
	public int getHp() {
		return super.getHp();
	}
}
