package trip;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

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
		
		
		//btn click
		btnTrip_01.addActionListener((ActionEvent e) -> {
			
			String url = "http://tour.jinju.go.kr/01tour/SIGHT001.jsp?amode=_viw&cult_sno=605&img_sno=36";
			Common.openWebpage(url);
		});
		
		btnTrip_02.addActionListener((ActionEvent e) -> {
			
			String url = "http://tour.jinju.go.kr/01tour/SIGHT002.jsp?amode=_viw&cult_sno=402&cpage=1";
			Common.openWebpage(url);
		}); 
		
		btnTrip_03.addActionListener((ActionEvent e) -> {
		
			String url = "http://tour.jinju.go.kr/01tour/SIGHT002.jsp?amode=_viw&cult_sno=403&cpage=1";
			Common.openWebpage(url);
		});
		
		panelTripContent.add(btnTrip_01);
		panelTripContent.add(btnTrip_02);
		panelTripContent.add(btnTrip_03);
		
		super.add(panelTripContent, "Center");
		super.add(new Footer(), "South");
	}	
}
