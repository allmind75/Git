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
		
		m.students = new CStudent[]{new CStudent("ȫ�浿", "����", "����", 2), new CStudent("äġ��", "����", "ü��", 4)};
		m.staffs = new CStaff[]{new CStaff("�躴��", "����", "����", "�븮"), new CStaff("�Ѱ�", "�뱸", "����", "����")};
	
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
