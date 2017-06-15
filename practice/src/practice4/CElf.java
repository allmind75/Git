package practice4;

public class CElf extends CMonster {
	
	public CElf(boolean state, String name) {
		super(state, name);
	}
	
	@Override
	public void attack(CGameObject obj) {
		System.out.println(super.getName() + "이(가) 숏보우로 " + obj.getName() + "을(를) 공격함");
	}

}
