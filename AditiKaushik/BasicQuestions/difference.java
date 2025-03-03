//WAP to take input 2 numbers from the user and print their difference.

import java.util.Scanner;

class difference {
    public static int diff(int number1, int number2){
        return number1 - number2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.println("Difference = " + diff(number1, number2));
        sc.close();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)