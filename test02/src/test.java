//package name 안주고 생성시
//default package

public class test {
	public static void main(String[] args) {

		int width, height, area;

		width = 200;
		height = 100;
		area = width * height;

		System.out.println("가로길이 : " + width + "\n" + "세로길이 : " + height + "\n" + "사각형넓이 : " + area);

		float n1 = 5;
		float n2 = 3;
		double n3 = 5;
		double n4 = 3;

		System.out.println("float : " + n1 / n2);
		System.out.println("double : " + n3 / n4);

		double x, y, z;
		x = 0.1;
		y = 0.2;
		z = x + y;
		System.out.println("double : x + y = " + z);

		short d1 = 1;
		short d2 = 2;
		// short d3 = d1 + d2; //오류발생//byte와 short의 산술연산 결과는 int형
		short d3 = (short) (d1 + d2);
		int d4 = d1 + d2;

		// 문제01, 삼각형 넓이 구하기, 밑변 : 30.25, 높이 : 25.75
		double downSide = 30.25;
		double height1 = 25.75;
		double triArea;
		triArea = downSide * height1 / 2;
		System.out.println("\n<삼각형 넓이 구하기 - 밑변 : " + downSide + " / 높이 : " + height1 + ">");
		System.out.println("삼각형 넓이  = " + triArea);

		// 문제02, 원의 넓이 구하기, 반지름 : 20,
		final double pi = 3.141592;
		double r = 20;
		double cirArea;
		cirArea = pi * r * r;
		System.out.println("\n<원의 넓이 구하기 - 반지름 : " + r + " / pi : 3.141592" + ">");
		System.out.println("원의 넓이 = " + cirArea);

		// 문제03, 사각형에서 내부 삼각형 넓이 뺀 넓이, 삼각형(밑변 : 25.5, 높이 : 10), 사각형(밑변 : 100, 높이
		// : 50)
		double triDownSide = 25.5;
		double triHeight = 10;
		double recDownSide = 100;
		double recHeight = 50;
		double area1;
		area1 = recDownSide * recHeight - triDownSide * triHeight / 2;
		System.out.println("\n사각형에서 내부 삼각형을 제외한 넓이 : " + area1);

		// 문제04, 구의 겉넓이, 부피 구하기(반지름 :20)
		double r2 = 20;
		double surfaceArea;
		double volume;
		surfaceArea = 4 * pi * r2 * r2;
		volume = pi * r2 * r2 * r2 * 4 / 3;
		System.out.println("\n구의 겉넓이 = " + surfaceArea);
		System.out.println("구의 부피 = " + volume);
		System.out.printf("구의부피 : %.3f\n" , volume);

		
		int x1=10, y1=20;
		double R = 20;
		System.out.printf("\nx=%10d y=%-10d r2=%f\n",x1, y1, r2);
		System.out.printf("pi : %.2f, R : %3.1f", pi, R);
	}

}
