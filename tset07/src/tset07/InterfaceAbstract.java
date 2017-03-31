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
		
		//Figure figure = new Figure();	//�߻�Ŭ�����θ� ��ü�� ���� �� ����.
	}

}


//interface
//interface�� �߻�޼ҵ�� ����� ����, ���� ���� �Ұ���
//���� interface ����
interface aExam {
	public abstract void hello();
}

interface bExam {
	public abstract void bye();
	
}

//interface ���� ���
interface cExam extends aExam, bExam {
	
}
//�������̽� ��� �� �������̽��� ���ǵ� ��� �߻� �޼ҵ� �����ؾ���
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

class Rectangle extends Figure implements cExam{
	void area(int a, int b) {
		System.out.println("area : " + (a*b));
	}
	
	public void hello() {
		
	}
	
	public void bye() {
		
	}
}