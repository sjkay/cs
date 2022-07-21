public class Test {
	public static void main(String [] args) {
		Point2D p = new Point2D(10,10);
		Circle2D c1 = new Circle2D(p,1), c2 = new Circle2D(p,2);
		System.out.println(c2.contains(c1));
		c2.move(10,10);
		System.out.println(c2.contains(c1));
	}
}