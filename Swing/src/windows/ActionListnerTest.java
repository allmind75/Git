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
//			System.out.println("����");
//			break;
//			
//		case "del":
//			System.out.println("ȸ��Ż��");
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
		super.setTitle("�α��� Dialog");
		super.setModal(true); // dialog�� ���ð���
		super.setLocationRelativeTo(frame); // ���޹��� frame ���� ����
		super.setResizable(false); // ũ�� ����
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

		btnLogin = new JButton("�α���");
		btnCancel = new JButton("���");

		btnLogin.addActionListener((ActionEvent e) -> {

			if (textId.getText().equals("admin")) {

				String pw = new String(textPw.getPassword());

				if (pw.equals("admin")) {
					super.dispose();
				}
			} else {
				
				JOptionPane.showMessageDialog(this, "�Ƶ��� �Ǵ� ��й�ȣ�� �߸��Ǿ����ϴ�.");
				
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
		JMenu menu = new JMenu("�޴�");
		JMenuItem[] menuItem = new JMenuItem[]{new JMenuItem("ȸ������"), new JMenuItem("������"), new JMenuItem("3")};
		
		menuBar.add(menu);		
		
		for(JMenuItem m: menuItem) {
			
			menu.add(m);
			menu.addSeparator();		//menuItem �и���
			
		}
		
		

		menuItem[0].addActionListener((ActionEvent e) -> {
			
			JOptionPane.showMessageDialog(this, "ȸ������");
			
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
			// System.out.println("����");

			System.exit(0);

			break;

		case "del":
			// System.out.println("ȸ��Ż��");
			txtField.setText("ȸ��Ż��");
			
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

		// Ŭ���� �̿�
		// MyActionLisiner action = new MyActionLisiner();

		// Lambda
		ActionListener action1 = (ActionEvent e) -> {

			String cmd = e.getActionCommand();

			// JOptionPane.showMessageDialog(null, "MessageDialog");
			// JOptionPane.showConfirmDialog(null, "ConfirmDialog");
			// JOptionPane.showInputDialog("�α��ι�ư Ŭ��");

			txtField.setText("�α���");

			// dialog ����
			MyDialog dialog = new MyDialog(this);

			System.out.println(cmd);
		};

		btn1 = new JButton("�α���");
		btn2 = new JButton("�α׾ƿ�");
		btn3 = new JButton("ȸ������");
		btn4 = new JButton("ȸ��Ż��");
		btn5 = new JButton("����");

		// button ActionCommand ����
		btn4.setActionCommand("del");
		btn5.setActionCommand("exit");

		btn1.addActionListener(action1);

		btn2.addActionListener((ActionEvent e) -> {
			System.out.println(e.getActionCommand());
			txtField.setText("�α׾ƿ�");
		});

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getActionCommand());
				txtField.setText("ȸ������");
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
