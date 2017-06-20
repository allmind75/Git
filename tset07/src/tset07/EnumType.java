package tset07;

public class EnumType {

	enum Gender{MAIL, FEMAIL}
	
	public static void main(String[] args) {
		
		//열거타입 변수, 열거 상수 값 저장
		Gender g = Gender.MAIL;
		
		//열거 타입 변수는 참조타입, null 값 저장 가능
		Gender g2 = null;
		g2 = Gender.FEMAIL;
		/*
		 * name() - 열거 객체의 문자열 리턴(String)
		 * 
		 * ordinal() - 열거 객체의 순번(0부터 시작) 리턴(int)
		 * 
		 * compareTo() - 열거 객체를 비교해서 순번 차이를 리턴(int)
		 * 
		 * valueOf(String name) - 주어진 문자열의 열거 객체를 리턴(열거타입)
		 * 
		 * values() - 모든 열거 객체들을 배열로 리턴(열거배열)
		 */
		
		System.out.println(g);
		System.out.println(g.name());
		System.out.println(g.ordinal());
		System.out.println(g2.compareTo(g2));
		
		Gender g3 = Gender.valueOf("MAIL");
		System.out.println(g3);
		
		Gender[] gArray = Gender.values();
		
		for(Gender gArray1: gArray) {
			System.out.println("gArray : " + gArray1.name());
		}
	}
}
