import java.util.Scanner;

public class Lab08_3 {
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
        int xStart = 0;
        int yStart = 0;
        int maxSize = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                int squareSize = 0;
                while (isSquare(i, j, squareSize, m)) {
                    squareSize += 1;
                }

                if (squareSize + 1 > maxSize) {
                    xStart = i;
                    yStart = j;
                    maxSize = squareSize + 1;
                }
            }
        }
        int[] S = {xStart, yStart, maxSize};
        return S;
    }

    public static boolean isSquare(int row, int column, int squareSize, int[][] matrix) {
        int size = squareSize + 2;

        if (row + size - 1 >= matrix.length || column + size - 1 >= matrix.length)
            return false;

        for (int i = row; i < row + size; i++) {
            for (int j = column; j < column + size; j++) {
                if (matrix[i][j] != 1)
                    return false;
            }
        }
        return true;
	}
}