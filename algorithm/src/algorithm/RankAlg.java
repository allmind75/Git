package algorithm;

public class RankAlg {

	public static void main(String[] args) {
		
		int[] grade = new int[]{47, 98, 56, 33, 85};
		int[] rank = new int[]{1, 1, 1, 1, 1};
		
		
		//rank 구하기
		for(int i=0 ; i<rank.length ; i++) {
			
			for(int j=0 ; j<grade.length ; j++) {
				
				if(grade[i] < grade[j]) {
					rank[i]++;
				}
				
			}
		}
		
		//출력
		System.out.println("1. 출력");
		for(int i=0 ; i<grade.length ; i++) {
			System.out.println(rank[i] + "\t" + grade[i]);
		}
		System.out.println();
		
		//1등부터 출력하기
		System.out.println("2. 출력");
		
		int[] index = new int[rank.length];	//rank의 각 index를 저장하는 배열
		
		for(int i=0 ; i<rank.length ; i++) {
			index[rank[i] - 1] = i;
		}
		
		//출력
		for(int i=0 ; i<rank.length ; i++) {
			int t = index[i];
			System.out.println(rank[t] + "\t" + grade[t]);
		}
	}
}
