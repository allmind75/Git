package tset07;

public class StringBufferTest {

	public static void main(String[] args) {

		/*
		 * StringBuffer ���ϴ� ���ڿ��� �ٷ� �� ���
		 * StringBuffer ��ü�� �ѹ��� ���� �⺻������ 16���� ���ڸ� ������ �� �ִ� ���� ���� ���ڿ� ó�� ���� �����
		 * ������ StringBuffer ��ü�� �ݿ�
		 * 
		 * StrngBuffer �ڷ����� String ���� ���ſ�
		 * String���� �޸� ��뷮�� ���� �ӵ��� ����
		 * ���� ���ڿ� �߰��� ������� �۾��� ���� ��� StringBuffer ���
		 **/
		StringBuffer sb = new StringBuffer("Java-");
		sb.append("hello");
		sb.append(" ");
		sb.append("world");

		System.out.println(sb.toString());
		System.out.println(sb.capacity()); 			// ���� ���ڿ��� �� �뷮
		System.out.println(sb.insert(11, "hi "));	// ���ϴ� ��ġ�� ���ڿ� ����
		System.out.println(sb.substring(0, 4));		// ���ڿ� �ڸ���	
		
	}
}
