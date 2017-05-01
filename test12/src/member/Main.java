package member;

public class Main {

	public static void main(String[] args) {
		
		Student s = new Student(1, "홍길동", "대전광역시", "하이브리드");
		Staff f = new Staff(1, "유재석", "대전광역시", "행정", "과장");
		
		
		s.print();
		System.out.println();
		f.print();
	}
}
