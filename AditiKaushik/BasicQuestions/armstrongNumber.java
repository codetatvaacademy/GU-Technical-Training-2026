// WAP to take input a number from the user and check whether it is armstrong.

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        
        if (isArmstrong(num)) {
            System.out.println("Armstrong number.");
        } else {
            System.out.println("Not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num, sum = 0, digits = 0;
        int temp = num;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        
        return sum == originalNum;
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)