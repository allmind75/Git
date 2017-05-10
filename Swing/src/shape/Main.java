package shape;

import java.awt.Graphics;

import javax.swing.JFrame;

public class Main extends JFrame{
	
	Shape[] shape = new Shape[]{ new Circle("원", 100, 100, 15)
			,new Rect("사각형", 300, 300, 50, 50)
			,new Triangle("삼각형", 100, 50, 10, 200, 300, 200)};
		
	public Main() {
		
		setSize(800, 800);
		setVisible(true);
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
