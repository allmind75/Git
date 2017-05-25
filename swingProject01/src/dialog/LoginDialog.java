package dialog;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import common.Common;

public class LoginDialog extends JDialog {
	
	private final int DIALOG_WIDTH = 200;
	private final int DIALOG_HEIGHT = 150;
	private final String TITLE = "로그인";
	
	private JPanel p1, p2, p3, p4;
	private JLabel labelID, labelPW;
	private JButton btnLogin, btnCancel;
	private JTextField textID;
	private JPasswordField textPW;
	
	public LoginDialog(JFrame frame) {
		
		super(frame);
		super.setSize(DIALOG_WIDTH, DIALOG_HEIGHT);
		super.setModal(true);				//dialog만 포커스
		super.setLocationRelativeTo(frame);
		super.setResizable(false);
		super.setLayout(new BorderLayout());
		super.setIconImage(Common.ICON_IMG);
		super.setTitle(TITLE);
		
		addPanel();
		addTextField();
		addButton();
		
		super.setVisible(true);
		
	}
	
	public void addPanel() {
		
		p1 = new JPanel(new BorderLayout());
		p2 = new JPanel(new GridLayout(2, 1, 15, 15));
		p3 = new JPanel(new GridLayout(2, 1, 15, 15));
		p4 = new JPanel(new FlowLayout());
		
		p1.add(p2, "West");
		p1.add(p3, "Center");
		
		super.add(p1, "Center");
		super.add(p4, "South");
	}
	
	public void addTextField() {
	
		textID = new JTextField(20);
		textPW = new JPasswordField(20);
		
		labelID = new JLabel("아이디", SwingConstants.CENTER);
		labelPW = new JLabel("비밀번호", SwingConstants.CENTER);
		
		textPW.setEchoChar('*');
		
		p2.add(labelID);
		p2.add(labelPW);
		
		p3.add(textID);
		p3.add(textPW);
	}
	
	public void addButton() {
		
		btnLogin = new JButton("로그인");
		btnCancel = new JButton("취소");
		
		btnLogin.addActionListener((ActionEvent e) -> {
			
			if (textID.getText().equals("admin")) {

				String pw = new String(textPW.getPassword());

				if (pw.equals("admin")) {
					super.dispose();
				}
			} else {
				
				JOptionPane.showMessageDialog(this, "아디이 또는 비밀번호가 잘못되었습니다.");
				
			}
		});
		
		btnCancel.addActionListener((ActionEvent e) -> { super.dispose(); });
		
		p4.add(btnLogin);
		p4.add(btnCancel);
	}

}
