package shape;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CShape[] shapes = new CShape[]{
				new CCircle("���� ��", 10, -10, 10),
				new CCircle("ū��", 100, 100, 50),
				new CRectangle("���� �簢��", 10, 200, 100, 50),
				new CRectangle("������ �簢��", 100, 250, 90, 45)};
		
		System.out.println("[���� ���]");	
		for(CShape s: shapes) {
			System.out.println("�̸� : " + s.getName());
		}
		
		System.out.println();
		
		System.out.println("[���� ����]");	
		for(CShape s: shapes) {
			System.out.println(s.getName()+ "�� ���� : " + s.areaCalc());
		}
	}

}
