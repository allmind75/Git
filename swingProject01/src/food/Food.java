package food;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

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
		
		//btn click
		btnFood_01.addActionListener((ActionEvent e) -> {
			
			String url = "https://store.naver.com/restaurants/detail?id=37655735&entry=plt&query=%EB%B0%95%EA%B5%B0%EC%9E%90%EC%A7%84%EC%A3%BC%EB%83%89%EB%A9%B4";
			Common.openWebpage(url);
		});
		
		btnFood_02.addActionListener((ActionEvent e) -> {
			
			String url = "https://store.naver.com/restaurants/detail?id=13197560&entry=plt&query=%EC%84%A4%EC%95%BC%EC%A7%84%EC%A3%BC%EC%A0%84%ED%86%B5%EB%B9%84%EB%B9%94%EB%B0%A5";
			Common.openWebpage(url);
		});
		
		btnFood_03.addActionListener((ActionEvent e) -> {
			
			String url = "http://youjung.net/";
			Common.openWebpage(url);
		});
		
		panelFoodContent.add(btnFood_01);
		panelFoodContent.add(btnFood_02);
		panelFoodContent.add(btnFood_03);
		
		super.add(panelFoodContent, "Center");
		super.add(new Footer(), "South");
	}
}
