package practice2;

public class Staff {

	private int number;
	private String name;
	private int age;
	private String part;
	private String position;
	private String address;
	
	public Staff(int number, String name, int age, String part, String position, String address) {
		
		this.number = number;
		this.name = name;
		this.age = age;
		this.part = part;
		this.position = position;
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void print() {
		System.out.println(getNumber() + " " + getName() + " " + getAge() + " " + getPart() + " " + getPosition() + " " + getAddress());
	}
	
	
}
