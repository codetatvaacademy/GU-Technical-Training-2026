// 1. WAP to take input 2 numbers from the user and print the sum of the numbers.
import java.util.*;
public class Solution {
    public static int sum(int first , int second) {
        return first+second;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int a = sc.nextInt();
        System.out.print("Enter second Number : ");
        int b = sc.nextInt();
        int ans = sum(a,b);
        System.out.println("Sum of "+a+" and "+b+" is "+ans);
        
    }
}
