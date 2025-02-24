//WAP to take input 3 digit numbers from the user and print sum of 1 and 3 digit.

import java.util.Scanner;

class sumOfDigits {
    public static int sum(int number){
        int firstDigit = number / 100;
        int lastDigit = number % 10;
        return firstDigit + lastDigit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = sc.nextInt();
        if (number >= 100 && number <= 999) {
            System.out.println("The sum of the 1st and 3rd digit is: " + sum(number));
        }
        else {
            System.out.println("The number entered is not a 3-digit number.");
        }
        sc.close();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)