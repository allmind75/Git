package practice1;

public class CStaff extends CPerson{

	private String part;
	private String position;
	
	public CStaff(String name, String addr, String part, String position) {
		super(name, addr);
		this.part = part;
		this.position = position;
	}
	
	public void printCStaff() {
		System.out.println(super.getName() + " " + super.getAddr() + " " + this.part + " " + this.position);
	}
}
