package jinjuTour;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

public class IndexFrame extends JFrame {

	private JTabbedPane tab;
	private JPanel recomandPanel, tripPanel, foodPanel, productPanel;
	private JLabel footerLabel;
	
	public IndexFrame() {
		
		//IndexFrame reset
		super.setSize(360, 680);
		super.setTitle("��������");
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setLocationRelativeTo(null);
		
		
		//Menu
		addMenu();
		
		//Panel
		addPanel();
		
		//TabbedPane
		addTabbedPane();
		
		//��õ ��
		makeRecomand();
		
		//
		
		super.setVisible(true);
	}
	
	public void addMenu() {
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("�޴�");
		JMenuItem[] menuItem = new JMenuItem[]{
				new JMenuItem("HOME"),
				new JMenuItem("ȸ������"),
				new JMenuItem("�α���"),
				new JMenuItem("��������"),
				new JMenuItem("����"),
				new JMenuItem("����"),
				new JMenuItem("����")
		};

		menuBar.add(menu);
		
		for(int i = 0 ; i < menuItem.length ; i++) {
			
			menu.add(menuItem[i]);
			
			if(i != menuItem.length - 1) {
				menu.addSeparator();
			}
		}
		
		super.setJMenuBar(menuBar);
	}
	
	public void addPanel() {
		
		recomandPanel = new JPanel(new BorderLayout());
		tripPanel = new JPanel(new BorderLayout());
		foodPanel = new JPanel(new BorderLayout());
		productPanel = new JPanel(new BorderLayout());
		
	}
	
	public void addTabbedPane() {
		
		tab = new JTabbedPane();
		
		
		
		tab.add("��õ", recomandPanel);
		tab.add("������", null);
		tab.add("����", null);
		tab.add("Ư�깰", null);
		
		super.add(tab);
		
	}
	
	public void makeRecomand() {
		
		addMainContent();
		addFooter();
	}
	
	public void addMainContent() {
		
		JPanel mainContentPanel = new JPanel();
		ImageIcon ic_main = new ImageIcon("res/mainContent.jpg");
		JLabel mainLabel = new JLabel(resizeImage(ic_main, 360, 224));
		
		mainContentPanel.add(mainLabel);
		
		recomandPanel.add(mainContentPanel, "North");
		
	}
	
	public void addFooter() {
		
		final String str = "COPYRIGHT JinjuTour ALL RIGHTS RESERVED";
		
		JPanel footerPanel = new JPanel();
		footerPanel.setBackground(new Color(75, 75, 75));
		
		footerLabel = new JLabel(str, SwingConstants.CENTER);
		footerLabel.setForeground(Color.WHITE);
		footerPanel.add(footerLabel);

		recomandPanel.add(footerPanel, "South");
	}
	
	
	
	
	public ImageIcon resizeImage(ImageIcon icon, int width, int height) {
		
		Image img = icon.getImage();
		img = img.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		ImageIcon resizeImageIcon = new ImageIcon(img);
				
		return resizeImageIcon;
	}
	
	
}
