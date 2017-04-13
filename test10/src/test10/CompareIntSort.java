package test10;

import java.util.Comparator;

public class CompareIntSort implements Comparator<Integer> {

	@Override
	public int compare(Integer a, Integer b) {
		
		if(a > b) {
			return -1;
		} else if( a == b) {
			return 0;
		} else {
			return 1;
		}
	}
}
