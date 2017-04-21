package test11;

public class Num11 {

	/*
	 * 아래와 같은 2차원 배열이 주어졌을 때, 2차원 배열을 출력하는 함수를 작성하시오
	 * 
	 * 34, 45, 66, 87, 20
	 * 89, 32, 45, 55, 90
	 */
	
	public static void print2D(int[][] n) {
		
		for(int i=0 ; i<n.length ; i++) {
			
			for(int j=0 ; j<n[i].length ; j++) {
				
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] data = new int[][]{{34, 45, 66, 87, 20}, {89, 32, 45, 55, 90}};
		
		print2D(data);
		
	}

}
