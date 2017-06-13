package practice1;

public class CPerson {

	private String name;
	private String addr;
	
	public CPerson(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getAddr() {
		return this.addr;
	}
}
