package shape;

import java.awt.Graphics;

public class Rect extends Shape{

	private int rx;
	private int ry;
	private int width;
	private int height;
	
	public Rect(String name, int rx, int ry, int width, int height) {
		super(name);
		this.rx = rx;
		this.ry = ry;
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw(Graphics g) {
		
		g.drawRect(rx, ry, width, height);
	}
}
