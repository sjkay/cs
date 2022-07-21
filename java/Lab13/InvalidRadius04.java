public class InvalidRadius04 extends Exception {
	private double r;
	InvalidRadius04(double r) {
		super("Radius = " + r);
		this.r = r;
	}
	public double getRadius() { return r; }
}