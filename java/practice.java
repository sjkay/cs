import java.util.Scanner;

public class practice {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int total = input.nextInt();

        int count = 1;
        for (int i = 0; i < total; i++) {
        	for (int j = 1; j <= (9-count); j++) {
                System.out.print(" ");
            }
        	for (int j = count; j > 0; j--) {
        		System.out.print(count+" ");
        	}
        	
        	System.out.println();
        	count += 1;
        }
	}
}