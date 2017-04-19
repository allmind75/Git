package test11;

import java.util.Scanner;

public class Num02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[문제 2] BMI(체질량지수) 구하기");
		
		double weight = 0.0;
		double height = 0.0;
		double bmi;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게 입력(kg)> ");
		weight = sc.nextDouble();
		
		System.out.print("키 입력(cm)> ");
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
			System.out.println("BMI : " + bmi + ", 체중상태 : 저체중");
		} else if(bmi <=24.9){
			System.out.println("BMI : " + bmi + ", 체중상태 : 정상");
		} else if(bmi <=29.9) {
			System.out.println("BMI : " + bmi + ", 체중상태 : 과체중");
		} else if(bmi >=30.0){
			System.out.println("BMI : " + bmi + ", 체중상태 : 비만");

		}
	}
}


