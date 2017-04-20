package test11;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Num09 {
	/*
	 * �Ʒ��� ���� 2���� �迭�� �־�����.
	 * �迭1 {0.1, 0.2, 10, 20, 30}, �迭2 {1,2,3,4,5,6}
	 * ���� 2���� �迭�� ���޹ް�, ���޹��� �迭�� �ϳ��� �����ϴ� �Լ��� �ۼ��Ͻÿ�.
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
