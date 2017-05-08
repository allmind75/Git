package game;

public class RedDragon extends Dragon{
	
	public RedDragon() {
		super("레드드래곤");
	}
	
	@Override
	public void attack() {
		System.out.println(super.getName() + "이 불로 공격");
	}
}
