package windows;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main extends JFrame{
	
	public Main(String title, int width, int height, boolean resize) {
		
		//Image
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image image = toolkit.getImage("res/icon.jpg");
		
		//button

//		Container contentPane = this.getContentPane();
//		JPanel pane = new JPanel();
//		JButton button1 = new JButton("button");
//		button1.setMnemonic('S');
//		
//		pane.add(button1);
//		contentPane.add(pane);
		
		
		//super.add(button1);
		
		
		
		
		
		
		super.setSize(width, height);
		super.setTitle(title);
		super.setResizable(resize);
		super.setIconImage(image);	//icon image º¯°æ		
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
		
	}

	@Override
	public void paint(Graphics g) {
		
		Font font = new Font("³ª´®°íµñ", Font.BOLD, 30);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img = toolkit.getImage("res/sana.jpg");
		
		
		
		//¼ø¼­°¡ Áß¿ä, down - up
		g.drawImage(img, 100, 100, null);
		
		g.setFont(font);
		
		g.setColor(Color.red);
		g.drawString("½ºÀ®", 80, 80);
		
		g.setColor(Color.black);
		g.drawString("½ºÀ®", 82, 82);
		
		//System.out.println("[paint]");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		new Main("Swing Test", 1000, 1000, false);
		

	}

}
