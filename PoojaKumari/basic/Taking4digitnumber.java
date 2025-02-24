//Question 8
import java.util.Scanner;
public class Taking4digitnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 4 digit number:");
        int number=sc.nextInt();
        int digit1=number/1000;
        int digit2=(number/100)%10;
        int digit3=(number/10)%10;
        int digit4=(number%10);
        int sum=digit1+digit2+digit3+digit4;
        System.out.println("Sum of digits:"+sum);
        sc.close();


    }
    
}
