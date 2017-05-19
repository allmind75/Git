package windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

//class MyActionLisiner implements ActionListener {
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//
//		switch (e.getActionCommand()) {
//
//		case "exit":
//			System.out.println("종료");
//			break;
//			
//		case "del":
//			System.out.println("회원탈퇴");
//			break;
//			
//		}
//	}
//}

class MyDialog extends JDialog {

	private JPanel p1, p2;
	private JLabel labelId, labelPw;
	private JButton btnLogin, btnCancel;
	private JTextField textId;
	private JPasswordField textPw;

	public MyDialog(JFrame frame) {

		super(frame);
		super.setSize(300, 150);
		super.setTitle("로그인 Dialog");
		super.setModal(true); // dialog만 선택가능
		super.setLocationRelativeTo(frame); // 전달받은 frame 위에 생성
		super.setResizable(false); // 크기 고정
		super.setLayout(new BorderLayout());

		addPanel();
		addLoginInfoTextFiedl();
		addButton();

		super.setVisible(true);
	}

	public void addPanel() {

		p1 = new JPanel();
		p2 = new JPanel();

		p1.setBackground(new Color(3, 195, 199));
		p2.setBackground(new Color(243, 91, 91));

		// p1.setLayout();
		p1.setLayout(new GridLayout(2, 2, 10, 10));
		p2.setLayout(new FlowLayout());

		super.add(p1, "Center");
		super.add(p2, "South");
	}

	public void addButton() {

		btnLogin = new JButton("로그인");
		btnCancel = new JButton("취소");

		btnLogin.addActionListener((ActionEvent e) -> {

			if (textId.getText().equals("admin")) {

				String pw = new String(textPw.getPassword());

				if (pw.equals("admin")) {
					super.dispose();
				}
			} else {
				
				JOptionPane.showMessageDialog(this, "아디이 또는 비밀번호가 잘못되었습니다.");
				
			}
		});

		btnCancel.addActionListener((ActionEvent e) -> {

			super.dispose();
		});

		p2.add(btnLogin);
		p2.add(btnCancel);
	}

	public void addLoginInfoTextFiedl() {

		textId = new JTextField(20);
		textPw = new JPasswordField(20);

		labelId = new JLabel("ID", SwingConstants.CENTER);
		labelPw = new JLabel("PW", SwingConstants.CENTER);

		textPw.setEchoChar('*');

		p1.add(labelId);
		p1.add(textId);

		p1.add(labelPw);
		p1.add(textPw);

	}

}

public class ActionListnerTest extends JFrame implements ActionListener, Runnable {

	private JButton btn1, btn2, btn3, btn4, btn5;
	private JTextField txtField;
	private Thread thread;

	public ActionListnerTest() {

		super.setSize(500, 500);
		super.setTitle("ActionListner Test");
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setLayout(new FlowLayout());

		super.setLocationRelativeTo(null);

		addButton();
		addTextField();
		addMenu();
		
		
		super.setVisible(true);
	}

	public void addMenu() {
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("메뉴");
		JMenuItem[] menuItem = new JMenuItem[]{new JMenuItem("회원가입"), new JMenuItem("끝내기"), new JMenuItem("3")};
		
		menuBar.add(menu);		
		
		for(JMenuItem m: menuItem) {
			
			menu.add(m);
			menu.addSeparator();		//menuItem 분리선
			
		}
		
		

		menuItem[0].addActionListener((ActionEvent e) -> {
			
			JOptionPane.showMessageDialog(this, "회원가입");
			
		});
		
		menuItem[1].setActionCommand("exit");
		menuItem[1].addActionListener(this);
		
		super.setJMenuBar(menuBar);
		
	}
	
	@Override
	public void run() {

		for (int i = 0; i < 26; i++) {

			txtField.setText(String.valueOf((char) (97 + i)));

			try {
				Thread.sleep(200);

			} catch (InterruptedException e) {

			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {

		case "exit":
			// System.out.println("종료");

			System.exit(0);

			break;

		case "del":
			// System.out.println("회원탈퇴");
			txtField.setText("회원탈퇴");
			
			thread = new Thread(this);
			thread.start();
			break;

		}
	}

	public void addTextField() {

		txtField = new JTextField(20);
		super.add(txtField);
	}

	public void addButton() {

		// 클래스 이용
		// MyActionLisiner action = new MyActionLisiner();

		// Lambda
		ActionListener action1 = (ActionEvent e) -> {

			String cmd = e.getActionCommand();

			// JOptionPane.showMessageDialog(null, "MessageDialog");
			// JOptionPane.showConfirmDialog(null, "ConfirmDialog");
			// JOptionPane.showInputDialog("로그인버튼 클릭");

			txtField.setText("로그인");

			// dialog 생성
			MyDialog dialog = new MyDialog(this);

			System.out.println(cmd);
		};

		btn1 = new JButton("로그인");
		btn2 = new JButton("로그아웃");
		btn3 = new JButton("회원가입");
		btn4 = new JButton("회원탈퇴");
		btn5 = new JButton("종료");

		// button ActionCommand 설정
		btn4.setActionCommand("del");
		btn5.setActionCommand("exit");

		btn1.addActionListener(action1);

		btn2.addActionListener((ActionEvent e) -> {
			System.out.println(e.getActionCommand());
			txtField.setText("로그아웃");
		});

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getActionCommand());
				txtField.setText("회원가입");
			}
		});

		btn4.addActionListener(this);

		btn5.addActionListener(this);

		super.add(btn1);
		super.add(btn2);
		super.add(btn3);
		super.add(btn4);
		super.add(btn5);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ActionListnerTest();

	}

}
