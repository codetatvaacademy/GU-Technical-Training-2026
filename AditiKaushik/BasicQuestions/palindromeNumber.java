// WAP to take input a number from the user and check whether it is palindrome.

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        
        if (isPalindrome(num)) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }
    }

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reverse = 0;
        
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        
        return originalNum == reverse;
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)