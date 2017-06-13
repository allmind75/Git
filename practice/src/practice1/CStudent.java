package practice1;

public class CStudent extends CPerson {

	private String major;
	private int grade;
	
	public CStudent(String name, String addr, String major, int grade) {
		super(name, addr);
		this.major = major;
		this.grade = grade;
	}
	
	public void printCStudent() {
		System.out.println(super.getName() + " " + super.getAddr() + " " + this.major + " " + this.grade);
	}
}
