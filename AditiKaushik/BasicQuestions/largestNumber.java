package AditiKaushik.BasicQuestions;

import java.util.Scanner;

class largestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        if(number1 > number2){
            System.out.println(number1 + " is largest.");
        }
        else{
            System.out.println(number2 + " is largest.");
        }
        sc.close();
    }
}