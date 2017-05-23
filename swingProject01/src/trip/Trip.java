package trip;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import common.Common;
import common.Footer;

public class Trip extends JPanel {

	private JPanel panelTripContent;
	private JButton btnTrip_01, btnTrip_02, btnTrip_03;
	
	public Trip() {
		
		super.setLayout(new BorderLayout());
		addTripContent();
	}
	
	public void addTripContent() {
		
		panelTripContent = new JPanel(new GridLayout(3, 1, 10, 10));
		
		btnTrip_01 = new JButton(new ImageIcon("res/trip_01.jpg"));
		btnTrip_02 = new JButton(new ImageIcon("res/trip_02.jpg"));
		btnTrip_03 = new JButton(new ImageIcon("res/trip_03.jpg"));
		
		panelTripContent.add(btnTrip_01);
		panelTripContent.add(btnTrip_02);
		panelTripContent.add(btnTrip_03);
		
		super.add(panelTripContent, "Center");
		super.add(new Footer(), "South");
	}	
}
