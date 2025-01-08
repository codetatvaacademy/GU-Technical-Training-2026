//Question 6
import java.util.Scanner;
public class threeDigitNumberSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 digit number:");
        int number=sc.nextInt();
        int digit1=number/100;
        int digit2=(number%10)/10;
        int digit3=(number%10);
        int sum=digit1+digit3;
        System.out.println("Sum of 1st and 3rd digit:"+sum);
        sc.close();;
    }
    
}
