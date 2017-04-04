package tset07;

import java.util.ArrayList;

/*
 * Thread ��Ӻ��� Runnable �������̽��� �����ϴ� ����� ���� ���
 * ThreadTest.java�� �����ϰ� �۵�
 * �ٸ�, �������̽��� �̿������� ��� �� ��Ÿ ���� �� �� ������ ���α׷����� ����
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
			 * Thread�� �����ڷ� Runnable �������̽��� ������ ��ü�� �ѱ�
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
