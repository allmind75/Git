package windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class ComponentTest extends JFrame {

	public ComponentTest() {

		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(400, 400);
		super.setTitle("Component Test");

		// layoutManager
		addBorderLayout(10, 10);

		// label
		//addLabel("레이블", "Center");
		// addLabel("레이블", "North");
		// addLabel("레이블", "South");
		//
		// addLabel("레이블1");

		JPanel p1 = addPanel("North");
		JPanel p2 = addPanel("South");
		JPanel p3 = addPanel("Center");

		
		//JButton
		for (int i = 1; i <= 10; i++) {
			
			JButton btn1 = addButton("버튼" + i);
		
			p1.add(btn1);

		}
		
		//JCheckBox
		JCheckBox box1 = addCheckBox("수영", true);
		JCheckBox box2 = addCheckBox("골프", false);
		JCheckBox box3 = addCheckBox("축구", false);
		JCheckBox box4 = addCheckBox("야구", true);
		
		
		p2.add(box1);
		p2.add(box2);
		p2.add(box3);
		p2.add(box4);

		
		//JRadioButton
		ButtonGroup group = new ButtonGroup();	//radioButton 그룹
		
		JRadioButton rb1 = addRadioButton("라디오버튼1", false);
		JRadioButton rb2 = addRadioButton("라디오버튼2", false);
		JRadioButton rb3 = addRadioButton("라디오버튼3", true);
		
		group.add(rb1);
		group.add(rb2);
		group.add(rb3);
		
		p3.add(rb1);
		p3.add(rb2);
		p3.add(rb3);
			
		
		super.setVisible(true);
	}

	public JButton addButton(String str) {

		JButton button = new JButton(str);
		return button;
	}

	public void addLabel(String str) {

		JLabel lb = new JLabel(str);
		lb.setForeground(Color.blue); // 글자색
		lb.setHorizontalAlignment(SwingConstants.CENTER); // 정렬
		super.add(lb);
	}

	public void addLabel(String str, String position) {

		//JLabel("레이블 내용")
		JLabel lb = new JLabel(str);
		lb.setHorizontalAlignment(SwingConstants.CENTER);
		super.add(lb, position);
	}

	public void addBorderLayout(int hGap, int vGap) {

		BorderLayout borderLayout = new BorderLayout(hGap, vGap);
		super.setLayout(borderLayout);

	}

	public JPanel addPanel(String position) {

		JPanel panel = new JPanel();

		panel.setBackground(new Color(255, 223, 10));

		FlowLayout flowLayout = new FlowLayout();
		panel.setLayout(flowLayout);				//panel의 layoutManager 설정

		super.add(panel, position);

		return panel;
	}

	public JCheckBox addCheckBox(String str, boolean check) {
		
		
		//JCheckBox("이름", 선택설정)
		JCheckBox jCheckBox = new JCheckBox(str, check);
		return jCheckBox;
	}
	
	public JRadioButton addRadioButton(String str, boolean check) {
		
		JRadioButton jRadioButton = new JRadioButton(str, check);
		return jRadioButton;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ComponentTest();
	}

}
