package shape;

import java.awt.Graphics;

import javax.swing.JFrame;

public class Main extends JFrame{
	
	Shape[] shape = new Shape[]{ new Circle("원", 100, 100, 15)
			,new Rect("사각형", 300, 300, 50, 50)};
		
	public Main() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
		setLocation(100, 100);
		setTitle("도형그리기");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Main main = new Main();
		
	}
	
	@Override
	public void paint(Graphics g) {
		
		for(Shape s: shape) {
			s.draw(g);
		}
	}
}
