package practice2;

import java.util.Scanner;

public class Main {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main m = new Main();

		// m.exam01();
		// m.exam02();
		// m.exam03();
		// m.exam04();
		// m.exam05();
		// m.exam06();
		// m.exam07();
		// m.exam08();
		// m.exam09();
		// m.exam10();
		// m.exam11();
		// m.exam12();
		// m.exam13();
		// m.exam14();
		// m.exam15();
		// m.exam16();
		//m.exam17();
		m.exam18();
	}

	public void exam01() {

		for (int i = -100; i <= 100; i++) {

			System.out.print((int) Math.pow(i, 2) + " ");
		}
		System.out.println();
	}

	public void exam02() {

		System.out.println("[������ �Է� �ް� �Է� ���� ������ ���丮�� ���]");
		int num;
		int facto = 1;

		System.out.print("���� �Է�> ");
		num = scan.nextInt();

		for (int i = 1; i <= num; i++) {
			facto *= i;
		}

		System.out.println("Factorial: " + num + "! -> " + facto);

	}

	public void exam03() {

		System.out.println("[1 ~ 1000 ���� ���� ��, 2�� ��� �Ǵ� 3�� ��� �Ǵ� 5�� ����̸鼭 10�� ����� �ƴ� ����]");
		for (int i = 1; i <= 1000; i++) {

			if ((i % 2 == 0 || i % 3 == 0 || i % 5 == 0) && (i % 10 != 0)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public void exam04() {

		int cnt = 0;
		System.out.println("[1000���� ���� ���� �� ���� ū 13�� ��� 2��]");
		for (int i = 1000; i > 0; i--) {

			if (i % 13 == 0) {
				System.out.print(i + " ");
				cnt++;
			}

			if (cnt == 2) {
				break;
			}
		}
		System.out.println();
	}

	public void exam05() {
		System.out.println("[0 ���� 100 ������ ���� �� ¦���� ���(��, 3�� 7�� ����� ����)]");
		for (int i = 0; i <= 100; i++) {

			if (i % 2 == 0 && i % 3 != 0 && i % 7 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public void exam06() {

		for (int i = -10; i <= 10; i++) {

			if (i == 0)
				continue;
			System.out.print(i + " ");
		}
	}

	public void exam07() {

		for (int i = 10; i <= 59; i++) {

			System.out.print(i / 10);
			if (i % 10 == 9)
				System.out.println();

		}
	}

	public void exam08() {

		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) {

				System.out.print(i);
			} else {

				System.out.print("(-" + i + ")");
			}
			System.out.print("*");
		}
	}

	public void exam09() {

		int[] fibo = new int[10];
		int sum = 0;

		fibo[0] = 1;
		fibo[1] = 1;

		for (int i = 2; i < 10; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
		}

		for (int n : fibo) {
			System.out.print(n + " ");
			sum += n;
		}
		System.out.println();

		System.out.println("�Ǻ���ġ ������ �� : " + sum);

	}

	public void exam10() {

		int cnt = 0;

		for (int i = 0; i <= 1000; i++) {

			if (i % 7 == 0)
				cnt++;
		}

		System.out.println("1���� 1000������ ���� �� 7�� ����� ���� : " + cnt);
	}

	public void exam11() {

		int input;
		int cnt = 0;

		System.out.print("���� �Է�> ");
		input = scan.nextInt();
		if (input < 0)
			input = -input;

		System.out.print("��� : ");
		for (int i = -input; i < 0; i++) {

			if (i < 0)
				i = -i;

			if (input % i == 0) {
				cnt++;
				System.out.print(-i + " ");
			}

			i = -i;
		}

		for (int i = 1; i <= input; i++) {

			if (input % i == 0) {
				cnt++;
				System.out.print(i + " ");
			}
		}

		System.out.println();
		System.out.println("����� ���� : " + cnt);
	}

	public void exam12() {

		for (double i = 0; i < 1; i += 0.1)
			System.out.printf("%.1f ", i);
	}

	public void exam13() {

		int year;

		year = scan.nextInt();

		if (year % 400 == 0) {
			System.out.println("����");
		} else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("����");
		} else {
			System.out.println("����ƴ�");
		}

	}

	public void exam14() {

		int cnt = 0;

		for (int i = 1; i <= 2016; i++) {
			if (i % 400 == 0) {
				cnt++;
			} else if (i % 4 == 0 && i % 100 != 0) {
				cnt++;
			}
		}

		System.out.println("1�� ���� 2016����� ����� ����? : " + cnt);
	}

	public void exam15() {

		int money = 1000000;
		double total = money;

		for (int i = 2000; i <= 2020; i++) {

			total = total + total * 0.1;
		}

		System.out.println("�� ���ݾ� : " + total + "��");

	}

	public void exam16() {

		int hint = 16456;

		for (int i = 1000; i <= 9999; i++) {

			for (int j = 1000; j <= 9999; j++) {

				if ((i + j) == hint) {

					String carStr = Integer.toString(i);
					String phoneStr = Integer.toString(j);
					String phoneReverse = new StringBuffer(phoneStr).reverse().toString();

					boolean zeroFlag = true;
					boolean sameFlag = true;

					char[] carArray = carStr.toCharArray();
					char[] phoneArray = phoneStr.toCharArray();

					for (int z = 0; z < 4; z++) {

						if (carArray[z] == '0' || phoneArray[z] == '0') {
							zeroFlag = false;
						}

						if (z != 0) {
							if (carArray[0] == carArray[z] || phoneArray[0] == phoneArray[z]) {
								sameFlag = false;
							}
						}

					}

					if (zeroFlag && sameFlag) {

						int d = Character.getNumericValue(carArray[0]);
						int c = Character.getNumericValue(carArray[1]);
						int b = Character.getNumericValue(carArray[2]);
						int a = Character.getNumericValue(carArray[3]);

						if (a == (d + 2) && (b > c)) {
							if (carStr.equals(phoneReverse)) {
								System.out.println("����ȣ : " + carStr);
							}
						}

					}
				}
			}
		}
	}

	public void exam17() {

		int sum = 0;

		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) {
				sum += -i;
				System.out.print(-i);
			} else {
				sum += i;
				if (i == 1) {
					System.out.print(i);
				} else {
					System.out.print("+" + i);
				}
			}
		}

		System.out.println("\n������ �� : " + sum);
	}

	public void exam18() {
		
		double multi = 1;

		for (int i = 1; i <= 100; i++) {

			if (i % 2 != 0) {
				multi *= (-i);
				System.out.print("(" + -i + ")");
			} else {
				multi *= i;
				if (i == 1) {
					System.out.print(i);
				} else {
					System.out.print("*" + i);
				}
			}
		}

		System.out.println("\n������ �� : " + multi);		
	}
}
