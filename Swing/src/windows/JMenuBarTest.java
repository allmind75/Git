package windows;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuBarTest extends JFrame{

	public JMenuBarTest() {
		
		super.setSize(300, 500);
		super.setTitle("JMenuBar Test");
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		addMenubar();
		
		super.setVisible(true);
		
	}
	
	public void addMenubar() {
		
		JMenuBar menuBar = new JMenuBar();		//menuBar
		
		JMenu file = new JMenu("����");			//menu
		JMenu edit = new JMenu("����");			//menu
		JMenu help = new JMenu("����");			//menu
		
		JMenuItem[] item_file = new JMenuItem[]{new JMenuItem("���θ����"), new JMenuItem("����..."), new JMenuItem("����"),new JMenuItem("������")};
		JMenuItem[] item_edit = new JMenuItem[]{new JMenuItem("�������"), new JMenuItem("�����ϱ�"), new JMenuItem("�߶󳻱�"),new JMenuItem("�ٿ��ֱ�")};
		JMenuItem[] item_help = new JMenuItem[]{new JMenuItem("�����ٱ�?"), new JMenuItem("����?")};
		
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(help);
		
		addMenuItem(file, item_file);
		addMenuItem(edit, item_edit);
		addMenuItem(help, item_help);
				
		//button select
		item_file[item_file.length-1].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
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
