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

public class LoginDialog extends JDialog {
	
	private final int DIALOG_WIDTH = 300;
	private final int DIALOG_HEIGHT = 150;
	
	private JPanel p1, p2;
	private JLabel labelID, labelPW;
	private JButton btnLogin, btnCancel;
	private JTextField textID;
	private JPasswordField textPW;
	
	public LoginDialog(JFrame frame) {
		
		super(frame);
		super.setSize(DIALOG_WIDTH, DIALOG_HEIGHT);
		super.setModal(true);				//dialog�� ��Ŀ��
		super.setLocationRelativeTo(frame);
		super.setResizable(false);
		super.setLayout(new BorderLayout());
		
		addPanel();
		addTextField();
		addButton();
		
		super.setVisible(true);
		
	}
	
	public void addPanel() {
		
		p1 = new JPanel();
		p2 = new JPanel();
		
		p1.setLayout(new GridLayout(2, 2, 10, 10));
		p2.setLayout(new FlowLayout());
		
		super.add(p1, "Center");
		super.add(p2, "South");
	}
	
	public void addTextField() {
	
		textID = new JTextField(20);
		textPW = new JPasswordField(20);
		
		labelID = new JLabel("ID", SwingConstants.CENTER);
		labelPW = new JLabel("PW", SwingConstants.CENTER);
		
		textPW.setEchoChar('*');
		
		p1.add(labelID);
		p1.add(textID);
		
		p1.add(labelPW);
		p1.add(textPW);
	}
	
	public void addButton() {
		
		btnLogin = new JButton("�α���");
		btnCancel = new JButton("���");
		
		btnLogin.addActionListener((ActionEvent e) -> {
			
			if (textID.getText().equals("admin")) {

				String pw = new String(textPW.getPassword());

				if (pw.equals("admin")) {
					super.dispose();
				}
			} else {
				
				JOptionPane.showMessageDialog(this, "�Ƶ��� �Ǵ� ��й�ȣ�� �߸��Ǿ����ϴ�.");
				
			}
		});
		
		btnCancel.addActionListener((ActionEvent e) -> { super.dispose(); });
		
		p2.add(btnLogin);
		p2.add(btnCancel);
	}

}
