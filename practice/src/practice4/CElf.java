package practice4;

public class CElf extends CMonster {
	
	public CElf(boolean state, String name) {
		super(state, name);
	}
	
	@Override
	public void attack(CGameObject obj) {
		System.out.println(super.getName() + "��(��) ������� " + obj.getName() + "��(��) ������");
	}

}
