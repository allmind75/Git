package test10;

import java.util.Arrays;
import java.util.Collections;
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
}
