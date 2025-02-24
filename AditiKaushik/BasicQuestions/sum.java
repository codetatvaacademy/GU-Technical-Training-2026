package AditiKaushik.BasicQuestions;

import java.util.Scanner;

class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = sc.nextInt();
        System.out.println("Sum of given two numbers: " + (firstNumber + secondNumber));
        sc.close();
    }
}