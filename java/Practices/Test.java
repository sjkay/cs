public class Test {
	int x = 3;
	void x(int x) {
		System.out.println("x = " + x);
	}
	void y() {
		System.out.println(x);
	}
	public static void main(String [] args) {
		{
			Test x = new Test();
			x.x(10);
			x.y();
		}
		{
			int x = 4;
			System.out.println(x);
		}
	}
}