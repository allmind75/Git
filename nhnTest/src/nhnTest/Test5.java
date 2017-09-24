package nhnTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String[] con = null;
		int p;
		String input;
		List<Person> list = new ArrayList<>();

		// INPUT
		String temp = scan.nextLine();
		con = new String[temp.length()];
		con = temp.split(" ");

		p = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < p; i++) {
			temp = scan.nextLine();
			String[] arr = temp.split(" ");
			Person person = null;
			if (arr.length == 2) {
				person = new Person(arr[0], Integer.parseInt(arr[1]));
			} else if (arr.length == 3) {
				person = new Person(arr[0], Integer.parseInt(arr[1]), arr[2]);
			}
			list.add(person);
		}

		// PROCESS
		switch (con[0]) {
		case "1":
			solution1(list, con);
			break;
		case "2":
			solution2(list);
			break;
		case "3":
			solution3(list);
			break;
		}

		// OUTPUT
		for (int i = 0; i < p; i++) {
			System.out.print(list.get(i).getSex() + " " + list.get(i).getAge());
			if (list.get(i).getEtc() != null) {
				System.out.print(" " + list.get(i).getEtc());
			}
			System.out.println();
		}

		scan.close();
	}

	public static void solution1(List<Person> list, String[] con) {
		// 성별
		Collections.sort(list, new SortSex(con));

	}

	public static void solution2(List<Person> list) {

		// 나이
		Collections.sort(list, new SortAge());
	}

	public static void solution3(List<Person> list) {

		Collections.sort(list, new SortEtc());
	}

}

class Person {
	private String sex;
	private Integer age;
	private String etc;

	public Person(String sex, Integer age) {
		super();
		this.sex = sex;
		this.age = age;
	}

	public Person(String sex, Integer age, String etc) {
		super();
		this.sex = sex;
		this.age = age;
		this.etc = etc;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEtc() {
		return etc;
	}

	public void setEtc(String etc) {
		this.etc = etc;
	}
}

class SortSex implements Comparator<Person> {

	private String[] con;

	public SortSex(String[] con) {
		this.con = con;
	}

	@Override
	public int compare(Person a, Person b) {

		return a.getSex().compareTo(b.getSex());
	}
}

class SortAge implements Comparator<Person> {

	@Override
	public int compare(Person a, Person b) {

		if (a.getAge() <= 7 || b.getAge() <= 7) {
			return a.getAge().compareTo(b.getAge());
		}

		if (a.getAge() == b.getAge()) {

		}
		return b.getAge().compareTo(a.getAge());
	}
}

class SortEtc implements Comparator<Person> {
	
	@Override
	public int compare(Person a, Person b) {
		
		String aEtc, bEtc;
		if(a.getEtc() == null) {
			aEtc = "A";
		} else {
			aEtc = a.getEtc();
		}
		
		if(b.getEtc() == null) {
			bEtc = "A";
		} else {
			bEtc = b.getEtc();
		}
		return bEtc.compareTo(aEtc);
	}
}