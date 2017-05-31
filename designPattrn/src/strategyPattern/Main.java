package strategyPattern;

public class Main {

	/* http://flowarc.tistory.com/entry/1-Strategy-Pattern
	 * [Strategy Pattern]
	 * 어떤 동작을 하는 로직을 정의하고, 하나로 묶어서(캡슐화) 관리하는 패턴
	 * 
	 * 로직을 사용하는 객체들은 자기의 입맛에 맞게 효율적으로 수정 가능
	 * 
	 * 새로운 로직을 추가하거나 변경할 때 객체의 종류 수 만큼 반복하지 않고
	 * 단 한번으로 반영할 수 있다.
	 */
	
	public static void main(String[] args) {
		
		Fighter fighter = new Fighter();
		Helicopter helicopter = new Helicopter();
		
		fighter.display();
		helicopter.display();
	}
}
