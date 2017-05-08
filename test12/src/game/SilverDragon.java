package game;

public class SilverDragon extends Dragon{

	public SilverDragon() {
		super("실버드래곤");
	}
	
	@Override
	public void attack() {
		System.out.println(super.getName() + "이 냉기 공격");
	}
	
}
