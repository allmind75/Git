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
		System.out.println("����!!");
	}
}

class Lion extends Animal implements Predator, Barkable {
	
	public String getName() {
		return this.name;
	}
	
	public void bark() {
		System.out.println("������!!");
	}
}

public class InterfaceTest {

	public void feed(Predator predator) {
		System.out.println("feed : " + predator.getName());
	}
	
	
	//������(����������)
	//�ϳ��� ��ü�� �������� �ڷ��� Ÿ���� ���� �� �ִ� ��
	
	/*
	 * tiger, lion ��ü�� Tiger, Lion Ŭ���� ��ü�̸鼭
	 * Animal Ŭ������ ��ü�̱⵵ �ϰ�
	 * Barkable, Predator �������̽��� ��ü�̱⵵ ��
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
