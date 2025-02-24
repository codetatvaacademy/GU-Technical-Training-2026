package AditiKaushik.BasicQuestions;

import java.util.Scanner;

class checkNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if(number < 0){
            System.out.println("The number entered is negative.");
        }
        else if(number > 0){
            System.out.println("The number entered is positive.");
        }
        else{
            System.out.println("The number entered is zero.");
        }
        sc.close();
    }
}