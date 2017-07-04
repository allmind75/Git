package list;

import java.util.ArrayList;
import java.util.Arrays;

public class List {
	
	/*
	 * [List Collection]
	 * - 객체를 인데스로 관리, 인덱스로 검색, 삭제 가능
	 * - 객체를 저장하는 것이 아니라, 객체의 번지를 참조
	 * - 객체를 중복 저장 가능(동일한 번지 참조)
	 * - null 저장 가능(해당 인덱스는 객체를 참조 안함)
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>(30);	//객체 30개 저장가능(30개 초과시 자동적으로 저장용량 증가), 초기값 10
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "DataBase");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		
		System.out.println("2: " + list.get(2));
		
		for(int i=0 ; i<size ; i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
		list.remove(2);		//Database 제거
		list.remove(2);		//Servlet/JSP 제거
		list.remove("iBATIS");
		
		System.out.println();
		for(int i=0 ; i<list.size() ; i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
		//asList(), 배열을 ArrayList로 변환
		
		String[] strArr = new String[]{"유재석", "강호동", "박명수"};
		
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(strArr));
		
		for(String name: list2) {
			System.out.println(name);
		}
		
		//ArrayList를 이용해서 배열에 특정 값이 들어 있는지 확인
		boolean isFlag = Arrays.asList(strArr).contains("유재석");
		System.out.println(isFlag);
	}

}
