package tset07;

import java.util.ArrayList;

public class TypeList {
	
	public static void main(String[] args) {
		
		/*
		 * List
		 * Ư¡ : ������ �ְ�, �ߺ��� ���
		 * 
		 * ����Ʈ�� �迭�� ������ �����ϱ� ���� ������� �ڷ���
		 * �迭�� ũ�Ⱑ ������ ������,
		 * ����Ʈ�� �������� ũ�� ���� ����
		 */
		
		ArrayList<String> launchs = new ArrayList<String>();
		
		launchs.add("Į����");
		launchs.add("�ᳪ������");
		launchs.add("���뱹��");
		launchs.add("���");
		launchs.add("�߽�");
		launchs.add("�����Ĵ�");
		launchs.add("�Ѱ����Ĵ�");

		//���(for each)
		System.out.print("ArrayList : ");
		for(String launch: launchs) {
			System.out.print(launch + " ");
		}
		System.out.println("\n");

		System.out.println("launchs.get(1) : " + launchs.get(1));				//Ư�� index �� ����
		System.out.println("launchs.size() : " + launchs.size());				//ArrayList�� ���� ����
		System.out.println("launchs.contains(\"�߽�\") : " + launchs.contains("�߽�"));	//����Ʈ �ȿ� �׸��� �ִ��� �Ǻ��Ͽ� �� ����� boolean���� ����
		
		//remove(��ü), remove(�ε���)
		System.out.println("remove(�߽�) : " + launchs.remove("�߽�"));
		System.out.println("remove(1) : " + launchs.remove(1));
		
		//���(for��)
		System.out.print("\nArrayList : ");
		for(int i = 0 ; i < launchs.size() ; i++) {
			System.out.print(launchs.get(i) + " ");
		}

		
	}
}
