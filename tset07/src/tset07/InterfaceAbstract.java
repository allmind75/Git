package tset07;

public class InterfaceAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//interface
		
		InterfaceExam interfaceExam = new InterfaceExam();
		
		interfaceExam.hello();
		interfaceExam.bye();
		
		
		//abstract
		
		Rectangle rectangle = new Rectangle();
		rectangle.area(10, 5);
		
		//Figure figure = new Figure();	//추상클래스로를 객체를 만들 수 없음.
	}

}


//interface
//interface는 추상메소드와 상수만 가짐, 로직 생성 불가능
//다중 interface 가능
interface aExam {
	public abstract void hello();
}

interface bExam {
	public abstract void bye();
	
}
//인터페이스 상속 시 인터페이스에 정의된 모든 추상 메소드 구현해야함
class InterfaceExam implements aExam, bExam {
	public void hello() {
		System.out.println("Hello!");
	}
	
	public void bye() {
		System.out.println("Bye!");
	}
}

//abstract, 
abstract class Figure {
	abstract void area(int a, int b);
}

class Rectangle extends Figure {
	void area(int a, int b) {
		System.out.println("area : " + (a*b));
	}
}