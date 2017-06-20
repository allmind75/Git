package list;

import java.util.ArrayList;
import java.util.Arrays;

public class List {
	
	/*
	 * [List Collection]
	 * - ��ü�� �ε����� ����, �ε����� �˻�, ���� ����
	 * - ��ü�� �����ϴ� ���� �ƴ϶�, ��ü�� ������ ����
	 * - ��ü�� �ߺ� ���� ����(������ ���� ����)
	 * - null ���� ����(�ش� �ε����� ��ü�� ���� ����)
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>(30);	//��ü 30�� ���尡��, �ʱⰪ 10
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "DataBase");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("�� ��ü�� : " + size);
		
		System.out.println("2: " + list.get(2));
		
		for(int i=0 ; i<size ; i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
		list.remove(2);		//Database ����
		list.remove(2);		//Servlet/JSP ����
		list.remove("iBATIS");
		
		System.out.println();
		for(int i=0 ; i<list.size() ; i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
		//asList(), �迭�� ArrayList�� ��ȯ
		
		String[] strArr = new String[]{"���缮", "��ȣ��", "�ڸ��"};
		
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(strArr));
		
		for(String name: list2) {
			System.out.println(name);
		}
	}

}
