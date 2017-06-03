package app;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoadingPanel extends JPanel implements Runnable {

	public final ImageIcon ic_loading = new ImageIcon("res/loading.jpg");

	public JLabel labelLoading = new JLabel(ic_loading);
	
	public LoadingPanel() {


		//panel.add(labelLoading);
		//panel.setBackground(Color.BLUE);
		super.add(labelLoading);
		super.setSize(360, 680);
		super.setVisible(true);
		
		Thread thread = new Thread(this);
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.start();

	}

	@Override
	public synchronized void run() {

		try {

			Thread.sleep(1500);
			super.setVisible(false);
			
		} catch (InterruptedException e) {

		}
	}

}
