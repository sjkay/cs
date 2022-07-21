public class Test04 {
	static void test(Rectangle r) {
		System.out.pringln("Rectangle");
	}
	static void test(Circle r) {
		System.out.println("Circle");
	}
	public static void main(String [] args) {
		Rectangle r = new Rectangle(0,0,1,1);
		Circle c = new Circle(0,0,1);
		test(r);
		test(c);
	}
}