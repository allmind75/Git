package product;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import common.Common;
import common.Footer;

public class Product extends Common {

	private JPanel productPanel, productContentPanel;
	private JButton btn_product_01, btn_product_02, btn_product_03;
	
	public Product() {
		
		productPanel = new JPanel(new BorderLayout());
		
	}
	
	public void addProductContent() {
		
		productContentPanel = new JPanel(new GridLayout(3, 1, 10, 10));
		
		btn_product_01 = new JButton(new ImageIcon("res/product_01.jpg"));
		btn_product_02 = new JButton(new ImageIcon("res/product_02.jpg"));
		btn_product_03 = new JButton(new ImageIcon("res/product_03.jpg"));
		
		productContentPanel.add(btn_product_01);
		productContentPanel.add(btn_product_02);
		productContentPanel.add(btn_product_03);
		
		productPanel.add(productContentPanel, "Center");
		productPanel.add(new Footer(), "South");
	}

	public JPanel getProductPanel() {
		return productPanel;
	}

	public void setTripPanel(JPanel productPanel) {
		this.productPanel = productPanel;
	}
	
}
