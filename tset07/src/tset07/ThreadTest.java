package tset07;

import java.util.ArrayList;

public class ThreadTest extends Thread {

	int seq;

	public ThreadTest(int seq) {
		this.seq = seq;
	}

	public void run() {
		System.out.println(this.seq + " thread start.");

		try {
			Thread.sleep(1000);
		} catch (Exception e) {

		}

		System.out.println(this.seq + "thread end.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Thread> threads = new ArrayList<Thread>();
		
		for (int i = 0; i < 10; i++) {
			Thread test = new ThreadTest(i);
			test.start();
			threads.add(test);
		}
		
		for(int i=0 ; i<threads.size() ; i++) {
			
			Thread test = threads.get(i);
			try {
				/*
				 * 쓰레드가 종료된 후 다음 로직 수행
				 * 쓰레드가 종료될 때 까지 대기하는 메소드
				 */
				test.join();
				
			} catch(Exception e) {
				
			}
			
		}
		System.out.println("main end.");

	}

}
