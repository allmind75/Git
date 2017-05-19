package tset07;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0 ; i < 20 ; i+=2) {
			list.add(i);
		}
		
		//get Stream
		Arrays.asList(1,2,3).stream();
		Arrays.asList(1,2,3).parallelStream();
		
		
		//for Each, ��� ��ȸ	
		list.stream().forEach(System.out::println);
		
		System.out.println("--------------");
		//map, ������� ����
		list.stream().map(i -> i*i).forEach(System.out::println);
		
		System.out.println("--------------");
		//limit, ���� ��Һ��� ������ �ε��� �������� �����ؼ� ���ο� stream ����
		list.stream().limit(4).forEach(System.out::println);
		
		System.out.println("--------------");
		//skip, ���� ��Һ��� ������ �ε��� �������� ��Ҹ� �����ϰ� ���ο� stream ����
		list.stream().skip(4).forEach(System.out::println);
		
		System.out.println("--------------");
		//filter, ��Ҹ��� �񱳸� �ϰ� �񱳹��� �����ϴ� ��ҷθ� ������ stream ��ȯ
		list.stream().filter(i-> i<=10).forEach(System.out::println);
		
		System.out.println("--------------");
	}

}
