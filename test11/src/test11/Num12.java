package test11;

public class Num12 {

	/*
	 * 국어점수가 아래와 같았다 1반 : 98.4, 78, 65, 80, 85 2반 : 88, 75, 80.5, 95, 76 3반 :
	 * 75, 77, 94, 90, 65
	 * 
	 * 1. 위의 점수를 2차원 배열에 저장하고 학교 평균을 계산해서 반환하는 함수 작성
	 * 
	 * 2. 데이터를 이용해서 반별 평균을 구해서 반환하는 함수를 작성
	 * 
	 */

	public static double avg(double[][] grade) {

		double avg;
		double sum = 0;
		int cnt = 0;

		for (int i = 0; i < grade.length; i++) {
			for (int j = 0; j < grade[i].length; j++) {
				sum += grade[i][j];
				cnt++;
			}
		}

		avg = sum / cnt;

		return avg;
	}

	public static double[] avgClass(double[][] grade) {

		double[] avg = new double[grade.length];

		for (int i = 0; i < grade.length; i++) {
			
			double sum = 0;

			for (int j = 0; j < grade[i].length; j++) {
				sum += grade[i][j];
			}
			avg[i] = sum / grade[i].length;
		}

		return avg;
	}

	public static void printArray(double[][] array) {
		
		for(int i=0 ; i<array.length ; i++) {
			for(int j=0 ; j<array[i].length ; j++) {
				System.out.println(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void printArray(double[] array) {
		
		for(double d: array) {
			System.out.print(d + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[][] grade = new double[][] { { 98.4, 78, 65, 80, 85 }, { 88, 75, 80.5, 95, 76 },
				{ 75, 77, 94, 90, 65 } };

		double avg;
		double[] avgClass;

		avg = avg(grade);
		avgClass = avgClass(grade);

		System.out.println("평균 : " + avg);
		
		printArray(avgClass);
	}

}
