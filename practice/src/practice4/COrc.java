package practice4;

public class COrc extends CMonster {

	public COrc(boolean state, String name) {
		super(state, name);
	}
	
	@Override
	public void attack(CGameObject obj) {
		System.out.println(super.getName() + "이(가) 돌도끼로 " + obj.getName() + "을(를) 공격함");
	}
}
