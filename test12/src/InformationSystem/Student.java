package InformationSystem;

public class Student extends PersonInfo{
	
	private String stdNum;
	private int grade;
	private String major;
	
	public Student(String name, String address, String stdNum, int grade, String major) {
		super(name, address);
		this.stdNum = stdNum;
		this.grade = grade;
		this.major = major;
	}

	public String getStdNum() {
		return stdNum;
	}

	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("\t\t" + this.stdNum + "\t" + this.grade + "\t" + this.major);
	}
	
}
