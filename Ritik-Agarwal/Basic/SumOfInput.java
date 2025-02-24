import java.util.Scanner;
public class SumOfInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        sc.close();
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    }
}