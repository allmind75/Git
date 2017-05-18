package windows;

import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class ImageButtonTest extends JFrame {

	private JButton btn1, btn2, btn3, btn4;
	private JLabel label1, label2;
	
	
	public ImageButtonTest() {
		
		super.setSize(360, 640);
		super.setTitle("ImageButton Test");
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		super.setLayout(new GridLayout(0, 1));
		
		addTabbedPane();

		//makeButton();
		//makeLabel();
		
		
		
		super.setVisible(true);
	}
	
	public void addTabbedPane() {
		
		//button
		ImageIcon ic_img1 = new ImageIcon("res/ic_map.png");
		ImageIcon ic_img2 = new ImageIcon("res/ic_foot.png");
		ImageIcon ic_img3 = new ImageIcon("res/icon.jpg");
		ImageIcon ic_img4 = new ImageIcon("res/sana.jpg");
		
		Image img1 = ic_img3.getImage(); //ImageIcon을 Image로 변환
		Image img2 = img1.getScaledInstance(400, 600, java.awt.Image.SCALE_SMOOTH);
		ImageIcon minion = new ImageIcon(img2);
		
		Image img3 = ic_img4.getImage(); //ImageIcon을 Image로 변환
		Image img4 = img3.getScaledInstance(400, 600, java.awt.Image.SCALE_SMOOTH);
		ImageIcon sana = new ImageIcon(img4);
		
		btn1 = addImgButton(ic_img1);
		btn2 = addImgButton(ic_img2);
		btn3 = addImgButton(minion);
		btn4 = addImgButton(sana);
		
		
		JPanel panel = new JPanel(new GridLayout(0,1,10,10));
		
		panel.add(btn3);
		panel.add(btn4);
		
		JTextField text = new JTextField();
		
		panel.add(text);
		
		//Tab, 여러개를 추가시, Panel을 활용해서 구성
		JTabbedPane tab = new JTabbedPane();
		
		tab.add("TAB 1", btn1);
		tab.add("TAB 2", btn2);
		tab.add("TAB 3", panel);
		
		

		
		
		
		super.add(tab);
		
	}
	public void makeButton() {
		
		ImageIcon ic_img1 = new ImageIcon("res/ic_map.png");
		ImageIcon ic_img2 = new ImageIcon("res/ic_foot.png");
		ImageIcon ic_img3 = new ImageIcon("res/icon.jpg");
		ImageIcon ic_img4 = new ImageIcon("res/sana.jpg");
		
		Image img1 = ic_img4.getImage(); //ImageIcon을 Image로 변환
		Image img2 = img1.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
		ImageIcon sana = new ImageIcon(img2);
		
		btn1 = addImgButton(ic_img1);
		btn2 = addImgButton(ic_img2);
		btn3 = addImgButton(ic_img3);
		btn4 = addImgButton(sana);
		

		super.add(btn1);
		super.add(btn2);
		super.add(btn3);
		super.add(btn4);
	}
	
	public void makeLabel() {
		
		ImageIcon ic_img1 = new ImageIcon("res/ic_map.png");
		ImageIcon ic_img2 = new ImageIcon("res/ic_foot.png");
		
		
		label1 = addImageLabel(ic_img1);
		label2 = addImageLabel(ic_img2);
		
		
		super.add(label1);
		super.add(label2);
	}
	
	public JButton addImgButton(String name, ImageIcon img) {
		
		JButton btn = new JButton(name, img);	
		return btn;
	}
	
	public JButton addImgButton(ImageIcon img) {
		
		JButton btn = new JButton(img);	
		return btn;
	}
	
	public JLabel addImageLabel(ImageIcon img) {
	
		JLabel label = new JLabel(img);
		return label;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ImageButtonTest();
	}

}
