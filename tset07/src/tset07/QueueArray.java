package tset07;

public class QueueArray {

	
	//배열을 이용한 큐
	// front, rear, maxSize 변수를 이용
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

	//큐가 비어있는지 확인
	public boolean empty() {
		return (front == rear+1);
	}

	//큐가 가득 찼는지 확인
	public boolean full() {
		return (rear == maxSize-1);
	}
	
	//큐에 데이터 추가
	public void insert(Object item) {
		
		if(full()) throw new ArrayIndexOutOfBoundsException();
		
		queue[++rear] = item;
	}
	
	//큐의 가장 앞에 있는 정수 출력
	public Object front() {
		
		if(empty()) throw new ArrayIndexOutOfBoundsException();
		
		return queue[front];	
	}
	
	//큐의 가장 뒤에 있는 정수 출력
	public Object back() {
		
		if(empty()) throw new ArrayIndexOutOfBoundsException();
		
		return queue[rear];
	}
	
	//큐에서 가장 앞에 있는 정수 빼고, 그 수를 출력
	public Object pop() {
		
		Object item = front();
		front++;
		return item;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
