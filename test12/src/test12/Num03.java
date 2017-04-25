package test12;

import java.util.Scanner;

public class Num03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "문자열";
		String str2 = "문자열";
		String str3 = new String("문자열");
		String str4 = new String("문자열");
		String str5;
		String str6;
		
		Scanner sc = new Scanner(System.in);
		
		str5 = sc.nextLine();
		str6 = sc.nextLine();
		
		System.out.println(str1.getClass() + "@" + Integer.toHexString(str1.hashCode()));
		System.out.println(str1.getClass() + "@" + Integer.toHexString(str2.hashCode()));
		System.out.println(str1.getClass() + "@" + Integer.toHexString(str3.hashCode()));
		System.out.println(str1.getClass() + "@" + Integer.toHexString(str4.hashCode()));
		System.out.println(str1.getClass() + "@" + Integer.toHexString(str5.hashCode()));
		System.out.println(str1.getClass() + "@" + Integer.toHexString(str6.hashCode()));
		
		System.out.println();
		
		System.out.println(Integer.toHexString(System.identityHashCode(str1)));
		System.out.println(Integer.toHexString(System.identityHashCode(str2)));
		System.out.println(Integer.toHexString(System.identityHashCode(str3)));
		System.out.println(Integer.toHexString(System.identityHashCode(str4)));
		System.out.println(Integer.toHexString(System.identityHashCode(str5)));
		System.out.println(Integer.toHexString(System.identityHashCode(str6)));

		
		if(str3 == str4) {
			System.out.println("== : 같음");
		}
		if(str2.equals(str3)) {
			System.out.println("equals : 같음");
		}
		
		sc.close();
	}

}
