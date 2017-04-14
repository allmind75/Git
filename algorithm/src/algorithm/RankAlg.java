package algorithm;

public class RankAlg {

	public static void main(String[] args) {
		
		int[] grade = new int[]{47, 98, 56, 33, 85};
		int[] rank = new int[]{1, 1, 1, 1, 1};
		
		
		//rank ���ϱ�
		for(int i=0 ; i<rank.length ; i++) {
			
			for(int j=0 ; j<grade.length ; j++) {
				
				if(grade[i] < grade[j]) {
					rank[i]++;
				}
				
			}
		}
		
		//���
		System.out.println("1. ���");
		for(int i=0 ; i<grade.length ; i++) {
			System.out.println(rank[i] + "\t" + grade[i]);
		}
		System.out.println();
		
		//1����� ����ϱ�
		System.out.println("2. ���");
		
		int[] index = new int[rank.length];	//rank�� �� index�� �����ϴ� �迭
		
		for(int i=0 ; i<rank.length ; i++) {
			index[rank[i] - 1] = i;
		}
		
		//���
		for(int i=0 ; i<rank.length ; i++) {
			int t = index[i];
			System.out.println(rank[t] + "\t" + grade[t]);
		}
	}
}
