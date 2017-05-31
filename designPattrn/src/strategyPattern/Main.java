package strategyPattern;

public class Main {

	/* http://flowarc.tistory.com/entry/1-Strategy-Pattern
	 * [Strategy Pattern]
	 * � ������ �ϴ� ������ �����ϰ�, �ϳ��� ���(ĸ��ȭ) �����ϴ� ����
	 * 
	 * ������ ����ϴ� ��ü���� �ڱ��� �Ը��� �°� ȿ�������� ���� ����
	 * 
	 * ���ο� ������ �߰��ϰų� ������ �� ��ü�� ���� �� ��ŭ �ݺ����� �ʰ�
	 * �� �ѹ����� �ݿ��� �� �ִ�.
	 */
	
	public static void main(String[] args) {
		
		Fighter fighter = new Fighter();
		Helicopter helicopter = new Helicopter();
		
		fighter.display();
		helicopter.display();
	}
}
