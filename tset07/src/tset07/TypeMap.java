package tset07;

import java.util.HashMap;

public class TypeMap {

	public static void main(String[] args) {
		
		/*
		 * Map
		 * 대응관계를 쉽게 표현할 수 있게 해주는 자료형
		 * Associative array, Hash라고도 불림
		 * 
		 * key, value 값
		 * 
		 * Map은 리스트나 배열처럼 순차적으로(Sequential) 해당 요소 값을
		 * 구하지 않고 key, value를 이용해서 얻는다.
		 * 
		 * Map의 가장 큰 특징은 key value!
		 */
		
		HashMap<String, String> mapStarCraft = new HashMap<String, String>();
		mapStarCraft.put("scv", "테란 일꾼");
		mapStarCraft.put("probe", "프로토스 일꾼");
		mapStarCraft.put("drone", "저그 일꾼");
		mapStarCraft.put("bird", "시조새");
				
		//key값으로 value값 얻기
		System.out.println(mapStarCraft.get("scv"));
		System.out.println(mapStarCraft.get("probe"));
		System.out.println(mapStarCraft.get("drone"));
		System.out.println("");
		
		//map에 해당 key가 있는지 확인 후 결과값 boolean으로 리턴
		System.out.println("mapStarCraft.containsKey(marine) = " + mapStarCraft.containsKey("marine"));
		
		//map에서 key값에 해당되는 아이템을 삭제후 그 value값을 리턴
		//key 값에 해당하는 값이 없으면 null 리턴
		System.out.println("mapStarCraft.remove(bird) : " + mapStarCraft.remove("bird"));
		
		
		//map의 갯수 리턴
		System.out.println("mapStarCraft size() = " + mapStarCraft.size());
	}
}
