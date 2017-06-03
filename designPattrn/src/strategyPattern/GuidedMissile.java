package strategyPattern;

public class GuidedMissile implements ShootAction {
	
	@Override
	public void attack() {
		System.out.println("GuidedMissile!!!");
	}

}
