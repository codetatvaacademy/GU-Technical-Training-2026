//WAP to check whether a number is even or odd.

import java.util.Scanner;

class evenOdd {
    public static void check(int number){
        if (number % 2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        check(number);
        sc.close();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)