import java.util.*;
public class sumofnnumbers {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Ask the user to input the value of n
        System.out.print("Enter a number n: ");
        int n = sc.nextInt();
        
        // Calculate the sum of first n numbers
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        // Output the result
        System.out.println("The sum of the first " + n + " numbers is: " + sum);
        
        // Close the scanner to avoid memory leak
        sc.close();
    }
}


