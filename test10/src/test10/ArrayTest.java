package test10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayTest {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] array1 = new int[]{6,5,4,3,2,1}; //배열 초기화
		// int[] array2 = {1,2,3,4,5}; //배열 초기화
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
		 * 문제 아래와 같은 데이터를 배열에 저장하고
		 * 
		 * 90.5 67.55 55.5 90 80
		 * 
		 * 출력하는 프로그램을 작성
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
		 * 문제 아래와 같은 데이터가 주어졌을 때 데이터를 저장하는 배열을 선언하고 초기화하시오. 35 40 55 -20 -30 78
		 * 200 98
		 * 
		 * 그리고 아래의 문제를 해결하는 프로그램 작성 a. 배열 데이터 전체 출력 b. 배열 데이터 중에서 음수만 출력 c. 배열
		 * 데이터의 절대값을 출력하시오. d. 배열 데이터의 합 출력
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
		System.out.println("배열 데이터의 합 : " + sum);

		System.out.println(" ");
	}

	public static void print03() {
		/*
		 * 문제 학교에서 영어 시험 점수가 아래와 같다 영어 시험 점수의 평균을 구해서 출력 번호 이름 평균 1 강호동 88.5 2
		 * 유재석 85 3 신동엽 77.65 4 김연아 70 5 송강호 90 6 전지현 66 7 김하늘 90 8 송윤아 65
		 */

		double score[] = new double[] { 88.5, 85, 77.65, 70, 90, 66, 90, 65 };
		double sum = 0;
		double avg;
		String name[] = new String[] { "강호동", "유재석", "신동엽", "김연아", "송강호", "전지현", "김하늘", "송윤아" };

		// 영어 점수 목록 출력
		for (int i = 0; i < name.length; i++) {
			System.out.println((i + 1) + "." + name[i] + " " + score[i]);
		}

		for (double n : score) {
			sum += n;
		}
		avg = sum / score.length;
		System.out.println("영어 시험 점수 평균 : " + avg + "점");

	}

	public static void print04() {
		/*
		 * 문제 태양계는 아래와 같은 행성들로 구성되어 있다. "태양", "수성", "금성", "지구", "화성", "목성",
		 * "토성", "천왕성", "해왕성"
		 * 
		 * a. 위의 행성 목록을 배열에 저장하고 출력
		 * 
		 * b. 지구의 배열 인덱스 출력
		 * 
		 * c. 토성의 배열 인덱스를 구하고, 토성과 지구사이에 있는 행성들을 출력 단, 순서는 역순으로
		 * 
		 * d. 지구와 토성의 위치를 교환하고, 배열에 있는 행성을 모두 출력
		 */
		String[] solarSystem = new String[] { "태양", "수성", "금성", "지구", "화성", "목성", "토성", "천왕성", "해왕성" };
		int earthIndex = 0;
		int saturnIndex = 0;

		for (int i = 0; i < solarSystem.length; i++) {
			System.out.print(solarSystem[i] + " ");

			if (solarSystem[i].equals("지구")) {
				earthIndex = i;
			} else if (solarSystem[i].equals("토성")) {
				saturnIndex = i;
			}
		}
		System.out.println();
		System.out.println("지구의 배열 인덱스 : " + earthIndex);

		System.out.print("토성과 지구사이에 있는 행성 : ");
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
		System.out.println("배열에서 찾은 최대값 : " + max);
	}

	public static void print06() {

		/*
		 * 편의점에서 우유 판매가격이 아래와 같았다.
		 * 
		 * 편의점 우유가격 하나로마트 1000 세븐일레븐 900 미니스톱 800 GS25 1200 CU 1000
		 * 
		 * 위에서 주어진 데이터를 참고해서 가장 저렴하게 우유를 판매하는 편의점을 출력
		 */

		HashMap<String, Integer> martMap = new HashMap<String, Integer>();
		martMap.put("하나로마트", 1000);
		martMap.put("세븐일레븐", 900);
		martMap.put("미니스톱", 800);
		martMap.put("GS25", 1200);
		martMap.put("CU", 1000);

		int min2 = martMap.get("하나로마트");
		String temp = null;

		for (String key : martMap.keySet()) {
			if (min2 > martMap.get(key)) {
				min2 = martMap.get(key);
				temp = key;
			}
		}
		System.out.println("HashMap, 저렴하게 우류를 판매하는 편의점 : " + temp);

		String[] mart = new String[] { "하나로마트", "세븐일레븐", "미니스톱", "GS25", "CU" };
		int[] price = new int[] { 1000, 900, 800, 1200, 1000 };
		int min = price[0];
		int index = 0;

		for (int i = 0; i < price.length; i++) {
			if (price[i] < min) {
				min = price[i];
				index = i;
			}
		}
		System.out.println("우유가 가장 저렴한 편의점 : " + mart[index]);

	}

	public static void print07() {
		/*
		 * 두 사람이 식당을 감 메뉴 가격 짜장면 4000원 짬뽕 4000원 볶음밥 6000원 탕수육 10000원
		 * 
		 * 1. 한사람이 한가지 메뉴를 주문할때, 두 사람이 주문하는 메뉴의 경우의 수 출력
		 * 
		 * 2. 위의 가격표를 참고하여 두사람이 선택한 메뉴 가격의 합을 출력
		 * 
		 * 3. 두 사람이 소지하고 있는 금액은 15000원 일때, 선택가능한 메뉴의 모든 경우 출력
		 */

		String[] menu = new String[] { "짜장면", "짬뽕", "볶음밥", "탕수육" };
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

		System.out.println("[문제. 1]");

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

		System.out.println("\n[문제. 2]");

		int[] array = new int[] { 100, 123, -45, 56, 300, 250, 78, -256, 43, -145, 0 };
		int minus = 0;
		int plus = 0;
		int zero = 0;

		System.out.println("a. 배열 출력");
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
		System.out.println("\nb. 음수, 양수, 0의 갯수 출력");
		System.out.println("양수의 갯수 : " + plus);
		System.out.println("음수의 갯수 : " + minus);
		System.out.println("0 의 갯수 : " + zero);

	}

	public static void print10() {

		System.out.println("\n[문제. 3]");

		int[] array = new int[] { 34, 56, 78, 44, 98, 33, 65, 66, 76, 54, 44, 56, 11 };

		System.out.print("십자리와 일의자리가 같은 숫자는 : ");
		for (int i = 0; i < array.length; i++) {

			if (array[i] / 10 == array[i] % 10) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();
	}

	public static void print11() {

		System.out.println("\n[문제. 4]");

		String[] name = new String[] { "김연아", "유재석", "송강호", " 강호동", "설경구" };
		int[] num = new int[] { 1, 2, 3, 2, 3 };
		boolean run = true;

		while (run) {

			int input;

			System.out.println("메뉴 1.전체 연예인  2.스포츠 스타  3.개그맨  4.영화배우  5.끝내기");
			input = sc.nextInt();
			sc.nextLine();
			switch (input) {
			case 1:
				System.out.print("1. 전체 연예인 : ");
				for (String s : name) {
					System.out.print(s + " ");
				}
				System.out.println();
				break;
			case 2:
				System.out.print("2. 스포츠 스타 : ");
				for (int i = 0; i < num.length; i++) {
					if (num[i] == 1) {
						System.out.print(name[i] + " ");
					}
				}
				System.out.println();
				break;
			case 3:
				System.out.print("3. 개그맨 : ");
				for (int i = 0; i < num.length; i++) {
					if (num[i] == 2) {
						System.out.print(name[i] + " ");
					}
				}
				System.out.println();
				break;
			case 4:
				System.out.print("4. 영화배우 : ");
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
		System.out.println("\n[문제. 5]");

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

		System.out.print("결과배열 : ");
		for (int n : array3) {

			System.out.print(n + " ");
		}

		System.out.println();

	}

	public static void print13() {
		System.out.println("\n[문제. 6]");

		int[] array = new int[] { 10, 45, 1, 3, 100, -10, 200, 5 };

		Arrays.sort(array);

		System.out.println("결과 : " + Arrays.toString(array));
	}

	public static void print14() {
		System.out.println("\n[문제. 7]");

		String[] array = new String[] { "사과", "배", "수박", "토마토", "딸기", "참외" };

		Arrays.sort(array);

		System.out.println("결과 : " + Arrays.toString(array));

	}

	public static void print15() {
		System.out.println("\n[문제. 8]");

		String s = "지효, 쯔위, 정연, 미나, 채영, 나연, 모모, 사나, 다현";
		String[] array;

		array = s.split(",");

		for (int i = 0; i < array.length; i++) {

			array[i] = array[i].trim();
			System.out.print(array[i] + " ");
		}
		System.out.println();

	}

	public static void print16() {
		System.out.println("\n[문제. 9]");

		String[] station = new String[] { "반석", "지족", "노은", "월드컵 경기장", "현충원", "구암", "유성온천", "갑천", "월평", "갈마", "정부청사",
				"시청", "탄방", "용문", "오룡", "서대전네거리", "중구청", "중앙로", "대전역", "대동", "신흥", "판암" };
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

			System.out.println("\na. 지하철 목록 출력");
			for (int i = 0; i < station.length; i++) {

				System.out.print(station[i] + "\t");
				if ((i + 1) % 3 == 0) {
					System.out.println();
				}
			}
			System.out.println();

			System.out.println("\nb. 출발역과 도착역 이름 입력");
			System.out.print("출발역> ");
			start = sc.nextLine();

			System.out.print("도착역> ");
			finish = sc.nextLine();

			if (start.equals(finish)) {
				System.out.println("출발역과 도착역이 같아서 소요시간을 구할 수 없습니다.");
			} else {
				for (int i = 0; i < station.length; i++) {

					if (station[i].equals(start)) {

						startIndex = i;

					} else if (station[i].equals(finish)) {

						finishIndex = i;
					}
				}
			}
			System.out.println("\nc. 출발역에서 도착역까지 소요되는 시간 출력(시간은 분초로 나우어 출력)");

			if (startIndex - finishIndex < 0) {
				for (int i = startIndex; i < finishIndex; i++) {

					totalTime += time[i];
				}
			} else {
				for (int i = finishIndex; i < startIndex; i++) {

					totalTime += time[i];
				}
			}
			System.out.println("소요시간 : " + totalTime / 60 + "분 " + totalTime % 60 + "초");

			System.out.print("\nd. 계속 / 중단 입력> ");
			temp = sc.nextLine();

			if (temp.equals("중단")) {
				run = false;

			} else if (temp.equals("계속)")) {
				continue;
			} else {
				System.out.println("잘못입력");
			}
		}

		System.out.println("프로그램 종료");
	}

	static public void print17() {
		System.out.println("\n[배열2 - 문제. 1]");

		int[][] fruit = new int[][] { { 500, 400, 300, 600 }, { 1000, 900, 1200, 1500 }, { 10000, 9000, 8000, 7000 },
				{ 1000, 800, 1200, 900 } };
		String[] fruitName = new String[] { "토마토", "참외", "수박", "우유" };
		String[] mart = new String[] { "하나로 마트", "행복한 마트", "더 좋은 마트", "세븐 일레븐" };
		boolean run = true;
		int index = 0;

		while (run) {
			int choice;
			int choiceMenu;

			System.out.println("\n메뉴] 1.마트별 판매시세 \t 2.품목별 판매시세 \t 3.최저가 시세보기 \t 4.종료하기");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("마트별 판매 시세] 1.하나로 마트 \t 2.행복한 마트 \t 3.더 좋은 마트 \t 4.세븐 일레븐");
				choiceMenu = sc.nextInt();
				index = choiceMenu - 1;

				System.out.print(mart[index] + " : ");
				for (int i = 0; i < fruitName.length; i++) {
					if (i == mart.length - 1) {
						System.out.print(fruitName[i] + " " + fruit[i][index] + "원");
					} else {
						System.out.print(fruitName[i] + " " + fruit[i][index] + "원, ");	
					}
				}
				System.out.println();
				break;
			case 2:
				System.out.println("품목별 판매 시세] 1.토마토 \t 2.참외 \t 3.수박 \t 4.우유");
				choiceMenu = sc.nextInt();
				index = choiceMenu - 1;

				System.out.print(fruitName[index] + " : ");
				for (int i = 0; i < fruitName.length; i++) {
					if (i == mart.length - 1) {
						System.out.print(mart[i] + " " + fruit[index][i] + "원");
					} else {
						System.out.print(mart[i] + " " + fruit[index][i] + "원, ");	
					}
				}
				System.out.println();
				break;
			case 3:
				int min;

				System.out.println("과일" + "\t" + "최저가" + "\t" + "판매마트");
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
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
