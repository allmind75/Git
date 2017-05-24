package jinjuTour;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
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
		super.setTitle("진주투어");
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setLocationRelativeTo(null);
		
		
		//Menu
		addMenu();
		
		//Panel
		addPanel();
		
		//TabbedPane
		addTabbedPane();
		
		//추천 탭
		makeRecomand();
		
		//
		
		super.setVisible(true);
	}
	
	public void addMenu() {
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("메뉴");
		JMenuItem[] menuItem = new JMenuItem[]{
				new JMenuItem("HOME"),
				new JMenuItem("회원가입"),
				new JMenuItem("로그인"),
				new JMenuItem("공지사항"),
				new JMenuItem("도움말"),
				new JMenuItem("설정"),
				new JMenuItem("종료")
		};

		menuBar.add(menu);
		
		for(int i = 0 ; i < menuItem.length ; i++) {
			
			menu.add(menuItem[i]);
			
			if(i != menuItem.length - 1) {
				menu.addSeparator();
			}
		}
		

		
		menuItem[6].addActionListener((ActionEvent e) -> { System.exit(0);
		});
		
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
		
		
		
		tab.add("추천", recomandPanel);
		tab.add("관광지", null);
		tab.add("맛집", null);
		tab.add("특산물", null);
		
		super.add(tab);
		
	}
	
	public void makeRecomand() {
		
		addMainContent();
		addFooter();
	}
	
	public void addMainContent() {
		
		JPanel mainVisualPanel = new JPanel();
		JPanel mainContentPanel = new JPanel(new GridLayout(0, 2,10, 10));
		
		ImageIcon ic_main = new ImageIcon("res/main_visual.jpg");
		ImageIcon ic_cont1 = new ImageIcon("res/main_cont_01.jpg");
		ImageIcon ic_cont2 = new ImageIcon("res/main_cont_02.jpg");
		
		JLabel mainLabel = new JLabel(resizeImage(ic_main, 360, 224));
		JLabel cont1Label = new JLabel(ic_cont1);
		JLabel cont2Label = new JLabel(ic_cont2);
		
		mainContentPanel.setBackground(Color.white);
		
		mainVisualPanel.add(mainLabel);
		mainContentPanel.add(cont1Label);
		mainContentPanel.add(cont2Label);
		
		recomandPanel.add(mainVisualPanel, "North");
		recomandPanel.add(mainContentPanel, "Center");
		
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
