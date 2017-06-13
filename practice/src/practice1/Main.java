package practice1;

import practice1.CStaff;
import practice1.CStudent;
import practice1.Main;

public class Main {

	private CStudent[] students;
	private CStaff[] staffs;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main m = new Main();
		
		m.students = new CStudent[]{new CStudent("홍길동", "대전", "경제", 2), new CStudent("채치수", "서울", "체육", 4)};
		m.staffs = new CStaff[]{new CStaff("김병준", "대전", "행정", "대리"), new CStaff("한강", "대구", "교무", "교감")};
	
		m.print();
	}

	public void print() {
		
		for(CStudent s: students) {
			s.printCStudent();
		}
		
		for(CStaff s: staffs) {
			s.printCStaff();
		}
	}
}
