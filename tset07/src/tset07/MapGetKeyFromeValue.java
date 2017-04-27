package tset07;

import java.util.HashMap;

public class MapGetKeyFromeValue {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "피카츄");
		map.put(2, "라이츄");
		map.put(3, "파이리");
		
		System.out.println("map.get(1) : " + map.get(1));
		System.out.println("map.get(2) : " + map.get(2));
		System.out.println("map.get(3) : " + map.get(3));
		System.out.println();
		
		//key값을 object 타입으로 반환
		System.out.println("getKeyFromValue(map, \"피카츄\") : " + getKey(map, "피카츄")); 
		System.out.println("getKeyFromValue(map, \"라이츄\") : " + getKey(map, "라이츄")); 
		System.out.println("getKeyFromValue(map, \"파이리\") : " + getKey(map, "파이리")); 
		System.out.println();

		//int형으로 변환 후 value 값 출력
		System.out.println(map.get( (int) getKey(map, "피카츄") ) ); 	
		System.out.println(map.get( (int) getKey(map, "라이츄") ) ); 	
		System.out.println(map.get( (int) getKey(map, "파이리") ) ); 	
	}

	public static Object getKey(HashMap<Integer, String> m, Object value) {
		
		for(Object o: m.keySet()) {
			
			if(m.get(o).equals(value)) {
				return o;
			}
		}
		return null;
	}
}
