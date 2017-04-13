package test10;

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

		 print01();
		 print02();
		 print03();
		 print04();
		 print05();
		 print06();
		 print07();

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
}
