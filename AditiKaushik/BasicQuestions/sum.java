//WAP to take input 2 numbers from the user and print the sum of the numbers.

import java.util.Scanner;

class sum{
    public static int sumOfTwoNumbers(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();
        System.out.println("Sum of given two numbers: " + sumOfTwoNumbers(firstNumber, secondNumber));
        sc.close();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)