package tset07;

/*
 * Exception�� �ΰ����� ����
 * 
 * 1. RuntimeException - ���� �� �߻��ϴ� ����
 * 2. Exception 	   - ������ �� �߻��ϴ� ����
 */

class NameException extends Exception {

}

public class ThrowTest {

	//throw
	public void nameCheck(String name) {
		try {
			if ("drone".equals(name)) {

				throw new NameException();
			}

			System.out.println("nameCheck() �׶� �ϲ� : " + name);
		} catch (NameException e) {
			System.err.println("namecheck()���� NameException �߻� : " + e);
		}
	}

	
	//throws
	//ȣ���� ������ ���� ó���ϵ��� ���ܸ� ����
	public void nameCheck2(String name) throws NameException {

		if ("drone".equals(name)) {
			throw new NameException();
		}

		System.out.println("nameCheck2() �׶� �ϲ� : " + name);
	}

	public static void main(String[] args) {
		ThrowTest test = new ThrowTest();
		
		
		//nameCheck()���� ����ó���� �ϴ°�쿡�� �Ʒ� �ι��� ��� ����
		
		test.nameCheck("drone");
		test.nameCheck("scv");
		
		
		try {
			
			// main �޼ҵ忡�� ����ó���� �� ��쿡�� test.nameCheck2("scv") ���� �ȵ�
			// wyh? test.nameCheck2("drone")���� ���ܰ� �߻��Ͽ� catch ������ ���� ����
			
			test.nameCheck2("drone");
			test.nameCheck2("scv");
			
		} catch (NameException e) {
			
			System.out.println("main() NameException �߻� : " + e);
		}
	}
}
