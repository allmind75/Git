package tset07;

public class TypeArray {
	
	public static void main(String[] args) {
		
		/*
		 * 배열이란 자료형의 집합
		 */
		int[] odds = {1, 3, 5, 7, 9};
		int[] evens = new int[5];
		
		int[][] data2 = new int[2][5];
		int[][] data = new int[][]{
			{10,20,30,40,50},
			{100,200,300,400,500}
		};
		
		evens[0] = 2;
		evens[1] = 4;
		evens[2] = 6;
		evens[3] = 8;
		evens[4] = 10;
		
		for(int i = 0 ; i < odds.length ; i++) {
			System.out.println("odds : " + odds[i]);
		}
		System.out.println("");
		
		for(int i = 0 ; i < evens.length ; i++) {
			System.out.println("evens : " + evens[i]);
		}
		
		for(int i=0 ; i<data.length ; i++) {
			for(int j=0 ; j<data[i].length ; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
	}
}
