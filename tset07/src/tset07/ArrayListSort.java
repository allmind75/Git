package tset07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> integerList = new ArrayList<Integer>();
		ArrayList<String> stringList = new ArrayList<String>();

		// 입력
		for (int i = 9; i >= 0; i--) {
			integerList.add(i);
		}

		stringList.add("ZZZ");
		stringList.add("YYY");
		stringList.add("XXX");
		stringList.add("WWW");
		stringList.add("VVV");

		// 출력
		System.out.println("<정렬전>");
		print1(integerList);
		print2(stringList);
		System.out.println();

		// 오름차순 정렬
		Collections.sort(integerList);
		Collections.sort(stringList);

		// 출력
		System.out.println("\n<오름차순>");
		print1(integerList);
		print2(stringList);

		// 내림차순 정렬
		Collections.sort(integerList, new AscendingInteger());
		Collections.sort(stringList, new AscendingString());
		
		// 출력
		System.out.println("\n<내림차순>");
		print1(integerList);
		print2(stringList);

	}

	public static void print1(ArrayList<Integer> list) {

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}

	public static void print2(ArrayList<String> list) {

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}
}

class AscendingInteger implements Comparator<Integer> {

	@Override
	public int compare(Integer a, Integer b) {
		
		return b.compareTo(a);
	}
}

class AscendingString implements Comparator<String> {

	@Override
	public int compare(String a, String b) {
		
		return b.compareTo(a);
	}
}
