package AditiKaushik.BasicQuestions;

import java.util.Scanner;

class squareMiddleDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = sc.nextInt();
        if (number >= 100 && number <= 999) {
            int middleDigit = (number / 10) % 10;
            System.out.println("The square of the middle digit is: " + (middleDigit * middleDigit));
        }
        else {
            System.out.println("The number entered is not a 3-digit number.");
        }
        sc.close();
    }
}