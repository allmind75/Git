//package name ���ְ� ������
//default package

public class test {
	public static void main(String[] args) {

		int width, height, area;

		width = 200;
		height = 100;
		area = width * height;

		System.out.println("���α��� : " + width + "\n" + "���α��� : " + height + "\n" + "�簢������ : " + area);

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
		// short d3 = d1 + d2; //�����߻�//byte�� short�� ������� ����� int��
		short d3 = (short) (d1 + d2);
		int d4 = d1 + d2;

		// ����01, �ﰢ�� ���� ���ϱ�, �غ� : 30.25, ���� : 25.75
		double downSide = 30.25;
		double height1 = 25.75;
		double triArea;
		triArea = downSide * height1 / 2;
		System.out.println("\n<�ﰢ�� ���� ���ϱ� - �غ� : " + downSide + " / ���� : " + height1 + ">");
		System.out.println("�ﰢ�� ����  = " + triArea);

		// ����02, ���� ���� ���ϱ�, ������ : 20,
		final double pi = 3.141592;
		double r = 20;
		double cirArea;
		cirArea = pi * r * r;
		System.out.println("\n<���� ���� ���ϱ� - ������ : " + r + " / pi : 3.141592" + ">");
		System.out.println("���� ���� = " + cirArea);

		// ����03, �簢������ ���� �ﰢ�� ���� �� ����, �ﰢ��(�غ� : 25.5, ���� : 10), �簢��(�غ� : 100, ����
		// : 50)
		double triDownSide = 25.5;
		double triHeight = 10;
		double recDownSide = 100;
		double recHeight = 50;
		double area1;
		area1 = recDownSide * recHeight - triDownSide * triHeight / 2;
		System.out.println("\n�簢������ ���� �ﰢ���� ������ ���� : " + area1);

		// ����04, ���� �ѳ���, ���� ���ϱ�(������ :20)
		double r2 = 20;
		double surfaceArea;
		double volume;
		surfaceArea = 4 * pi * r2 * r2;
		volume = pi * r2 * r2 * r2 * 4 / 3;
		System.out.println("\n���� �ѳ��� = " + surfaceArea);
		System.out.println("���� ���� = " + volume);
		System.out.printf("���Ǻ��� : %.3f\n" , volume);

		
		int x1=10, y1=20;
		double R = 20;
		System.out.printf("\nx=%10d y=%-10d r2=%f\n",x1, y1, r2);
		System.out.printf("pi : %.2f, R : %3.1f", pi, R);
	}

}
