package tset07;

import java.util.HashSet;

public class TypeSet {

	/*
	 * Set
	 * Ư¡ : ������ ����, �ߺ� ��� ����
	 * ���� : �����ӵ�
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("1");
		
		System.out.println(set);
	}

}
