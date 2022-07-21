public class Point2D {
	private double x, y;
	Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	Point2D(Point2D p){
		this.x = p.getX();
		this.y = p.getY();
	}
	double getX() { return x; }
	double getY() { return y; }
	void move(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}
	double distance(double x, double y) {
		double a = this.x - x;
		double b = this.y - y;
		return Math.sqrt(a*a + b*b);
	}
	double distance(Point2D other) {
		return distance(other.getX(), other.getY());
	}
	Point2D() {
		this.x = 0;
		this.y = 0;
	}

}