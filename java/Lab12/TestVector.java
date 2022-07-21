public class TestVector {
	public static void main(String[] args) {
		Vector v1 = new Vector(3);
		Vector v2 = new Vector(3,-2,-1);
		System.out.println(v1);
		try {
			double d = v1.product(v2);
			System.out.println("inner product = " + d);
		}
		catch (Exception e) {
			System.out.println("Something wrong");
		}
	}
}