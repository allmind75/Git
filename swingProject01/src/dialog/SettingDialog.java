package dialog;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

import common.Common;

public class SettingDialog extends JDialog {
	
	private final int DIALOG_WIDTH = 200;
	private final int DIALOG_HEIGHT = 300;
	private final String TITLE = "설정";
	
	private JPanel p1, p2;
	private JCheckBox box1, box2, box3, box4;
	private JButton btnSave, btnCancel;
	
	public SettingDialog(JFrame frame) {
	
		super(frame);
		super.setSize(DIALOG_WIDTH, DIALOG_HEIGHT);
		super.setModal(true);
		super.setLocationRelativeTo(frame);
		super.setResizable(false);
		super.setLayout(new BorderLayout());
		super.setIconImage(Common.ICON_IMG);
		super.setTitle(TITLE);
		
		addPanel();
		addCheckBox();
		addButton();
		
		super.setVisible(true);
	}

	public void addPanel() {
		
		p1 = new JPanel(new GridLayout(2, 2, 5, 5));
		p2 = new JPanel(new FlowLayout());
		
		super.add(p1, "Center");
		super.add(p2, "South");
	}
	
	public void addCheckBox() {
		
		box1 = new JCheckBox("설정1", true);
		box2 = new JCheckBox("설정2", true);
		box3 = new JCheckBox("설정3", false);
		box4 = new JCheckBox("설정4", false);
		
		box1.setHorizontalAlignment(JCheckBox.CENTER);
		box2.setHorizontalAlignment(JCheckBox.CENTER);
		box3.setHorizontalAlignment(JCheckBox.CENTER);
		box4.setHorizontalAlignment(JCheckBox.CENTER);
		
		box1.setFont(Common.DEFALUT_FONT);
		box2.setFont(Common.DEFALUT_FONT);
		box3.setFont(Common.DEFALUT_FONT);
		box4.setFont(Common.DEFALUT_FONT);
		
		p1.add(box1);
		p1.add(box2);
		p1.add(box3);
		p1.add(box4);
	}
	
	public void addButton() {
		
		btnSave = new JButton("저장");
		btnCancel = new JButton("취소");
		
		btnSave.setFont(Common.fontStyle(Font.BOLD, 14));
		btnCancel.setFont(Common.fontStyle(Font.BOLD, 14));
		
		btnSave.addActionListener((ActionEvent e) -> {
		
			super.dispose();
		});
		
		btnCancel.addActionListener((ActionEvent e) -> {super.dispose();});
		
		p2.add(btnSave);
		p2.add(btnCancel);
	}
}
