package shape;

import java.awt.Graphics;

public class Shape {

	private String name;
	
	public Shape(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void draw(Graphics g){}
	public void fill(Graphics g){}
}
