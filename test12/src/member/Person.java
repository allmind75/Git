package member;

public class Person {

	private int num;
	private String name;
	private String address;

	public Person() {

	}

	public Person(int num, String name, String address) {
		this.num = num;
		this.name = name;
		this.address = address;
	}

	public int getNum() {
		return this.num;
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}
