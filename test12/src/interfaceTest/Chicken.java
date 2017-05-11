package interfaceTest;

public class Chicken extends Game implements IGame{

	public Chicken(String name, int hp) {
		super(name, hp);
	}
	
	@Override
	public void move() {
		
		System.out.println("걸어서 이동");
	}
	
	@Override
	public void attack() {
		
		System.out.println("부리 공격");
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
