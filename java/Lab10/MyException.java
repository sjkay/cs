import java.util.Scanner;
import java.util.InputMismatchException;
public class MyException {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for(;;) {
			try {
				int x = input.nextInt();
				int y = input.nextInt();
				System.out.format("%d/%d = %d\n", x, y, x/y);
			}
			catch (InputMismatchException ex) {
				System.out.println("Really an integer? Try again");
				input.nextLine();
			}
			catch (ArithmeticException ex) {
				System.out.println("Division by zero?");
			}
			finally {
				System.out.println("Always called");
			}
		}
	}
}