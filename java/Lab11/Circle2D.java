public class Circle2D {
	private Point2D center;
	private double radius;
	Circle2D(Point2D center, double radius) {
		this.center = new Point2D(center);
		this.radius = radius;
	}
	Point2D getCenter() { return center; }
	double getRadius() { return radius; }
	void move(double dx, double dy) {
		this.center.move(dx, dy);
	}
	Circle2D() {
		this.center = new Point2D();
		this.radius = 1;
	}
	double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}
	boolean contains(Point2D other) {
		double d = this.center.distance(other);
		return d < this.radius;
	}
	boolean contains(double x, double y) {
		double d = this.center.distance(x, y);
		return d < this.radius;
	}
	boolean contains(Circle2D other) {
		double d = this.center.distance(other.getCenter());
		double r = this.radius - other.getRadius();
		return d < r;
	}
	boolean overlaps(Circle2D other) {
		double d = this.center.distance(other.getCenter());
		double r = this.radius + other.getRadius();
		return d < r;
	}
}