package test11;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Num09 {
	/*
	 * 아래와 같은 2개의 배열이 주어졌다.
	 * 배열1 {0.1, 0.2, 10, 20, 30}, 배열2 {1,2,3,4,5,6}
	 * 위의 2개의 배열을 전달받고, 전달받은 배열을 하나로 연결하는 함수를 작성하시오.
	 */
	public static void main(String[] args) {
		
		double[] d1 = new double[]{0.1, 0.2, 10, 20, 30};
		double[] d2 = new double[]{1, 2, 3, 4, 5, 6};
		double[] d3 = new double[d1.length + d2.length];
		
		d3 = ArrayCat(d1, d2);
		
		for(double d: d3) {
			System.out.print(d + " ");
		}
	}
	
	public static double[] ArrayCat(double[] d1, double[] d2) {
		
		double[] d3;
		d3 = new double[d1.length + d2.length];
		
		for(int i=0 ; i<d3.length ; i++) {
			
			if(i<d1.length) {
				d3[i] = d1[i];
			} else {
				d3[i] = d2[i-d1.length];
			}
		}
			
		return d3;
	}
}
