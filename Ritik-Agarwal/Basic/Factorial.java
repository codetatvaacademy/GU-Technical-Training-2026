import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer to calculate factorial: ");
        int n = sc.nextInt();
        sc.close();
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}