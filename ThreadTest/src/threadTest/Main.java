package threadTest;

import java.awt.Toolkit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���ٽ�
		Thread thread = new Thread(() -> {
			
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0 ; i<10 ; i++) {
				toolkit.beep();
				try { Thread.sleep(500);} catch(Exception e) {}
			}
		});
		
		thread.start();
		
		System.out.println("thread name : " + thread.getName());
		
		for(int i=0 ; i<10 ; i++) {
			System.out.println("���");
			try{ Thread.sleep(500);} catch(Exception e) {}
		}
	}

}
