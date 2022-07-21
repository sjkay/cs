import java.util.Scanner;

public class pyramid {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter num (1-9): ");
		int x = input.nextInt();
		for (int i = 1; i<=x; i++) {
			for (int a = x; a>i; a--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++){
				System.out.print(i+ " ");
			}
			System.out.println();
		}
	}
}