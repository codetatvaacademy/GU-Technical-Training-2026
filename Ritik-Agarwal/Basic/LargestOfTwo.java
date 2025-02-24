import java.util.Scanner;
public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();
        sc.close();
        System.out.println("Largest number is: " + (num1>num2?num1:num2));
    }
}