import java.util.Scanner;

public class Lab08_1x {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int total = input.nextInt();
        int[] list = new int[29];
        int count = 1;
        for (int i = total; i > 0; i--) {
        	for (int j = count; j > 1; j--) {
        		list[15-j] = j;
                list[13+j] = j;
        	}
        	System.out.println(list);
        	count += 1;
        }
	}
}