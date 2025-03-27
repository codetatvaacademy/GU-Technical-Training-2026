// WAP to take input 3 numbers from the user and print the numbers in the descending order.

import java.util.Scanner;

public class descendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        int first, second, third;

        if (num1 >= num2 && num1 >= num3) {
            first = num1;
            if (num2 >= num3) {
                second = num2;
                third = num3;
            } else {
                second = num3;
                third = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            first = num2;
            if (num1 >= num3) {
                second = num1;
                third = num3;
            } else {
                second = num3;
                third = num1;
            }
        } else {
            first = num3;
            if (num1 >= num2) {
                second = num1;
                third = num2;
            } else {
                second = num2;
                third = num1;
            }
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        scanner.close();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)