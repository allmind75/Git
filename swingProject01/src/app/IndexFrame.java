package app;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

import common.Common;
import dialog.LoginDialog;
import dialog.SettingDialog;
import food.Food;
import product.Product;
import recomand.Recomand;
import trip.Trip;

public class IndexFrame extends JFrame {

	private static final int SCREEN_Width = 360;
	private static final int SCREEN_HEIGHT = 680;
	private static final String TITLE = "��������";
	private static final Image ICON_IMG = java.awt.Toolkit.getDefaultToolkit().getImage("res/ic_launcher_16.png");

	private JTabbedPane tab;
	private ImageIcon ic_user, ic_home, ic_user_plus, ic_login, ic_notice, ic_help, ic_setting, ic_exit;
	
	private Recomand tabRecomand;
	private Trip tabTrip;
	private Food tabFood;
	private Product tabProduct;

	public IndexFrame() {

		// IndexFrame reset
		super.setSize(SCREEN_Width, SCREEN_HEIGHT);
		super.setTitle(TITLE);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setLocationRelativeTo(null);
		super.setIconImage(ICON_IMG);
		super.setResizable(false); // ȭ�� ũ�⺯�� X

		//��ü ����
		tabTrip = new Trip();
		tabFood = new Food();
		tabProduct = new Product();

		// Menu
		addMenu();

		// TabbedPane
		addTabbedPane();



		super.setVisible(true);
	}

	public void addMenu() {

		ic_user = new ImageIcon("res/ic_user.png");
		ic_home = new ImageIcon("res/ic_home.png");
		ic_user_plus = new ImageIcon("res/ic_user_plus.png");
		ic_login = new ImageIcon("res/ic_login.png");
		ic_notice = new ImageIcon("res/ic_notice.png");
		ic_help = new ImageIcon("res/ic_help.png");
		ic_setting = new ImageIcon("res/ic_setting.png");
		ic_exit = new ImageIcon("res/ic_close.png");
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("�޴�(M)");
		JMenuItem[] menuItem = new JMenuItem[] { new JMenuItem(null, ic_user), new JMenuItem("HOME", ic_home),
				new JMenuItem("ȸ������", ic_user_plus), new JMenuItem("�α���", ic_login), new JMenuItem("��������", ic_notice), new JMenuItem("����", ic_help),
				new JMenuItem("����", ic_setting), new JMenuItem("����", ic_exit) };

		menuBar.add(menu);

		for (int i = 0; i < menuItem.length; i++) {

			menu.add(menuItem[i]);
			menuItem[i].setFont(Common.fontStyle(Font.BOLD, 14));
			menuItem[i].setBackground(new Color(243, 243, 243));
			
			if (i != menuItem.length - 1) {
				menu.addSeparator();
			}

			if (i == 0) {
				menuItem[i].setHorizontalAlignment(SwingConstants.CENTER); // menuItem ����
				menuItem[i].setBackground(new Color(3, 195, 199));
			}
		}

		// Mnemonic
		menu.setMnemonic(KeyEvent.VK_M);

		// actionListener
		menuItem[1].addActionListener((ActionEvent e) -> {
			tab.setSelectedIndex(0);
		});
		
		menuItem[3].addActionListener((ActionEvent e) -> {
			
			LoginDialog loginDialog = new LoginDialog(this);
			
		});
		
		
		menuItem[6].addActionListener((ActionEvent e) -> {
			
			SettingDialog settingDialog = new SettingDialog(this);
			
		});
		
		menuItem[menuItem.length - 1].addActionListener((ActionEvent e) -> {
			System.exit(0);
		});

		super.setJMenuBar(menuBar);
	}

	public void addTabbedPane() {

		tab = new JTabbedPane();

		tab.setFont(Common.TAB_FONT);

		tab.add("��õ", new Recomand());
		tab.add("������", tabTrip.getTripPanel());
		tab.add("����", tabFood.getFoodPanel());
		tab.add("Ư�깰", tabProduct.getProductPanel());

		super.add(tab);
		
		//tab
		//tabRecomand.addMainContent();
		tabTrip.addTripContent();
		tabFood.addFoodContent();
		tabProduct.addProductContent();

	}
}
