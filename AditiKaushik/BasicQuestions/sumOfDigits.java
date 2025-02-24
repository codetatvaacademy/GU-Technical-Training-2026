package AditiKaushik.BasicQuestions;

import java.util.Scanner;

class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = sc.nextInt();
        if (number >= 100 && number <= 999) {
            int firstDigit = number / 100;
            int lastDigit = number % 10;
            System.out.println("The sum of the 1st and 3rd digit is: " + (firstDigit + lastDigit));
        }
        else {
            System.out.println("The number entered is not a 3-digit number.");
        }
        sc.close();
    }
}