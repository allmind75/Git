package test11;

public class Num01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[문제 1] 빗 금친 부분의 넓이 구하기");
		
		double area = 100.0 * 35.0;
		
		area -= (rectArea(20.25, 10.12) + circleArea(9.82) + triArea(20, 10)); 
		
		System.out.println("빗 금친 부분의 넓이 : " + area);
	}

	static double rectArea(double w, double h) {
		return w*h;
	}
	
	static double circleArea(double r) {
		return r*r*Math.PI;
	}
	
	static double triArea(double w, double h) {
		return w*h/2;
	}

}
