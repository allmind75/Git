package tset07;

/*
 * Exception은 두가지로 구분
 * 
 * 1. RuntimeException - 실행 시 발생하는 예외
 * 2. Exception 	   - 컴파일 시 발생하는 예외
 */

class NameException extends Exception {

	NameException() {
		super("[NameException]");
	}
}

public class ThrowTest {

	//throw
	public void nameCheck(String name) {
		try {
			if ("drone".equals(name)) {

				throw new NameException();
			}

			System.out.println("nameCheck() 테란 일꾼 : " + name);
		} catch (NameException e) {
			System.err.println("namecheck()에서 NameException 발생 : " + e);
		}
	}

	
	//throws
	//호출한 곳에서 예외 처리하도록 예외를 던짐
	public void nameCheck2(String name) throws NameException {

		if ("drone".equals(name)) {
			throw new NameException();
		}

		System.out.println("nameCheck2() 테란 일꾼 : " + name);
	}

	public static void main(String[] args) {
		ThrowTest test = new ThrowTest();
		
		
		//nameCheck()에서 예외처리를 하는경우에는 아래 두문장 모두 실행
		
		test.nameCheck("drone");
		test.nameCheck("scv");
		
		
		try {
			
			// main 메소드에서 예외처리를 한 경우에는 test.nameCheck2("scv") 실행 안됨
			// wyh? test.nameCheck2("drone")에서 예외가 발생하여 catch 문으로 가기 때문
			
			test.nameCheck2("drone");
			test.nameCheck2("scv");
			
		} catch (NameException e) {
			
			System.out.println("main() NameException 발생 : " + e);
		
		} finally { 
			
			System.out.println("[finally]");
		}
	}
}
