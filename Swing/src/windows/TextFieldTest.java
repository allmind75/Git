package windows;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextFieldTest extends JFrame{

	public TextFieldTest() {
		
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setSize(500, 400);
		super.setTitle("TextField Test");
		
		//addGridLayout(0, 2, 10, 5);
		
		makeTextField();
		
		super.setVisible(true);
	}
	
	public void makeTextField() {
		
		JPanel pL = new JPanel();
		pL.setLayout(new GridLayout(0, 1, 10, 5));
		pL.add(new JLabel(" 이름: "));
		pL.add(new JLabel(" 암호: "));
		
		JPanel pT = new JPanel();	
		pT.setLayout(new GridLayout(0, 1, 10, 5));
		
		JTextField textField1 = addTextField("기본 텍스트");
		
		JPasswordField pwd = addPassWordField();
		
		pT.add(textField1);
		pT.add(pwd);
		
		JPanel pA = new JPanel(new GridLayout(0, 1, 10, 5));
		JTextArea area = addTextArea();
		area.setText("Text Area");
		area.append("append");
		area.append("append");
		area.append("append");
		area.append("append");
		
		pA.add(new JLabel("메모 :"));
		pA.add(area);
		
		super.add(pL, "West");
		super.add(pT, "Center");
		super.add(pA, "South");
		
	}
	
	public void addGridLayout(int rows, int cols, int hGap, int vGap) {
		
		GridLayout gridLayout = new GridLayout(rows, cols, hGap, vGap);
		super.setLayout(gridLayout);		
	}
	
	public JTextField addTextField(String text) {
		
		JTextField textField = new JTextField();
		textField.setText(text);
		textField.setForeground(Color.blue);
		
		return textField;
	}
	
	public JPasswordField addPassWordField() {
		
		JPasswordField pwd = new JPasswordField();
		pwd.setEchoChar('*');
		pwd.setBackground(Color.red);
		return pwd;
	}
	
	public JTextArea addTextArea() {
		
		Font font = new Font("궁서", Font.BOLD, 24);
		JTextArea area = new JTextArea();
		area.setFont(font);
		
		return area;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new TextFieldTest();
	}
}
