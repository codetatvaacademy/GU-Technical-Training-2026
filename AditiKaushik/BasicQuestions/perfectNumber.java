// WAP to check whether a number is perfect or not.

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isPerfect(num)) {
            System.out.println("Perfect number.");
        } else {
            System.out.println("Not a perfect number.");
        }
    }

    public static boolean isPerfect(int num) {
        if (num <= 1) {
            return false;
        }
        
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        
        return sum == num;
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)