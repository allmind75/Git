package test10;

import java.util.Scanner;

public class Num09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
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
		
		sc.close();
		System.out.println("프로그램 종료");
	}
	

}
