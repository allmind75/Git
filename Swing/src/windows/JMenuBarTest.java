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
		
		JMenuBar menuBar = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenuItem item_new = new JMenuItem("New");
		JMenuItem item_exit = new JMenuItem("Exit");
		
		menuBar.add(file);
		file.add(item_new);
		file.add(item_exit);
		
		item_exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		//menuBar.setBackground();
		
		super.setJMenuBar(menuBar);;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JMenuBarTest();
	}

}
