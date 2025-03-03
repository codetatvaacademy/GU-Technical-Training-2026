//WAP to take input 3 digit numbers from the user and print the square of the middle digit.

import java.util.Scanner;

class squareMiddleDigit {
    public static int square(int number){
        int middleDigit = (number / 10) % 10;
        return middleDigit * middleDigit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = sc.nextInt();
        if (number >= 100 && number <= 999) {
            System.out.println("The square of the middle digit is: " + square(number));
        }
        else {
            System.out.println("The number entered is not a 3-digit number.");
        }
        sc.close();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)