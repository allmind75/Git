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
		
		HashMap<String, String> mapStarCraft = new HashMap<String, String>();
		mapStarCraft.put("scv", "�׶� �ϲ�");
		mapStarCraft.put("probe", "�����佺 �ϲ�");
		mapStarCraft.put("drone", "���� �ϲ�");
		mapStarCraft.put("bird", "������");
				
		//key������ value�� ���
		System.out.println(mapStarCraft.get("scv"));
		System.out.println(mapStarCraft.get("probe"));
		System.out.println(mapStarCraft.get("drone"));
		System.out.println("");
		
		//map�� �ش� key�� �ִ��� Ȯ�� �� ����� boolean���� ����
		System.out.println("mapStarCraft.containsKey(marine) = " + mapStarCraft.containsKey("marine"));
		
		//map���� key���� �ش�Ǵ� �������� ������ �� value���� ����
		//key ���� �ش��ϴ� ���� ������ null ����
		System.out.println("mapStarCraft.remove(bird) : " + mapStarCraft.remove("bird"));
		
		
		//map�� ���� ����
		System.out.println("mapStarCraft size() = " + mapStarCraft.size());
	}
}
