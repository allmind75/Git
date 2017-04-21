package test11;

public class Num12 {

	/*
	 * ���������� �Ʒ��� ���Ҵ� 1�� : 98.4, 78, 65, 80, 85 2�� : 88, 75, 80.5, 95, 76 3�� :
	 * 75, 77, 94, 90, 65
	 * 
	 * 1. ���� ������ 2���� �迭�� �����ϰ� �б� ����� ����ؼ� ��ȯ�ϴ� �Լ� �ۼ�
	 * 
	 * 2. �����͸� �̿��ؼ� �ݺ� ����� ���ؼ� ��ȯ�ϴ� �Լ��� �ۼ�
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

		System.out.println("��� : " + avg);
		
		printArray(avgClass);
	}

}
