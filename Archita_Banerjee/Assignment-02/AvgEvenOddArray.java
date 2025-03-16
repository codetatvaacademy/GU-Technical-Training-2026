import java.util.Scanner;

public class AvgEvenOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sEven = 0, sOdd = 0, cntEven = 0, cntOdd = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                sEven += arr[i];
                cntEven++;
            } else {
                sOdd += arr[i];
                cntOdd++;
            }
        }
        double avgEven = 0;
        double avgOdd = 0;

        if (cntEven > 0) {
            avgEven = (double) sEven / cntEven;
        }

        if (cntOdd > 0) {
            avgOdd = (double) sOdd / cntOdd;
        }

        System.out.println("Average of even numbers: " + avgEven);
        System.out.println("Average of odd numbers: " + avgOdd);
    }
}

