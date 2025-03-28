// 	WAP to input a lower limit and an upper limit from user and print all the numbers in between the given limits.

import java.util.Scanner;

public class printNumbersInRange {
    public static void numbersInRange(int lowerLimit, int upperLimit) {
        if (lowerLimit > upperLimit) {
            System.out.println("Invalid input! Lower limit should be smaller than upper limit.");
            return;
        }
        for (int i = lowerLimit; i <= upperLimit; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int lowerLimit = scanner.nextInt();
        
        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();
        numbersInRange(lowerLimit, upperLimit);

        scanner.close();
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)