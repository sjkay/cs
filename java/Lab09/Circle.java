public class Circle extends Point {
	double r;
	Circle(double initx, double inity, double initr) {
		super(initx,inity);
		r = initr;
	}
	boolean isHit(Point p) {
		double dx = p.x - x;
		double dy = p.y - y;
		double d = Math.sqrt(dx*dx + dy*dy);
		return d < r;
	}
	boolean isHit(Circle c) {
		return distance(c) < (r + c.r);
	}
	boolean isHit(Rectangle t) {
		boolean xHit = x + r > t.x && t.x + t.w > x - r;
		boolean yHit = y + r > t.y && t.y + t.h > y - r;
		return xHit && yHit;
	}
}