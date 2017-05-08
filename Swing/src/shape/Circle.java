package shape;

import java.awt.Graphics;

public class Circle extends Shape{

	private int cx;
	private int cy;
	private int r;
	
	public Circle(String name, int cx, int cy, int r) {
		super(name);
		this.cx = cx;
		this.cy = cy;
		this.r = r;
	}
	
	@Override
	public void draw(Graphics g) {
		
		g.drawOval(cx-r, cy-r, r*2, r*2);
	}
	
	@Override
	public void fill(Graphics g) {
		
	}
}
