import java.util.Scanner;

public class SumEvenOddArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sEven = 0, sOdd = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                sEven += arr[i];
            } else {
                sOdd += arr[i];
            }
        }

        System.out.println("Sum of even numbers: " + sEven);
        System.out.println("Sum of odd numbers: " + sOdd);
    }
}
