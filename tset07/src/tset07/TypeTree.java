package tset07;

import java.util.TreeSet;

public class TypeTree {

	/*
	 * Tree
	 * 각 Element(Node)들의 균형된 분포가 관건
	 * Balanced Tree - Node  들의 분포가 고른 Tree 구조
	 * 어떤 Node를 찾아도 검색 depth가 일정하게 구성 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> tree = new TreeSet<String>();
		
		tree.add("AAAA");
		tree.add("xxxx");
		tree.add("ZZZZ");
		tree.add("BBBB");
		
		System.out.println(tree);
	}

}
