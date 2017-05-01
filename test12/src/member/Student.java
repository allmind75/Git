package member;

public class Student extends Person {
	
	private String course;
	
	public Student(int num, String name, String address, String course) {	
		super(num, name, address);
		this.course = course;
	}
	
	public String getCourse() {
		return this.course;
	}
	
	public void print() {
		System.out.println("학생번호 : " + super.getNum());
		System.out.println("이름 : " + super.getName());
		System.out.println("주소 : " + super.getAddress());
		System.out.println("과정 : " + this.course);
	}
}
