package tset07;

import java.util.ArrayList;

public class TypeList {
	
	public static void main(String[] args) {
		
		/*
		 * List
		 * 리스트는 배열의 약점을 보완하기 위해 만들어진 자료형
		 * 배열은 크기가 정해져 있으나,
		 * 리스트는 동적으로 크기 조절 가능
		 */
		
		ArrayList<String> launchs = new ArrayList<String>();
		
		launchs.add("칼국수");
		launchs.add("콩나물국밥");
		launchs.add("순대국밥");
		launchs.add("돈까스");
		launchs.add("중식");
		launchs.add("가나식당");
		launchs.add("한가람식당");
		
		System.out.println(launchs.get(1));				//특정 index 값 추출
		System.out.println(launchs.size());				//ArrayList의 갯수 리턴
		System.out.println(launchs.contains("중식"));	//리스트 안에 항목값이 있는지 판별하여 그 결과를 boolean으로 리턴
		
		//remove(객체), remove(인덱스)
		System.out.println("remove(객체) : " + launchs.remove("중식"));
		System.out.println("remove(인덱스) : " + launchs.remove(1));
		
		System.out.println("");
		for(int i = 0 ; i < launchs.size() ; i++) {
			System.out.println(launchs.get(i));
		}
		
		for(String launch: launchs) {
			System.out.println(launch);
		}
		
	}
}
