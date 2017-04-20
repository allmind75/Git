package test11;

public class Num07 {

	public static void main(String[] args) {

		System.out.println("[문제 7] 3개의 문자열을 전달받고, 전달 받은 3개의 문자열을 연결한 후 출력하는 정적 메소드를 작성");

		String str1 = "대전";
		String str2 = "광역시 ";
		String str3 = "중구";
		String str4;
		
		str4 = strCat(strCat(str1, str2), str3);
		System.out.println("\n연결된 문자열: " + str4);

	}

	public static String strCat(String s1, String s2) {

		return s1 + s2;
	}

}
