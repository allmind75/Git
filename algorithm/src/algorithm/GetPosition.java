package algorithm;

public class GetPosition {

	/*
	 * ���簢�� ����� 3���� ��ǥ�� �־�����.
	 * �̶� ������ �ϳ� ��ǥ ���ϱ� 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] v = { { 1, 4 }, { 3, 4 }, { 3, 10 } };
		
		int[] result = solution(v);
		
		System.out.println(result[0] + " " + result[1]);
	}
	
	public static int[] solution(int[][] v) {
		int[] result = new int[2];
		int cnt = 0;
		
		for(int i=0 ; i<v.length ; i++) {
			cnt = 0;
			for(int j=0 ; j<v.length ; j++) {
				if(v[i][0] == v[j][0]) {
					cnt++;
				}
			}
			if(cnt == 1) {
				result[0] = v[i][0];
			}
		}
		
		for(int i=0 ; i<v.length ; i++) {
			cnt = 0;
			for(int j=0 ; j<v.length ; j++) {
				if(v[i][1] == v[j][1]) {
					cnt++;
				}
			}
			if(cnt == 1) {
				result[1] = v[i][1];
			}
		}		
		
		return result;
	}

}
