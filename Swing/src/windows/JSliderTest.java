package windows;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class JSliderTest extends JFrame {

	public JSliderTest() {
		
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setTitle("JSlider Test");
		super.setSize(500, 200);
		
		makeSlider();
		
		super.setVisible(true);
	}
	
	public void makeSlider() {
		
		JSlider sdr = new JSlider(JSlider.VERTICAL, 0, 255, 1); //VERTICAL, HORIZONTAL
		JSlider hsdr = new JSlider(0, 50, 10);
		
		hsdr.setPaintTicks(true);
		//hsdr.setPaintTrack(true);
		hsdr.setMajorTickSpacing(10);		//큰간격
		hsdr.setMinorTickSpacing(1);		//작은간격
		hsdr.setPaintLabels(true);
		
		JPanel p = new JPanel();
		
		p.setLayout(new GridLayout(0, 1));
		p.add(sdr);
		p.add(hsdr);
		
		super.add(p);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JSliderTest();
	}

}
