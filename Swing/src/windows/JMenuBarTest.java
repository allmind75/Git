package windows;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class JMenuBarTest extends JFrame{

	
	
	
	public JMenuBarTest() {
		
		super.setSize(300, 500);
		super.setTitle("JMenuBar Test");
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		super.setLayout(new BorderLayout());
		
		addMenubar();
		addToolBar();
		
		super.setVisible(true);
		
	}
	
	
	public void addToolBar() {
	
		//ImageIcon �߰�
		ImageIcon ic_1 = new ImageIcon("res/sana.jpg");
		
		//ImgageIcon ũ�� ����
		Image img = ic_1.getImage().getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
		ImageIcon sana = new ImageIcon(img);
		
		JToolBar toolBar = new JToolBar();
		JButton btn1 = new JButton("Sana", sana);
		
		
		toolBar.add(btn1);
		super.add(toolBar, "North");
	}
	
	
	public void addMenubar() {
		
		JMenuBar menuBar = new JMenuBar();		//menuBar
		
		JMenu[] menu = new JMenu[]{new JMenu("����(F)"), new JMenu("����(E)"), new JMenu("����(H)")};
		
		//ImageIcon �߰�
		ImageIcon ic_1 = new ImageIcon("res/sana.jpg");
		
		//ImgageIcon ũ�� ����
		Image img = ic_1.getImage().getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
		ImageIcon sana = new ImageIcon(img);
		
		JMenuItem[] item_file = new JMenuItem[]{new JMenuItem("���θ����", sana), new JMenuItem("����..."), new JMenuItem("����"),new JMenuItem("������")};
		JMenuItem[] item_edit = new JMenuItem[]{new JMenuItem("�������"), new JMenuItem("�����ϱ�"), new JMenuItem("�߶󳻱�"),new JMenuItem("�ٿ��ֱ�")};
		JMenuItem[] item_help = new JMenuItem[]{new JMenuItem("�����ٱ�?"), new JMenuItem("����?"), new JMenuItem("Randon Help !")};
		
		
		
		for(int i=0 ; i<menu.length ; i++) {
			
			menuBar.add(menu[i]);
		}

		
		addMenuItem(menu[0], item_file);
		addMenuItem(menu[1], item_edit);
		addMenuItem(menu[2], item_help);
		
		
		//����Ű ����
		menu[0].setMnemonic(KeyEvent.VK_F);
		menu[1].setMnemonic(KeyEvent.VK_E);
		menu[2].setMnemonic(KeyEvent.VK_H);
				
		//�޴� �������� ���� ���¿���, �޴� ������ �����ϴ� ���
		item_file[item_file.length-1].setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));

		
		
		//button select
//		item_file[item_file.length-1].addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.exit(0);
//			}
//		});
		
		
		item_file[item_file.length-1].addActionListener((ActionEvent e)->{
			

				// TODO Auto-generated method stub
				System.exit(0);
			
		});
		
		
		//menuBar.setBackground();
		
		super.setJMenuBar(menuBar);;
		
	}

	public void addMenuItem(JMenu menu, JMenuItem[] item) {
		
		for(int i=0 ; i<item.length ; i++) {
			
			menu.add(item[i]);
			
			if(i<item.length-1) menu.addSeparator();		//�и���
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JMenuBarTest();
	}

}
