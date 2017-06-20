package tset07;

public class EnumType {

	enum Gender{MAIL, FEMAIL}
	
	public static void main(String[] args) {
		
		//����Ÿ�� ����, ���� ��� �� ����
		Gender g = Gender.MAIL;
		
		//���� Ÿ�� ������ ����Ÿ��, null �� ���� ����
		Gender g2 = null;
		g2 = Gender.FEMAIL;
		/*
		 * name() - ���� ��ü�� ���ڿ� ����(String)
		 * 
		 * ordinal() - ���� ��ü�� ����(0���� ����) ����(int)
		 * 
		 * compareTo() - ���� ��ü�� ���ؼ� ���� ���̸� ����(int)
		 * 
		 * valueOf(String name) - �־��� ���ڿ��� ���� ��ü�� ����(����Ÿ��)
		 * 
		 * values() - ��� ���� ��ü���� �迭�� ����(���Ź迭)
		 */
		
		System.out.println(g);
		System.out.println(g.name());
		System.out.println(g.ordinal());
		System.out.println(g2.compareTo(g2));
		
		Gender g3 = Gender.valueOf("MAIL");
		System.out.println(g3);
		
		Gender[] gArray = Gender.values();
		
		for(Gender gArray1: gArray) {
			System.out.println("gArray : " + gArray1.name());
		}
	}
}
