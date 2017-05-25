package common;

import java.awt.Desktop;
import java.awt.Font;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public class Common {

	public static final Font DEFALUT_FONT = new Font("³ª´®°íµñ", Font.PLAIN, 12);
	public static final Font TAB_FONT = new Font("³ª´®°íµñ", Font.BOLD, 15);
	public static final Image ICON_IMG = java.awt.Toolkit.getDefaultToolkit().getImage("res/ic_launcher_192.png");

	
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
	
	public static void openWebpage(String url) {
	    try {
	        Desktop.getDesktop().browse(new URL(url).toURI());
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
}
