package game;

public class BlueDragon extends Dragon{

	public BlueDragon() {
		super("블루드래곤");
	}
	
	@Override
	public void attack() {
		System.out.println(super.getName() + "이 얼음 공격");
	}
}
