package algorithm;

import java.util.Scanner;

public class Num1966 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T, N, M;
		int data;
		int searchData = 0;
		int result;

		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();

		for (int t = 0; t < T; t++) {

			result = 1;
			N = sc.nextInt();
			M = sc.nextInt();

			QueueArrayMap queue = new QueueArrayMap(N);

			// insert queue
			for (int i = 0; i < N; i++) {

				data = sc.nextInt();
				queue.enqueue(data, i);

				if (M == i) {
					searchData = data;
				}
			}

			// check
			while (!queue.empty()) {

				int[] temp = queue.check();

				if (temp == null) {

				} else if (temp[0] == searchData && temp[1] == M) {
					System.out.println(result);
				} else {
					result++;
				}
			}

			for (int i = 0; i < N; i++) {

				try {

					int[] temp = queue.dequeue();
					System.out.println(temp[0] + "//" + temp[1]);

				} catch (ArrayIndexOutOfBoundsException e) {

				}
			}
		}

	}

}

class QueueArrayMap {

	private int front;
	private int rear;
	private int maxSize;
	static Node[] queue;

	class Node {

		private int data;
		private int position;

		Node(int data, int position) {
			this.data = data;
			this.position = position;
		}
	}

	public QueueArrayMap(int maxSize) {
		this.front = 0;
		this.rear = -1;
		this.maxSize = maxSize * 4;
		this.queue = new Node[this.maxSize];
	}

	public boolean empty() {
		return (front == rear + 1);
	}

	public boolean full() {
		return (rear == maxSize - 1);
	}

	public void enqueue(int data, int position) {

		if (full())
			throw new ArrayIndexOutOfBoundsException();

		queue[++rear] = new Node(data, position);
	}

	public Node front() {

		if (empty())
			throw new ArrayIndexOutOfBoundsException();

		return queue[front];
	}

	public int peek() {

		if (empty())
			throw new ArrayIndexOutOfBoundsException();

 		return queue[front].data;
	}

	public int[] dequeue() {

		Node data = front();
		int[] temp = new int[2];

		front++;
		temp[0] = data.data;
		temp[1] = data.position;

		return temp;
	}

	public int[] check() {

		for (int i = front; i <= rear; i++) {

			for (int j = i + 1; j <= rear; j++) {
				
				if (peek() < queue[j].data) {

					int[] temp = dequeue();
					enqueue(temp[0], temp[1]);

				} else {

					int[] temp = dequeue();
					return temp;
				}
			}
		}
		return dequeue();
	}
}
