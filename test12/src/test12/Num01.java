package test12;

public class Num01 {

	/*
	 * 회사의 회사원 정보
	 * 
	 * 사원번호 이름 직책 거주지 주소 1 유재석 대리 대전광역시 중구 2 박명수 과장 대전광역시 서구
	 * 
	 * (1) 위의 사원 정보를 저장하는 클래스 설계 사원 정보 클래스는 사원번호, 이름, 직책, 거주지 필드를 가지고 잇음
	 * 
	 * (2) (1)에서 설계한 클래스를 이용해서 위의 표에 있는 사원정보를 갖는 객체 2개를 생성
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberInfo member1 = new MemberInfo();
		MemberInfo member2 = new MemberInfo(2, "박명수", "과장", "대전광역시 중구");

		member1.memberNum = 1;
		member1.name = "유재석";
		member1.position = "대리";
		member1.address = "대전광역시 중구";

		member1.printInfo();
		System.out.println();
		member2.printInfo();

	}

}

class MemberInfo {

	//field - 객체의 속성(정보)
	int memberNum;
	String name;
	String position;
	String address;

	
	/*
	 * 생성자(constructor) - 객체가 생성될때 실행되는 메소드
	 * 1. 클래스 이름과 같음
	 * 2. 반환값 없음
	 * 3. 함수 오버로딩 가능
	 * 4. 생성자를 하나라도 제공하면 기본생성자 자동으로 생성 안됨! 
	 */
	
	//기본 생성자
	MemberInfo() {}
	
	//오버로딩한 생성자
	MemberInfo(int memberNum, String name, String position, String address) {
		this.memberNum = memberNum;
		this.name = name;
		this.position = position;
		this.address = address;
	}
	
	//출력메소드
	public void printInfo() {
		System.out.println("사원번호 : " + this.memberNum);
		System.out.println("이름 : " + this.name);
		System.out.println("직위 : " + this.position);
		System.out.println("거주지주소 : " + this.address);
	}

}
