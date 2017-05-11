package zoo;

public class CBird extends Animal implements IManageInfo{

	public CBird(String name, String kind, String managerName, double age,
			String aiPreventDay, int num) {
		super(name, kind, managerName, age, aiPreventDay, num);
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
		return super.getAiPrventDay();
	}
	
	@Override
	public int getNum() {
		return super.getNum();
	}
}
