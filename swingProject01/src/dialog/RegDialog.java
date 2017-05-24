package dialog;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import common.Common;

public class RegDialog extends JDialog{

	private final int DIALOG_WIDTH = 300;
	private final int DIALOG_HEIGHT = 500;
	private final String TITLE = "회원가입";
	
	private JPanel p1, p2;
	private JLabel labelID, labelPW;
	private JButton btnReg, btnCancel;
	private JTextField textID;
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
		
		addButton();
		
		super.setVisible(true);
	}
	
	public void addPanel() {
		
		p1 = new JPanel();
		p2 = new JPanel(new FlowLayout());
		
		
		p1.setBackground(Color.LIGHT_GRAY);
		p2.setBackground(Color.DARK_GRAY);
		
		super.add(p1, "Center");
		super.add(p2, "South");
		
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
		
		p2.add(btnReg);
		p2.add(btnCancel);
	}
	
	
}
