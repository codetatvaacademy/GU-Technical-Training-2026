import java.util.Scanner;

public class Problem33 {
    //WAP to take input a number from the user and check whether it is palindrome.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int reverse = 0 ;
        int original=num;
        while (num != 0) {
            int digit = num % 10;     
            reverse = reverse * 10 + digit;  
            num /= 10;  
        }
        if(original==reverse){
            System.out.println(original+" is a palindrome number.");
        }else{
            System.out.println(original+" is not a palindrome number.");
        }
    }
    
}
