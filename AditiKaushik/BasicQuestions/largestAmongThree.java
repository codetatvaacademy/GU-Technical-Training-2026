package AditiKaushik.BasicQuestions;

import java.util.Scanner;

class largestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();
        if (number1 > number2){
            if (number1 > number3){
                System.out.println("Largest Number = " + number1);
            }
            else{
                System.out.println("Largest Number = " + number3);
            }
        }
        else{
            if (number2 > number3){
                System.out.println("Largest Number = " + number2);
            }
            else{
                System.out.println("Largest Number = " + number3);
            }
        }
        sc.close();
    }
}