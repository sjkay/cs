public class TestVector2 {
	public static void main(String[] args) throws Exception {
		Vector v1 = new Vector(2);
		Vector v2 = new Vector(3,-2,-1);
		System.out.println(v1);
		double d = v1.product(v2);
		System.out.println("inner product = " + d);
	}
}