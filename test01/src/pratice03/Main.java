package pratice03;

import java.util.Scanner;

public class Main {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

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
		// m.exam14();
		//m.exam15();

		scan.close();
	}

	public void exam01() {

		System.out.println("[exam01]");

		double[] grade = { 76.34, 80.12, 65, -89.22, 85, 73 };
		double avg;
		double sum = 0;
		double max_grade = grade[0];
		int max_num = 0;

		for (int i = 0; i < grade.length; i++) {

			if (grade[i] < 0)
				grade[i] = -grade[i];

			sum += grade[i];

			if (max_grade < grade[i]) {
				max_grade = grade[i];
				max_num = i + 1;
			}
		}

		avg = sum / grade.length;

		System.out.println("평균 : " + avg);
		System.out.println("최고득점자 점수 : " + max_grade + " / 학생번호 : " + max_num);

	}

	public void exam02() {

		System.out.println("[exam02]");

		int data[] = { 32, 23, 45, 33, 96, 1034, 304, 102, 34, 77, 34, 56, 62, 99, 43 };
		int oddCnt = 0;
		int evenCnt = 0;

		for (int d : data) {

			if (d % 2 == 0) {
				evenCnt++;
			} else {
				oddCnt++;
			}
		}

		System.out.println("홀수 개수 : " + oddCnt);
		System.out.println("짝수 개수 : " + evenCnt);
	}

	public void exam03() {

		System.out.println("[exam03]");

		String str = "Student Number : 1234567";
		String strUpper;

		char[] temp = str.toCharArray();

		for (int i = 0; i < temp.length; i++) {

			temp[i] = Character.toUpperCase(temp[i]);
		}

		strUpper = new String(temp);

		System.out.println("결과 : " + strUpper);

	}

	public void exam04() {

		System.out.println("[exam04]");

		int[][] data = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };

		for (int j = 0; j < 5; j++) {

			for (int i = 0; i < 2; i++) {

				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void exam05() {

		System.out.println("[exam05]");

		String[] rainbowColor = { "빨간색", "주황색", "노락색", "초록색", "파란색", "남색", "보라색" };
		String input;

		System.out.println("무지개색 역순 출력");
		for (int i = rainbowColor.length - 1; i >= 0; i--) {
			System.out.print(rainbowColor[i] + " ");
		}
		System.out.println();

		System.out.print("좋아하는 색 입력> ");
		input = scan.nextLine();

		for (int i = 0; i < rainbowColor.length; i++) {

			if (rainbowColor[i].equals(input)) {
				System.out.println("무지개색에서 " + (i + 1) + "번째 색");
				break;
			}
		}

	}

	public void exam06() {

		System.out.println("[exam06]");

		int[] data = { 10, 12, 15, -10, 23, 43, 12, 34, 56, 76 };
		int[] newData = new int[data.length];
		int index = data.length - 1;

		for (int i = 0; i < data.length; i++) {

			newData[index--] = data[i];
		}

		for (int d : newData) {
			System.out.print(d + " ");
		}
		System.out.println();

	}

	public void exam07() {

		System.out.println("[exam07]");

		int[] data = { 10, 12, 15, -10, 23, 43, 12, 34, 56, 76 };
		int[] newData = new int[6];
		int index = 0;

		for (int i = 2; i < 8; i++) {
			newData[index++] = data[i];
		}

		for (int d : newData) {
			System.out.print(d + " ");
		}
		System.out.println();
	}

	public void exam08() {

		System.out.println("[exam08]");

		int[] data = { 10, 12, 15, -10, 23, 43, 12, 34, 56, 76 };
		int temp = 0;
		int temp2 = 0;

		for (int i = 0; i < data.length - 1; i++) {

			if (i == 0) {

				temp = data[i + 1];
				data[i + 1] = data[i];

			} else if (i == (data.length - 2)) {

				temp2 = data[i + 1];
				data[i + 1] = temp;
				data[0] = temp2;

			} else {

				temp2 = data[i + 1];
				data[i + 1] = temp;
				temp = temp2;
			}

		}

		for (int d : data) {
			System.out.print(d + " ");
		}
		System.out.println();

	}

	public void exam09() {

		System.out.println("[exam09]");

		int[][] data = new int[5][5];
		int[][] temp = new int[3][3];
		int num = 1;

		for (int i = 0; i < data[0].length; i++) {

			for (int j = 0; j < 5; j++) {

				data[i][j] = num++;
			}
		}

		num = 0;
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {

				temp[i - 1][j - 1] = data[i][j];

				System.out.print(temp[i - 1][j - 1] + " ");
			}
			System.out.println();
		}

	}

	public void exam14() {

		System.out.println("[exam14]");

		int[] data = new int[10];
		int input;
		int near7 = 9999;
		int result = 0;

		System.out.print("임의의 정수 10개 입력> ");

		for (int i = 0; i < data.length; i++) {

			input = scan.nextInt();
			data[i] = input;

			if (near7 >= (Math.abs(data[i] - 7))) {

				near7 = Math.abs(data[i] - 7);
				result = data[i];
			}

		}

		System.out.println("7에 가장 가까운 값 : " + result);

	}

	public void exam15() {

		int[][] data1 = new int[5][5];
		int[][] data2 = new int[5][5];
		int[][] data3 = new int[5][5];

		int num = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				data1[j][i] = num++;
			}
		}

		num = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {

				data2[i][j] = num++;
			}
		}

		num = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {

				data3[i][j] = num++;
			}
		}

		// print
		System.out.println("[a]");
		printArray(data1);

		System.out.println("[b]");
		printArray(data2);

		System.out.println("[c]");
		printArray(data3);
	}

	public void printArray(int[][] data) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
	}
}
