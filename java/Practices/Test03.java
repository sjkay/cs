public class Test03 {
	int fib(int n) {
		if (n<=2)
			return 1;
		else
			return fib(n-1) + fib(n-2);			
	}
	public static void main (String [] args) {
		Test03 obj = new Test03();
		System.out.println(obj.fib(10));
	}
}