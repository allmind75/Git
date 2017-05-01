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
		System.out.println("�л���ȣ : " + super.getNum());
		System.out.println("�̸� : " + super.getName());
		System.out.println("�ּ� : " + super.getAddress());
		System.out.println("���� : " + this.course);
	}
}
