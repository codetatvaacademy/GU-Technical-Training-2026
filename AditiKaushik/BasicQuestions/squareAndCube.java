package AditiKaushik.BasicQuestions;

import java.util.Scanner;

class squareAndCube{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Square of number: " + (number*number));
        System.out.println("Cube of number: " + (number*number*number));
        sc.close();
    }
}