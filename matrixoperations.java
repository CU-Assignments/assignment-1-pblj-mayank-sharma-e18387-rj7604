import java.util.Scanner;

public class matrixoperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter rows and columns for matrices: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        // Input matrices
        System.out.println("Enter elements of Matrix 1:");
        inputMatrix(scanner, matrix1);
        System.out.println("Enter elements of Matrix 2:");
        inputMatrix(scanner, matrix2);

        // Perform operations
        System.out.println("Addition:");
        printMatrix(addMatrices(matrix1, matrix2));

        System.out.println("Subtraction:");
        printMatrix(subtractMatrices(matrix1, matrix2));

        System.out.println("Multiplication:");
        printMatrix(multiplyMatrices(matrix1, matrix2));

        scanner.close();
    }

    static void inputMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    static int[][] addMatrices(int[][] m1, int[][] m2) {
        int[][] result = new int[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }

    static int[][] subtractMatrices(int[][] m1, int[][] m2) {
        int[][] result = new int[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                result[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return result;
    }

    static int[][] multiplyMatrices(int[][] m1, int[][] m2) {
        int rows = m1.length, cols = m2[0].length, sum;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum = 0;
                for (int k = 0; k < m1[0].length; k++) {
                    sum += m1[i][k] * m2[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
