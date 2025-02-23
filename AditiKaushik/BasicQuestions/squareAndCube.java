//WAP to take input 1 number from the user and print its square and cube.

import java.util.Scanner;

class squareAndCube{
    public static int square(int number){
        return number*number;
    }
    public static int cube(int number){
        return number*number*number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Square of number: " + square(number));
        System.out.println("Cube of number: " + cube(number));
        sc.close();
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)