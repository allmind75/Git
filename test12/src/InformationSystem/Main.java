package InformationSystem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		Student[] student = new Student[]{
				new Student("홍길동", "대전광역시", "1234-567890", 2,"경제"),
				new Student("유재석", "세종시", "1234-123456", 1, "컴퓨터")};
		
		Staff[] staff = new Staff[]{
				new Staff("하하", "서울", "교무부", "대리"),
				new Staff("박명수", "인천", "행정", "과장")};
				
		Scanner sc = new Scanner(System.in);
		String input;
		
		//학생목록 출력
		studentsPrint(student);
		
		//교직원 목록 출력
		staffPrint(staff);
		
		//학번 입력받고, 입력된 학생 정보 출력
		System.out.print("\n학번 입력> ");
		input = sc.nextLine();
		stdNumSearch(student, input);
		
		//부서를 입력받고, 입력 부서원들의 정보 출력
		System.out.print("\n부서 입력> ");
		input = sc.nextLine();
		divisionSearch(staff, input);		
		
		sc.close();
		
	}
	
	public static void studentsPrint(Student[] student) {
		
		System.out.println("이름\t" + "주소\t" + "학번\t\t" + "학년\t" + "전공\t");
		for(Student s: student) {
			s.print();
		}	
	}
	
	public static void staffPrint(Staff[] staff) {
		
		System.out.println("\n이름\t" + "주소\t" + "부서\t" + "전공\t");
		for(Staff f: staff) {
			f.print();
		}
	}
	
	public static void stdNumSearch(Student[] student, String input) {
		
		int flag = 0;
		
		for(int i=0 ; i<student.length ; i++) {
			if(student[i].getStdNum().equals(input)) {
				student[i].print();
				flag++;
			}
		}
		
		if(flag == 0) {
			System.out.println("찾는 학생이 없습니다.");
		}
	}
	
	public static void divisionSearch(Staff[] staff, String input) {
		
		int flag = 0;
		
		for(int i=0 ; i<staff.length ; i++) {
			if(staff[i].getDivision().equals(input)) {
				staff[i].print();
				flag++;
			}
		}
		
		if(flag == 0) {
			System.out.println("찾는 부서가 없습니다.");
		}
	}
}
