package algorithm;

public class BubbleSort {

	public static void main(String[] args) {
		
		int N;
		int[] array = new int[]{-10, 5, 33, 0, 29};
		N = array.length;
				
		for(int i=N-1 ; i>0 ; i--) {
			System.out.print("\n Bubble Sort " + (N-i) + "�ܰ�");
			for(int j=0 ; j<i ; j++) {
				//���� ��ġ���� ū ���� ������ �ڸ��ٲ� 
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				
				System.out.printf("\n\t");
				for(int n: array) {
					System.out.printf("%3d ", n);
				}
			}
			System.out.println();			
		}
		
		System.out.print("\nBubble Sort Result : ");
		for(int i=0 ; i<N ; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
