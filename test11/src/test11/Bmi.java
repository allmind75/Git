package test11;

public class Bmi {

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
	
	static void showBmi(double weight, double height) {
		
		double bmi = Bmi.bmiCalc(weight, height);
		System.out.println();
		Bmi.bmiPrint(bmi);
	}
}
