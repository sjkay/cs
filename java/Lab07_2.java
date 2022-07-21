public class Lab07_2 {
	public static void main (String [] args) {
		double l2r = 0;
		double r2l = 0;
    	for (double i = 1; i <= 50000; i++) {
   			l2r += 1/i;
   		}
   		for (double i = 50000; i > 0; i--) {
   			r2l += 1/i;
   		}
   		
   		System.out.println("computing from left to right = " + l2r);
       	System.out.println("computing from right to left = " + r2l);
       	System.out.println("difference = " + (r2l - l2r));

	}
}