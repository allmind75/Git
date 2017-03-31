package tset07;

public class ClassOverride {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass childClass = new ChildClass();
		childClass.DisplayMethod();
	}

}

class ParentClass {
	public void DisplayMethod() {
		System.out.println("ParentClass DisplayMethod()");
	}
}

class ChildClass extends ParentClass {
	@Override
	public void DisplayMethod() {
		super.DisplayMethod();
		System.out.println("ChildClas DisplayMethod()");
	}
}
