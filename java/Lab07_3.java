public class Lab07_3 {
  double sum = 1;
  double temp = 1;

  double e(int n) {
    sum = 1;
    temp = 1;
    for (double i = 1; i <= n; i++) {
      temp *= 1/i;
      sum += temp;
    }
    return sum; 
  }
    public static void main (String [] args) {
	  Lab07_3 obj = new Lab07_3();
    double smalln = obj.e(200);
    double bign = obj.e(100000);
		System.out.println("approximation when n = 200 :    " + smalln);
   	System.out.println("approximation when n = 100000 : " + bign);
    System.out.println("difference = " + (smalln - bign));
	}
}