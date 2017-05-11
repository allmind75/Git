package tset07;

public class QueueArray {

	
	//�迭�� �̿��� ť
	// front, rear, maxSize ������ �̿�
	private int front;
	private int rear;
	private int maxSize;
	private Object[] queue;
	
	public QueueArray(int maxSize) {
		
		this.front = 0;
		this.rear = -1;
		this.maxSize = maxSize;
		this.queue = new Object[maxSize];
	}

	//ť�� ����ִ��� Ȯ��
	public boolean empty() {
		return (front == rear+1);
	}

	//ť�� ���� á���� Ȯ��
	public boolean full() {
		return (rear == maxSize-1);
	}
	
	//ť�� ������ �߰�
	public void insert(Object item) {
		
		if(full()) throw new ArrayIndexOutOfBoundsException();
		
		queue[++rear] = item;
	}
	
	//ť�� ���� �տ� �ִ� ���� ���
	public Object front() {
		
		if(empty()) throw new ArrayIndexOutOfBoundsException();
		
		return queue[front];	
	}
	
	//ť�� ���� �ڿ� �ִ� ���� ���
	public Object back() {
		
		if(empty()) throw new ArrayIndexOutOfBoundsException();
		
		return queue[rear];
	}
	
	//ť���� ���� �տ� �ִ� ���� ����, �� ���� ���
	public Object pop() {
		
		Object item = front();
		front++;
		return item;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
