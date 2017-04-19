package test11;

public class Num01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[문제 1] 빗 금친 부분의 넓이 구하기");
		
		Shape shape = new Shape();
		double area = shape.rectArea(100.0, 35.0);
		
		area -= (shape.rectArea(20.25, 10.12) + shape.circleArea(9.82) + shape.triArea(20, 10)); 
		
		System.out.println("빗 금친 부분의 넓이 : " + area);
	}
}
