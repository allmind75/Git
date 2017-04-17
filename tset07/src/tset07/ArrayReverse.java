package tset07;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] array2 = new Integer[] { 10, 45, 1, 3, 100, -10, 200, 5};
		System.out.println("기존배열 : " + Arrays.toString(array2));
		
		Arrays.sort(array2);
		System.out.println("sort : " + Arrays.toString(array2));
	
		List<Integer> list = Arrays.asList(array2);
		Collections.reverse(list);
		array2 = list.toArray(new Integer[list.size()]);
		
		System.out.println("list로 변환 후 reverse : " + Arrays.toString(array2));
	}

}
