public class Lab07_3m {
    public static void main (String [] args) {
		double smallE = 1;
		double bigE = 1;

    	for (double i = 200; i > 0; i--) {
   			smallE *= 1/i;
   			smallE += 1;
   		}

   		for (double i = 100000; i > 0; i--) {
   			bigE *= 1/i;
   			bigE += 1;
   		}
   		
   		System.out.println("approximation when n = 200 : " + smallE);
       	System.out.println("approximation when n = 100000 : " + bigE);
       	System.out.println("difference = " + (bigE - smallE));

	}
}