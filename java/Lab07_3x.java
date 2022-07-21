public class Lab07_3x {
  public static void main (String [] args) {
	  double smallE = 1;
		double bigE = 1;
    double temp = 1;

    for (double i = 1; i <= 200; i++) {
      temp *= 1/i;
   		smallE += temp;
   	}

    temp = 1;
		for (double i = 1; i <= 100000; i++) {
   		temp *= 1/i;
   		bigE += temp;
   	}
   		
		System.out.println("approximation when n = 200 : " + smallE);
   	System.out.println("approximation when n = 100000 : " + bigE);
    System.out.println("difference = " + (bigE - smallE));

	}
}