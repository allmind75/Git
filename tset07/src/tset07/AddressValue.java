package tset07;

public class AddressValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 123;
		double b = 567.22;
		double c = 567.22;
		String d = "str";
		String e = "str";
		
		System.out.println("a狼 林家 : @" +Integer.toHexString(System.identityHashCode(a)));
		System.out.println("b狼 林家 : @" +Integer.toHexString(System.identityHashCode(b)));
		System.out.println("c狼 林家 : @" +Integer.toHexString(System.identityHashCode(c)));
		System.out.println("d狼 林家 : @" +Integer.toHexString(System.identityHashCode(d)));
		System.out.println("e狼 林家 : @" +Integer.toHexString(System.identityHashCode(e)));
		
	}

}
