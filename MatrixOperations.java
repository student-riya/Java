import java.util.Scanner;

class Matrix {
    private int[][] elements;

    // Constructor to initialize a 3x3 matrix
    public Matrix() {
        elements = new int[3][3];
    }

    // Method to fill the matrix with user input
    public void fillMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Element [%d][%d]: ", i, j);
                elements[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to find the maximum element and its position
    public void findMaxElement() {
        int maxElement = elements[0][0];
        int maxRow = 0, maxCol = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (elements[i][j] > maxElement) {
                    maxElement = elements[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.printf("The maximum element is %d at position [%d][%d].\n", maxElement, maxRow, maxCol);
    }

    // Method to display the matrix
    public void displayMatrix() {
        System.out.println("The matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class MatrixOperations {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();

        // Fill the matrix with user input
        matrix.fillMatrix();

        // Display the matrix
        matrix.displayMatrix();

        // Find and display the maximum element
        matrix.findMaxElement();
    }
}
