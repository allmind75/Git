package windows;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame();
		Toolkit toolkit = frame.getToolkit();
		Image image = toolkit.createImage("src/icon.jpg");
		
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setTitle("Swing Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setIconImage(image);
	}

}
