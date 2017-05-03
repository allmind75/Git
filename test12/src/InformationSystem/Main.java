package InformationSystem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		Student[] student = new Student[]{
				new Student("ȫ�浿", "����������", "1234-567890", 2,"����"),
				new Student("���缮", "������", "1234-123456", 1, "��ǻ��")};
		
		Staff[] staff = new Staff[]{
				new Staff("����", "����", "������", "�븮"),
				new Staff("�ڸ��", "��õ", "����", "����")};
				
		Scanner sc = new Scanner(System.in);
		String input;
		
		//�л���� ���
		studentsPrint(student);
		
		//������ ��� ���
		staffPrint(staff);
		
		//�й� �Է¹ް�, �Էµ� �л� ���� ���
		System.out.print("\n�й� �Է�> ");
		input = sc.nextLine();
		stdNumSearch(student, input);
		
		//�μ��� �Է¹ް�, �Է� �μ������� ���� ���
		System.out.print("\n�μ� �Է�> ");
		input = sc.nextLine();
		divisionSearch(staff, input);		
		
		sc.close();
		
	}
	
	public static void studentsPrint(Student[] student) {
		
		System.out.println("�̸�\t" + "�ּ�\t" + "�й�\t\t" + "�г�\t" + "����\t");
		for(Student s: student) {
			s.print();
		}	
	}
	
	public static void staffPrint(Staff[] staff) {
		
		System.out.println("\n�̸�\t" + "�ּ�\t" + "�μ�\t" + "����\t");
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
			System.out.println("ã�� �л��� �����ϴ�.");
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
			System.out.println("ã�� �μ��� �����ϴ�.");
		}
	}
}
