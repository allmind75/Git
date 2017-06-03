package strategyPattern;

public class Nobomb implements BombAction {
	
	@Override
	public void bomb() {
		System.out.println("Nobomb...");
	}

}
