package test11;

import java.util.Scanner;

public class Num02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[���� 2] BMI(ü��������) ���ϱ�");
		
		double weight = 0.0;
		double height = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է�(kg)> ");
		weight = sc.nextDouble();
		
		System.out.print("Ű �Է�(cm)> ");
		height = sc.nextDouble();
		height /= 100.0;
		
		Bmi.showBmi(weight, height);
		
		sc.close();
		
	}
	
	
}


