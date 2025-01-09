package AditiKaushik.BasicQuestions;

import java.util.Scanner;

class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();
        int secondLargest;
        if ((number1 > number2 && number1 < number3) || (number1 < number2 && number1 > number3)) {
            secondLargest = number1;
        } else if ((number2 > number1 && number2 < number3) || (number2 < number1 && number2 > number3)) {
            secondLargest = number2;
        } else {
            secondLargest = number3;
        }
        System.out.println("Second largest number: " + secondLargest);
        sc.close();
    }
}