import java.util.Scanner;

public class Lab08_3x {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int total = input.nextInt();

        System.out.print("Enter the matrix row by row: \n");
        int[][] matrix = new int[total][total];
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        
        int[] S = findLargestBlock(matrix);

        System.out.println("The maximum square submatrix is at (" + S[0] + ", " + S[1] + ") with size " + S[2]);
    }

    public static int[] findLargestBlock(int[][] m) {
        int xBlock = 0;
        int yBlock = 0;
        int maxSize = 0;
        int[][] newm = m;
        for (int i = 1; i < m.length; i++) {
            for (int j = 1; j < m.length; j++) {
                int squareSize = 0;

                if (newm[i][j] == 1) {
                    squareSize = 1 + Math.min(Math.min(newm[i-1][j-1], newm[i-1][j]), newm[i][j-1]);
                    newm[i][j] = squareSize;
                }
                

                if (squareSize > maxSize) {
                    xBlock = i - squareSize + 1;
                    yBlock = j - squareSize + 1;
                    maxSize = squareSize;
                }
            }
        }
        int[] S = {xBlock, yBlock, maxSize};
        return S;
    }
}