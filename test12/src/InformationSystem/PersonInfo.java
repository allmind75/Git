package InformationSystem;

public class PersonInfo {

	private String name;
	private String address;
	
	public PersonInfo(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void print() {
		System.out.print(this.name + "\t" + this.address);
	}
}
