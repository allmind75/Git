package test11;

public class Num07 {

	public static void main(String[] args) {

		System.out.println("[���� 7] 3���� ���ڿ��� ���޹ް�, ���� ���� 3���� ���ڿ��� ������ �� ����ϴ� ���� �޼ҵ带 �ۼ�");

		String str1 = "����";
		String str2 = "������ ";
		String str3 = "�߱�";
		String str4;
		
		str4 = strCat(strCat(str1, str2), str3);
		System.out.println("\n����� ���ڿ�: " + str4);

	}

	public static String strCat(String s1, String s2) {

		return s1 + s2;
	}

}
