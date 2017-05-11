package algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import javax.management.openmbean.ArrayType;

public class Num10845 {

	private int front;
	private int rear;
	private int maxSize;
	static Object[] queue;

	public Num10845(int maxSize) {

		this.front = 0;
		this.rear = -1;
		this.maxSize = maxSize;
		this.queue = new Object[maxSize];
	}

	public boolean isEmpty() {
		return (front == rear + 1);
	}

	public boolean full() {
		return (rear == maxSize - 1);
	}

	public void push(Object item) {

		if (full())
			throw new ArrayIndexOutOfBoundsException();

		queue[++rear] = item;
	}

	public Object front() {

		if (isEmpty())
			throw new ArrayIndexOutOfBoundsException();

		return queue[front];
	}

	public Object back() {

		if (isEmpty())
			throw new ArrayIndexOutOfBoundsException();

		return queue[rear];
	}

	public Object pop() {

		Object item = front();
		front++;
		return item;
	}

	public int size() {

		if (isEmpty())
			throw new ArrayIndexOutOfBoundsException();

		return (rear - front + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N;
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		sc.nextLine();

		Num10845 main = new Num10845(N);

		for (int i = 0; i < N; i++) {

			String input;
			input = sc.nextLine();
			String[] temp = input.split("\\s");

			switch (temp[0]) {
			case "push":
				main.push(Integer.parseInt(temp[1]));
				break;
			case "pop":
				try {
					System.out.println(main.pop());
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println(-1);
				}
				break;
			case "size":
				try {
					System.out.println(main.size());
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println(0);
				}
				break;
			case "empty":
				if (main.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			case "front":
				if (main.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(main.front());
				}
				break;
			case "back":
				if (main.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(main.back());
				}
				break;
			}

		}
		sc.close();
	}

}
