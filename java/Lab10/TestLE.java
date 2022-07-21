public class TestLE {
	public static void main(String [] args) {
		LinearEquation le
			= new LinearEquation(9.0, 4.0, 3.0, -5.0, -6.0, -21.0);
		if (le.isSolvable())
			System.out.println("x = " + le.getX() + ", y = " + le.getY());
		else
			System.out.println("The equation has no solution");
		le = new LinearEquation(1.0, 2.0, 2.0, 4.0, 4.0, 5.0);
		if (le.isSolvable())
			System.out.println("x = " + le.getX() + ", y = " + le.getY());
		else
			System.out.println("The equation has no solution");
	}
}