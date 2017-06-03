package strategyPattern;

public class Helicopter extends Unit {

	public Helicopter() {
		
		super.shootAction = new GuidedMissile();
	}
	
	@Override
	public void display() {
		super.shootAction.attack();
	}
}
