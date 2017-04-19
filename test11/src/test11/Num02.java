package test11;

import java.util.Scanner;

public class Num02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[문제 2] BMI(체질량지수) 구하기");
		
		double weight = 0.0;
		double height = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게 입력(kg)> ");
		weight = sc.nextDouble();
		
		System.out.print("키 입력(cm)> ");
		height = sc.nextDouble();
		height /= 100.0;
		
		Bmi.showBmi(weight, height);
		
		sc.close();
		
	}
	
	
}


