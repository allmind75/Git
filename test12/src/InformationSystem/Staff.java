package InformationSystem;

public class Staff extends PersonInfo{

	private String division;
	private String position;
	
	public Staff(String name, String address, String division, String position) {
		super(name, address);
		this.division = division;
		this.position = position;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("\t" + this.division + "\t" + this.position);
	}
}

