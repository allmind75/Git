package practice4;

public class COrc extends CMonster {

	public COrc(boolean state, String name) {
		super(state, name);
	}
	
	@Override
	public void attack(CGameObject obj) {
		System.out.println(super.getName() + "��(��) �������� " + obj.getName() + "��(��) ������");
	}
}
