package strategyPattern;

public class OneWayMissile implements ShootAction {
	
	@Override
	public void attack() {
		
		System.out.println("OneWayMissile!!!");
	}

}
