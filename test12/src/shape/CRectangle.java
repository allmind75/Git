package shape;

public class CRectangle extends CShape{

	private int xPoint;
	private int yPoint;
	private double width;
	private double height;
	
	public CRectangle(String name, int xPoint, int yPoint, double width, double height) {
		super(name);
		this.xPoint = xPoint;
		this.yPoint = yPoint;
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double areaCalc() {
		return this.width * this.height;
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

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
