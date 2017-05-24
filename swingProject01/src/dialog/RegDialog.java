package dialog;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import common.Common;

public class RegDialog extends JDialog {

	private final int DIALOG_WIDTH = 300;
	private final int DIALOG_HEIGHT = 300;
	private final String TITLE = "회원가입";
	
	private JPanel p1, p2, p3, p4;
	private JLabel labelID, labelPW, labelName, labelEmail, labelPhoneNum;
	private JButton btnReg, btnCancel;
	private JTextField textID, textName, textEmail, textPhoneNum;
	private JPasswordField textPW;
	
	
	public RegDialog(JFrame frame) {
		
		super(frame);
		super.setSize(DIALOG_WIDTH, DIALOG_HEIGHT);
		super.setModal(true);
		super.setLocationRelativeTo(frame);
		super.setResizable(false);
		super.setLayout(new BorderLayout());
		super.setIconImage(Common.ICON_IMG);
		super.setTitle(TITLE);
		
		
		addPanel();
		addLabel();
		addTextField();
		addButton();
		
		super.setVisible(true);
	}
	
	public void addPanel() {
		
		p1 = new JPanel(new BorderLayout());
		p2 = new JPanel(new GridLayout(5, 1, 10, 10));
		p3 = new JPanel(new GridLayout(5, 1, 10, 10));
		p4 = new JPanel(new FlowLayout());
		
		
		p1.setBackground(Color.LIGHT_GRAY);
		p4.setBackground(Color.DARK_GRAY);
		

		p1.add(p2, "West");
		p1.add(p3, "Center");
		
		super.add(p1, "Center");
		super.add(p4, "South");
		
	}
	public void addLabel() {
		
		labelID = new JLabel("아이디");
		labelPW = new JLabel("비밀번호");
		labelName = new JLabel("이름");
		labelEmail = new JLabel("이메일");
		labelPhoneNum = new JLabel("휴대폰번호");
		
		labelID.setHorizontalAlignment(JLabel.CENTER);
		labelPW.setHorizontalAlignment(JLabel.CENTER);
		labelName.setHorizontalAlignment(JLabel.CENTER);
		labelEmail.setHorizontalAlignment(JLabel.CENTER);
		labelPhoneNum.setHorizontalAlignment(JLabel.CENTER);
		
		p2.add(labelID);
		p2.add(labelPW);
		p2.add(labelName);
		p2.add(labelEmail);
		p2.add(labelPhoneNum);
		
	}
	
	public void addTextField() {
		
		textID = new JTextField(20);
		textPW = new JPasswordField(20);
		textName = new JTextField(20);
		textEmail = new JTextField(20);
		textPhoneNum = new JTextField(20);
		
		p3.add(textID);
		p3.add(textPW);
		p3.add(textName);
		p3.add(textEmail);
		p3.add(textPhoneNum);
		
	}
	
	public void addButton() {
		
		btnReg = new JButton("회원가입");
		btnCancel = new JButton("취소");
		
		btnReg.addActionListener((ActionEvent e) -> {
			
			super.dispose();
		});
		
		btnCancel.addActionListener((ActionEvent e) -> {
			
			super.dispose();
			
		});
		
		p4.add(btnReg);
		p4.add(btnCancel);
	}
	
	
}
