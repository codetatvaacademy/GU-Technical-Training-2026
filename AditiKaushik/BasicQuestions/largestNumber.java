//WAP to take input two numbers from the user and print the largest of them.

import java.util.Scanner;

class largestNumber {
    public static void check(int number1, int number2){
        if(number1 > number2){
            System.out.println(number1 + " is largest.");
        }
        else{
            System.out.println(number2 + " is largest.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        check(number1, number2);
        sc.close();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)