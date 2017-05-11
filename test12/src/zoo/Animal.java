package zoo;

public class Animal {

	private String name;
	private String kind;
	private String managerName;
	private double age;
	private String aiPrventDay;
	private int num;
	
	public Animal(String name, String kind, String managerName, double age, String aiPreventDay, int num) {
		
		this.name = name;
		this.kind = kind;
		this.managerName = managerName;
		this.age = age;
		this.aiPrventDay = aiPreventDay;
		this.num = num;
	}
	
	public Animal(String name, String kind, String managerName, double age, int num) {
		
		this.name = name;
		this.kind = kind;
		this.managerName = managerName;
		this.age = age;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public double getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAiPrventDay() {
		return aiPrventDay;
	}

	public void setAiPrventDay(String aiPrventDay) {
		this.aiPrventDay = aiPrventDay;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}
