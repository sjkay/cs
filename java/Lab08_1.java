import java.util.Scanner;

public class Lab08_1 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int total = input.nextInt();

        int count = 1;
        for (int i = 0; i <total; i++) {
        	for (int j = 1; j <= (18-count)*2; j++) {
        		System.out.print(" ");
        	}
        	
        	for (int j = count; j > 1; j--) {
        		System.out.print(j+" ");
        	}
        	for (int j = 1; j <= count; j++) {
        		System.out.print(j+" ");
        	}
        	System.out.println();
        	count += 1;
        }
	}
}