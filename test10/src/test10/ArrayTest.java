package test10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayTest {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] array1 = new int[]{6,5,4,3,2,1}; //�迭 �ʱ�ȭ
		// int[] array2 = {1,2,3,4,5}; //�迭 �ʱ�ȭ
		//
		// System.out.println(array1.length + " " + array2.length);

		// print01();
		// print02();
		// print03();
		// print04();
		// print05();
		// print06();
		// print07();
		print08();
		print09();
		print10();
		print11();
		print12();
		print13();
		print14();
		print15();
		print16();
		print17();

	}

	public static void print01() {
		/*
		 * ���� �Ʒ��� ���� �����͸� �迭�� �����ϰ�
		 * 
		 * 90.5 67.55 55.5 90 80
		 * 
		 * ����ϴ� ���α׷��� �ۼ�
		 */
		double[] array = new double[5];

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextDouble();
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void print02() {
		/*
		 * ���� �Ʒ��� ���� �����Ͱ� �־����� �� �����͸� �����ϴ� �迭�� �����ϰ� �ʱ�ȭ�Ͻÿ�. 35 40 55 -20 -30 78
		 * 200 98
		 * 
		 * �׸��� �Ʒ��� ������ �ذ��ϴ� ���α׷� �ۼ� a. �迭 ������ ��ü ��� b. �迭 ������ �߿��� ������ ��� c. �迭
		 * �������� ���밪�� ����Ͻÿ�. d. �迭 �������� �� ���
		 */

		int array[] = new int[] { 35, 40, 55, -20, -30, 78, 200, 98 };
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		for (int n : array) {
			if (n < 0) {
				System.out.print(n + " ");
			}
		}
		System.out.println();
		for (int n : array) {

			if (n < 0) {
				System.out.print(-n + " ");
			} else {
				System.out.print(n + " ");
			}
		}
		System.out.println();
		for (int n : array) {

			sum += n;
		}
		System.out.println("�迭 �������� �� : " + sum);

		System.out.println(" ");
	}

	public static void print03() {
		/*
		 * ���� �б����� ���� ���� ������ �Ʒ��� ���� ���� ���� ������ ����� ���ؼ� ��� ��ȣ �̸� ��� 1 ��ȣ�� 88.5 2
		 * ���缮 85 3 �ŵ��� 77.65 4 �迬�� 70 5 �۰�ȣ 90 6 ������ 66 7 ���ϴ� 90 8 ������ 65
		 */

		double score[] = new double[] { 88.5, 85, 77.65, 70, 90, 66, 90, 65 };
		double sum = 0;
		double avg;
		String name[] = new String[] { "��ȣ��", "���缮", "�ŵ���", "�迬��", "�۰�ȣ", "������", "���ϴ�", "������" };

		// ���� ���� ��� ���
		for (int i = 0; i < name.length; i++) {
			System.out.println((i + 1) + "." + name[i] + " " + score[i]);
		}

		for (double n : score) {
			sum += n;
		}
		avg = sum / score.length;
		System.out.println("���� ���� ���� ��� : " + avg + "��");

	}

	public static void print04() {
		/*
		 * ���� �¾��� �Ʒ��� ���� �༺��� �����Ǿ� �ִ�. "�¾�", "����", "�ݼ�", "����", "ȭ��", "��",
		 * "�伺", "õ�ռ�", "�ؿռ�"
		 * 
		 * a. ���� �༺ ����� �迭�� �����ϰ� ���
		 * 
		 * b. ������ �迭 �ε��� ���
		 * 
		 * c. �伺�� �迭 �ε����� ���ϰ�, �伺�� �������̿� �ִ� �༺���� ��� ��, ������ ��������
		 * 
		 * d. ������ �伺�� ��ġ�� ��ȯ�ϰ�, �迭�� �ִ� �༺�� ��� ���
		 */
		String[] solarSystem = new String[] { "�¾�", "����", "�ݼ�", "����", "ȭ��", "��", "�伺", "õ�ռ�", "�ؿռ�" };
		int earthIndex = 0;
		int saturnIndex = 0;

		for (int i = 0; i < solarSystem.length; i++) {
			System.out.print(solarSystem[i] + " ");

			if (solarSystem[i].equals("����")) {
				earthIndex = i;
			} else if (solarSystem[i].equals("�伺")) {
				saturnIndex = i;
			}
		}
		System.out.println();
		System.out.println("������ �迭 �ε��� : " + earthIndex);

		System.out.print("�伺�� �������̿� �ִ� �༺ : ");
		for (int i = saturnIndex; i >= earthIndex; i--) {
			System.out.print(solarSystem[i] + " ");
		}
		System.out.println();

		String temp;
		temp = solarSystem[earthIndex];
		solarSystem[earthIndex] = solarSystem[saturnIndex];
		solarSystem[saturnIndex] = temp;

		int temp2;
		temp2 = earthIndex;
		earthIndex = saturnIndex;
		saturnIndex = temp2;

		for (String s : solarSystem) {
			System.out.print(s + " ");
		}
		System.out.println();

	}

	public static void print05() {

		int[] data = new int[] { 78, 85, 60, 90, 95, 75 };
		int max = data[0];

		for (int n : data) {
			if (n > max) {
				max = n;
			}
		}
		System.out.println("�迭���� ã�� �ִ밪 : " + max);
	}

	public static void print06() {

		/*
		 * ���������� ���� �ǸŰ����� �Ʒ��� ���Ҵ�.
		 * 
		 * ������ �������� �ϳ��θ�Ʈ 1000 �����Ϸ��� 900 �̴Ͻ��� 800 GS25 1200 CU 1000
		 * 
		 * ������ �־��� �����͸� �����ؼ� ���� �����ϰ� ������ �Ǹ��ϴ� �������� ���
		 */

		HashMap<String, Integer> martMap = new HashMap<String, Integer>();
		martMap.put("�ϳ��θ�Ʈ", 1000);
		martMap.put("�����Ϸ���", 900);
		martMap.put("�̴Ͻ���", 800);
		martMap.put("GS25", 1200);
		martMap.put("CU", 1000);

		int min2 = martMap.get("�ϳ��θ�Ʈ");
		String temp = null;

		for (String key : martMap.keySet()) {
			if (min2 > martMap.get(key)) {
				min2 = martMap.get(key);
				temp = key;
			}
		}
		System.out.println("HashMap, �����ϰ� ����� �Ǹ��ϴ� ������ : " + temp);

		String[] mart = new String[] { "�ϳ��θ�Ʈ", "�����Ϸ���", "�̴Ͻ���", "GS25", "CU" };
		int[] price = new int[] { 1000, 900, 800, 1200, 1000 };
		int min = price[0];
		int index = 0;

		for (int i = 0; i < price.length; i++) {
			if (price[i] < min) {
				min = price[i];
				index = i;
			}
		}
		System.out.println("������ ���� ������ ������ : " + mart[index]);

	}

	public static void print07() {
		/*
		 * �� ����� �Ĵ��� �� �޴� ���� ¥��� 4000�� «�� 4000�� ������ 6000�� ������ 10000��
		 * 
		 * 1. �ѻ���� �Ѱ��� �޴��� �ֹ��Ҷ�, �� ����� �ֹ��ϴ� �޴��� ����� �� ���
		 * 
		 * 2. ���� ����ǥ�� �����Ͽ� �λ���� ������ �޴� ������ ���� ���
		 * 
		 * 3. �� ����� �����ϰ� �ִ� �ݾ��� 15000�� �϶�, ���ð����� �޴��� ��� ��� ���
		 */

		String[] menu = new String[] { "¥���", "«��", "������", "������" };
		int[] price = new int[] { 4000, 4000, 6000, 10000 };

		for (int i = 0; i < menu.length; i++) {
			for (int j = 0; j < menu.length; j++) {

				if ((price[i] + price[j]) <= 15000) {
					System.out.print("(" + menu[i] + ", " + menu[j] + ")");
				}
				System.out.println();
			}
			System.out.println();
		}
	}


	public static void print08() {

		System.out.println("[����. 1]");

		int[] array = new int[21];
		int temp = -10;

		for (int i = 0; i < array.length; i++) {
			array[i] = temp++;
		}
		for (int n : array) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	public static void print09() {

		System.out.println("\n[����. 2]");

		int[] array = new int[] { 100, 123, -45, 56, 300, 250, 78, -256, 43, -145, 0 };
		int minus = 0;
		int plus = 0;
		int zero = 0;

		System.out.println("a. �迭 ���");
		for (int n : array) {
			if (n > 0) {
				System.out.print("+" + n + " ");
				plus = plus + 1;
			} else if (n < 0) {
				System.out.print(n + " ");
				minus++;
			} else {
				System.out.println(n + " ");
				zero++;
			}

		}
		System.out.println("\nb. ����, ���, 0�� ���� ���");
		System.out.println("����� ���� : " + plus);
		System.out.println("������ ���� : " + minus);
		System.out.println("0 �� ���� : " + zero);

	}

	public static void print10() {

		System.out.println("\n[����. 3]");

		int[] array = new int[] { 34, 56, 78, 44, 98, 33, 65, 66, 76, 54, 44, 56, 11 };

		System.out.print("���ڸ��� �����ڸ��� ���� ���ڴ� : ");
		for (int i = 0; i < array.length; i++) {

			if (array[i] / 10 == array[i] % 10) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();
	}

	public static void print11() {

		System.out.println("\n[����. 4]");

		String[] name = new String[] { "�迬��", "���缮", "�۰�ȣ", " ��ȣ��", "���汸" };
		int[] num = new int[] { 1, 2, 3, 2, 3 };
		boolean run = true;

		while (run) {

			int input;

			System.out.println("�޴� 1.��ü ������  2.������ ��Ÿ  3.���׸�  4.��ȭ���  5.������");
			input = sc.nextInt();
			sc.nextLine();
			switch (input) {
			case 1:
				System.out.print("1. ��ü ������ : ");
				for (String s : name) {
					System.out.print(s + " ");
				}
				System.out.println();
				break;
			case 2:
				System.out.print("2. ������ ��Ÿ : ");
				for (int i = 0; i < num.length; i++) {
					if (num[i] == 1) {
						System.out.print(name[i] + " ");
					}
				}
				System.out.println();
				break;
			case 3:
				System.out.print("3. ���׸� : ");
				for (int i = 0; i < num.length; i++) {
					if (num[i] == 2) {
						System.out.print(name[i] + " ");
					}
				}
				System.out.println();
				break;
			case 4:
				System.out.print("4. ��ȭ��� : ");
				for (int i = 0; i < num.length; i++) {
					if (num[i] == 3) {
						System.out.print(name[i] + " ");
					}
				}
				System.out.println();
				break;
			case 5:
				run = false;
				break;
			}
			System.out.println();

		}

	}

	public static void print12() {
		System.out.println("\n[����. 5]");

		int[] array1 = new int[] { 11, 14, 39, 22, 44 };
		int[] array2 = new int[] { 33, 56, 78, 33, 45, 35, 90 };
		int[] array3;
		int length;
		int index = 0;

		length = array1.length + array2.length;

		array3 = new int[length];

		for (int i = 0; i < array1.length; i++) {

			array3[index++] = array1[i];
		}

		for (int i = 0; i < array2.length; i++) {

			array3[index++] = array2[i];
		}

		System.out.print("����迭 : ");
		for (int n : array3) {

			System.out.print(n + " ");
		}

		System.out.println();

	}

	public static void print13() {
		System.out.println("\n[����. 6]");

		int[] array = new int[] { 10, 45, 1, 3, 100, -10, 200, 5 };

		Arrays.sort(array);

		System.out.println("��� : " + Arrays.toString(array));
	}

	public static void print14() {
		System.out.println("\n[����. 7]");

		String[] array = new String[] { "���", "��", "����", "�丶��", "����", "����" };

		Arrays.sort(array);

		System.out.println("��� : " + Arrays.toString(array));

	}

	public static void print15() {
		System.out.println("\n[����. 8]");

		String s = "��ȿ, ����, ����, �̳�, ä��, ����, ���, �糪, ����";
		String[] array;

		array = s.split(",");

		for (int i = 0; i < array.length; i++) {

			array[i] = array[i].trim();
			System.out.print(array[i] + " ");
		}
		System.out.println();

	}

	public static void print16() {
		System.out.println("\n[����. 9]");

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

		System.out.println("���α׷� ����");
	}

	static public void print17() {
		System.out.println("\n[�迭2 - ����. 1]");

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
	}

}
