package test06;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�ﰢ�� ����
		//triangleArea();
		
		//bmi ���
		//bmiCalc();
		
		//�ʸ� ��, ��, �ʷ� �ٲٱ�
		//timeCalc();
		
		//���� ���� ���� ���� �Է� �� ������ ��� ���
		//gradeCalc();
		
		//������ ��ǰ����, �ݶ� : 1500, ���� : 900, ���� : 1200
		//1. ���� ������ ��ǰ ������ �Է¹ް� ������ �ѱݾ� ���
		//2. ���� �ݾ��� ��, õ, ��� �����ؼ� ���
		gs25();
			
	}
	
	public static void triangleArea() {
		//�ﰢ�� ���� �غ� �Է�, �ﰢ�� ���� ��� �� ���
		double width;
		double height;
		double area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----�ﰢ�� ���� ���ϱ� ----");
		
		System.out.print("�ﰢ�� �غ� : ");
		width = sc.nextDouble();
		
		System.out.print("�ﰢ�� ���� : ");
		height = sc.nextDouble();
		
		area = width * height / 2.0;
		
		System.out.println("�ﰢ�� ���� : " + area);
		System.out.println("----���α׷� ����----");

	}
	
	public static void bmiCalc() {
		//bmi�� ����ؼ� ����ϴ� ���α׷� �ۼ�
		//�Է� : ü��(kg), Ű(m^2);
		//bmi = ü��(kg) / Ű�� ����(m^2)
		double weight;
		double height;
		double bmi;
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("----BMI ����(���ڸ� �Է�)----");
		
		System.out.print("ü�� �Է�(kg ������ �Է�) : ");
		weight = sc2.nextDouble();
		
		System.out.print("Ű �Է�(m ������ �Է�) : ");
		height = sc2.nextDouble();
		
		bmi = weight / (height * height);
		
		System.out.println("BMI : " + bmi);
		System.out.println("----���α׷� ����----");
	}
	
	public static void timeCalc(){
		//�ʴ����� �ð��� �Է¹ް�, ��, ��, �ʷ� ���
		int input;
		int hour;
		int min;
		int sec;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----�ð� ��ȯ(�� -> �� �� ��)----");
		System.out.print("�ʸ� �Է� : ");
		
		input = sc.nextInt();
		
		hour = input / 3600;
		min = (input % 3600) / 60;
		sec = (input % 3600) % 60;
		
		System.out.println("��� : " + hour + "�ð� " + min + "�� " + sec + "��" );
		
		System.out.println("----���α׷� ����----");
	}
	
	public static void gradeCalc() {
		
		double korean;
		double math;
		double english;
		double sum;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----���� ���----");
		System.out.print("���� ���� �Է� : ");
		korean = sc.nextDouble();
		
		System.out.print("���� ���� �Է� : ");
		math = sc.nextDouble();
		
		System.out.print("���� ���� �Է� : ");
		english = sc.nextDouble();
		
		sum = korean + math + english;
		avg = sum / 3.0;
		
		System.out.println("���� : " + sum + "/ ��� : " + avg);
		System.out.println("----���α׷� ����----");
	}
	
	public static void gs25() {
		int coke;
		int milk;
		int water;
		int total;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----GS25----");
		System.out.println("����> " + "�ݶ�(1500��)" + " ����(900��)" + " ����(1200��)");
		System.out.print("���ż��� �Է�> �ݶ� : ");
		
		coke = sc.nextInt();
		
		System.out.print("���ż��� �Է�> ���� : ");
		
		milk = sc.nextInt();
		
		System.out.print("���ż��� �Է�> ���� : ");
		
		water = sc.nextInt();
		
		total = coke*1500 + milk*900 + water*1200;
		
		System.out.println("���� �ݾ� : " + total + "��");
		System.out.println("���ұݾ� : " + total/10000 +"�� " + (total%10000)/1000 +"õ " + ((total%10000)%1000)/100 +"�� ��");
		System.out.println("----���α׷� ����----");
	}

}
