public class TestFoo {
	public static void main(String[] args) {
		Vector v1 = new Vector(3);
		Vector v2 = new Vector(3,-2,-1);
		System.out.println(v1);
		double d = v1.product(v2);
		System.out.println("inner product = " + d);
	}
}