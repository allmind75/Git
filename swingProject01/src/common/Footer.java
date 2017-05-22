package common;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Footer extends JPanel{
	
	private final String COPYRIGHT = "COPYRIGHT JinjuTour ALL RIGHTS RESERVED";
	private JLabel labelFooter;
	
	public Footer() {
		
		super.setBackground(new Color(75, 75, 75));
		
		labelFooter = new JLabel(COPYRIGHT, SwingConstants.CENTER);
		labelFooter.setForeground(Color.WHITE);
		labelFooter.setFont(Common.fontStyle(Font.BOLD, 12));
		
		super.add(labelFooter);

	}
}
