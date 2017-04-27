package tset07;

import java.util.HashMap;

public class MapGetKeyFromeValue {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "��ī��");
		map.put(2, "������");
		map.put(3, "���̸�");
		
		System.out.println("map.get(1) : " + map.get(1));
		System.out.println("map.get(2) : " + map.get(2));
		System.out.println("map.get(3) : " + map.get(3));
		System.out.println();
		
		//key���� object Ÿ������ ��ȯ
		System.out.println("getKeyFromValue(map, \"��ī��\") : " + getKey(map, "��ī��")); 
		System.out.println("getKeyFromValue(map, \"������\") : " + getKey(map, "������")); 
		System.out.println("getKeyFromValue(map, \"���̸�\") : " + getKey(map, "���̸�")); 
		System.out.println();

		//int������ ��ȯ �� value �� ���
		System.out.println(map.get( (int) getKey(map, "��ī��") ) ); 	
		System.out.println(map.get( (int) getKey(map, "������") ) ); 	
		System.out.println(map.get( (int) getKey(map, "���̸�") ) ); 	
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
