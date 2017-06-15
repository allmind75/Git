package practice4;

public abstract class CGameObject {

	private boolean state;
	private String tag;
	private String name;
	
	public CGameObject(boolean state, String tag, String name) {
		this.state = state;
		this.tag = tag;
		this.name = name;
	}
	
	public abstract void attack(CGameObject obj);

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
