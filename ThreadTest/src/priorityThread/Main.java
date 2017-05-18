package priorityThread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=1 ; i<=20 ; i++) {
			
			Thread thread = new CalcThread("thread " + i);
			
			if(i != 20) {
				thread.setPriority(Thread.MIN_PRIORITY);
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			
			thread.start();
		}
	}

}
