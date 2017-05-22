package food;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import common.Common;
import common.Footer;

public class Food extends Common {
	
	private JPanel panelFood, panelFoodContent;
	private JButton btnFood_01, btnFood_02, btnFood_03;
	
	public Food() {
		
		panelFood = new JPanel(new BorderLayout());
		
	}
	
	public void addFoodContent() {
		
		panelFoodContent = new JPanel(new GridLayout(3, 1, 10, 10));
		
		btnFood_01 = new JButton(new ImageIcon("res/food_01.jpg"));
		btnFood_02 = new JButton(new ImageIcon("res/food_02.jpg"));
		btnFood_03 = new JButton(new ImageIcon("res/food_03.jpg"));
		
		panelFoodContent.add(btnFood_01);
		panelFoodContent.add(btnFood_02);
		panelFoodContent.add(btnFood_03);
		
		panelFood.add(panelFoodContent, "Center");
		panelFood.add(new Footer(), "South");
	}

	public JPanel getFoodPanel() {
		return panelFood;
	}

	public void setFoodPanel(JPanel panelFood) {
		this.panelFood = panelFood;
	}
	

}
