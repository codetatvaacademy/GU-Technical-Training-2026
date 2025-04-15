// WAP to print the reverse of a number given by user.

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        System.out.println(reverse_Number(num));
    }

    public static int reverse_Number(int num) {
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return reverse;
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)