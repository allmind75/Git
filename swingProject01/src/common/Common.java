package common;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Common {

	public static final Font DEFALUT_FONT = new Font("³ª´®°íµñ", Font.PLAIN, 12);
	public static final Font TAB_FONT = new Font("³ª´®°íµñ", Font.BOLD, 15);
	public static final Image ICON_IMG = java.awt.Toolkit.getDefaultToolkit().getImage("res/ic_launcher_16.png");

	
	public static final ImageIcon resizeImage(ImageIcon icon, int width, int height) {
		
		Image img = icon.getImage();
		img = img.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		ImageIcon resizeImageIcon = new ImageIcon(img);
				
		return resizeImageIcon;
	}
	
	
	public static final Font fontStyle(int fontWeight, int fontSize) {
		
		Font font = new Font("³ª´®°íµñ", fontWeight, fontSize);
		return font;
	}
	
}
