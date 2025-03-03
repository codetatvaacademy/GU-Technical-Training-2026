//WAP to take input 4 digit numbers from the user and print its all digits.

import java.util.Scanner;

class fourDigits {
    public static void print(int number){
        int firstDigit = number / 1000;
        int secondDigit = (number / 100) % 10;
        int thirdDigit = (number / 10) % 10;
        int fourthDigit = number % 10;
        System.out.println("First digit: " + firstDigit + "  Second digit: " + secondDigit + "  Third digit: " + thirdDigit + "  Fourth digit: " + fourthDigit);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int number = sc.nextInt();
        if (number >= 1000 && number <= 9999) {
            print(number);
        }
        else {
            System.out.println("The number entered is not a 4-digit number.");
        }
        sc.close();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)