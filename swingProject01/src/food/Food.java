package food;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import common.Common;
import common.Footer;

public class Food extends JPanel {
	
	private JPanel panelFoodContent;
	private JButton btnFood_01, btnFood_02, btnFood_03;
	
	public Food() {
		
		super.setLayout(new BorderLayout());
		addFoodContent();
	}
	
	public void addFoodContent() {
		
		panelFoodContent = new JPanel(new GridLayout(3, 1, 10, 10));
		
		btnFood_01 = new JButton(new ImageIcon("res/food_01.jpg"));
		btnFood_02 = new JButton(new ImageIcon("res/food_02.jpg"));
		btnFood_03 = new JButton(new ImageIcon("res/food_03.jpg"));
		
		panelFoodContent.add(btnFood_01);
		panelFoodContent.add(btnFood_02);
		panelFoodContent.add(btnFood_03);
		
		super.add(panelFoodContent, "Center");
		super.add(new Footer(), "South");
	}
}
