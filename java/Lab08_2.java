import java.util.Scanner;

public class Lab08_2 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list: ");
        int total = input.nextInt();
        int[] list = new int[total];
        for (int i = 0; i < total; i++) {
            list[i] = input.nextInt();
        }

        if (isSorted(list)) {
            System.out.println("The list is already sorted");
        }
        else System.out.println("The list is not sorted");
        
	}

    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length-1; i++) {
            if (list[i] > list[i+1]) return false;
        }
        return true;
    }

}