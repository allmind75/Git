package shape;

import java.awt.Graphics;

public class Triangle extends Shape{
	
	private int x0, y0;
	private int x1, y1;
	private int x2, y2;
	
	public Triangle(String name, int x0, int y0, int x1, int y1, int x2, int y2) {
		super(name);
		
		this.x0 = x0;
		this.y0 = y0;
		
		this.x1 = x1;
		this.y1 = y1;
		
		this.x2 = x2;
		this.y2 = y2;
	}
	
	@Override
	public void draw(Graphics g) {
		
		int[] x = new int[]{x0, x1, x2};
		int[] y = new int[]{y0, y1, y2};
		
		g.drawPolygon(x, y, 3);
	}

}
