//WAP to take input 3 numbers and print the 2nd largest number among them.

import java.util.Scanner;

class secondLargest {
    public static int check(int number1, int number2, int number3){
        if ((number1 > number2 && number1 < number3) || (number1 < number2 && number1 > number3)) {
            return number1;
        } else if ((number2 > number1 && number2 < number3) || (number2 < number1 && number2 > number3)) {
            return number2;
        } else {
            return number3;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();
        System.out.println("Second largest number: " + check(number1, number2, number3));
        sc.close();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)