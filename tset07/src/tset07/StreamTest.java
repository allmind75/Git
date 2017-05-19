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
		
		
		//for Each, 요소 순회	
		list.stream().forEach(System.out::println);
		
		System.out.println("--------------");
		//map, 개별요소 연산
		list.stream().map(i -> i*i).forEach(System.out::println);
		
		System.out.println("--------------");
		//limit, 최초 요소부터 선언한 인덱스 이전까지 추출해서 새로운 stream 생성
		list.stream().limit(4).forEach(System.out::println);
		
		System.out.println("--------------");
		//skip, 최초 요소부터 선언한 인덱스 이전까지 요소를 제외하고 새로운 stream 생성
		list.stream().skip(4).forEach(System.out::println);
		
		System.out.println("--------------");
		//filter, 요소마다 비교를 하고 비교문을 만족하는 요소로만 구성된 stream 반환
		list.stream().filter(i-> i<=10).forEach(System.out::println);
		
		System.out.println("--------------");
	}

}
