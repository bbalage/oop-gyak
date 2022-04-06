package set3;

public class Point2 extends Point {

	protected final double x;
	protected final double y;
	
	public Point2(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	@Override
	public Point add(Point point) {
		return new Point2();
	}

	@Override
	public Point multiply(Object scalar) {
		// TODO Auto-generated method stub
		return null;
	}

}
