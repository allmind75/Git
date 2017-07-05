package member;

public class Session {

	private String name;
	private String value;

	public void setAttribute(String name, String value) {
		this.name = name;
		this.value = value;
	}

	public String getAttribute(String name) {
		if (this.name != null && this.name.equals(name)) {
			return this.value;
		} else {
			return null;
		}
	}
	
	public void removeAttribute(String name) {
		if(this.name != null && this.value != null && this.name.equals(name)) {
			this.name = null;
			this.value = null;
		}
	}
}
