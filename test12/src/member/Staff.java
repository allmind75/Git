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
		System.out.println("�����ȣ : " + super.getNum());
		System.out.println("�̸� : " + super.getName());
		System.out.println("�ּ� : " + super.getAddress());
		System.out.println("�ٹ��μ� : " + this.div);
		System.out.println("��å : " + this.position);
	}
}