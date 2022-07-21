import java.util.Scanner;

public class Lab06_5 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int a  = input.nextInt();
        int b  = input.nextInt();
        int c  = input.nextInt();
        
        if (a > b) {
            int temp = b;
            b = a;
            a = temp;
        }
        
        if (b > c) {
            int temp = c;
            c = b;
            b = temp;
        }

        if (a > c) {
            int temp = c;
            c = a;
            a = temp;
        }
        
        if (a > b) {
            int temp = b;
            b = a;
            a = temp;
        }
        System.out.println(a + ", " + b + " and " + c);
    }
}