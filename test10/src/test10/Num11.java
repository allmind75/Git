package test10;

public class Num11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = new String[] { "��ȣ��", "���缮", "�ڼ�ȫ", "��Ǹ�", "�̰���" };
		double[][] grade = new double[][] { { 84.55, 77.32, 45.5, 67 }, { 89.67, 88.98, 90.23, 65.8 },
				{ 77.43, 56.78, 54.56, 90 }, { 56.98, 76, 75.5, 86 }, { 89.23, 67.5, 50, 85 } };
		
		int sum;
		double[] avg = new double[5];
		int[] rank = new int[]{1,1,1,1,1};
		int[] index = new int[5];
		
		System.out.println("a. �迭 ���");
		System.out.println("�л��̸� " + "����\t" + "����\t" + "����\t" + "�̼�\t"); 
		
		for (int i = 0; i < name.length; i++) {
			sum = 0;
			System.out.print(name[i] + "\t");
			for (int j = 0; j < grade[0].length; j++) {
				System.out.print(grade[i][j] + "\t");
				
				sum += grade[i][j];
			}
			avg[i] = sum / 4.0;
			System.out.println();
		}
		System.out.println();
		
		System.out.println("b. �л����� ��� ���");
		for(int i=0 ; i<name.length ; i++) {
			System.out.println(name[i] + "\t" + avg[i]);
		}
		System.out.println();
		
		System.out.println("c. ����� �������� ���� ���");
		for(int i=0; i<rank.length ; i++) {
			for(int j=0 ; j<avg.length ; j++) {
				if(avg[i] < avg[j]) {
					rank[i]++;
				}
			}
			index[rank[i] - 1] = i;
		}
		
		
		for(int i=0 ; i<rank.length ; i++) {
			int t = index[i];
			System.out.println(rank[t] + "\t"+ name[t] + "\t" + avg[t]);
		}
		
	}

}
