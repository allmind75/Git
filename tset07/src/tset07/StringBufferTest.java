package tset07;

public class StringBufferTest {

	public static void main(String[] args) {

		/*
		 * StringBuffer 변하는 문자열을 다룰 때 사용
		 * StringBuffer 객체는 한번만 생성 기본적으로 16개의 문자를 저장할 수 있는 버퍼 공간 문자열 처리 후의 결과를
		 * 원래의 StringBuffer 객체에 반영
		 * 
		 * StrngBuffer 자료형은 String 보다 무거움
		 * String보다 메모리 사용량도 많고 속도도 느림
		 * 따라서 문자열 추가나 변경등의 작업이 많은 경우 StringBuffer 사용
		 **/
		StringBuffer sb = new StringBuffer("Java-");
		sb.append("hello");
		sb.append(" ");
		sb.append("world");

		System.out.println(sb.toString());
		System.out.println(sb.capacity()); 			// 현재 문자열의 총 용량
		System.out.println(sb.insert(11, "hi "));	// 원하는 위치에 문자열 삽입
		System.out.println(sb.substring(0, 4));		// 문자열 자르기	
		
	}
}
