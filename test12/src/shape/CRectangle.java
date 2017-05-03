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

}
