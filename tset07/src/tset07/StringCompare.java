package tset07;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "aa";
		String b = "aa";
		
		String c = new String("aa");
		
		System.out.println("a의 주소 : " + "@" + Integer.toHexString(System.identityHashCode(a)));
		System.out.println("b의 주소 : " + "@" + Integer.toHexString(System.identityHashCode(b)));
		System.out.println("c의 주소 : " + "@" + Integer.toHexString(System.identityHashCode(c)));
		
		System.out.println();
		
		if(a == b) {
			System.out.println("a == b -> a와 b의 주소값이 같음");
		} 
		
		if(a == c) {
			System.out.println("a == c -> a와 c의 주소값이 같음");
		} else {
			System.out.println("a == c -> a와 c의 주소값이 다름");
		}
		System.out.println();
		if(a.equals(b)) {
			System.out.println("a.equals(b) -> a와 b의 문자열이 같음");
		}
		
		if(a.equals(c)) {
			System.out.println("a.equals(c) -> a와 c의 문자열이 같음");
		}
	}
}
