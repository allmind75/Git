package game;

public class SilverDragon extends Dragon{

	public SilverDragon() {
		super("�ǹ��巡��");
	}
	
	@Override
	public void attack() {
		System.out.println(super.getName() + "�� �ñ� ����");
	}
	
}
