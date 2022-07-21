public class Lab07_2 {
	public static void main(String [] args) {
		double r2l = 0;
		double l2r = 0;
		for(double i = 1; i <= 50000; i++) {
			l2r += 1/i;
		}
		for(double i = 50000; i>0; i--) {
			r2l += 1/i;
		}
	
		System.out.println("Left to right: " + l2r);
		System.out.println("Right to left: " + r2l);
		System.out.println("Difference: " + (r2l - l2r));
	}
}