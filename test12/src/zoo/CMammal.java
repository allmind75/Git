package zoo;

public class CMammal extends Animal implements IManageInfo{

	public CMammal(String name, String kind, String managerName, double age, int num) {
		super(name, kind, managerName, age, num);
	}
	
	@Override
	public String getName() {
		return super.getName();
	}
	
	@Override
	public String getKind() {
		return super.getKind();
	}
	
	@Override
	public String getManagerName() {
		return super.getManagerName();
	}
	
	@Override
	public double getAge() {
		return super.getAge();
	}
	
	@Override
	public String getAIPreventDay() {
		String str = "Àû¿ë¾ÈµÊ";
		return str;
	}
	
	@Override
	public int getNum() {
		return super.getNum();
	}
	
}
