import java.util.Scanner;

public class Problem32 {
    // WAP to print the reverse of a number given by user
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int reverse = 0 ;
        while (num != 0) {
            int digit = num % 10;     
            reverse = reverse * 10 + digit;  
            num /= 10;  
        }
        System.out.println("The reversed number is: "+ reverse);
    }

    
}
