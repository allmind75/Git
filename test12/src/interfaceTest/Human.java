package interfaceTest;

public class Human extends Game implements IGame{
	
	public Human(String name, int hp) {
		super(name, hp);
	}
	
	@Override
	public void move() {
		
		System.out.println("�޷��� �̵�");
	}
	
	@Override
	public void attack() {
		
		System.out.println("�ָ� ����");
	}
	
	@Override
	public String getName() {
		return super.getName();
	}
	
	@Override
	public int getHp() {
		return super.getHp();
	}
}
