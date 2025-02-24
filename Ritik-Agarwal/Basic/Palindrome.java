import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        sc.close();
        int temp = n;
        int rev = 0;
        while(temp!=0){
            rev *= 10;
            rev += temp%10;
            temp/=10;
        }
        if(rev==n){
            System.out.println(n + " is a palindrome.");
        }
        else{
            System.out.println(n + " is not a palindrome.");
        }
    }
}