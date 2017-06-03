package strategyPattern;

public class Fighter extends Unit{
	
	public Fighter() {
		
		super.shootAction = new OneWayMissile();
	}
	
	@Override
	public void display() {
		super.shootAction.attack();
		
	}
}
