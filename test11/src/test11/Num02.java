package test11;

import java.util.Scanner;

public class Num02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[���� 2] BMI(ü��������) ���ϱ�");
		
		double weight = 0.0;
		double height = 0.0;
		double bmi;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է�(kg)> ");
		weight = sc.nextDouble();
		
		System.out.print("Ű �Է�(cm)> ");
		height = sc.nextDouble();
		height /= 100.0;
		
		bmi = bmiCalc(weight, height);
		
		System.out.println();
		bmiPrint(bmi);
		
		sc.close();
		
	}
	
	static double bmiCalc(double w, double h) {
		return w/(h*h);
	}
	
	static void bmiPrint(double bmi) {
		
		if(bmi <= 18.5) {
			System.out.println("BMI : " + bmi + ", ü�߻��� : ��ü��");
		} else if(bmi <=24.9){
			System.out.println("BMI : " + bmi + ", ü�߻��� : ����");
		} else if(bmi <=29.9) {
			System.out.println("BMI : " + bmi + ", ü�߻��� : ��ü��");
		} else if(bmi >=30.0){
			System.out.println("BMI : " + bmi + ", ü�߻��� : ��");

		}
	}
}


