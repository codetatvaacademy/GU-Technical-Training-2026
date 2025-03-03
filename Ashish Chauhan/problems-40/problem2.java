// 2. WAP to take input 1 number from the user and print its square and cube.
import java.util.*;
public class Solution {
    public static void sq_cube(int num) {
        int square = num*num;
        int cube = square*num;
        System.out.println("Square of Number : "+square);
        System.out.print("Cube Of Number : "+cube);
        
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int a = sc.nextInt();
        sq_cube(a);
        
    }
}
