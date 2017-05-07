package shape;

public class CCircle extends CShape{

	private int xPoint;
	private int yPoint;
	private double radius;
	
	public CCircle(String name, int xPoint, int yPoint, double radius) {
		super(name);
		this.xPoint = xPoint;
		this.yPoint = yPoint;
		this.radius = radius;
	}
	
	@Override
	public double areaCalc() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	public int getxPoint() {
		return xPoint;
	}

	public void setxPoint(int xPoint) {
		this.xPoint = xPoint;
	}

	public int getyPoint() {
		return yPoint;
	}

	public void setyPoint(int yPoint) {
		this.yPoint = yPoint;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	
}
