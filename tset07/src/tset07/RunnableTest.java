package tset07;

import java.util.ArrayList;

/*
 * Thread 상속보다 Runnable 인터페이스를 구현하는 방법을 많이 사용
 * ThreadTest.java와 동일하게 작동
 * 다만, 인터페이스를 이용했으니 상속 및 기타 등등에서 좀 더 유연한 프로그램으로 발전
 */
public class RunnableTest implements Runnable {

	int seq;
	
	public RunnableTest(int seq) {
		this.seq = seq;
	}
	
	public void run() {
		System.out.println(this.seq + " thread start.");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
		System.out.println(this.seq + " thread end.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Thread> threads = new ArrayList<Thread>();
		
		for(int i=0 ; i<10 ; i++) {
			
			/*
			 * Thread의 생성자로 Runnable 인터페이스를 구현한 객체를 넘김
			 */
			Thread t = new Thread(new RunnableTest(i));
			t.start();
			threads.add(t);
		}
		
		for(int i=0 ; i<threads.size() ; i++) {
			Thread t = threads.get(i);
			
			try {
				t.join();
			}catch(Exception e) {
				
			}
		}
		
		System.out.println("main end.");
	}

}
