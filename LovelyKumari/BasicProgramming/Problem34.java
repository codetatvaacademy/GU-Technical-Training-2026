import java.util.Scanner;

public class Problem34 {
    //WAP to take input a number from the user and check whether it is armstrong.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int original = num; // Store the original number
        int digits = 0, sum = 0;

        // Calculate the number of digits
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        // Calculate the sum of each digit raised to the power of 'digits
        temp = num;
        while (temp != 0) {
            int digit = temp % 10; 
            sum += Math.pow(digit, digits); 
            temp /= 10; 
        }

        //Check if the sum equals the original number
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
        
    }
    
}
