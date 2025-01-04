import java.util.Scanner;

public class SumOf2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the dimensions of the 2D array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Initialize the 2D array
        int[][] array = new int[rows][cols];

        // Prompt the user to enter the elements of the 2D array
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Calculate the sum of the 2D array
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += array[i][j];
            }
        }

        // Display the sum
        System.out.println("The sum of all elements in the 2D array is: " + sum);
    }
}