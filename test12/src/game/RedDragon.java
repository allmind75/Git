package game;

public class RedDragon extends Dragon{
	
	public RedDragon() {
		super("����巡��");
	}
	
	@Override
	public void attack() {
		System.out.println(super.getName() + "�� �ҷ� ����");
	}
}
