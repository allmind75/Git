package tset07;

public class QueueList {

	private class Node {
		private Object data;
		private Node nextNode;

		Node(Object data) {
			this.data = data;
			this.nextNode = null;
		}
	}

	private Node front;
	private Node rear;

	public QueueList() {
		this.front = null;
		this.rear = null;
	}

	public boolean empty() {
		return front == null;
	}

	public void enqueue(Object data) {

		Node node = new Node(data);
		node.nextNode = null;

		if (empty()) {
			rear = node;
			front = node;
		} else {
			rear.nextNode = node;
			rear = node;
		}
	}

	public Object peek() {
		if (empty())
			throw new ArrayIndexOutOfBoundsException();
		return front.data;
	}

	public Object dequeue() {

		Object data = peek();
		front = front.nextNode;

		if (front == null) {
			rear = null;
		}

		return data;
	}

	public Object back() {
		if (empty())
			throw new ArrayIndexOutOfBoundsException();
		return rear.data;
	}

	public static void main(String[] args) {

		QueueList queue = new QueueList();

		for (int i = 0; i < 10; i++) {
			queue.enqueue(i);
			System.out.println("queue.peek() : " + queue.back());
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(queue.dequeue());
		}
	}
}
