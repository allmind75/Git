package shape;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CShape[] shapes = new CShape[]{
				new CCircle("작은 원", 10, -10, 10),
				new CCircle("큰원", 100, 100, 50),
				new CRectangle("왼쪽 사각형", 10, 200, 100, 50),
				new CRectangle("오른쪽 사각형", 100, 250, 90, 45)};
		
		System.out.println("도형 목록");	
		for(CShape s: shapes) {
			System.out.println("이름 : " + s.getName());
		}
		
		System.out.println("도형 넓이");	
		for(CShape s: shapes) {
			System.out.println(s.getName()+ "의 넓이 : " + s.areaCalc());
		}
	}

}
