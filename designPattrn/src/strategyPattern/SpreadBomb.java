package strategyPattern;

public class SpreadBomb implements BombAction {

	@Override
	public void bomb() {
		System.out.println("SpreadBomb!!!");
	}
}
