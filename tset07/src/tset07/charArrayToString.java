package tset07;

import java.util.Arrays;

public class charArrayToString {

	
	public static void main(String[] args) {
		
		char[] charArray1 = {'a', 'b', 'c'};
		char[] charArray2;
		int[] intArray1 = {1, 2, 3};
		
		//char �迭�� String���� ��ȯ
		String str1 = String.valueOf(charArray1);
		String str2 = new String(charArray1);
		
		//Arrays.toString()�� "[ �迭���, �迭���, �迭��� ...]" ���� ���ڿ� ��ȯ
		String str3 = Arrays.toString(intArray1);
		
		//String ���ڿ��� char �迭�� ��ȯ
		charArray2 = str1.toCharArray();
		
		//���
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("Arrays.toString(charArray1) : " + Arrays.toString(charArray1)); //�迭�� ���ڿ��� ��ȯ�ؼ� ���
		System.out.print("charArray2 : ");
		for(int i=0 ; i<charArray2.length ; i++) {
			System.out.print(charArray2[i] + " ");
		}
	}
}
