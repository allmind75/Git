package practice4;

public class CHuman extends CGameObject {

	public CHuman(boolean state, String name) {
		super(state, "human", name);
	}
	
	@Override
	public void attack(CGameObject obj) {
		System.out.println(super.getName() + "이(가) 워해머로 " + obj.getName() + "을(를) 공격함");
	}
}
