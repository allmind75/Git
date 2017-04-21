package tset07;

import java.util.HashMap;

public class TypeMap {

	public static void main(String[] args) {
		
		/*
		 * Map
		 * �������踦 ���� ǥ���� �� �ְ� ���ִ� �ڷ���
		 * Associative array, Hash��� �Ҹ�
		 * 
		 * key, value ��
		 * 
		 * Map�� ����Ʈ�� �迭ó�� ����������(Sequential) �ش� ��� ����
		 * ������ �ʰ� key, value�� �̿��ؼ� ��´�.
		 * 
		 * Map�� ���� ū Ư¡�� key value!
		 */
		
		//HashMap<key, value>
		HashMap<String, String> mapStarCraft = new HashMap<String, String>();
		
		//map.put(key, value) - map�� ��
		mapStarCraft.put("scv", "�׶� �ϲ�");
		mapStarCraft.put("probe", "�����佺 �ϲ�");
		mapStarCraft.put("drone", "���� �ϲ�");
		mapStarCraft.put("bird", "������");
				
		//map.get(key) - key������ value�� ���
		System.out.println("mapStarCraft.get(\"scv\") : " + mapStarCraft.get("scv"));
		System.out.println("mapStarCraft.get(\"probe\") : " + mapStarCraft.get("probe"));
		System.out.println("mapStarCraft.get(\"drone\") : " + mapStarCraft.get("drone"));
		System.out.println("");
		
		//map.containsKey(key) - map�� �ش� key�� �ִ��� Ȯ�� �� ����� boolean���� ����
		System.out.println("mapStarCraft.containsKey(scv) = " + mapStarCraft.containsKey("scv"));
		System.out.println("mapStarCraft.containsKey(marine) = " + mapStarCraft.containsKey("marine"));
		System.out.println("");

		//map.remove(key) - map���� key���� �ش�Ǵ� �������� ������ �� value���� ����
		//key ���� �ش��ϴ� ���� ������ null ����
		System.out.println("mapStarCraft.remove(bird) : " + mapStarCraft.remove("bird"));
		System.out.println("mapStarCraft.remove(dog) : " + mapStarCraft.remove("dog"));
		System.out.println("");
		
		//.size() - map�� ���� ����
		System.out.println("mapStarCraft size() = " + mapStarCraft.size());
	}
}
