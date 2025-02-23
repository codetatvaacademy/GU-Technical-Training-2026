import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int duplicateNum = number;

        int numLength = (int)(1+Math.log10(number));

        int reverse =0;
        for(int range = 0; range < numLength ; range++){
            int remainder = number%10;
            reverse = (reverse*10)+remainder;
            number /= 10;
        }
        System.out.println(reverse);
        

        if(duplicateNum == reverse){
            System.out.println("It is a palindrome.");
        }
        else{
            System.out.println("It is not a palindrome.");
        }
        sc.close();
    }
}
