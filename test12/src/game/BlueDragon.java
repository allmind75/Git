package game;

public class BlueDragon extends Dragon{

	public BlueDragon() {
		super("���巡��");
	}
	
	@Override
	public void attack() {
		System.out.println(super.getName() + "�� ���� ����");
	}
}
