//WAP to check whether the number is positive, negative or zero.

import java.util.Scanner;

class checkNumber {
    public static void check(int number){
        if(number < 0){
            System.out.println("The number entered is negative.");
        }
        else if(number > 0){
            System.out.println("The number entered is positive.");
        }
        else{
            System.out.println("The number entered is zero.");
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