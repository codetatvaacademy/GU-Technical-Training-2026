//2. WAP to take input 1 number from the user and print its square and cube.

import java.util.Scanner;
public class problem02 {
    public static int square(int n){
        return n*n;
    }
    public static int cube(int n){
        return square(n) * n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Square of number: " + square(n));
        System.out.println("cube of number: " + cube(n));
        sc.close();
    }
    
}
