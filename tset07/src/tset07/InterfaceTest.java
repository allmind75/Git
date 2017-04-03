package tset07;


interface Predator {
	public String getName();
}

interface Barkable {
	public void bark();
}

class Animal {
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
}

class Tiger extends Animal implements Predator, Barkable{
	
	public String getName() {
		return this.name;
	}
	
	public void bark() {
		System.out.println("어흥!!");
	}
}

class Lion extends Animal implements Predator, Barkable {
	
	public String getName() {
		return this.name;
	}
	
	public void bark() {
		System.out.println("으르렁!!");
	}
}

public class InterfaceTest {

	public void feed(Predator predator) {
		System.out.println("feed : " + predator.getName());
	}
	
	
	//다형성(폴리모피즘)
	//하나의 객체가 여러개의 자료형 타입을 가질 수 있는 것
	
	/*
	 * tiger, lion 객체는 Tiger, Lion 클래스 객체이면서
	 * Animal 클래스의 객체이기도 하고
	 * Barkable, Predator 인터페이스의 객체이기도 함
	 **/

	public void barkAnimal(Barkable animal) {
		animal.bark();
	}
	
	public static void main(String[] args) {
		
		Tiger tiger = new Tiger();
		tiger.setName("tiger");
		
		Lion lion = new Lion();
		lion.setName("lion");
		
		InterfaceTest zooKeeper = new InterfaceTest();
		zooKeeper.feed(tiger);
		zooKeeper.feed(lion);
		
		zooKeeper.barkAnimal(tiger);
		zooKeeper.barkAnimal(lion);
		
		
	}
	

}
