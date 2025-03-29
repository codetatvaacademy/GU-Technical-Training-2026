// 	WAP to input a number from user and print its table.

import java.util.Scanner;

public class multiplicationTable {
    public static void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        printTable(num);
        scanner.close();
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)