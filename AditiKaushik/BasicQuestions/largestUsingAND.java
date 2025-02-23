//WAP to take input 3 numbers from the user and print the largest number among them using AND operator.

import java.util.Scanner;

class largestUsingAND {
    public static void largest(int number1, int number2, int number3){
        if (number1 >= number2 && number1 >= number3){
            System.out.println("Largest Number = " + number1);
        }
        else if (number2 >= number1 && number2 >= number3){
            System.out.println("Largest Number = " + number2);
        }
        else{
            System.out.println("Largest Number = " + number3);
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
        largest(number1, number2, number3);
        sc.close();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)