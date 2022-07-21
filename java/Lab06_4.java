import java.util.Scanner;

public class Lab06_4 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a  = input.nextDouble();
        double b  = input.nextDouble();
        double c  = input.nextDouble();
        
        double discriminant = Math.pow(b, 2) - 4*a*c;

        if (discriminant > 0) {
            double r1 = (-b + Math.pow(discriminant, 0.5)) / (2*a);
            double r2 = (-b - Math.pow(discriminant, 0.5)) / (2*a);
            System.out.print("The equation has two roots ");
            System.out.printf("%.6f", r1); 
            System.out.print(" and ");
            System.out.printf("%.5f %n", r2);
        }
        else if (discriminant == 0) {
            double r = -b / (2*a);
            System.out.println("The equation has one root " + r);
        }
        else System.out.println("The equation has no real roots");
    }
}