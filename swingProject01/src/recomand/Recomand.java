package recomand;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import common.Common;
import common.Footer;

public class Recomand extends JPanel implements Runnable {

	private JPanel panelMainVisual, panelMainContent;
	private JLabel labelMain;
	private JButton btnCont_01, btnCont_02;
	private ImageIcon ic_main, ic_cont1, ic_cont2;
	private String[] resMainVisualImg = new String[]{"res/bg_main1.jpg", "res/bg_main2.jpg", "res/bg_main3.jpg", "res/bg_main4.jpg", "res/bg_main5.jpg"};
	
	public Recomand() {

		super.setLayout(new BorderLayout());
		addMainContent();
		
		Thread thread = new Thread(this);
		thread.setPriority(Thread.MIN_PRIORITY);
		thread.start();
		
	}

	public void addMainContent() {

		panelMainVisual = new JPanel();
		panelMainContent = new JPanel(new GridLayout(0, 2, 10, 10));

		ic_main = new ImageIcon("res/main_visual.jpg");
		ic_cont1 = new ImageIcon("res/main_cont_01.jpg");
		ic_cont2 = new ImageIcon("res/main_cont_02.jpg");

		labelMain = new JLabel(Common.resizeImage(ic_main, 360, 224));
		btnCont_01 = new JButton(ic_cont1);
		btnCont_02 = new JButton(ic_cont2);

		panelMainContent.setBackground(Color.white);

		panelMainVisual.add(labelMain);
		panelMainContent.add(btnCont_01);
		panelMainContent.add(btnCont_02);

		add(panelMainVisual, "North");
		add(panelMainContent, "Center");
		add(new Footer(), "South");

	}

	@Override
	public void run() {
		
		int i = 0;
		
		while(true) {
			
			ImageIcon img = new ImageIcon(resMainVisualImg[i++]);
			labelMain.setIcon(Common.resizeImage(img, 360, 224));
			
			if(i == 5) {
				i = 0;
			}
			
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {
				
			}
		}
	}
}
