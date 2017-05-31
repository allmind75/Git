package strategyPattern;

public class Unit {

	public ShootAction shootAction;
	public BombAction bombAction;
	
	public void doAttack() {
		shootAction.attack();
	}

	public void doBomb() {
		bombAction.bomb();		
	}
	
	public void display() {
		
		
	}
}
