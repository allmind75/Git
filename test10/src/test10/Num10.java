package test10;

import java.util.Scanner;

public class Num10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[�迭2 - ����. 1]");

		int[][] fruit = new int[][] { { 500, 400, 300, 600 }, { 1000, 900, 1200, 1500 }, { 10000, 9000, 8000, 7000 },
				{ 1000, 800, 1200, 900 } };
		String[] fruitName = new String[] { "�丶��", "����", "����", "����" };
		String[] mart = new String[] { "�ϳ��� ��Ʈ", "�ູ�� ��Ʈ", "�� ���� ��Ʈ", "���� �Ϸ���" };
		boolean run = true;
		int index = 0;

		while (run) {
			int choice;
			int choiceMenu;

			System.out.println("\n�޴�] 1.��Ʈ�� �ǸŽü� \t 2.ǰ�� �ǸŽü� \t 3.������ �ü����� \t 4.�����ϱ�");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("��Ʈ�� �Ǹ� �ü�] 1.�ϳ��� ��Ʈ \t 2.�ູ�� ��Ʈ \t 3.�� ���� ��Ʈ \t 4.���� �Ϸ���");
				choiceMenu = sc.nextInt();
				index = choiceMenu - 1;

				System.out.print(mart[index] + " : ");
				for (int i = 0; i < fruitName.length; i++) {
					if (i == mart.length - 1) {
						System.out.print(fruitName[i] + " " + fruit[i][index] + "��");
					} else {
						System.out.print(fruitName[i] + " " + fruit[i][index] + "��, ");	
					}
				}
				System.out.println();
				break;
			case 2:
				System.out.println("ǰ�� �Ǹ� �ü�] 1.�丶�� \t 2.���� \t 3.���� \t 4.����");
				choiceMenu = sc.nextInt();
				index = choiceMenu - 1;

				System.out.print(fruitName[index] + " : ");
				for (int i = 0; i < fruitName.length; i++) {
					if (i == mart.length - 1) {
						System.out.print(mart[i] + " " + fruit[index][i] + "��");
					} else {
						System.out.print(mart[i] + " " + fruit[index][i] + "��, ");	
					}
				}
				System.out.println();
				break;
			case 3:
				int min;

				System.out.println("����" + "\t" + "������" + "\t" + "�ǸŸ�Ʈ");
				for(int i=0 ; i<fruitName.length ; i++) {
					
					min = fruit[i][0];
					for(int j=0 ; j<fruit[0].length ; j++) {
						if(fruit[i][j] < min) {
							min = fruit[i][j];
							index = j;
						}
					}
					System.out.println(fruitName[i] + "\t" + min + "\t" + mart[index]);
				}
				break;
			case 4:
				run = false;
				System.out.println("���α׷� ����");
				break;
			}
		}
		sc.close();
		
	}

}
