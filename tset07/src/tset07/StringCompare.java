package tset07;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "aa";
		String b = "aa";
		
		String c = new String("aa");
		
		System.out.println("a�� �ּ� : " + "@" + Integer.toHexString(System.identityHashCode(a)));
		System.out.println("b�� �ּ� : " + "@" + Integer.toHexString(System.identityHashCode(b)));
		System.out.println("c�� �ּ� : " + "@" + Integer.toHexString(System.identityHashCode(c)));
		
		System.out.println();
		
		if(a == b) {
			System.out.println("a == b -> a�� b�� �ּҰ��� ����");
		} 
		
		if(a == c) {
			System.out.println("a == c -> a�� c�� �ּҰ��� ����");
		} else {
			System.out.println("a == c -> a�� c�� �ּҰ��� �ٸ�");
		}
		System.out.println();
		if(a.equals(b)) {
			System.out.println("a.equals(b) -> a�� b�� ���ڿ��� ����");
		}
		
		if(a.equals(c)) {
			System.out.println("a.equals(c) -> a�� c�� ���ڿ��� ����");
		}
	}
}
