package test10;

import java.util.Scanner;

public class Num09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[����. 9]");

		String[] station = new String[] { "�ݼ�", "����", "����", "������ �����", "�����", "����", "������õ", "��õ", "����", "����", "����û��",
				"��û", "ź��", "�빮", "����", "�������װŸ�", "�߱�û", "�߾ӷ�", "������", "�뵿", "����", "�Ǿ�" };
		int[] time = new int[] { 500, 300, 700, 320, 440, 340, 180, 230, 456, 230, 890, 340, 120, 789, 230, 543, 888,
				333, 456, 789, 300 };
		boolean run = true;

		while (run) {

			String temp;
			String start;
			String finish;
			int startIndex = 0;
			int finishIndex = 0;
			int totalTime = 0;

			System.out.println("\na. ����ö ��� ���");
			for (int i = 0; i < station.length; i++) {

				System.out.print(station[i] + "\t");
				if ((i + 1) % 3 == 0) {
					System.out.println();
				}
			}
			System.out.println();

			System.out.println("\nb. ��߿��� ������ �̸� �Է�");
			System.out.print("��߿�> ");
			start = sc.nextLine();

			System.out.print("������> ");
			finish = sc.nextLine();

			if (start.equals(finish)) {
				System.out.println("��߿��� �������� ���Ƽ� �ҿ�ð��� ���� �� �����ϴ�.");
			} else {
				for (int i = 0; i < station.length; i++) {

					if (station[i].equals(start)) {

						startIndex = i;

					} else if (station[i].equals(finish)) {

						finishIndex = i;
					}
				}
			}
			System.out.println("\nc. ��߿����� ���������� �ҿ�Ǵ� �ð� ���(�ð��� ���ʷ� ����� ���)");

			if (startIndex - finishIndex < 0) {
				for (int i = startIndex; i < finishIndex; i++) {

					totalTime += time[i];
				}
			} else {
				for (int i = finishIndex; i < startIndex; i++) {

					totalTime += time[i];
				}
			}
			System.out.println("�ҿ�ð� : " + totalTime / 60 + "�� " + totalTime % 60 + "��");

			System.out.print("\nd. ��� / �ߴ� �Է�> ");
			temp = sc.nextLine();

			if (temp.equals("�ߴ�")) {
				run = false;

			} else if (temp.equals("���)")) {
				continue;
			} else {
				System.out.println("�߸��Է�");
			}
		}
		
		sc.close();
		System.out.println("���α׷� ����");
	}
	

}
