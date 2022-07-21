public class Test04 {
	public static void main(String [] args) {
		try {
			double a = getCircleArea(-1);
			System.out.println("Area = " + a);
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
		finally {
			System.out.println("end");
		}
	}
	static double getCircleArea(double r) throws Exception {
		if (r < 0) {
			throw new InvalidRadius04(r);
		}
		return r*r*Math.PI;
	}
}