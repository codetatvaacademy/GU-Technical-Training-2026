import java.util.Scanner;
public class Square_Cube {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        int square= n*n;
        int cube=n*n*n;
        System.out.println("Square of the given number is :" + square);
        System.out.println("Cube of the given number is :" + cube);
    }
}
