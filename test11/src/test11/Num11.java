package test11;

public class Num11 {

	/*
	 * �Ʒ��� ���� 2���� �迭�� �־����� ��, 2���� �迭�� ����ϴ� �Լ��� �ۼ��Ͻÿ�
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
