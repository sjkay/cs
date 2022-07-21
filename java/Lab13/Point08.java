public class Point08 implements Geom08 {
	private double x,y;
	@Override
	public void move(double dx, double dy) {
		x += dx;
		y += dy;
	}
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}