package AditiKaushik.BasicQuestions;

import java.util.Scanner;

class difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.println("Difference = " + (number1 - number2));
        sc.close();
    }
}