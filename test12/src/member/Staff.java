package member;

public class Staff extends Person {
	
	private String div;
	private String position;
	
	public Staff(int num, String name, String address, String div, String position) {
		super(num, name, address);
		this.div = div;
		this.position = position;
	}
	
	public String getDiv() {
		return this.div;
	}
	
	public String getPosition() {
		return this.position;
	}
	
	public void print() {
		System.out.println("사원번호 : " + super.getNum());
		System.out.println("이름 : " + super.getName());
		System.out.println("주소 : " + super.getAddress());
		System.out.println("근무부서 : " + this.div);
		System.out.println("직책 : " + this.position);
	}
}