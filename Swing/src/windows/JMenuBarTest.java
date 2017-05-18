package windows;

import java.awt.Event;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

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
		
		JMenu[] menu = new JMenu[]{new JMenu("파일(F)"), new JMenu("편집(E)"), new JMenu("도움말(H)")};
		
		//ImageIcon 추가
		ImageIcon ic_1 = new ImageIcon("res/sana.jpg");
		
		//ImgageIcon 크기 변경
		Image img = ic_1.getImage().getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
		ImageIcon sana = new ImageIcon(img);
		
		JMenuItem[] item_file = new JMenuItem[]{new JMenuItem("새로만들기", sana), new JMenuItem("열기..."), new JMenuItem("저장"),new JMenuItem("끝내기")};
		JMenuItem[] item_edit = new JMenuItem[]{new JMenuItem("실행취소"), new JMenuItem("복사하기"), new JMenuItem("잘라내기"),new JMenuItem("붙여넣기")};
		JMenuItem[] item_help = new JMenuItem[]{new JMenuItem("도와줄까?"), new JMenuItem("말까?"), new JMenuItem("Randon Help !")};
		
		
		
		for(int i=0 ; i<menu.length ; i++) {
			
			menuBar.add(menu[i]);
		}

		
		addMenuItem(menu[0], item_file);
		addMenuItem(menu[1], item_edit);
		addMenuItem(menu[2], item_help);
		
		
		//단축키 설정
		menu[0].setMnemonic(KeyEvent.VK_F);
		menu[1].setMnemonic(KeyEvent.VK_E);
		menu[2].setMnemonic(KeyEvent.VK_H);
				
		//메뉴 선택하지 않은 상태에서, 메뉴 아이템 선택하는 방법
		item_file[item_file.length-1].setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));

		
		
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
			
			if(i<item.length-1) menu.addSeparator();		//분리선
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JMenuBarTest();
	}

}
